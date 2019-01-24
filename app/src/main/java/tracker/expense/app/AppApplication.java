package tracker.expense.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "tracker.expense")

public class AppApplication {
        
    /*@Bean
    public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter(){
        return new ApplicationSecurity();
    }*/
    
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}

