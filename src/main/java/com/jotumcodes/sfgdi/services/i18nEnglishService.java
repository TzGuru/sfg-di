package com.jotumcodes.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Profile({"EN", "default"})
@Service("i18nService")
public class i18nEnglishService implements TestService{
    @Override
    public String getText() {
        return "Sample Text!\t->\tEN";
    }
}
