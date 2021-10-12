package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9999999");

        // Normal Java Function (imperative)
        greetingCustomer(maria);

        // Consumer Functuinal interface
        greetingCustomerConsumer.accept(maria);
    }

    static void greetingCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " Thanks for registering phone number " + customer.cunstomerPhoneNumber);
    }

    static Consumer<Customer> greetingCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " Thanks for registering phone number " + customer.cunstomerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String cunstomerPhoneNumber;

        Customer(String customerName, String cunstomerPhoneNumber) {
            this.customerName = customerName;
            this.cunstomerPhoneNumber = cunstomerPhoneNumber;
        }
    }

}
