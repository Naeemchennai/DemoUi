package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutgoingController {

    @RequestMapping("/outgoing")
    public String index() {

        MT103Parser.generateOutputMain();
        String xml = FileUtil.readFile("C:\\TEMP\\output.txt");
        return xml != null ? xml : "File not Found!!";
    }

}
