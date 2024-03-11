package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Carro extends Veiculo{

    private int numeroPortas;
    private String cambio;

    public Carro(int numeroPortas, String cambio) {
        this.numeroPortas = numeroPortas;
        this.cambio = cambio;
    }

    public Carro() {

    }
    public Carro(long id, String marca, String cor, double preco, String ano, int numeroPortas, String cambio) {
        super(id, marca, cor, preco, ano);
        this.numeroPortas = numeroPortas;
        this.cambio = cambio;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
}
