package com.yangweiye.impl;

import com.yangweiye.common.HttpResult;
import com.yangweiye.common.ResultEnum;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseTest {
    @Test
    public void test() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        String format = simpleDateFormat.format(new Date());
        Calendar instance = Calendar.getInstance();
        System.out.println(format);
        System.out.println(instance.get(Calendar.YEAR));
        instance.add(Calendar.SECOND, -1);
        System.out.println(instance.getTime());
    }

    @Test
    public void testEnum() {
        Integer[] arr = {1, 2, 3};
        System.out.println(HttpResult.success(arr));
    }
}
