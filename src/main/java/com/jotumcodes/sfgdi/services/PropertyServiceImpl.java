package com.jotumcodes.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Service
public class PropertyServiceImpl implements TestService{
    @Override
    public String getText() {
        return "Sample Text!\t->\tProperty";
    }
}
