//Pedro Henrique Zanatta de Oliveira RA:2601443
public class Televisao extends Eletrodomestico implements Controle{

    private int polegada;
    private String resolucao;

    public Televisao(String modelo, String marca, int polegada, String resolucao, Loja lj, Fornecedor forn) {
        super(modelo, marca, lj, forn);
        this.polegada = polegada;
        this.resolucao = resolucao;
    }

    public Televisao(String modelo, String marca, int polegada, String resolucao) {
        super(modelo, marca);
        this.polegada = polegada;
        this.resolucao = resolucao;
    }

    public Televisao() {
        super();
    }

    public void menu() {
        System.out.println("\n\tMenu Televisao");
    }

    public void cadastro(){
        System.out.println("\n Cadastrando Televisao...");
    }

    public void atualizar(){
        System.out.println("\n Atualizando Televisao...");
    }

    public void remover(){
        System.out.println("\nRemovendo Televisao...");
    }

    public void setPolegada(int polegada) {
        this.polegada = polegada;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public int getPolegada() {
        return polegada;
    }

    public String getResolucao() {
        return resolucao;
    }
}