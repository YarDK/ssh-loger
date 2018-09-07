package sshloger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sshloger.sshconnect.Commands;
import sshloger.sshconnect.LogReader;
import sshloger.sshconnect.UserAuthPubKey;

@Controller
public class MainController {

    // Сюда передаются два числа и они обрабатываются

    @PostMapping("log")
    public String log(@RequestParam(name = "context", required = false, defaultValue = "") String context,
                      Model model) {

        LogReader logReader = new LogReader();

        if(context.isEmpty()){
            model.addAttribute("postLog", "Отсутствует контекст");
            model.addAttribute("allLog", "Отсутствует контекст");
        } else {
            Commands commands = new Commands(context);
            UserAuthPubKey userAuthPubKey = new UserAuthPubKey();
            userAuthPubKey.loger(commands, context);
            model.addAttribute("postLog", logReader.postLog());
            model.addAttribute("allLog", logReader.allLog());
        }

        logReader.messageCleaner();
        System.out.println("Выгрузка логов завершена!" + "\n");
        return "log";
    }

    // Стартовая страница, ничего особенного
    @GetMapping("/sshloger")
    public String sshloger() {
        return "sshloger";
    }

}
