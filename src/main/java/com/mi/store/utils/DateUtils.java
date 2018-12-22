package com.mi.store.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtils {

    public static String currentDate() {
        String dateString = "";
        Calendar calendar = null;
        SimpleDateFormat formatter = null;
        try {
            calendar = new GregorianCalendar();
            formatter = new SimpleDateFormat("yyyy-MM-dd");
            dateString = formatter.format(calendar.getTime());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dateString;
    }
}
