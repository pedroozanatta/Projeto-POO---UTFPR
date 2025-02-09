//Pedro Henrique Zanatta de Oliveira RA:2601443
public class Loja {

    private int cnpj;
    private String empresa;

    public Loja() { //Poilimorfismo por sobrecarga
        cnpj = 7777;
        empresa = "Americanas";
    }

    public Loja(int cnpj, String empresa) { //Polimorfismo por Sobrecarga
        this.cnpj = cnpj;
        this.empresa = empresa;
    }

        
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public int getCnpj(){
        return cnpj;
    }
}