package com.jotumcodes.sfgdi.controllers;

import com.jotumcodes.sfgdi.services.TestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Controller
public class I18nController {

    private final TestService testService;

    public I18nController(@Qualifier("i18nService") TestService testService) {
        this.testService = testService;
    }

    public String getText(){
        return testService.getText();
    }
}
