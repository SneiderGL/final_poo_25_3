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

                case 9:
                    System.out.print("Ingrese una edad: ");
                    int edad9 = sc.nextInt();
                    System.out.println("Ejercicio 9: " + e.asignarEdad(edad9));
                    break;

                case 10:
                    System.out.print("Ingrese un nombre: ");
                    String nombre10 = sc.next();
                    System.out.println("Ejercicio 10: " + e.asignarNombre(nombre10));
                    break;

                case 11:
                    System.out.print("Ingrese el primer valor: ");
                    int a11 = sc.nextInt();
                    System.out.print("Ingrese el segundo valor: ");
                    int b11 = sc.nextInt();

                    int[] resultado11 = e.intercambiarValores(a11, b11);
                    System.out.println("Ejercicio 11: [" + resultado11[0] + ", " + resultado11[1] + "]");
                    break;

                case 12:
                    System.out.print("Ingrese un nombre: ");
                    String nombre12 = sc.next();
                    System.out.print("Ingrese una edad: ");
                    int edad12 = sc.nextInt();

                    System.out.println("Ejercicio 12: " + e.concatenarDatos(nombre12, edad12));
                    break;

                case 13:
                    System.out.print("Ingrese el salario base: ");
                    double base13 = sc.nextDouble();

                    System.out.print("Ingrese los bonos: ");
                    double bonos13 = sc.nextDouble();

                    System.out.println("Ejercicio 13: " + e.calcularSalarioTotal(base13, bonos13));
                    break;

                case 14:
                    System.out.print("Ingrese el contador actual: ");
                    int cont14 = sc.nextInt();

                    System.out.print("Ingrese el incremento: ");
                    int inc14 = sc.nextInt();

                    System.out.println("Ejercicio 14: " + e.actualizarContador(cont14, inc14));
                    break;

                case 15:
                    System.out.print("Ingrese el primer numero: ");
                    int n15a = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    int n15b = sc.nextInt();

                    System.out.println("Ejercicio 15: " + e.sumarDosNumeros(n15a, n15b));
                    break;

                case 16:
                    System.out.print("Ingrese el dividendo: ");
                    int d16 = sc.nextInt();

                    System.out.print("Ingrese el divisor: ");
                    int v16 = sc.nextInt();

                    System.out.println("Ejercicio 16: " + e.calcularResto(d16, v16));
                    break;

                case 17:
                    System.out.print("Ingrese el primer numero: ");
                    int n17a = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    int n17b = sc.nextInt();

                    System.out.println("Ejercicio 17: " + e.esMayorQue(n17a, n17b));
                    break;

                case 18:
                    System.out.print("Ingrese un numero: ");
                    int n18 = sc.nextInt();

                    System.out.println("Ejercicio 18: " + e.esParYPositivo(n18));
                    break;

                case 19:
                    System.out.print("Ingrese un numero: ");
                    int n19 = sc.nextInt();

                    System.out.println("Ejercicio 19: " + e.esMultiploDeTres(n19));
                    break;


                case 20:
                    System.out.print("Ingrese el numero: ");
                    int num20 = sc.nextInt();

                    System.out.print("Ingrese N: ");
                    int n20 = sc.nextInt();

                    System.out.println("Ejercicio 20: " + e.esMultiploDeN(num20, n20));
                    break;

                case 21:
                    System.out.print("Ingrese un numero: ");
                    int n21 = sc.nextInt();
                    System.out.println("Ejercicio 21: " + e.incrementarEnUno(n21));
                    break;

                case 22:
                    System.out.print("Ingrese el numero: ");
                    int num22 = sc.nextInt();
                    System.out.print("Ingrese el divisor: ");
                    int div22 = sc.nextInt();
                    System.out.println("Ejercicio 22: " + e.esDivisiblePor(num22, div22));
                    break;

                case 23:
                    System.out.print("Ingrese la edad: ");
                    int edad23 = sc.nextInt();
                    System.out.println("Ejercicio 23: " + e.esMayorDeEdad(edad23));
                    break;

                case 24:
                    System.out.print("Ingrese un numero: ");
                    int num24 = sc.nextInt();
                    System.out.println("Ejercicio 24: " + e.clasificarNumero(num24));
                    break;

                case 25:
                    System.out.print("Ingrese la nota: ");
                    double nota25 = sc.nextDouble();
                    System.out.println("Ejercicio 25: " + e.evaluarPrueba(nota25));
                    break;



                default:
                    System.out.println("  ");
            }

        }

        sc.close();
    }
}
