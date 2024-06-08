package model;

public class Curso {

    // Atributos
    private String nome;
    private String instrutor;

    // Construtor
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public void setInstrutor(String instrutor) {
        if (instrutor != null && !instrutor.isEmpty()) {
            this.instrutor = instrutor;
        } else {
            throw new IllegalArgumentException("Nome de instrutor inválido");
        }
    }

}