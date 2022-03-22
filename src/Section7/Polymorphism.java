package Section7;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "shark eats people";
    }
}

class Tarzan extends Movie {
    public Tarzan() {
        super("Tarzan");
    }

    @Override
    public String plot() {
        return "man living in a jungle";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "people escape the maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "forces try to take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("forgetable");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(" movie #" + i + " " + movie.getName() + "\n" + " plot " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number is " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Forgetable();
            case 3:
                return new MazeRunner();
            case 4:
                return new Tarzan();
            case 5:
                return new StarWars();

        }
        return null;
    }
}
