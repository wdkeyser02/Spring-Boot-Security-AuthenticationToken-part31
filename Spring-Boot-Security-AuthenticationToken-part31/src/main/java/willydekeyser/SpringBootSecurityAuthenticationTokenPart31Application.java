package willydekeyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug=true)
public class SpringBootSecurityAuthenticationTokenPart31Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAuthenticationTokenPart31Application.class, args);
	}

}
