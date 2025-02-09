//Pedro Henrique Zanatta de Oliveira RA:2601443
public class Geladeira extends Eletrodomestico implements Controle{

    private float volume;
    private int qntPorta;

    public Geladeira(String modelo, String marca, float volume, int qntPorta, Loja lj, Fornecedor forn) {
        super(modelo, marca, lj, forn);
        this.volume = volume;
        this.qntPorta = qntPorta;
    }

    public Geladeira(String modelo, String marca, float volume, int qntPorta) {
        super(modelo, marca);
        this.volume = volume;
        this.qntPorta = qntPorta;
    }

    public Geladeira() {
        super();
    }

    public void menu() {
        System.out.println("\n\tMenu Geladeira");
    }

    public void cadastro(){
        System.out.println("\n Cadastrando Geladeira...");
    }

    public void atualizar(){
        System.out.println("\n Atualizando Geladeira...");
    }

    public void remover(){
        System.out.println("\nRemovendo Geladeira...");
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setQntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }

    public float getVolume() {
        return volume;
    }

    public int getQntPorta() {
        return qntPorta;
    }
}
