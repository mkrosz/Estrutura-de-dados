package exercicio.pkg03;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
       Pilha p = new Pilha(5);
       
       int valor, qtdpares=0;
       
       while(!p.cheia()){
           valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inteiro a ser inserido na pilha: "));
           if (valor == 0) {
               break;
           }
           else{
               p.empilhar(valor);
               if(valor % 2 == 0){
                   qtdpares++;
               }
           }
       }
       JOptionPane.showInputDialog(null, "A quantidade de numeros pares na pilha são:\n" + qtdpares);
    }
    
}
