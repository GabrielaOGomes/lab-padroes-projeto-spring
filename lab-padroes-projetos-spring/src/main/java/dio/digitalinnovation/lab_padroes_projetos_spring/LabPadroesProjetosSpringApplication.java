package dio.digitalinnovation.lab_padroes_projetos_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetosSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
    }

}
