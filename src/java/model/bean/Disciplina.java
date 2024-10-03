package model.bean;

public class Disciplina {
    
    public int id_disciplina;
    public String nome_disciplina;
    public int fk_id_area;

    public Disciplina() {
    }

    public Disciplina(int id_disciplina, String nome_disciplina, int fk_id_area) {
        this.id_disciplina = id_disciplina;
        this.nome_disciplina = nome_disciplina;
        this.fk_id_area = fk_id_area;
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public int getFk_id_area() {
        return fk_id_area;
    }

    public void setFk_id_area(int fk_id_area) {
        this.fk_id_area = fk_id_area;
    }
    
    
    
    
}
