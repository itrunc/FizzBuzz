package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class Buzz2Caculator extends Caculator<NumberPlaceholder> {

    public final static String BUZZ = "Buzz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        //Set placeholder as Buzz when the number is divisible by 5 or in whom has 5
        if (obj.num % 5 == 0 || String.valueOf(obj.num).contains("5")) {
            obj.placeholder += BUZZ;
        }
        return obj;
    }
}