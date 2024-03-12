package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Gerente extends Funcionario {
    private int senha;
    private int numFuncGerenciados;

    public Gerente() {
    }

    public Gerente(Long id, double salario, int senha, int numFuncGerenciados) {
        super(id, salario);
        this.senha = senha;
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public Gerente(String nome, String cpf, String idade, Long id, double salario, int senha, int numFuncGerenciados) {
        super(nome, cpf, idade, id, salario);
        this.senha = senha;
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public Gerente(String cpf, String idade, Long id, String nome, double salario, int senha, int numFuncGerenciados) {
        super(cpf, idade, id, nome, salario);
        this.senha = senha;
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public Gerente(int senha, int numFuncGerenciados) {
        this.senha = senha;
        this.numFuncGerenciados = numFuncGerenciados;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
}
