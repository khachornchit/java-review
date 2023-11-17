package chorn.in.th.advantage;

import java.time.*;

public class DateAndTimeApi {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
    }
}
