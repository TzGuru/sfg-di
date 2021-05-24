package com.jotumcodes.sfgdi;

import com.jotumcodes.sfgdi.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        TestController testController = (TestController) ctx.getBean("testController");
        String text = testController.test();
        System.out.println("Return Value "+text);
    }
}
