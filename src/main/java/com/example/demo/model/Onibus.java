package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Onibus extends Veiculo{
    private int numeroPassageiros;
    private String servico;

    public Onibus() {
    }

    public Onibus(int numeroPassageiros, String servico) {
        this.numeroPassageiros = numeroPassageiros;
        this.servico = servico;
    }

    public Onibus(long id, String marca, String cor, double preco, String ano, int numeroPassageiros, String servico) {
        super(id, marca, cor, preco, ano);
        this.numeroPassageiros = numeroPassageiros;
        this.servico = servico;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
}
