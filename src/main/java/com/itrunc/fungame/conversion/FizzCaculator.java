package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class FizzCaculator extends Caculator<NumberPlaceholder> {

    public final static String FIZZ = "Fizz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        if (obj.num % 3 == 0) {
            obj.placeholder += FIZZ;
        }
        return obj;
    }
}