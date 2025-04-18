public class Administrativo extends Funcionario{
    private int dependentes;

    public int getDependentes() {
        return this.dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getContribuicaoSindical(){
        return getSalario() + (getSalario() * 0.01);
    }

    @Override
    public String toString() {
        return "\nDiretor " + getNome() + ": " +
                "\nQuantidade de Dependentes: " + getDependentes() + (getDependentes() > 0 ? "\nO salário deste Diretor é de R$ " + getContribuicaoSindical() : "\nO salário deste Diretor é de R$ " + getSalario());
    }
}