package projetopoo;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String CPF;
    private String dtNasc;
    private String celular;
    private String RG;
    private float peso;
    private float altura;

    public Pessoa() {
        nome = "";
        sobrenome = "";
        RG = "";
        CPF = "";
        celular = "";
        dtNasc = "";
        peso = (float) 0.0;
        altura = (float) 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String dadosPessoais() {
        String dadosPessoa;

        dadosPessoa = "Nome Completo: " + this.nome + " " + this.sobrenome
                + "\nData de Nascimento: " + this.dtNasc
                + "\nRG: " + this.RG
                + "\nCPF: " + this.CPF
                + "\nCelular: " + this.celular;

        return dadosPessoa;
    }
}
