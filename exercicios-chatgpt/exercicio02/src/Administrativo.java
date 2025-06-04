import java.util.Calendar;

public class Administrativo extends Funcionario{
    private int dependentes;
    private Calendar dataAdmissao;

    public Administrativo(String nome, String cpf, double salario, int dependentes, Calendar dataAdmissao) {
        super(nome, cpf, salario);
        setDependentes(dependentes);
        setDataAdmissao(dataAdmissao);
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
