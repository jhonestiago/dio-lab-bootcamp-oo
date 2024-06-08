package service;

import java.time.LocalDateTime;

import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

public class BootcampService {
    
    // Adiciona um novo curso
    public void adicionarCurso(Bootcamp bootcamp, String nomeCurso, String instrutor) {
        Curso curso = new Curso(nomeCurso, instrutor);
        bootcamp.adicionarCurso(curso);
    }

    // Adiciona uma nova mentoria
    public void adicionarMentoria(Bootcamp bootcamp, String tema, LocalDateTime dataHora) {
        Mentoria mentoria = new Mentoria(tema, dataHora);
        bootcamp.adicionarMentoria(mentoria);
    }

    // Adiciona um novo dev
    public void adicionarDev(Bootcamp bootcamp, String nomeDev, String nivel) {
        Dev dev = new Dev(nomeDev, nivel);
        bootcamp.adicionarDev(dev);
    }

}
