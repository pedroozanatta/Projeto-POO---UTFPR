//Pedro Henrique Zanatta de Oliveira RA:2601443
public class Fornecedor {

    private int tel;
    private String nome;

    public Fornecedor(){ //Polimorfismo por Sobrecarga
	    nome = "Antonio";
	    tel = 94567;
    }

    public Fornecedor(String nome, int tel){ //Polimorfismo por Sobrecarga
	    this.nome = nome;
	    this.tel = tel;
    }

        
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTel(int tel){
        this.tel = tel;
    }
    
    public int getTel(){
        return tel;
    }
}