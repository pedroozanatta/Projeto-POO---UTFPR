//Pedro Henrique Zanatta de Oliveira RA:2601443
import java.util.List;
import java.util.ArrayList;

public class GerTv{

    private Televisao tv;
    private List<Televisao> bdTv = new ArrayList<>();
    private Leitura l = new Leitura();

    public Televisao cadTv(Televisao tv) {
        try {
            tv.setMarca(l.entDados("\nMarca: "));
        } catch(TamException te) {
            te.tamMin();
            tv = te.corTamException(tv);
        } catch(LetraException le) {
            le.soLetra();
            tv = le.corLetraException(tv);
        }
        tv.setModelo(l.entDados("Modelo: "));
        tv.setPolegada(Integer.parseInt(l.entDados("Polegada: ")));
        tv.setResolucao(l.entDados("Resolucao: "));

        bdTv.add(tv);
        return tv;
    }

    public void estoqueTelevisao() { 
        for(int i = 0; i < bdTv.size(); i++) {
            System.out.println("Indice: " + i + " - Marca: " + bdTv.get(i).getMarca() +" - Modelo: " + bdTv.get(i).getModelo() + " - Polegada: " + bdTv.get(i).getPolegada() +" - Resolucao: " + bdTv.get(i).getResolucao());
        }
    }

    public void impTv(int i) {
        System.out.println("\nIndice: " + i + " - Marca: " + bdTv.get(i).getMarca() +" - Modelo: " + bdTv.get(i).getModelo() + " - Polegada: " + bdTv.get(i).getPolegada() +" - Resolucao: " + bdTv.get(i).getResolucao());
    }

    public Televisao consultaTv(int i) {
        if (i < bdTv.size()) {
            return bdTv.get(i);
        } else {
            return null;
        }
    }

    public void removeTv(int i) {
        if (i < bdTv.size()) { 
            bdTv.remove(i); 
        } else {
            System.out.println("\nNao existe esse indice. Nenhum produto foi excluido.");
        }
    }

    public void atualizarTv(int indice) {
        tv = consultaTv(indice);
        if (tv!=null) {
            try {
                tv.setMarca(l.entDados("\nInforme a nova Marca: "));
            } catch(TamException te) {
                te.tamMin();
                tv = te.corTamException(tv);
            } catch(LetraException le) {
                le.soLetra();
                tv = le.corLetraException(tv);
            }
            tv.setModelo(l.entDados("Informe o novo Modelo: "));
            tv.setPolegada(Integer.parseInt(l.entDados("Informe a nova Polegada: ")));
            tv.setResolucao(l.entDados("Informe a nova Resolucao: "));
            bdTv.set(indice, tv);
            tv.atualizar();
        } else {
            System.out.println("\nNao existe esse indice. Nenhum produto foi atualizado.");
        }
    }
}
