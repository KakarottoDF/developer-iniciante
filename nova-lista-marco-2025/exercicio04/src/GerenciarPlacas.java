public class GerenciarPlacas {
    Placas[] placas;
    final double PLACA_COM_SINAL_MLP = 0.50;
    final double ENTRADAS_ANALOGICAS = 3;
    final double QUANTIFICADOR_PRECO = 3;

    public Placas[] findPlacas(){
        return this.placas;
    }

    public static int menu(){
        int entrada;

        System.out.println("Escolha uma opção");
        System.out.println("[1]Cadastrar Placas");
        System.out.println("[2]Apresentar todas as placas");
        System.out.println("[3]Custo total com as placas");
        System.out.println("[4]Todas as placas que produzem sinal MLP");
        System.out.println("[5]Custo das placas que não produzem sinal MLP");
        entrada = Reader.lerInt("Faça a sua escolha: ", "Escolha inválida", 1, 5);

        return entrada;
    }

    public boolean placasRepetidas(Placas novaPlaca) {
        for (int i = 0; i < this.placas.length; i++) {
            if (this.placas[i] != null && this.placas[i].codigoFabricante.equals(novaPlaca.codigoFabricante)) {
                System.out.println("Placa já cadastrada.");
                return true;
            }
        }
        return false;
    }

    public double somarPlacasMLP(){
        double somatorio = 0;
        for (int i = 0; i < this.placas.length; i++) {
            if (this.placas[i] != null && this.placas[i].sinaisMLP){
                somatorio += this.placas[i].precoBase + (PLACA_COM_SINAL_MLP * this.placas[i].qtdPinosDigitais);
            }
        }
        return somatorio;
    }

    public double somarPlacas(){
        double somatorio = 0;
        for (int i = 0; i < this.placas.length; i++) {
            if (this.placas[i] != null && !this.placas[i].sinaisMLP) {
                if (this.placas[i].qtdEntradasAnalogicas <= ENTRADAS_ANALOGICAS) {
                    somatorio += this.placas[i].precoBase;
                } else {
                    somatorio += this.placas[i].precoBase * QUANTIFICADOR_PRECO;
                }
            }
        }
        return somatorio;
    }

    public double custoTotal(){
        return somarPlacasMLP() + somarPlacas();
    }
}
