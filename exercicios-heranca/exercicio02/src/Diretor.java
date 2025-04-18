public class Diretor extends Funcionario{
    private int dependentes;

    public int getDependentes() {
        return this.dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getContribuicaoSindical(){
        return getSalario() - (getSalario() * 0.01);
    }

    @Override
    public String toString() {
        return "\nDIRETOR " + getNome() + ": " +
                "\nCPF: " + getCpf() +
                "\nSALÁRIO BRUTO R$ " + getSalario() +
                "\nQUANTIDADE DE DEPENDENTES: " + getDependentes() + (getDependentes() > 0 ? "\nO SALÁRIO DESTE DIRETOR É DE R$ " + getContribuicaoSindical() : "\nO SALÁRIO DESTE DIRETOR É DE R$ " + getSalario()) + "\n ";
    }
}