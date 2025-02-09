//Pedro Henrique Zanatta de Oliveira RA:2601443
public class TamException extends Exception{
    Leitura l = new Leitura();

    public void tamMin(){
        System.out.println("A marca deve ter no minimo 1 digito");
    }

    public Televisao corTamException(Televisao tv1){
        try{
            tv1.setMarca(l.entDados("Informe a Marca da TV novamente: "));      
        }
        catch(LetraException le){
            le.soLetra();
            tv1 = le.corLetraException(tv1);
        }
        catch(TamException te){
            te.tamMin();
            tv1 = te.corTamException(tv1);
        }       
        return tv1;
    }

    public Fogao corTamException(Fogao fg1){
        try{
            fg1.setMarca(l.entDados("Informe a Marca do Fogao novamente: "));      
        }
        catch(LetraException le){
            le.soLetra();
            fg1 = le.corLetraException(fg1);
        }
        catch(TamException te){
            te.tamMin();
            fg1 = te.corTamException(fg1);
        }
        
        return fg1;
    }

    public Geladeira corTamException(Geladeira gl1){
        try{
            gl1.setMarca(l.entDados("Informe a Marca da Geladeira novamente: "));
            
        }
        catch(LetraException le){
            le.soLetra();
            gl1 = le.corLetraException(gl1);
        }
        catch(TamException te){
            te.tamMin();
            gl1 = te.corTamException(gl1);
        }
        
        return gl1;
    }
}