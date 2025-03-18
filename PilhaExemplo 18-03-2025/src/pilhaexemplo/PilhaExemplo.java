
package pilhaexemplo;

import javax.swing.JOptionPane;

public class PilhaExemplo {

    public static void main(String[] args) {
        //Criando objeto da classe Pilha
        //A pilha criada tem 6 elementos
        Pilha p = new Pilha(6);
        int num, op;
        do{ 
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "1-Inserir na pilha\n"
          + "2-Remover da Pilha\n"
          + "3-Exibir elementos\n"
          + "4-Sair"));
            switch(op){
                case 1:
                num = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o valor a ser inserido na Pilha:"));
                p.empilhar(num);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, 
                            p.desempilhar());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, 
                            "Os elementos listados "
                            + "serão exibidos no console!");
                    p.ExibePilha();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção inválida!");
            }           
        }while(op!=4);
    }
    
}
