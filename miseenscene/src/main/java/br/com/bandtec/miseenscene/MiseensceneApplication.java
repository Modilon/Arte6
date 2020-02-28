package br.com.bandtec.miseenscene;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class MiseensceneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiseensceneApplication.class, args);
	}

}
