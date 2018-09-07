package sshloger.sshconnect;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Base64;

public class Commands {

    private static String context;
    private static Integer year;
    private static Integer month;
    private static Integer day;
    private static Integer hour;

    private static WebAdmin webAdmin = new WebAdmin();

    public Commands(String context) {
        this.context = Base64.getEncoder().encodeToString(context.getBytes());
        webAdmin.contextDate(context);
        this.year = webAdmin.getYear();
        this.month = webAdmin.getMonth();
        this.day = webAdmin.getDay();
        this.hour = webAdmin.getHour();

    }

    public Commands() {
    }

    /*
    // Копируем дату из ВА и разбираем по цифиркам))
    public void convector(){
        String[] convector = this.time.split("[\\D]"); // сплит по не цифровому символу
        this.day = Integer.parseInt(convector[0]);
        this.month = convector[1];
        this.year = convector[2];
        this.hour = Integer.parseInt(convector[3]);
    }
    */

    // Создание команды для проверки интеграции срм
    public ArrayList<String> apiCrmIntegration(){
        // example "zgrep NDYyMjc1NDY1MA== /var/log/remote/itg-prod-cluster-node*.ru.mgo.su/2018/08/30/07*"

        String node1 = "/var/log/remote/itg-prod-cluster-node1.ru.mgo.su";
        String node2 = "/var/log/remote/itg-prod-cluster-node2.ru.mgo.su";
        String node3 = "/var/log/remote/itg-prod-cluster-node3.ru.mgo.su";
        String node4 = "/var/log/remote/itg-prod-cluster-node4.ru.mgo.su";

        String allnode = "/var/log/remote/itg-prod-cluster-node*.ru.mgo.su";

        //String grep = dataArсhiv() ? "grep" : "zgrep"; // 14 звонок был в 11, греп. звонок был в 9, згреп
        String grep = "zgrep";

        // подставляем 0 если надо
        String hour = this.hour < 10 ? "0" + this.hour : "" + this.hour;
        String day = this.day < 10 ? "0" + this.day : "" + this.day;
        String month = this.month < 10 ? "0" + this.month : "" + this.month;

        String date = "/" + this.year + "/" + month + "/" + day + "/" + hour + "*";

        ArrayList<String> list = new ArrayList<>();
        list.add(grep + " " + this.context + " " + allnode + date);

        /*
        list.add(grep + " " + this.context + " " + node1 + date);
        list.add(grep + " " + this.context + " " + node2 + date);
        list.add(grep + " " + this.context + " " + node3 + date);
        list.add(grep + " " + this.context + " " + node4 + date);
        */
        return list;
    }

    // Проверка на grep и zgrep
    public boolean dataArсhiv(){

        SimpleDateFormat hourFormat = new SimpleDateFormat("kk");
        Integer nowHour =  Integer.parseInt(hourFormat.format(new Date()));

        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        Integer nowDay =  Integer.parseInt(dayFormat.format(new Date()));
        // Если прошло менее трех часов и дата сегодняшняя то греп
        if((nowHour - this.hour) <= 3 && nowDay == this.day) return true;
        return false;
    }


}
