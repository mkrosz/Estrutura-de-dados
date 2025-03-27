package exercicio.pkg04;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        Pilha n = new Pilha(8);
        int[] valores = new int[8];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro a ser inserido no Array: "));
            if (valores[i] > 0) {
                p.empilhar(valores[i]);
            } else if (valores[i] < 0) {
                n.empilhar(valores[i]);
            } else {
                p.desempilhar();
                n.desempilhar();
            }
        }
        JOptionPane.showMessageDialog(null, "Valores removidos da pilha p: ");
        while(!p.vazia()){
            JOptionPane.showMessageDialog(null, p.desempilhar());
        }
        
        JOptionPane.showMessageDialog(null, "Valores removidos da pilha n: ");
        while(!p.vazia()){
            JOptionPane.showMessageDialog(null, n.desempilhar());
        }
    }

}
