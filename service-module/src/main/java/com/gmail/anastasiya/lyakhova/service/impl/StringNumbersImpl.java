package com.gmail.anastasiya.lyakhova.service.impl;

import com.gmail.anastasiya.lyakhova.service.StringNumbers;
import com.gmail.anastasiya.lyakhova.service.exception.NotValidValueException;
import com.gmail.anastasiya.lyakhova.service.validation.Validation;


public class StringNumbersImpl implements StringNumbers  {

    @Override
    public Integer add(String numbers) {

        if(numbers.isEmpty()){
            return 0;
        }
        String separator = ", *|: *|\\n *|\\| *";
        Validation.isOnlyNums(numbers);
        String[] arrayNumbers = numbers.split(separator);
        Validation.maximumLength(arrayNumbers);

        Integer sum = 0;

        for (String arrayNumber : arrayNumbers) {
            sum+=Integer.parseInt(arrayNumber);
        }

        return sum;
    }


}
