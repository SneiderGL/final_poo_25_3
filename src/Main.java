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

                case 4:
                    System.out.println("Ejercicio 4: " + e.declararBooleano());
                    break;

                case 5:
                    System.out.print("Ingrese un entero: ");
                    int valor5 = sc.nextInt();
                    System.out.println("Ejercicio 5: " + e.convertirEnteroATexto(valor5));
                    break;

                case 6:
                    System.out.print("Ingrese un numero en texto: ");
                    String valor6 = sc.next();
                    System.out.println("Ejercicio 6: " + e.convertirTextoAEntero(valor6));
                    break;

                case 7:
                    System.out.print("Ingrese un numero decimal: ");
                    double valor7 = sc.nextDouble();
                    System.out.println("Ejercicio 7: " + e.convertirDecimalAEntero(valor7));
                    break;

                case 8:
                    System.out.print("Ingrese un entero: ");
                    int valor8 = sc.nextInt();
                    System.out.println("Ejercicio 8: " + e.convertirEnteroADecimal(valor8));
                    break;



                default:
                    System.out.println("  ");
            }

        }

        sc.close();
    }
}
