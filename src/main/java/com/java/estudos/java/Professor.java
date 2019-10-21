package com.java.estudos.java;

public class Professor extends Funcionario{

    private int classe;
    private int modulo;

    public Professor(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getClasse() {
        return classe;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getModulo() {
        return modulo;
    }
}
