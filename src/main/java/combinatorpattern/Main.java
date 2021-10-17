package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice Smith",
                "alice.smith@email.com",
                "+0998392213",
                LocalDate.of(2004, 1, 4)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

    }
}
