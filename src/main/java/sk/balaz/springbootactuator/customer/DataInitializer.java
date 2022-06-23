package sk.balaz.springbootactuator.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        customerService.createCustomer(new Customer(null, "Test1", "test1@test.com"));
        customerService.createCustomer(new Customer(null, "Test2", "test2@test.com"));
    }
}
