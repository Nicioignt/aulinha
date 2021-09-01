package projetodehoje;

import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        Marteria a = new Marteria();
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas matérias você quer adicionar?"));
        for(int i =0; i < qtd; i++){
        String nome = JOptionPane.showInputDialog("Qual a " + (i+1) + "ª que você quer adicionar?");
        
        a.addMateria(nome);
        }
        a.listaMaterias();
        
        String busca = JOptionPane.showInputDialog(null, "Qual matéria você quer conferir?");
       
        a.busca(busca);
        
        String deleta = JOptionPane.showInputDialog(null, "Qual matéria você quer deletar?");
        
        a.deleta(deleta);
        a.listaMaterias();

    }
    
}
