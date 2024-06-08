package model;

public class Dev {
    
    // Atributos
    private String nome;
    private String nivel;

    // Construtor
    public Dev(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        if (nivel != null && !nivel.isEmpty()) {
            this.nivel = nivel;
        } else {
            throw new IllegalArgumentException("Nível inválido");
        }
    }
}
