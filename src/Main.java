import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ejercicios e = new Ejercicios();

        while (true) {

            System.out.println("\n====== MENÚ DE EJERCICIOS ======");
            System.out.println("Elija un ejercicio (1 - 36), o 0 para salir:");
            System.out.print(">> ");

            int opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Resultado ejercicio 1: " + e.declararEntero());
                    break;

                case 2:
                    System.out.println("Resultado ejercicio 2: " + e.declararDecimal());
                    break;

                case 3:
                    System.out.println("Ejercicio 3: " + e.declararTexto());
                    break;


                default:
                    System.out.println("  ");
            }

        }

        sc.close();
    }
}
