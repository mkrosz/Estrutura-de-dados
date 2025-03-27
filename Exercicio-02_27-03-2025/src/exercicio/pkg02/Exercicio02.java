/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg02;

import javax.swing.JOptionPane;

/**
 *
 * @author 0031432512022
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pilha ruaSemSaida = new Pilha(6);
       Pilha ruaSemSaida_copia = new Pilha(6);
       
       String placa, placaBuscada="";
       boolean encontrou=false;
       int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Informar carro estacionado\n"
                    + "2 - Buscar placa de carro\n"
                    + "3 - Remover carro buscado da rua\n"
                    + "4 - Sair\n"
                    + "Informe a opção desejada: "));
            switch (opcao) {
                case 1:
                    placa = JOptionPane.showInputDialog("Informe a placa do carro estacionado: ");
                    ruaSemSaida.empilhar(placa);
                    ruaSemSaida_copia.empilhar(placa);
                    break;
                case 2:
                    placaBuscada = JOptionPane.showInputDialog("Informar a placa do veículo a ser buscado: ");
                    while (!ruaSemSaida_copia.vazia()) {
                        placa = ruaSemSaida_copia.desempilhar().toString();
                        if (placa.equals(placaBuscada)) {
                            JOptionPane.showConfirmDialog(null, "O carro se encontra estacionado na rua");
                            encontrou = true;
                        }
                    }
                    break;
                case 3:
                    if (encontrou) {
                        while (!ruaSemSaida.vazia()) {
                            placa = ruaSemSaida.desempilhar().toString();
                            if (placa.equals(placaBuscada)) {
                                JOptionPane.showMessageDialog(null, "Remova o carro com a placa "
                                        + placa
                                        + " para que o carro com a placa "
                                        + placaBuscada
                                        + " possa sair");
                            }

                        }
                    } else {
                        JOptionPane.showInputDialog(null, "O carro buscado não foi encontrado\n"
                                + "Tente informar uma outra placa: ");

                    }
                    break;
                case 4:
                    break;
            }
        } while (opcao !=4);
    }

}
