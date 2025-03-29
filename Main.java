import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        while (true) {
            System.out.println("\n1- Inserir na Fila");
            System.out.println("2- Remover da Fila");
            System.out.println("3- Ver Fila");
            System.out.println("4- Inserir na Pilha");
            System.out.println("5- Remover da Pilha");
            System.out.println("6- Ver Pilha");
            System.out.println("7- Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe um número para adicionar à Fila:");
                    int elementoFila = scanner.nextInt();
                    fila.inserir(elementoFila);
                    break;

                case 2:
                    fila.remover();
                    break;

                case 3:
                    fila.imprimir();
                    break;

                case 4:
                    System.out.println("Informe um número para adicionar à Pilha:");
                    int elementoPilha = scanner.nextInt();
                    pilha.empilhar(elementoPilha);
                    break;

                case 5:
                    pilha.desempilhar();
                    break;

                case 6:
                    pilha.imprimir();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
