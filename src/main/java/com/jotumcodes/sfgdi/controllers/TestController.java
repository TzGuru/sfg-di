package com.jotumcodes.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class TestController {

    public String test(){
        System.out.println("Test");
        return "Test";
    }
}
