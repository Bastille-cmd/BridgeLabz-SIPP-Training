import java.util.*;

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}

class Customer {
    String name;
    List<Bank> banks = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Viewing balance for " + name);
    }

    void addBank(Bank bank) {
        banks.add(bank);
    }
}