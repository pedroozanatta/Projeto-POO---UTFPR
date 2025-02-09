//Pedro Henrique Zanatta de Oliveira RA:2601443
public class Principal {

    public static void main(String[] args) {

        MenuTv mt = new MenuTv();
        MenuFogao mf = new MenuFogao();
        MenuGeladeira mg = new MenuGeladeira();
        Leitura l = new Leitura();
        int opc = 1;

        do {
            System.out.println();
            System.out.println("\tMenu Principal");
            System.out.println("1) Menu de Televisoes");
            System.out.println("2) Menu de Fogoes");
            System.out.println("3) Menu de Geladeira");
            System.out.println("4) Informacoes sobre Lojas e Fornecedores");
            System.out.println("0) Sair");

            try {
                opc = Integer.parseInt(l.entDados("Escolha uma Opção: "));
            } catch (NumberFormatException nfe) {
                System.out.println("\nA opção digitada não deve ser uma letra. Tente novamente.");
            }

            switch (opc) {
                case 1:
                    mt.menuT();
                    break;
                case 2:
                    mf.menuF();
                    break;
                case 3:
                    mg.menuG();
                    break;
                case 4:
		            Eletrodomestico e1 = new Fogao(); // Polimorfismo por Coerção

                    System.out.println("\nEmpresa: " + e1.getLj().getEmpresa());
                    System.out.println("CNPJ: " + e1.getLj().getCnpj());
                    System.out.println("Nome do Fornecedor: " + e1.getForn().getNome());
                    System.out.println("Telefone do Fornecedor: " + e1.getForn().getTel());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao Invalida. Tente Novamente");
                    break;
            }
        } while (opc != 0);
    }
}