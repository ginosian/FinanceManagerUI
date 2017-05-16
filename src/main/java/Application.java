import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Martha on 4/4/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("com.financeui")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}

