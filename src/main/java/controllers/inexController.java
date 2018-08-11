package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inexController {
//    @RequestMapping("/")
//    public String login(){return "index";}
//    @GetMapping("/error")
//    public String errorViewHamdler(){return "errorView";}

    @GetMapping("/")
    public String index() {return "index";}

    @GetMapping("/error")
    public String errorViewHamdler(){return "errorView";}
}
