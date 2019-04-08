package com.gmail.anastasiya.lyakhova;

import com.gmail.anastasiya.lyakhova.service.StringNumbers;
import com.gmail.anastasiya.lyakhova.service.exception.NotValidValueException;
import com.gmail.anastasiya.lyakhova.service.impl.StringNumbersImpl;
import org.junit.Assert;
import org.junit.Test;

public class MethodAddTest {

    @Test
    public void shouldSumOfNumbersIsCorrect(){

        StringNumbers stringNumbers = new StringNumbersImpl();
        String numbers = "1, 2";
        Integer correctSum = 3;
        Integer sum = stringNumbers.add(numbers);
        Assert.assertEquals(correctSum, sum);
    }

    @Test
    public void shouldEmptyLineIsNull(){
        StringNumbers stringNumbers = new StringNumbersImpl();
        String numbers = "";
        Integer correctResult = 0;
        Integer sum = stringNumbers.add(numbers);
        Assert.assertEquals(correctResult,sum);
    }

    @Test(expected = NotValidValueException.class)
    public void shouldAppearExceptionIfStringLong(){
        StringNumbers stringNumbers = new StringNumbersImpl();
        String numbers = "1,2,3,4,5,6,7";
        Integer sum = stringNumbers.add(numbers);
        Assert.assertNotNull(sum);
    }
    @Test(expected = NotValidValueException.class)
    public void shouldHaveOnlyNumsAndSeparatorsInLine(){
        StringNumbers stringNumbers = new StringNumbersImpl();
        String numbers = "1,d";
        Integer sum = stringNumbers.add(numbers);
        Assert.assertNotNull(sum);
    }
}
