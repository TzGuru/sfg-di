package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
public class PropertyInjectedController {

    public TestService testService;

    public String getText() {
        return testService.getText();
    }
}
