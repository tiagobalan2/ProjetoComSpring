package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Bicicleta extends Veiculo{
    private int aro;
    private boolean rodinha;

    public Bicicleta() {
    }

    public Bicicleta(int aro, boolean rodinha) {
        this.aro = aro;
        this.rodinha = rodinha;
    }

    public Bicicleta(long id, String marca, String cor, double preco, String ano, int aro, boolean rodinha) {
        super(id, marca, cor, preco, ano);
        this.aro = aro;
        this.rodinha = rodinha;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public boolean isRodinha() {
        return rodinha;
    }

    public void setRodinha(boolean rodinha) {
        this.rodinha = rodinha;
    }
}
