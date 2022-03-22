package Section8;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    private ArrayList<Branch> branches;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
        this.branches = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existedCustomer = findCustomer(customerName);
        if (findCustomer(customerName) != null) {
            existedCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (this.customers.get(i).getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;

    }

//    public boolean addBranch(String brandName) {
//        if (findBranch(brandName) == null) {
//            this.branches.add(new Branch(brandName));
//            return true;
//
//        }
//        return false;
//    }
//
//    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
//        Branch branch = findBranch(branchName);
//        if (branchName != null) {
//            return branch.newCustomer(customerName, initialAmount);
//
//        }
//        return false;
//    }
//
//    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
//        Branch branch = findBranch(branchName);
//        if (branch!=null) {
//            return branch.addCustomerTransaction(customerName,amount);
//
//        }
//        return false;
//    }


    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;

    }

}
