package com.java.estudos.java;

public class Funcionario extends Pessoa {

    protected String funcao;
    protected String cargo;

    public Funcionario(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }
}
