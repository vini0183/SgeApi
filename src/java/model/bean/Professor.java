package model.bean;

import java.util.List;
import javafx.scene.chart.PieChart.Data;

public class Professor {
    
    private int id_professor;
    private String nome,sobrenome,senha,cpf,imagem;
    private List<Disciplina> disciplina;

    public Professor() {
    }

    public Professor(int id_professor, String nome, String sobrenome, String senha, String cpf, String imagem, List<Disciplina> disciplina) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.cpf = cpf;
        this.imagem = imagem;
        this.disciplina = disciplina;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
    
}
