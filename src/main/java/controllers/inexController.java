package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class inexController {
//    @RequestMapping("/")
//    public String login(){return "index";}
//    @GetMapping("/error")
//    public String errorViewHamdler(){return "errorView";}

    @RequestMapping("/")
    public String index() {return "index";}

    @RequestMapping("/error")
    public String errorViewHandler(){return "errorView";}
}
