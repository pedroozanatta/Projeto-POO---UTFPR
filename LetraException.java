//Pedro Henrique Zanatta de Oliveira RA:2601443
public class LetraException extends Exception{
    Leitura l = new Leitura();
    
    public void soLetra(){
        System.out.println("A marca nao deve conter numeros ou simbolos");
    }

    public Televisao corLetraException(Televisao tv1){
        try{
            tv1.setMarca(l.entDados("Informe a Marca da TV novamente: "));   
        }
        catch(TamException te){
            te.tamMin();
            tv1 = te.corTamException(tv1);
        }
        catch(LetraException le){
            le.soLetra();
            tv1 = le.corLetraException(tv1);
        }  
        return tv1;
    }

    public Fogao corLetraException(Fogao fg1){
        try{
            fg1.setMarca(l.entDados("Informe a Marca do Fogao novamente: "));   
        }
        catch(TamException te){
            te.tamMin();
            fg1 = te.corTamException(fg1);
        }
        catch(LetraException le){
            le.soLetra();
            fg1 = le.corLetraException(fg1);
        }  
        return fg1;
    }

    public Geladeira corLetraException(Geladeira gl1){
        try{
            gl1.setMarca(l.entDados("Informe a Marca da Geladeira novamente: "));   
        }
        catch(TamException te){
            te.tamMin();
            gl1 = te.corTamException(gl1);
        }
        catch(LetraException le){
            le.soLetra();
            gl1 = le.corLetraException(gl1);
        }  
        return gl1;
    }
}