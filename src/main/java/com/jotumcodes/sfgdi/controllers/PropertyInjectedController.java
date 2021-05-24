package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyServiceImpl")
    public TestService testService;

    public String getText() {
        return testService.getText();
    }
}
