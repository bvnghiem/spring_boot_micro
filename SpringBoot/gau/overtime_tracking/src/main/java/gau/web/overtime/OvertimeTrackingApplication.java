package gau.web.overtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("gau.web.overtime.*")
public class OvertimeTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvertimeTrackingApplication.class, args);
	}

}
