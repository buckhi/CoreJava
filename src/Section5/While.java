package Section5;

public class While {
    public static void main(String[] args) {
        int count = 6;
        while (count != 6) {
            System.out.println(count + "cont");
            count++;
        }
        for (int i = 6; i != 6; i++) {
            System.out.println(count);
        }
        count = 4;
        do {
            System.out.println(count);
            count++;
            if (count > 100) {
                break;
            }

        } while (count != 6);
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println(count);
//            count++;
//        }
        System.out.println("****");
        int number = 4;
        int endNumber = 20;
        count = 0;

        while (number <= endNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println(number);
            count++;
            if (count>=5){
                break;
            }
        }
        System.out.println("total found" + count);



    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
