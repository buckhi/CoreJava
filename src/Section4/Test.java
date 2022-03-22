package Section4;

public class Test {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megabytes = Math.round(kiloBytes / 1024);
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        } else if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        }
    }

    //Ex 3
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24) && barking == true) {
            System.out.println(barking);
        } else if (barking = false && (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) {
            System.out.println(barking);
        } else if (!(hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) {
            System.out.println(barking = false);
        }
        return barking;

    }

    //Ex 4
    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if (leapYear = ((year >= 1 && year <= 9999) && year % 100 == 0 && year % 400 == 0) ? true : false) {
            System.out.println(leapYear);
        } else if (leapYear != year >= 1 && year <= 9999 && year % 4 != 0 && year % 100 != 0 ? true : false) {
            System.out.println(leapYear);
        } else if (leapYear = year >= 1 && year <= 9999 && year % 400 != 0 && year % 100 != 0 ? true : false) {
            System.out.println(leapYear);
        } else if (leapYear != year >= 1 && year <= 9999 || year % 400 != 0 || year % 100 != 0 ? true : false) {
            System.out.println(leapYear);
        } else if (leapYear != (year >= 1 && year <= 9999 && year % 400 == 0 || year % 100 == 0) ? true : false) {
            System.out.println(leapYear);
        } else if (leapYear = (year >= 1 && year <= 9999 && year % 100 == 0) ? true : false
        ) {
            System.out.println(leapYear);
        }
        return leapYear;
    }

    //Ex 5
    public static boolean areEqualByThreeDecimalPlaces(double mot, double hai) {
        boolean verify;
        int one = (int) (mot * 1000);
        int two = (int) (hai * 1000);

        if (verify = one == two ? true : false) {
            System.out.println(verify);

        }

        return verify;
    }

    //Ex 6
    public static boolean hasEqualSum(int mot, int hai, int ba) {
        boolean verify;
        if (verify = ((mot + hai) == ba) ? true : false) {
            System.out.println(verify);
        }

        return verify;
    }

    //Ex 7
    public static boolean hasTeen(int mot, int hai, int ba) {
        boolean verify;
        if (verify = ((mot >= 13 && mot <= 19) || (hai >= 13 && hai <= 19) || (ba >= 13 && ba <= 19)) ? true : false) {
            System.out.println(verify);
        }
        return verify;
    }

    public static boolean isTeen(int mot) {
        boolean verify;
        if (verify = (mot >= 13 && mot <= 19) ? true : false) {
            System.out.println(verify);
        }
        return verify;
    }


}



