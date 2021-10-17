package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

    Optional.ofNullable("John@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending... \n ::email to:: " + email), () -> {
                    System.out.println("Email Field Invalid or not specified");
                });


    }
}
