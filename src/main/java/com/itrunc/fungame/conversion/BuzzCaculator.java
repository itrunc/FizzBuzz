package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class BuzzCaculator extends Caculator<NumberPlaceholder> {

    public final static String BUZZ = "Buzz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        if (obj.num % 5 == 0) {
            obj.placeholder += BUZZ;
        }
        return obj;
    }
}