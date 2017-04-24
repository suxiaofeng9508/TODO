package com.loveqh.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by WL on 2017-04-24.
 */
public class MyDateUtil {

    public static Date getDateByDelta(Date date, int d) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, d);
        return calendar.getTime();
    }
}
