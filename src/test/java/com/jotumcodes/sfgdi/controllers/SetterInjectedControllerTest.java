package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setTestService(new TestServiceImpl());
    }

    @Test
    void getText() {
        System.out.println(controller.getText());
    }
}