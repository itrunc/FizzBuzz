package com.itrunc.fungame.conversion;

import com.itrunc.fungame.model.NumberPlaceholder;

public class Fizz2Caculator extends Caculator<NumberPlaceholder> {

    public final static String FIZZ = "Fizz";
    
    @Override
    protected NumberPlaceholder doCaculation(NumberPlaceholder obj) {
        //Set placeholder as Fizz when the number is divisible by 3 or in whom has 3
        if (obj.num % 3 == 0 || String.valueOf(obj.num).contains("3")) {
            obj.placeholder += FIZZ;
        }
        return obj;
    }
}