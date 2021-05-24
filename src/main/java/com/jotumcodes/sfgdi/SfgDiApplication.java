package com.jotumcodes.sfgdi;

import com.jotumcodes.sfgdi.controllers.*;
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
        System.out.println("------- i18n -------");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("Return Value : "+i18nController.getText());
        System.out.println("------- Property -------");
        TestController testController = (TestController) ctx.getBean("testController");
        System.out.println("Return Value : "+testController.getText());
        System.out.println("------- Property -------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println("Return Value : "+propertyInjectedController.getText());
        System.out.println("------- Setter -------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println("Return Value : "+setterInjectedController.getText());
        System.out.println("------- Constructor -------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println("Return Value : "+constructorInjectedController.getText());
    }
}
