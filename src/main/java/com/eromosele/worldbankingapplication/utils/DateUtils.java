package com.eromosele.worldbankingapplication.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String dateToString(LocalDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofPattern("YYYY-MM-dd'T'HH:mm:ss"));
    }
}
