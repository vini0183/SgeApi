package model.bean;

public class ProfessorDisciplina {
    
    public int fk_id_professor;
    public int fk_id_disciplina;

    public ProfessorDisciplina() {
    }

    public ProfessorDisciplina(int fk_id_professor, int fk_id_disciplina) {
        this.fk_id_professor = fk_id_professor;
        this.fk_id_disciplina = fk_id_disciplina;
    }

    public int getFk_id_professor() {
        return fk_id_professor;
    }

    public void setFk_id_professor(int fk_id_professor) {
        this.fk_id_professor = fk_id_professor;
    }

    public int getFk_id_disciplina() {
        return fk_id_disciplina;
    }

    public void setFk_id_disciplina(int fk_id_disciplina) {
        this.fk_id_disciplina = fk_id_disciplina;
    }
    
    
    
    
}
