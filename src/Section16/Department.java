package Section16;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employeez> employeezs;

    public Department(String name) {
        this.name = name;
        employeezs = new ArrayList<>();
    }

    public void addEmployee(Employeez employeez) {
        employeezs.add(employeez);
    }

    public List<Employeez> getEmployeezs() {
        return employeezs;
    }
}
