package com.example.aula_spring.model;

public class Tarefa {
    private Long id;
    private String tarefa;
    private boolean tarefaConcluida;

    public Tarefa() {
    }

    public Tarefa(Long id, String tarefa, boolean tarefaConcluida) {
        this.id = id;
        this.tarefa = tarefa;
        this.tarefaConcluida = tarefaConcluida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
}
