package exercicio.pkg01;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        //Declarando o objeto p da classe Pilha
        Pilha p = new Pilha(5);
        int valor;

        while (!p.cheia()) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inteiro a ser iserido na pilha: "));
            if (valor == 0) {
                break;
            } 
            else {
                p.empilhar(valor);
            }
        }
        while (!p.vazia()) {
            JOptionPane.showMessageDialog(null, "Valor removido: " + p.desempilhar());
        }
    }

}
