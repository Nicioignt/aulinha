package al;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Al {
    LinkedList<String> alunos = new LinkedList<String>();

    public static void main(String[] args) {
        Al a = new Al();
        a.addalunos();
        a.procura(JOptionPane.showInputDialog("Digite o nome do aluno a procurar"), a.alunos);
    }
    public void addalunos(){
        
       int qdt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos que deseja cadastrar!"));

        for (int i = 0; i < qdt; i++) {
            alunos.add (JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno"));
    }
    }
    public void procura(String aluno, LinkedList<String> alunos){
    String mensagem = aluno+ " Não foi encontrado!";
    for(String s:alunos){
        if(s.equals(aluno)){
        mensagem = aluno+ " Foi encontrado!";
        }
    }
        JOptionPane.showMessageDialog(null, mensagem);
            
    }
}

