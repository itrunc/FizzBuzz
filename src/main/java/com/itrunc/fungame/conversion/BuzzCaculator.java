package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class BuzzCaculator extends Caculator<NumberPlaceholder> {

    public final static String BUZZ = "Buzz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        //Set placeholder as Buzz if the number is divisible by 5
        if (obj.num % 5 == 0) {
            obj.placeholder += BUZZ;
        }
        return obj;
    }
}