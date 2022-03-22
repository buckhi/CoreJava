package Section5;

public class Ex {
    public static void printNumberInWord(int number) {
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 0) {
            System.out.println("ZERO");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }

    }

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000.0,2.0));
//        for (int i =0; i<5;i++) {
//            System.out.println("hello " + i);
//        }

        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(1000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(1000.0, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime");
                if (count == 10) {
                    System.out.println("exit");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            System.out.println("looping" + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int n) {
        if (n <= 0) {
            return false;
        }
        return n % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (start <= 0) || (end <= 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
