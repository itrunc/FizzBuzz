package com.itrunc.fungame;

import com.itrunc.fungame.conversion.Caculator;
import com.itrunc.fungame.conversion.FizzCaculator;
import com.itrunc.fungame.model.NumberPlaceholder;

import org.junit.Assert;
import org.junit.Test;

public class TestFizz {

    @Test
    public void fizz() {
        FizzCaculator fizzCaculator = new FizzCaculator();
        Caculator<NumberPlaceholder> caculatorChain = fizzCaculator;

        try {
            NumberPlaceholder numberPlaceholder = new NumberPlaceholder(3);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(FizzCaculator.FIZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(2);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertNotEquals(FizzCaculator.FIZZ, numberPlaceholder.placeholder);

        } catch (Exception e) {
            
        }
    }

}