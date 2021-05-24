package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
public class ConstructorInjectedController {

    private final TestService testService;

    public ConstructorInjectedController(TestService testService) {
        this.testService = testService;
    }

    public String getText() {
        return testService.getText();
    }
}
