package dio.padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/* Projeto Spring Boot criado com Spring Initializr */
/* Com os módulos
 * - Spring Web
 * - OpenFeign
 * - H2 Database
 * - Spring Data JPA
 * 
 * Adicionado posteriormente:
 * - SpringFox
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
