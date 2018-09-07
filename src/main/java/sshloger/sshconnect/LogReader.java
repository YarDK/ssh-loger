package sshloger.sshconnect;

public class LogReader {

    UserAuthPubKey userAuthPubKey = new UserAuthPubKey();

    public String allLog(){
        String allLog = "";
        for(String s : userAuthPubKey.getMessage()){
            allLog += s + "\n";
        }
        return allLog;
    }

    public String postLog(){
        String postLog = "";
        for(String s : userAuthPubKey.getMessage()) {
            if (s.contains("POST")) {
                postLog += s + "\n";
            }
        }
        return postLog;
    }

    public void messageCleaner(){
        userAuthPubKey.getMessage().clear();
    }

}
