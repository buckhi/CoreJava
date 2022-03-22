package Section4;

import javax.print.DocFlavor;
import java.util.EventListener;

public class Methods {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
//        int newS = calculateScore("Hai", 500);
//        System.out.println(newS);
//
//        calculateScore(21);
//
//        calculateScore();
//        double centimeters = calcFeetAndInchesToCentimeters(5, 1);
//        if (centimeters < 0.0) {
//            System.out.println("invalid");
//        }
//
//        calcFeetAndInchesToCentimeters(100);
//        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(3945L));
//        System.out.println(getDurationString(-231));
        area(1.0);
        area(10.0, 5.0);
        printYearsAndDays(561600);
        printEqual(1, 1, 1);
        isCatPlaying(false, 3);
    }

//    public static int calculateScore(String name, int score) {
//        System.out.println(name + " " + score);
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println(score);
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("");
//        return 0;
//    }
//
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//        if ((feet < 0) || (inches < 0) && (inches > 12)) {
//            System.out.println("invalid");
//            return -1;
//        }
//
//        double centimeters = (feet * 12) * 2.54;
//        centimeters += inches * 2.54;
//        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm ");
//        return centimeters;
//    }
//
//    public static double calcFeetAndInchesToCentimeters(double inches) {
//        if (inches < 0) {
//            return -1;
//        }
//        double feet = (int) inches / 12;
//        double remainingInches = (int) inches % 12;
//        System.out.println(inches + "inches" + feet + "feet" + remainingInches);
//        return calcFeetAndInchesToCentimeters(feet, remainingInches);
//    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String hoursString = hours + " h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + " m ";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + " s ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSec = seconds % 60;
        return getDurationString(minutes, remainingSec);
    }

    public static double area(double radius) {
        double PI = (double) Math.PI;
        double circle = (double) radius * radius * PI;
        if (radius < 0) {
            return -1.0;
        } else if (radius == 0.0) {
            System.out.println(0.0);
        } else if (radius == 1.0) {
            System.out.println(circle);
        } else if (radius > 0) {
            System.out.println(circle);
        }
        return circle;
    }

    public static double area(double x, double y) {
        double PI = (double) Math.PI;
        double rectangle = (double) x * y;
        double circle = (double) x * y * PI;
        if (x < 0 || y < 0) {
            return -1;
        } else if (x > 0.0 && y > 0.0) {
            System.out.println(rectangle);
            System.out.println(circle);
        } else if (x == 0 & y == 0) {
            return 0.0;
        }
        return rectangle;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long years = (long) minutes / 525600;
        long minutesRemaining = (minutes - (years * 525600));
        long daysRemaining = (long) minutesRemaining / 1440;
        if (minutes > 0) {
            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d ");
        } else if (minutes == 0) {
            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d ");
        }
    }

    public static void printEqual(int mot, int hai, int ba) {
        if (mot < 0 || hai < 0 || ba < 0) {
            System.out.println("Invalid Value");
        } else if (mot == hai && hai == ba) {
            System.out.println("All numbers are equal");
        } else if (mot != hai && hai != ba && mot != ba) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }


}