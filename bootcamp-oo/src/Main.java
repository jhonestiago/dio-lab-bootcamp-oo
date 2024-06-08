import java.time.LocalDateTime;

import model.Bootcamp;
import service.BootcampService;

public class Main {

    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento");

        BootcampService bootcampService = new BootcampService();

        // Adicionando cursos
        bootcampService.adicionarCurso(bootcamp, "Java Fundamentals", "João Silva");
        bootcampService.adicionarCurso(bootcamp, "Web Development", "Maria Oliveira");

        // Adicionando mentorias
        bootcampService.adicionarMentoria(bootcamp, "Dicas para carreira de desenvolvedor", LocalDateTime.now());
        bootcampService.adicionarMentoria(bootcamp, "Introdução ao Git", LocalDateTime.now().plusHours(1));

        // Adicionando devs
        bootcampService.adicionarDev(bootcamp, "Lucas Souza", "Junior");
        bootcampService.adicionarDev(bootcamp, "Ana Santos", "Pleno");

        // Visualizando cursos, mentorias e devs
        bootcamp.visualizarCursos();
        bootcamp.visualizarMentorias();
        bootcamp.visualizarDevs();
    }
}
