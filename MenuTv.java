//Pedro Henrique Zanatta de Oliveira RA:2601443
public class MenuTv {

    private Televisao tv ;
    private Leitura l = new Leitura();
    private GerTv gt = new GerTv();

    public void menuT() {
        int opc, indice;

        do {
            tv = new Televisao();
            tv.menu();
            System.out.println("\n1) Cadastrar nova Televisao");
            System.out.println("2) Televisoes no Estoque");
            System.out.println("3) Consultar televisao pelo indice");
            System.out.println("4) Remover Televisao pelo indice");
            System.out.println("5) Atualizar Televisao pelo indice");
            System.out.println("0) Sair");
            opc = Integer.parseInt(l.entDados("Digite uma opcao: "));

            switch(opc) {
                case 1:
                    System.out.println("Cadastrar nova Televisao");
                    tv = new Televisao();
                    tv = gt.cadTv(tv);
                    tv.cadastro();
                    break;
                case 2:
                    System.out.println("Estoque de Televisoes");
                    gt.estoqueTelevisao(); 
                    break;
                case 3:
                    System.out.println("Consultar Televisao pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser consultado: "));
                    tv = gt.consultaTv(indice);
                    if(tv != null)
                        gt.impTv(indice);
                    else
                        System.out.println("\nNao existe esse indice. Nenhum produto foi encontrado.");
                    break;
                case 4:
                    System.out.println("Remover Televisao pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser removido: "));
                    tv = gt.consultaTv(indice);
                    if(tv != null){
                        gt.removeTv(indice); 
                        tv.remover();
                    } else {
                        System.out.println("Nao existe esse indice. Nenhum produto foi excluido.");
                    }
                    break;
                case 5:
                    System.out.println("Atualizar Televisao pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser atualizado: "));
                    tv = gt.consultaTv(indice);
                    if(tv != null){
                        gt.atualizarTv(indice); 
                    } else {
                        System.out.println("Nao existe esse indice. Nenhum produto foi atualizado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao Invalida. Tente novamente.");
            }
        } while(opc != 0);
    }
}
