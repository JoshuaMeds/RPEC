public class Fila {
    private int inicio = 0;
    private int fim = 0;
    private final int tamanho = 5;
    private final int[] fila = new int[tamanho];

    public boolean estaVazia() {
        return inicio == fim;
    }

    public boolean estaCheia() {
        return (fim + 1) % tamanho == inicio;
    }

    public void inserir(int elemento) {
        if (estaCheia()) {
            System.out.println("Erro: Fila cheia!");
        } else {
            fila[fim] = elemento;
            fim = (fim + 1) % tamanho;
        }
    }

    public void remover() {
        if (estaVazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            System.out.println("Removendo: " + fila[inicio]);
            inicio = (inicio + 1) % tamanho;
        }
    }

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.print("Fila: ");
        for (int i = inicio; i != fim; i = (i + 1) % tamanho) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}
