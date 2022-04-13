package com.devmountain.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        return LocalDate.now();
    }

    public LocalDateTime getNowForDateAndTime() {
        return LocalDateTime.now();
    }

    public DayOfWeek getDayOfWeekForNow() {
        return LocalDateTime.now().getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        return LocalDateTime.now().getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        return LocalDateTime.now().getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        //Return Method ZoneDateTime for now
        //invoke the method .withZoneSameInstant with argument of a specific ZoneId
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/London"));
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/Moscow"));
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
    }



}
