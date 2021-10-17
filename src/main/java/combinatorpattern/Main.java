package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice Smith",
                "alice.smith@email.com",
                "+0998392213",
                LocalDate.of(2004, 1, 4)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        System.out.println("Using combinator pattern");
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
