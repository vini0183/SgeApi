package model.bean;

import java.util.Date;

public class Tarefa {
    
    private int id_tarefa;
    private String nome_tarefa;
    private String descricao;
    private Date data_entrega;
    private int fk_id_turma;
    
    private int id_notas;
    private float nota;
    private int fk_id_aluno;
    private int fk_id_tarefa;
    
    private int id_turma;
    private String nome_turma;
    private int fk_id_professor_disciplina;

    public Tarefa() {
    }

    public Tarefa(int id_tarefa, String nome_tarefa, String descricao, Date data_entrega, int fk_id_turma, int id_notas, float nota, int fk_id_aluno, int fk_id_tarefa, int id_turma, String nome_turma, int fk_id_professor_disciplina) {
        this.id_tarefa = id_tarefa;
        this.nome_tarefa = nome_tarefa;
        this.descricao = descricao;
        this.data_entrega = data_entrega;
        this.fk_id_turma = fk_id_turma;
        this.id_notas = id_notas;
        this.nota = nota;
        this.fk_id_aluno = fk_id_aluno;
        this.fk_id_tarefa = fk_id_tarefa;
        this.id_turma = id_turma;
        this.nome_turma = nome_turma;
        this.fk_id_professor_disciplina = fk_id_professor_disciplina;
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public int getFk_id_turma() {
        return fk_id_turma;
    }

    public void setFk_id_turma(int fk_id_turma) {
        this.fk_id_turma = fk_id_turma;
    }

    public int getId_notas() {
        return id_notas;
    }

    public void setId_notas(int id_notas) {
        this.id_notas = id_notas;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getFk_id_aluno() {
        return fk_id_aluno;
    }

    public void setFk_id_aluno(int fk_id_aluno) {
        this.fk_id_aluno = fk_id_aluno;
    }

    public int getFk_id_tarefa() {
        return fk_id_tarefa;
    }

    public void setFk_id_tarefa(int fk_id_tarefa) {
        this.fk_id_tarefa = fk_id_tarefa;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public int getFk_id_professor_disciplina() {
        return fk_id_professor_disciplina;
    }

    public void setFk_id_professor_disciplina(int fk_id_professor_disciplina) {
        this.fk_id_professor_disciplina = fk_id_professor_disciplina;
    }
    
    
    
    
}
