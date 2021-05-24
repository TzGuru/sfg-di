package com.jotumcodes.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Emmanuel Jonas on 24/05/2021
 */
@Primary
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getText() {
        return "Sample Text!\t->\tPrimary";
    }
}
