package model;

import java.time.LocalDateTime;

public class Mentoria {
    
    // Atributos
    private String tema;
    private LocalDateTime dataHora;

    // Construtor
    public Mentoria(String tema, LocalDateTime dataHora) {
        this.tema = tema;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        if (tema != null && !tema.isEmpty()) {
            this.tema = tema;
        } else {
            throw new IllegalArgumentException("Tema inválido");
        }
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        if (dataHora != null) {
            this.dataHora = dataHora;
        } else {
            throw new IllegalArgumentException("Data e hora inválido");
        }
    }

}
