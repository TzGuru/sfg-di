package com.jotumcodes.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Profile("SW")
@Service("i18nService")
public class i18nSwahiliService implements TestService{
    @Override
    public String getText() {
        return "Sample Text!\t->\tSW";
    }
}
