/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_matriz;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 0031432512022
 */
public class Exercicios_matriz {

    public static void main(String[] args) {
//      1 - Escreva um programa em Java que leia uma matriz de inteiros de tamanho NxM (onde N 
//      e M são definidos pelo usuário) e retorne a posição (linha e coluna) do maior valor 
//      armazenado na matriz

        int N, M, maior = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas da matriz: "));
        M = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas da matriz: "));
        int[][] matriz = new int[N][M];
        for (int linha = 0; linha < N; linha++) {
            for (int coluna = 0; coluna < M; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o valor a ser inserido" + "na linha"
                                + linha + "e na coluna" + coluna + ":"));
                if (linha == 0 && coluna == 0) {
                    maior = matriz[linha][coluna];
                } else {
                    if (matriz[linha][coluna] > maior) {
                        maior = matriz[linha][coluna];
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O maior valor encontrado é: " + maior);
        
//       2 - Crie um programa em Java que implemente a união de dois arrays. O programa deve 
//       receber dados para preencher dois arrays de inteiros e criar um novo array contendo a 
//       união de v1 e v2. Por exemplo, se v1 = {11, 13, 45, 7} e v2 = {24, 4, 16, 81, 10, 12}, v3 irá 
//       conter {11, 13, 45, 7, 24, 4, 16, 81, 10, 12}.

       int p, s;
       
        p=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números da largura do PRIMEIRO array: "));
        s=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números da largura do SEGUNDO array: "));
 
        int[] primeiro = new int[p];
        int[] segundo = new int[s];
        int[] juncao = new int[p + s];
        
        for (int i = 0; i < primeiro.length; i++) {
            primeiro[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º valor do PRIMEIRO array: "));     
        }
        for (int i = 0; i < segundo.length; i++) {
            segundo[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º valor do SEGUNDO array: "));     
        }
        //quem será copiado, a parir de onde será a copia, o alvo (para onde vamos enviar os dados), index do envio (onde vou começar a copiar), a quantidade que você vai copiar.
        System.arraycopy(primeiro, 0, juncao, 0, primeiro.length);
        System.arraycopy(segundo, 0, juncao, primeiro.length, segundo.length);

        JOptionPane.showMessageDialog(null, "A junção do array ficaria em: " + Arrays.toString(juncao));
        
    }

}
