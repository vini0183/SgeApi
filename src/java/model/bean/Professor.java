package model.bean;

import javafx.scene.chart.PieChart.Data;

public class Professor {
    
    private int id_professor;
    private String nome,sobrenome,senha,cpf,imagens;

    public Professor() {
    }

    public Professor(int id_professor, String nome, String sobrenome, String senha, String cpf, String imagens) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.cpf = cpf;
        this.imagens = imagens;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }
    
    
    
}
