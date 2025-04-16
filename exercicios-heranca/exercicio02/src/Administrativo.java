public class Administrativo extends Funcionario{
    private int dependentes;

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
        return "Administrativo{" +
                "dependentes=" + getDependentes() +
                ", administrativo=" + getAdministrativo() +
                '}';
    }
}
