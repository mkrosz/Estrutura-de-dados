package projetopoo;

import javax.swing.JOptionPane;

public class ProjetoPOO {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNome("Mike");
        p.setDtNasc("Franguelli");
        p.setSobrenome("12/04/2006");
        p.setCPF("111.222.333-44");
        p.setRG("99.888.777-66");
        p.setCelular("(15)9164-6255");
        p.setPeso((float) 55.5);
        p.setAltura((float) 1.98);
        
        JOptionPane.showMessageDialog(null, p.dadosPessoais());
    }

}
