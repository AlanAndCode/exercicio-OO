import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main triangulo = null; // Inicialmente, nenhum triângulo foi criado

        System.out.println("Iniciando o programa...");

        loop: while (true) {
            System.out.println("\n\n===============================================");
            System.out.println("               MENU DE UTILIZAÇÃO");
            System.out.println("===============================================");
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Criar um novo triângulo");
            System.out.println("2 - Alterar um dos lados");
            System.out.println("3 - Calcular a área");
            System.out.println("4 - verificar triangulo");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            System.out.println("Opção lida: " + opcao);

            switch (opcao) {
                case 0:
                    break loop; // Sai do loop e encerra o programa
                case 1:
                    System.out.print("Informe o lado 1: ");
                    int lado1 = scanner.nextInt();
                    System.out.println("Lado 1 informado: " + lado1);
                    System.out.print("Informe o lado 2: ");
                    int lado2 = scanner.nextInt();
                    System.out.println("Lado 2 informado: " + lado2);
                    System.out.print("Informe o lado 3: ");
                    int lado3 = scanner.nextInt();
                    System.out.println("Lado 3 informado: " + lado3);
                    break;
                case 2:
                    if (triangulo != null) {
                        System.out.print("Informe o novo valor do lado 1: ");
                        int novoLado1 = scanner.nextInt();
                        System.out.println("Novo valor do lado 1: " + novoLado1);
                        triangulo.setLado1(novoLado1);
                        System.out.println("Lado 1 alterado para " + novoLado1);
                    } else {
                        System.out.println("Nenhum triângulo foi criado ainda!");
                    }
                    break;
                case 3:
                    if (triangulo != null) {
                        System.out.println("Área do triângulo: " + Main.area(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));
                    } else {
                        System.out.println("Nenhum triângulo foi criado ainda!");
                    }
                    break;
                    case 4:
                    if (Main.verificaTriangulo(lado1, lado2, lado3)) {
                        System.out.println("Os lados informados não formam um triângulo válido!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("\n\n---  FIM DE UTILIZAÇÃO  ---\n\n");
        scanner.close();
    }
}
