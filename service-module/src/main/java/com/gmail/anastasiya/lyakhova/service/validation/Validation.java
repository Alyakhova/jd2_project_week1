package com.gmail.anastasiya.lyakhova.service.validation;

import com.gmail.anastasiya.lyakhova.service.exception.NotValidValueException;

public class Validation  {

    public static void maximumLength(String[] array){
        if (array.length>2) {
            throw new NotValidValueException();
        }
    }

    public static void isOnlyNums(String line){
        if(line.matches("[A-Za-zА-Яа-я]")){
            throw new NotValidValueException();
        }
    }
}
