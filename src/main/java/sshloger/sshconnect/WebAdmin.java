package sshloger.sshconnect;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import sshloger.json.MainJSON;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WebAdmin {

    private static Integer year;
    private static Integer month;
    private static Integer day;
    private static Integer hour;

    public static Integer getYear() {
        return year;
    }

    public static Integer getMonth() {
        return month;
    }

    public static Integer getDay() {
        return day;
    }

    public static Integer getHour() {
        return hour;
    }

    public static void contextDate(String context) {

        try {
            // Создаем подключение
            HttpClient client = HttpClientBuilder.create().build();

            // Шлем пост запрос на авторизацию
            HttpPost post = new HttpPost("http://webadmin.mango.local:8088/wa/SSWAController?module=Auth&action=login");
            post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("authorizationType", "2"));
            urlParameters.add(new BasicNameValuePair("username", "yakor"));
            urlParameters.add(new BasicNameValuePair("password", "nZ4gklU4"));
            urlParameters.add(new BasicNameValuePair("languageSelect", "ru"));
            urlParameters.add(new BasicNameValuePair("timezone", "+0300"));
            urlParameters.add(new BasicNameValuePair("olsonTimezone", "Europe/Moscow"));
            urlParameters.add(new BasicNameValuePair("sessionTimeout", "3"));

            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            HttpResponse response = client.execute(post);
            System.out.println("Авторизация - " + response.getStatusLine());

            // Если авторизация успешная, шлем запрос на выгрузку контекста
            HttpPost post2 = new HttpPost("http://webadmin.mango.local:8088/wa/SSWAController?module=SoftplatformCdrs&action=list&waModelIdList=20");
            // add header
            post2.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            List<NameValuePair> urlParameters2 = new ArrayList<NameValuePair>();
            urlParameters2.add(new BasicNameValuePair("contextIds", context));
            post2.setEntity(new UrlEncodedFormEntity(urlParameters2));
            HttpResponse response2 = client.execute(post2);
            System.out.println("Запрос контекста - " + response2.getStatusLine());

            //Output json
            BufferedReader br = new BufferedReader(new InputStreamReader((response2.getEntity().getContent())));
            Gson gson = new Gson();
            MainJSON mainJSON = gson.fromJson(br.readLine(), MainJSON.class);

            year = mainJSON.getSoftplatformCdrs().get(0).getTimeCreated().getYear();
            month = mainJSON.getSoftplatformCdrs().get(0).getTimeCreated().getMonth();
            day = mainJSON.getSoftplatformCdrs().get(0).getTimeCreated().getDay();
            hour = mainJSON.getSoftplatformCdrs().get(0).getTimeCreated().getHour();

            br.close();
            //System.out.println(mainJSON.getSoftplatformCdrs().get(0).getTimeCreated().getYear());

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

