public class Ejercicios {

    // =================================================================
    // 1. TIPOS DE DATOS Y CONVERSIÓN
    // =================================================================

    /**
     * Crea una variable de tipo entero, asígnale el valor 42 y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar 42
     */
    public int declararEntero() {
        int numero =42;
        return numero;
    }

    /**
     * Crea una variable de tipo double, asígnale el valor 3.14159 y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar 3.14159
     */
    public double declararDecimal() {
        double numero = 3.14159;
        return numero;
    }

    /**
     * Crea una variable String, asígnale "Hola Mundo" y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar "Hola Mundo"
     */
    public String declararTexto() {
        String texto = "Hola Mundo";
        return texto;
    }


    /**
     * Crea una variable boolean, asígnale true y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar true
     */
    public boolean declararBooleano() {
        boolean valor = true;
        return valor;
    }


    /**
     * Convierte un número entero a texto usando String.valueOf().
     * Ejemplo: Si pasas 123, debe retornar "123"
     */
    public String convertirEnteroATexto(int num) {


        return ""+num;
    }

    /**
     * Convierte un texto que contiene un número a entero usando Integer.parseInt().
     * Ejemplo: Si pasas "456", debe retornar 456
     */
    public int convertirTextoAEntero(String texto) {
        return Integer.parseInt(texto);
    }


    /**
     * Convierte un número decimal a entero (truncando los decimales).
     * Ejemplo: Si pasas 9.87, debe retornar 9
     */
    public int convertirDecimalAEntero(double decimal) {
        return (int) decimal;
    }


    /**
     * Convierte un número entero a decimal.
     * Ejemplo: Si pasas 5, debe retornar 5.0
     *  ejercicio 8
     */
    public double convertirEnteroADecimal(int entero) {
        return (double) entero;
    }


    // =================================================================
    // 2. ASIGNACIÓN E INTERACCIÓN DE VARIABLES
    // =================================================================

    /**
     * Recibe una edad, guárdala en una variable local y retórnala.
     * Ejemplo: Si pasas 25, debe retornar 25
     * ejercicio 9
     */
    public int asignarEdad(int edad) {
        int edadLocal = edad;
        return edadLocal;
    }


    /**
     * Recibe un nombre, guárdalo en una variable local y retórnalo.
     * Ejemplo: Si pasas "Juan", debe retornar "Juan"
     * ejercicio 10
     */
    public String asignarNombre(String nombre) {
        String nombreLocal = nombre;
        return nombreLocal;
    }


    /**
     * Intercambia dos valores y retorna un array con los valores intercambiados.
     * Ejemplo: Si pasas (5, 10), debe retornar [10, 5]
     * ejercicio 11
     */
    public int[] intercambiarValores(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }


    /**
     * Combina el nombre y la edad en un texto descriptivo.
     * Ejemplo: Si pasas ("Ana", 22), debe retornar "Ana tiene 22 años"
     * ejercicio 12
     */
    public String concatenarDatos(String nombre, int edad) {
        return nombre + " tiene " + edad + " años";
    }


    /**
     * Suma el salario base más los bonos para obtener el salario total.
     * Ejemplo: Si pasas (+1000.0, 200.0), debe retornar 1200.0
     * ejercicio 13
     */
    public double calcularSalarioTotal(double salarioBase, double bonos) {
        return salarioBase + bonos;
    }


    /**
     * Incrementa un contador con el valor especificado.
     * Ejemplo: Si pasas (10, 5), debe retornar 15
     * ejercicio 14
     */
    public int actualizarContador(int contadorActual, int incremento) {
        return contadorActual + incremento;
    }


    // =================================================================
    // 3. OPERADORES
    // =================================================================

    /**
     * Suma dos números enteros.
     * Ejemplo: Si pasas (7, 3), debe retornar 10
     * ejercicio 15
     */
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }


    /**
     * Calcula el residuo de una división usando el operador módulo (%).
     * Ejemplo: Si pasas (17, 5), debe retornar 2
     * ejercicio 16
     */
    public int calcularResto(int dividendo, int divisor) {
        return dividendo % divisor;
    }


    /**
     * Compara si el primer número es mayor que el segundo.
     * Ejemplo: Si pasas (8, 5), debe retornar true
     * ejercicio 17
     */
    public boolean esMayorQue(int a, int b) {
        return a > b;
    }


    /**
     * Verifica si un número es par Y positivo usando operadores lógicos.
     * Ejemplo: Si pasas 6, debe retornar true. Si pasas -4, debe retornar false
     * ejercicio 18
     */
    public boolean esParYPositivo(int num) {
        return num % 2 == 0 && num > 0;
    }


    /**
     * Verifica si un número es múltiplo de 3 usando el operador módulo.
     * Ejemplo: Si pasas 9, debe retornar true. Si pasas 7, debe retornar false
     * ejercicio  19
     */
    public boolean esMultiploDeTres(int num) {
        // TODO: Implementar
        return false;
    }

    /**
     * Verifica si el primer número es múltiplo del segundo.
     * Ejemplo: Si pasas (20, 4), debe retornar true
     * ejercicio  20
     */
    public boolean esMultiploDeN(int num, int n) {
        return num % n == 0;
    }


    /**
     * Incrementa un número en 1 usando operadores de asignación.
     * Ejemplo: Si pasas 5, debe retornar 6
     * ejercicio 21
     */
    public int incrementarEnUno(int num) {
        num += 1;
        return num;
    }

    /**
     * Verifica si un número es divisible por otro (residuo = 0).
     * Ejemplo: Si pasas (15, 3), debe retornar true
     * ejercicio 22
     */
    public boolean esDivisiblePor(int num, int divisor) {
        return num % divisor == 0;
    }

// =================================================================
// 4. CONDICIONALES
// =================================================================

    /**
     * Verifica si una persona es mayor de edad (18 años o más).
     * Ejemplo: Si pasas 20, debe retornar true. Si pasas 16, debe retornar false
     * ejercicio 23
     */
    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    /**
     * Clasifica un número como "positivo", "negativo" o "cero".
     * Ejemplo: Si pasas 5, debe retornar "positivo"
     * ejercicio 24
     */
    public String clasificarNumero(int num) {
        if (num > 0) return "positivo";
        else if (num < 0) return "negativo";
        else return "cero";
    }

    /**
     * Determina si un estudiante es "apto" (nota >= 3.0) o "no apto".
     * Ejemplo: Si pasas 3.5, debe retornar "apto"
     * ejercicio 25
     */
    public String evaluarPrueba(double nota) {
        return nota >= 3.0 ? "apto" : "no apto";
    }

    /**
     * Evalúa aptitud considerando: nota >= 3.0, edad >= 18 y experiencia.
     * Ejemplo: Si pasas (4.0, 22, true), debe retornar "apto"
     * ejercicio 26
     */
    public String evaluarAptitud(double nota, int edad, boolean tieneExperiencia) {
        if (nota >= 3.0 && edad >= 18 && tieneExperiencia) return "apto";
        else return "no apto";
    }

    /**
     * Aplica 15% descuento si es estudiante menor de 25 años.
     * Ejemplo: Si pasas (100.0, 20, true), debe retornar 85.0
     * ejercicio 27
     */
    public double calcularDescuentoEstudiante(double precio, int edad, boolean esEstudiante) {
        if (esEstudiante && edad < 25) return precio * 0.85;
        else return precio;
    }

    /**
     * Categoriza por edad: 0-12 "niño", 13-17 "adolescente", 18-64 "adulto", 65+ "adulto mayor".
     * Ejemplo: Si pasas 30, debe retornar "adulto"
     * ejercicio 28
     */
    public String determinarCategoria(int edad) {
        if (edad >= 0 && edad <= 12) return "niño";
        else if (edad >= 13 && edad <= 17) return "adolescente";
        else if (edad >= 18 && edad <= 64) return "adulto";
        else return "adulto mayor";
    }

// =================================================================
// 5. CICLOS
// =================================================================

    /**
     * Calcula la suma de números desde 1 hasta n (1+2+3+...+n).
     * Ejemplo: Si pasas 5, debe retornar 15 (1+2+3+4+5)
     * ejercicio 29
     */
    public int sumarHastaN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Calcula el factorial de n (n! = n × (n-1) × ... × 1).
     * Ejemplo: Si pasas 4, debe retornar 24 (4×3×2×1)
     * ejercicio 30
     */
    public int factorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Retorna el n-ésimo número de la secuencia Fibonacci (0,1,1,2,3,5,8...).
     * Ejemplo: Si pasas 6, debe retornar 8
     * ejercicio 31
     */
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * Verifica si un número es perfecto (suma de sus divisores = él mismo).
     * Ejemplo: Si pasas 6, debe retornar true (1+2+3=6)
     * ejercicio 32
     */
    public boolean esNumeroPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) suma += i;
        }
        return suma == num;
    }

    /**
     * Determina si un año es bisiesto (divisible por 4, excepto centenarios no divisibles por 400).
     * Ejemplo: Si pasas 2024, debe retornar true
     * ejercicio 33
     */
    public boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    /**
     * Verifica si la suma de los dígitos de un número es múltiplo de 7.
     * Ejemplo: Si pasas 25, debe retornar true (2+5=7, que es múltiplo de 7)
     * ejercicio 34
     */
    public boolean numeroMagico(int num) {
        int suma = 0;
        int n = Math.abs(num);
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma % 7 == 0;
    }

    /**
     * Cuenta cuántos dígitos tiene un número.
     * Ejemplo: Si pasas 1234, debe retornar 4
     * ejercicio 35
     */
    public int contarDigitos(int num) {
        int n = Math.abs(num);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    /**
     * Genera la tabla de multiplicar del 1 al 10 para el número dado, retorna como String.
     * Ejemplo: Si pasas 3, debe retornar "3x1=3\n3x2=6\n3x3=9\n...3x10=30"
     * ejercicio 36
     */
    public String tablaMultiplicar(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(num).append("x").append(i).append("=").append(num * i);
            if (i != 10) sb.append("\n");
        }
        return sb.toString();
    }

}