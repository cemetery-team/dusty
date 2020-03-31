package com.network;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Group {
    @GetMapping("/group")
    public String group(){
        return "group";
    }

}
