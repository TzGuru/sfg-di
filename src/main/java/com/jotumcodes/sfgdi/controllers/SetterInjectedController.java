package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class SetterInjectedController {

    private TestService testService;

    @Autowired
    public void setTestService(@Qualifier("setterServiceImpl") TestService testService) {
        this.testService = testService;
    }

    public String getText() {
        return testService.getText();
    }
}
