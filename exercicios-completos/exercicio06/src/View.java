public class View {
    public Terrorista cadastrarTerroristas(){
        return new Terrorista(
                Reader.lerString("Informe o nome do Terrorista: "),
                Reader.lerInt("Informe a quantidade de explosivos deste terrorista: ")
        );
    }
}
