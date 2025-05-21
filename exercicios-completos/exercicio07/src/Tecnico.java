public class Tecnico extends AtoAdministrativo{
    private String notaTecnica;

    public String getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(String notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "notaTecnica='" + getNotaTecnica() + '\'' +
                '}';
    }
}
