
package projetodehoje;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Marteria {
    LinkedList<String> mat = new LinkedList<>();
    
    public void addMateria(String nome){
        mat.add(nome);
    }
    
    public void listaMaterias(){
        String msg = "";
        for(String a : mat){
            msg = msg + "\n" + a;
        }
        JOptionPane.showMessageDialog(null, msg);

    }
    public void busca(String nome_busca){
        String msg = "A matéria "+nome_busca+ " não foi encontrada na lista!";
    for(String a : mat){
        if(a.equals(nome_busca)){
           msg = "A matéria "+nome_busca+ " foi encontrada na lista!";
            
    }
        
    }
    JOptionPane.showMessageDialog(null, msg);
    
}
    public void deleta(String mt){
        mat.remove(mt);
    }


}
