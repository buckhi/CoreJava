package Section5;

import java.util.Locale;

public class Switch {
    public static void main(String[] args) {
        getDaysInMonth(12, 10000);
        printDayOfTheWeek(0);

        int switchValue = 21;
        switch (switchValue) {
            case 1:
                System.out.println("it is 1");
                break;

            case 2:
                System.out.println("it was 2");
                break;

            case 20:
                System.out.println("it was 20");
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        // Challenge
        char kitty = 'A';
        switch (kitty) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(kitty);
                break;
            default:
                System.out.println("no no no");
                break;
        }

        String month = "Jan";
        switch (month.toLowerCase(Locale.ROOT)) {
            case "jan":
                System.out.println(month);
                break;
            case "Feb":
                System.out.println(month);
                break;
            default:
                System.out.println("not sure");
                break;

        }


    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Wednesday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;

        }
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid day");
        }


    }

    public static boolean isLeapYear(int year) {
        if (year < 1 && year > 9999) {
            return false;
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (year >= 1 && year <= 9999) {
                    daysInMonth = 31;
                    System.out.println(daysInMonth);
                } else {
                    daysInMonth = -1;
                    System.out.println(daysInMonth);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (year >= 1 && year <= 9999) {
                    daysInMonth = 30;
                    System.out.println(daysInMonth);
                } else {
                    daysInMonth = -1;
                    System.out.println(daysInMonth);
                }

                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) && year >= 1 && year <= 9999) {
                    daysInMonth = 29;
                    System.out.println(daysInMonth);
                } else {
                    daysInMonth = 28;
                    System.out.println(daysInMonth);
                }

                break;
            default:
                daysInMonth = -1;
                System.out.println("invalid");
        }
        return daysInMonth;
    }
}

//        if ((month == 1 && month >= 12) && (year < 1 && year > 9999)) {
//            daysInMonth = -1;
//            System.out.println(daysInMonth);
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            daysInMonth = 30;
//            System.out.println(daysInMonth);
//        } else {
//            if (month == 2) {
//                daysInMonth = (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0)) ? 29 : 28);
//                System.out.println(daysInMonth);
//            } else {
//                daysInMonth = 31;
//                System.out.println(daysInMonth);
//            }
//        }

