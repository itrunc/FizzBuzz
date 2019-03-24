package com.itrunc.fungame;

import com.itrunc.fungame.conversion.Buzz2Caculator;
import com.itrunc.fungame.conversion.BuzzCaculator;
import com.itrunc.fungame.conversion.Caculator;
import com.itrunc.fungame.conversion.Fizz2Caculator;
import com.itrunc.fungame.conversion.FizzCaculator;
import com.itrunc.fungame.model.NumberPlaceholder;

public class FizzBuzzProcessor {

    public static void main(String[] args) {
        FizzBuzzProcessor processor = new FizzBuzzProcessor();
        try {
            System.out.println("FizzBuzz game begin:");
            processor.process();
            System.out.println("----------------------------");
            System.out.println("Another FizzBuzz game begin:");
            processor.process2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void process() throws Exception {
        FizzCaculator fizzCaculator = new FizzCaculator();
        BuzzCaculator buzzCaculator = new BuzzCaculator();

        fizzCaculator.setSubCaculator(buzzCaculator);

        //Chain： Fizz -> Buzz
        Caculator<NumberPlaceholder> caculatorChain = fizzCaculator;

        int loop = 1;
        while (loop <= 100) {
            NumberPlaceholder numberPlaceholder = new NumberPlaceholder(loop);
            caculatorChain.caculate(numberPlaceholder);
            numberPlaceholder.show();
            loop++;
        }
    }

    public void process2() throws Exception {
        Fizz2Caculator fizzCaculator = new Fizz2Caculator();
        Buzz2Caculator buzzCaculator = new Buzz2Caculator();

        fizzCaculator.setSubCaculator(buzzCaculator);

        //Chain: Fizz2 -> Buzz2
        Caculator<NumberPlaceholder> caculatorChain = fizzCaculator;

        int loop = 1;
        while (loop <= 100) {
            NumberPlaceholder numberPlaceholder = new NumberPlaceholder(loop);
            caculatorChain.caculate(numberPlaceholder);
            numberPlaceholder.show();
            loop++;
        }
    }
}