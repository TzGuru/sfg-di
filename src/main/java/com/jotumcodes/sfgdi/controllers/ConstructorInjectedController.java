package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class ConstructorInjectedController {

    private final TestService testService;

    // @Autowired // is optional, is injected directly to constructor
    public ConstructorInjectedController(@Qualifier("constructorServiceImpl") TestService testService) {
        this.testService = testService;
    }

    public String getText() {
        return testService.getText();
    }
}
