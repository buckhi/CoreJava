package Section4;

public class Keywords {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 5000;
        int level = 5;
        int bonus = 421;
        int highS = calculateStore(gameover, score, level, bonus);
        System.out.println("final score high" + highS);

        if (gameover) {
            int finalS = score + (level * bonus);
            System.out.println(finalS);
        }


        score = 10000;
        level = 8;
        bonus = 200;
        if (gameover) {
            int secondS = score + (level * bonus);
            System.out.println(secondS);
        }

        calculateStore(true, score, level, bonus);
        calculateStore(true, 1000, 8, 200);

        int position = calculatePosition(1500);
        displayHighScorePosition("Hai", position);

        position = calculatePosition(400);
        displayHighScorePosition("Tim", position);

        position = calculatePosition(900);
        displayHighScorePosition("Tom", position);

        position = calculatePosition(30);
        displayHighScorePosition("Bob", position);
    }

    public static int calculateStore(boolean gameover, int score
            , int level, int bonus) {

        if (gameover) {
            int finalS = score + (level * bonus);
            finalS += 2000;
            return finalS;
        }


//        score = 10000;
//        level = 8;
//        bonus = 200;
//        if (gameover) {
//            int secondS = score + (level * bonus);
//            System.out.println(secondS);
//        }
//

        return -1;
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on high score table");

    }

    public static int calculatePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500  ) {
//            return 2;
//        } else if (playerScore >= 100 ) {
//            return 3;
//        }
//            return 4;
//
//
//
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;

        } else if (playerScore >= 500) {
            position = 2;

        } else if (playerScore >= 100)
        {
            position = 3;
        }
        return position;
    }
}

