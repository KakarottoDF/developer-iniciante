public class Aluno extends Pessoa {
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, String curso, int periodo) {
        super(nome, matricula);
        setCurso(curso);
        setPeriodo(periodo);
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "\nALUNO:" +
                super.toString() +
                "\nCURSO: " + getCurso() +
                "\nPERÍODO: " + getPeriodo() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return getMatricula().equals(aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
