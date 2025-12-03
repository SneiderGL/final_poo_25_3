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

                case 26:
                    System.out.print("Ingrese la nota: ");
                    double nota26 = sc.nextDouble();
                    System.out.print("Ingrese la edad: ");
                    int edad26 = sc.nextInt();
                    System.out.print("Tiene experiencia (true/false): ");
                    boolean exp26 = sc.nextBoolean();
                    System.out.println("Ejercicio 26: " + e.evaluarAptitud(nota26, edad26, exp26));
                    break;

                case 27:
                    System.out.print("Ingrese el precio: ");
                    double precio27 = sc.nextDouble();
                    System.out.print("Ingrese la edad: ");
                    int edad27 = sc.nextInt();
                    System.out.print("Es estudiante (true/false): ");
                    boolean esEstudiante27 = sc.nextBoolean();
                    System.out.println("Ejercicio 27: " + e.calcularDescuentoEstudiante(precio27, edad27, esEstudiante27));
                    break;

                case 28:
                    System.out.print("Ingrese la edad: ");
                    int edad28 = sc.nextInt();
                    System.out.println("Ejercicio 28: " + e.determinarCategoria(edad28));
                    break;

                case 29:
                    System.out.print("Ingrese n: ");
                    int n29 = sc.nextInt();
                    System.out.println("Ejercicio 29: " + e.sumarHastaN(n29));
                    break;

                case 30:
                    System.out.print("Ingrese n: ");
                    int n30 = sc.nextInt();
                    System.out.println("Ejercicio 30: " + e.factorial(n30));
                    break;

                case 31:
                    System.out.print("Ingrese n: ");
                    int n31 = sc.nextInt();
                    System.out.println("Ejercicio 31: " + e.fibonacci(n31));
                    break;

                case 32:
                    System.out.print("Ingrese un numero: ");
                    int num32 = sc.nextInt();
                    System.out.println("Ejercicio 32: " + e.esNumeroPerfecto(num32));
                    break;

                case 33:
                    System.out.print("Ingrese un año: ");
                    int año33 = sc.nextInt();
                    System.out.println("Ejercicio 33: " + e.esBisiesto(año33));
                    break;

                case 34:
                    System.out.print("Ingrese un número: ");
                    int num34 = sc.nextInt();
                    System.out.println("Ejercicio 34: " + e.numeroMagico(num34));
                    break;

                case 35:
                    System.out.print("Ingrese un número: ");
                    int num35 = sc.nextInt();
                    System.out.println("Ejercicio 35: " + e.contarDigitos(num35));
                    break;

                case 36:
                    System.out.print("Ingrese un número: ");
                    int num36 = sc.nextInt();
                    System.out.println("Ejercicio 36:\n" + e.tablaMultiplicar(num36));
                    break;


                default:
                    System.out.println("seleccionaste una opcion incorrecta  ");
            }

        }

        sc.close();
    }
}
