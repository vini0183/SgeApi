/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Senai
 */
public class Professor {
    
    public int id_professor;
    public String nome,matricula,senha,cpf,imagens;
    public int area_id;
    public Data admissao;

    public Professor() {
    }

    public Professor(int id_professor, String nome, String matricula, String senha, String cpf, String imagens, int area_id, Data admissao) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.cpf = cpf;
        this.imagens = imagens;
        this.area_id = area_id;
        this.admissao = admissao;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public Data getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }
    
    
    
}
