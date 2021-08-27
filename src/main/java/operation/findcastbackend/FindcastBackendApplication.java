package operation.findcastbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="operation.findcastbackend")
@SpringBootApplication
public class FindcastBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindcastBackendApplication.class, args);
	}

}
