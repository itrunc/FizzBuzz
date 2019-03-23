package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class Buzz2Caculator extends Caculator<NumberPlaceholder> {

    public final static String BUZZ = "Buzz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        if (obj.num % 5 == 0 || String.valueOf(obj.num).contains("5")) {
            obj.placeholder += BUZZ;
        }
        return obj;
    }
}