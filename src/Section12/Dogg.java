package Section12;

public class Dogg {

    private final String name;

    public Dogg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Dogg) {
            String objectName = ((Dogg) object).getName();
            return this.name.equals(objectName);
        }
        return false;
    }
}
