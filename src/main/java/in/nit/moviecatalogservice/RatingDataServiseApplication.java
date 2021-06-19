package in.nit.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingDataServiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiseApplication.class, args);
	}

}
