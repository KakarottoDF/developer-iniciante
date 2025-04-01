

public class View {
    /**
     * Enquanto o usuário desejar você deve permitir ele adicionar uma franquia.
     * O estagiário deve ter errado alguma coisa fique atento.
     * Altere o que for necessário para que o sistema evite franquias repetidas (mesmo código).
     * Em caso de repetição apresente uma mensagem: "Franquia já cadastrada".
     */
    public static Anatel lerAnatel(){
        Anatel anatel = new Anatel();

        while (true) {
            Franquia novaFranquia = lerFranquia();

            boolean adicionou = anatel.adicionar(novaFranquia);
            if (!adicionou) { // Se já foi cadastrada, não pergunta novamente
                continue;
            }

            String opcao = Leitura.lerString("Deseja adicionar outra franquia? (s/n): ");
            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
        }
        return anatel;
    }

    public static Franquia lerFranquia() {
        Franquia franquia = new Franquia();
        franquia.nome = Leitura.lerString("Insira o nome da franquia: ");
        franquia.codigo = Leitura.lerString("Insira o código: ");
        franquia.quantidadeGB = Leitura.lerInt("Insira o quantidade de GB: ");
        return franquia;
    }
}
