//Pedro Henrique Zanatta de Oliveira RA:2601443
public class MenuGeladeira {

    private Geladeira gl;
    private Leitura l = new Leitura();
    private GerGeladeira gg = new GerGeladeira();

    public void menuG() {
        int opc, indice;

        do {
            gl = new Geladeira();
            gl.menu(); 
            System.out.println("\n1) Cadastrar nova Geladeira");
            System.out.println("2) Geladeiras no Estoque");
            System.out.println("3) Consultar Geladeira pelo indice");
            System.out.println("4) Remover Geladeira pelo indice");
            System.out.println("5) Atualizar Geladeira pelo indice");
            System.out.println("0) Sair");
            opc = Integer.parseInt(l.entDados("Digite uma opcao: "));

            switch(opc) {
                case 1:
                    System.out.println("Cadastrar nova Geladeira");
                    gl = new Geladeira();
                    gl = gg.cadGl(gl);
                    gl.cadastro();
                    break;
                case 2:
                    System.out.println("Estoque de Geladeiras");
                    gg.estoqueGeladeira(); 
                    break;
                case 3:
                    System.out.println("Consultar Geladeira pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser consultado: "));
                    gl = gg.consultaGl(indice);
                    if(gl != null)
                        gg.impGl(indice);
                    else
                        System.out.println("\nNao existe esse indice. Nenhum produto foi encontrado.");
                    break;
                case 4:
                    System.out.println("Remover Geladeira pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser removido: "));
                    gl = gg.consultaGl(indice);
                    if(gl != null){
                        gg.removeGl(indice); 
                        gl.remover();
                    } else {
                        System.out.println("Nao existe esse indice. Nenhum produto foi excluido.");
                    }
                    break;
                case 5:
                    System.out.println("Atualizar Geladeira pelo Indice");
                    indice = Integer.parseInt(l.entDados("Digite o indice do produto a ser atualizado: "));
                    gl = gg.consultaGl(indice);
                    if(gl != null){
                        gg.atualizarGl(indice); 
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
