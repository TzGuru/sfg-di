package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;
import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    public String getText() {
        return testService.getText();
    }

    public String test(){
        System.out.println("Test");
        return "Test";
    }
}
