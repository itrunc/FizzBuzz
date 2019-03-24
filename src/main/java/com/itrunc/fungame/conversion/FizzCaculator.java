package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class FizzCaculator extends Caculator<NumberPlaceholder> {

    public final static String FIZZ = "Fizz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        //Set placeholder as Fizz if the number is divisible by 3
        if (obj.num % 3 == 0) {
            obj.placeholder += FIZZ;
        }
        return obj;
    }
}