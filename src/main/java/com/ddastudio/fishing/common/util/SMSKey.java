package com.ddastudio.fishing.common.util;

import java.util.Random;

public class SMSKey {

    public static String getKey(int length) {
        Random random = new Random(System.currentTimeMillis());
        int seedSize = 10;
        int range = (int)Math.pow(seedSize, length);
        int trim = (int)Math.pow(seedSize, length-1);
        int result = random.nextInt(range)+trim;
        return String.valueOf(result > range ? result - trim : result);
    }
}
