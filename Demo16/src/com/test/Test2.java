package com.test;

import java.time.*;

public class Test2 {
    /*
    2020-01-20T03:21:50.144Z
    2020-01-20
    11:21:50.259
    2020-01-20T11:21:50.259
    2020-01-20T11:21:50.259+08:00[Asia/Shanghai]
     */
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Instant instant = clock.instant();
        System.out.println(instant.toString());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime.toString());
        System.out.println(String.join("abc","efg"));
    }


}
