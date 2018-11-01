package com.example.demo;

import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IncomingController {

    @RequestMapping(value = "/incoming", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String index() {
        String xml = FileUtil.readFile("C:\\TEMP\\input.txt");
        return xml != null ? xml : "File Not Found!!";
    }

}
