package src.Core.Java8Review.Java808_NewDateTimeApi;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class LocalDateTimeApi {

    public static void main(String[] main) {
        testLocalDateTime();
        testZonedDateTime();
        testChronoUnits();
        testPeriod();
        testDuration();
        testAdjusters();
        testBackwardCompatability();
    }

    public static void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + localDateTime);

        LocalDate date1 = localDateTime.toLocalDate();
        System.out.println("date1: " + date1);

        LocalTime time1 = localDateTime.toLocalTime();
        System.out.println("time1: " + time1);

        Month month = localDateTime.getMonth();
        int day = localDateTime.getDayOfMonth();
        int seconds = localDateTime.getSecond();

        System.out.println("Month: " + month + ", day: " + day + ", seconds: " + seconds);
        System.out.println("Day of week: " + localDateTime.getDayOfWeek());
        System.out.println("Day of year: " + localDateTime.getDayOfYear());

        LocalDateTime date2 = localDateTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }

    public static void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("Zoned Date Time: " + zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Zone Id: " + zoneId);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current Zone: " + currentZone);
    }

    public static void testChronoUnits() {
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate nextDay = today.plus(1, ChronoUnit.DAYS);
        System.out.println("Next day: " + nextDay);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
    }

    public static void testPeriod() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    public static void testDuration() {
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);
    }

    public static void testAdjusters() {
        //Get the current date
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date: " + localDate);

        //get the next tuesday
        LocalDate nextTuesday = localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(localDate.getYear(), localDate.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(
                TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }

    public static void testBackwardCompatability() {
        //Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        //Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println("Zoned date: " + zonedDateTime);
    }
}
