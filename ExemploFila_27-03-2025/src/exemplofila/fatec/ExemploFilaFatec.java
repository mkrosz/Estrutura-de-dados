/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplofila.fatec;

public class ExemploFilaFatec {

    public static void main(String[] args) {
        //Criando objeto do tipo Fila com 6 elementos
        Fila f = new Fila(6);
        
        //Inserindo os 6 elementos inteiros abaixo
        f.enfileirar(10);
        f.enfileirar(12);
        f.enfileirar(33);
        f.enfileirar(42);
        f.enfileirar(53);
        f.enfileirar(2);
        
        //Removendo dois valores inteiros
        f.desenfileirar();
        f.desenfileirar();
        
        f.exibeFila();
        
    }
    
}
