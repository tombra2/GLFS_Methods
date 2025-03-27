package at.htl.klu.methods;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate birthday = LocalDate.of(1999, 12, 31);
        System.out.println(birthday);

        LocalDate realBirthday = birthday.plusYears(53);
        System.out.println(realBirthday);
    }


    public static boolean isMyNextBirthdayOnWeekend(LocalDate birthday) {


        return true;
    }

    public static int daysInBetween(LocalDate date1, LocalDate date2) {
        return 0;
    }

    public static int daysAlive(LocalDate birthday) {
        return 0;
    }
}
