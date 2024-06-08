package model;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    // Atributos
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    // Construtor
    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    // Métodos de Cursos
    // Adiciona um novo curso
    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    // Remove um curso
    public void removerCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    // Visualiza todos os cursos
    public void visualizarCursos() {
        System.out.println("Cursos:");
        int i = 1;
        for (Curso curso : this.cursos) {
            System.out.println(i + " - " + curso.getNome());
            i++;
        }
    }

    // Métodos de Mentoria
    // Adiciona uma nova mentoria
    public void adicionarMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }

    // Remove uma mentoria
    public void removerMentoria(Mentoria mentoria) {
        this.mentorias.remove(mentoria);
    }

    // Visualiza todas as mentorias
    public void visualizarMentorias() {
        System.out.println("Mentorias:");
        int i = 1;
        for (Mentoria mentoria : this.mentorias) {
            System.out.println(i + " - " + mentoria.getTitulo());
            i++;
        }
    }

    // Métodos de Dev
    // Adiciona um novo dev
    public void adicionarDev(Dev dev) {
        this.devs.add(dev);
    }

    // Remove um dev
    public void removerDev(Dev dev) {
        this.devs.remove(dev);
    }

    // Visualiza todos os devs
    public void visualizarDevs() {
        System.out.println("Devs:");
        int i = 1;
        for (Dev dev : this.devs) {
            System.out.println(i + " - " + dev.getNome());
            i++;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

}
