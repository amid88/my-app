package com.amid88.app.utils.runners;

import com.amid88.app.utils.converters.PrimitiveConverter;

/**
 * Created by dstrashko on 11/15/16.
 */
public class Lesson3Runner {

    public static void main (String args[]){

        PrimitiveConverter converter = new PrimitiveConverter();
        converter.floatToChar(234234);
        converter.intToChar(123);
        converter.charToInt('*');

    }


}
