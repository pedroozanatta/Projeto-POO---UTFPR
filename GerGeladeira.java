//Pedro Henrique Zanatta de Oliveira RA:2601443
import java.util.List;
import java.util.ArrayList;

public class GerGeladeira{

    private Geladeira gl;
    private List<Geladeira> bdGl = new ArrayList<>();
    private Leitura l = new Leitura();

    public Geladeira cadGl(Geladeira gl) {
        try {
            gl.setMarca(l.entDados("\nMarca: "));
        } catch(TamException te) {
            te.tamMin();
            gl = te.corTamException(gl);
        } catch(LetraException le) {
            le.soLetra();
            gl = le.corLetraException(gl);
        }
        gl.setModelo(l.entDados("Modelo: "));
        gl.setVolume(Float.parseFloat(l.entDados("Volume: ")));
        gl.setQntPorta(Integer.parseInt(l.entDados("Quantidade de Porta: ")));

        bdGl.add(gl);
        return gl;
    }

    public void estoqueGeladeira() { 
        for(int i = 0; i < bdGl.size(); i++) {
            System.out.println("Indice: " + i + " - Marca: " + bdGl.get(i).getMarca() +" - Modelo: " + bdGl.get(i).getModelo() + " - Volume: " + bdGl.get(i).getVolume() +" - Quantidade de Porta: " + bdGl.get(i).getQntPorta());
        }
    }

    public void impGl(int i) {
        System.out.println("\nIndice: " + i + " - Marca: " + bdGl.get(i).getMarca() +" - Modelo: " + bdGl.get(i).getModelo() + " - Volume: " + bdGl.get(i).getVolume() +" - Quantidade de Porta: " + bdGl.get(i).getQntPorta());
    }

    public Geladeira consultaGl(int i) {
        if (i < bdGl.size()) {
            return bdGl.get(i);
        } else {
            return null;
        }
    }

    public void removeGl(int i) {
        if (i < bdGl.size()) { 
            bdGl.remove(i); 
        } else {
            System.out.println("\nNao existe esse indice. Nenhum produto foi excluido.");
        }
    }

    public void atualizarGl(int indice) {
        gl = consultaGl(indice);
        if (gl!=null) {
            try {
                gl.setMarca(l.entDados("\nInforme a nova Marca: "));
            } catch(TamException te) {
                te.tamMin();
                gl = te.corTamException(gl);
            } catch(LetraException le) {
                le.soLetra();
                gl = le.corLetraException(gl);
            }
            gl.setModelo(l.entDados("Informe o novo Modelo: "));
            gl.setVolume(Float.parseFloat(l.entDados("Informe o novo Volume: ")));
            gl.setQntPorta(Integer.parseInt(l.entDados("Informe a nova Quantidade de Porta: ")));
            bdGl.set(indice, gl);
            gl.atualizar();
        } else {
            System.out.println("\nNao existe esse indice. Nenhum produto foi atualizado.");
        }
    }
}
