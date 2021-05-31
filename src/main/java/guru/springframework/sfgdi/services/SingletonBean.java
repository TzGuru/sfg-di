package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by Emmanuel Jonas on 31/05/2021
 */
@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating a Singleton bean");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
