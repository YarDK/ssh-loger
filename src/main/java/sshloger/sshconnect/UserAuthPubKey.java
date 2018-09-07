package sshloger.sshconnect;



/* -*-mode:java; c-basic-offset:2; indent-tabs-mode:nil -*- */
/**
 * This program will demonstrate the user authentification by public key.
 * $ CLASSPATH=.:../build javac UserAuthPubKey.java
 * $ CLASSPATH=.:../build java UserAuthPubKey
 * You will be asked username, hostname, privatekey(id_dsa) and passphrase.
 * If everything works fine, you will get the shell prompt
 */

import com.jcraft.jsch.*;

import java.io.*;
import java.util.ArrayList;

public class UserAuthPubKey {

    private static String logPath;
    private static Channel channel;
    private static ArrayList<String> message = new ArrayList<>();

    public static ArrayList<String> getMessage() {
        return message;
    }

    public static void loger (Commands commands, String context){

        try {
            // По каждому контексту создается свой лог в папке Log
            logPath = "C:\\Users\\yako\\IdeaProjects\\ssh-loger\\src\\main\\log\\" + context + ".txt";

            for(String command : commands.apiCrmIntegration()){
                System.out.println(command);
                CommandsThread commandsThread = new CommandsThread(command);
                commandsThread.start();
                commandsThread.join();
            }


            FileWriter writer = new FileWriter(logPath);
            for(String i : message){
                writer.write(i);
            }
            writer.close();

//            channel.setInputStream(System.in);
//            channel.setOutputStream(System.out);

//            session.disconnect();
//            channel.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static class CommandsThread extends Thread {

        String command;

        public CommandsThread(String command) {
            this.command = command;
        }


        public void run() {
            try {
                JSch jsch = new JSch();
                jsch.addIdentity("C:\\Users\\yako\\IdeaProjects\\ssh-loger\\korotyshov_private.PPK");
                String user = "yakorotyshov"; // указываем свой логин
                String host = "log-crm.as.ru.mgo.su"; //"192.168.30.126"; //хост по умолчанию log-crm.as.ru.mgo.su
                Session session = jsch.getSession(user, host, 22);

                UserInfo ui = new MyUserInfo();
                session.setUserInfo(ui);
                session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
                session.connect();
                channel = session.openChannel("exec");
                ((ChannelExec) channel).setCommand(command);
                channel.setInputStream(null);
                ((ChannelExec) channel).setErrStream(System.err);
                InputStream in = channel.getInputStream();
                channel.connect();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String str;

                while ((str = reader.readLine()) != null){
                    message.add(str);
                }

                reader.close();
                session.disconnect();
                channel.disconnect();
                System.out.println("Finish");


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    public static class MyUserInfo implements UserInfo {
        @Override
        public String getPassphrase() {
            return null;
        }

        @Override
        public String getPassword() {
            return null;
        }

        @Override
        public boolean promptPassword(String s) {
            return true;
        }

        @Override
        public boolean promptPassphrase(String s) {
            return true;
        }

        @Override
        public boolean promptYesNo(String s) {
            return true;
        }

        @Override
        public void showMessage(String s) {

        }
    }

}
