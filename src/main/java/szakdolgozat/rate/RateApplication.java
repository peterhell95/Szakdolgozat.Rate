package szakdolgozat.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateApplication.class, args);
    }

}
