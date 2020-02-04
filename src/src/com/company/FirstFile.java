package src.com.company;

import java.time.DateTimeException;
import java.time.DayOfWeek;



    public enum FirstFile{

        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

    private DayOfWeek dayOfWeek;



    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    }

