package Section6;

public class VIP {
    private String name;
    private double limit;
    private String email;


    public VIP(){
        this("name" ,13123.00,"default@gmail.com");
    }
    public VIP(String name, double limit) {
       this(name,limit,"unkown@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

    public VIP(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }
}
