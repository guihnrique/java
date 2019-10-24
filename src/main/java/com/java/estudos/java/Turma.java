package com.java.estudos.java;

public class Turma {

    private int qtdAlunos;
    private int modulo;
    private int turma;

    public Turma(int modulo, int turma){
        this.qtdAlunos = 0;
        this.modulo = modulo;
        this.turma = turma;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}
