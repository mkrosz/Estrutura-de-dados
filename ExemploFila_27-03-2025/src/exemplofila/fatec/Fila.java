package exemplofila.fatec;

public class Fila {

    private int tamanho;
    private int inicio;
    private int fim;
    private int total;
    private int vetor[];

   //Método construtor para inicialização da Fila
    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new int[tam];
    }

    public boolean vazia() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if (total >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public void enfileirar(int elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
            /*if (fim >= tamanho) {
                fim = 0;
            }*/
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public String desenfileirar() {
        String elem;
        if (vazia() == false) {
            elem = String.valueOf(vetor[inicio]);
            System.out.println(elem);
            inicio++;
            /*if (inicio >= tamanho) {
                inicio = 0;
            }*/
            total--;
        } else {
            elem = "Fila vazia";
        }
        return elem;
    }

    public void exibeFila() {
        for (int i = inicio; i < fim; i++) {
            System.out.println("posicao " + i + " valor " + vetor[i]);
        }
    }
}
