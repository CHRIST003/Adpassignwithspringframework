package ac.za.cput.project;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "empS")
    public Payable getEmployee() {
        return new Employee("john", "nganga", "678765");
    }

    @Bean(name = "inv")
    public Payable getInvoice() {
        return new Invoice("hksk334", "900.00", 798, 499.00);
    }

}
