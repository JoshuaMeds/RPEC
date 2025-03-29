public class Pilha {
    private final int max = 5;
    private int topo = -1;
    private final int[] pilha = new int[max];

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == max - 1;
    }

    public void empilhar(int elemento) {
        if (estaCheia()) {
            System.out.println("Erro: Pilha cheia!");
        } else {
            pilha[++topo] = elemento;
        }
    }

    public void desempilhar() {
        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
        } else {
            System.out.println("Removendo: " + pilha[topo--]);
        }
    }

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
