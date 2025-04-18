public class Diretor extends Funcionario{
    private int dependentes;

    public Diretor(String nome, String cpf, double salario, int dependentes) {
        super(nome, cpf, salario);
        setDependentes(dependentes);
    }

    public int getDependentes() {
        return this.dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getContribuicaoSindical(){
        return getSalario() * 0.01;
    }

    @Override
    public String toString() {
        return "\nDIRETOR " + getNome() + ": " +
                "\nCPF: " + getCpf() +
                "\nSALÁRIO BRUTO R$ " + getSalario() +
                "\nQUANTIDADE DE DEPENDENTES: " + getDependentes() +
                "\nO VALOR DE CONTRIBUIÇÃO SINDICAL DESTE DIRETOR É DE R$ " + getContribuicaoSindical() +
                "\nO SALÁRIO DESTE DIRETOR SERÁ DE R$ " + (getSalario() - getContribuicaoSindical()) + "\n ";
    }
}