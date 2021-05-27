package com;

import java.util.Calendar;

public class CalendarService {

    private Calendar calendar;

    public CalendarService(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendar() {
        return calendar;
    }
}
