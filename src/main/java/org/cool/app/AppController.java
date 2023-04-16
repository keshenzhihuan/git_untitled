package org.cool.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/demo")
    public String demo(){
        return "demo.html";
    }
}
