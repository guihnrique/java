package com.java.estudos.java;

public class Aluno extends Pessoa{
    
    private int classe;
    private double nota;
    private int modulo;

    public Aluno(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public Aluno(String nome, int idade, String cpf, int modulo) {
        super(nome, idade, cpf);
        this.modulo = modulo;
    }

    public void setClasse(int classe){
        this.classe = classe;
    }

    public int getClasse(){
        return this.classe;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota(){
        return this.nota;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getModulo(){
        return this.modulo;
    }
}
