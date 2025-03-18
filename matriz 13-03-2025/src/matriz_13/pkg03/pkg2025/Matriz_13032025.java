/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_13.pkg03.pkg2025;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 0031432512022
 */
public class Matriz_13032025 {

    public static void main(String[] args) {
//        int [][] matriz = new int [2][2]; 
//        int [][] matriz2 = {{1,2},{3,4}};
//        int [][][] imagem = new int [16][16][3];

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int op, num, indice;
        String valores="";
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1)Adicionar elemento\n"
                    + "2)Consultar elemento\n"
                    + "3)Remover elemento\n"
                    + "4)Listar todos os elementos\n"
                    + "5) Sair\n"
                    + "Informe a opção desejada:"));
            switch (op) {
                case 1:
                    num = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o valor a ser inserido:"));
                    numeros.add(num);
                    break;
                case 2:
                    indice = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o índice do valor buscado:"));
                    JOptionPane.showMessageDialog(null,
                            "O valor encontrado é:" + numeros.get(indice));
                    break;
                case 3:
                    indice = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o índice do valor a ser removido:"));
                    numeros.remove(indice);
                    break;
                case 4:
                    for (int i = 0; i < numeros.size(); i++) {
                        valores += numeros.get(i) + " ";
                    }
                    JOptionPane.showMessageDialog(null,
                            "Os valores existentes no Array são: " + valores);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida!");
            }
        } while (op != 5);

    }

}
