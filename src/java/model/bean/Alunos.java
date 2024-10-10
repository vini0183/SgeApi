package model.bean;

import java.util.List;

public class Alunos {
    
    private int id_alunos;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String imagem;
    
    private List<Tarefa> terefa;

    public Alunos() {
    }

    public Alunos(int id_alunos, String nome, String sobrenome, String cpf, String imagem, List<Tarefa> terefa) {
        this.id_alunos = id_alunos;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.imagem = imagem;
        this.terefa = terefa;
    }

    public int getId_alunos() {
        return id_alunos;
    }

    public void setId_alunos(int id_alunos) {
        this.id_alunos = id_alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Tarefa> getTerefa() {
        return terefa;
    }

    public void setTerefa(List<Tarefa> terefa) {
        this.terefa = terefa;
    }
    
    
    
    
}
