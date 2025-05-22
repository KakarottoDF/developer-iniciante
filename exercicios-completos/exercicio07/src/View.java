public class View {

    public static AgentePublico alimentarAgentePublico(){
        return new AgentePublico(
                Reader.lerString("Informe o nome do agente: "),
                Reader.lerString("Informe a matrícula deste agente: ")
        );
    }

    public static AtoAdministrativo alimentarArrayAtoAdministrativo() {
        AgentePublico agente = alimentarAgentePublico();
        String assunto = Reader.lerString("Informe o assunto do ato administrativo: ");


        String exposicao = Reader.lerString("Informe a exposição de motivos: ");
        return new AtoAdministrativo(agente, assunto, exposicao);

    }

    public static void cadastrarAtoAdministrativo(ControleDeAtosAdministrativos controleDeAtosAdministrativos){
        controleDeAtosAdministrativos.adicionar(alimentarArrayAtoAdministrativo());

    }
}
