//Pedro Henrique Zanatta de Oliveira RA:2601443
public abstract class Eletrodomestico{

    private String modelo;
    private String marca;
    private Loja lj;
    private Fornecedor forn;
	
    public Eletrodomestico(){ //Polimorfismo por Sobrecarga
	this.modelo = "";
	this.marca = "";
        this.lj = new Loja();
        this.forn = new Fornecedor();
    }

    public Eletrodomestico(String modelo, String marca, Loja lj, Fornecedor forn) { //Polimorfismo por Sobrecarga
	this.modelo = modelo; 
	this.marca = marca; 
	this.lj = lj; 
	this.forn = forn; 
   }

    public Eletrodomestico(String modelo, String marca){ //Polimorfismo por Sobrecarga 
	this.modelo = modelo;
	this.marca = marca;
	this.lj = new Loja();
	this.forn = new Fornecedor();
    }

    public abstract void menu();

    public void setForn(Fornecedor forn){
	this.forn = forn;
    }

    public Fornecedor getForn(){
	return forn;
    }

    public void setLj(Loja lj){
	this.lj = lj;
    }

    public Loja getLj(){
	return lj;
    }
    
     public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setMarca(String marca) throws TamException, LetraException{
        if(marca.length()>0){
            if(marca.matches("[a-zA-Z]+")){
                this.marca = marca;
            }
            else
                throw new LetraException();
        }
        else 
            throw new TamException();
    }

    public String getMarca(){
        return marca;
    }
}