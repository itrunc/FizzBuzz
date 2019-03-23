package com.itrunc.fungame;

import com.itrunc.fungame.conversion.Caculator;
import com.itrunc.fungame.conversion.Buzz2Caculator;
import com.itrunc.fungame.conversion.BuzzCaculator;
import com.itrunc.fungame.model.NumberPlaceholder;

import org.junit.Assert;
import org.junit.Test;

public class TestBuzz {

    @Test
    public void buzz() {
        BuzzCaculator buzzCaculator = new BuzzCaculator();
        Caculator<NumberPlaceholder> caculatorChain = buzzCaculator;

        try {
            NumberPlaceholder numberPlaceholder = new NumberPlaceholder(5);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(50);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(3);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertNotEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(51);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertNotEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

        } catch (Exception e) {
            
        }
    }

    @Test
    public void buzz2() {
        Buzz2Caculator buzzCaculator = new Buzz2Caculator();
        Caculator<NumberPlaceholder> caculatorChain = buzzCaculator;

        try {
            NumberPlaceholder numberPlaceholder = new NumberPlaceholder(5);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(50);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(3);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertNotEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

            numberPlaceholder = new NumberPlaceholder(51);
            caculatorChain.caculate(numberPlaceholder);
            Assert.assertEquals(BuzzCaculator.BUZZ, numberPlaceholder.placeholder);

        } catch (Exception e) {
            
        }
    }

}