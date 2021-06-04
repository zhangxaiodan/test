package cn.jsonzh.book.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static Date formatDate (String date) throws ParseException {

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").parse(date);


    }
}
