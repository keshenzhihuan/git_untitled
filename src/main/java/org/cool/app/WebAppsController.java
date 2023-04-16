package org.cool.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppsController {
    @GetMapping
    public String index(){
        return "Hello, hu ha ha ha!";
    }
}
