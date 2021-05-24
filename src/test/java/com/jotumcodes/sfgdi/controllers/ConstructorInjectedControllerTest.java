package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new TestServiceImpl());
    }

    @Test
    void getText() {
        System.out.println(controller.getText());
    }
}