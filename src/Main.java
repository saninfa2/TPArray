import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Abrimos scanner
        Scanner scan = new Scanner(System.in);

        //----------------------------------DECLARACIÓN E INICIALIZACIÓN-----------------------------
        //-----------------------------------------EJERCICIO 1---------------------------------------
        // Declarar un array de 10 enteros y inicializarlo
        //con los valores de los 10 primeros números naturales.
        int [] integerNumbers = new int[10];
        for (int i = 0; i <= 9; i++) {
            integerNumbers[i] = i;
        }
        for (int i = 0; i <= 9; i++) {
            if (i != 9){
                System.out.print(integerNumbers[i] + ", ");
            } else {
                System.out.print(integerNumbers[i]);
            }
        }

        //----------------------------------------EJERCICIO 2---------------------------------------
        //Declarar un array de 10 números reales y inicializarlo con los
        //valores de los 10 primeros números primos.

        //Inicialización de variables
        int [] primeNumbers = new int[10];
        int j = 0;

        //se busca un número primo a través del método hasta que se llena el array
        for (int i = 2; j <= 9; i++) {
            if (EsPrimo.esPrimo(i)) {
                primeNumbers[j] = i;
                j+=1;
            }
        }

        //Mostramos el array a través del método mostrarArray
        MostrarArray.mostrarArrayInt(primeNumbers);

        //----------------------------------------EJERCICIO 3-----------------------------------------
        //Declarar un array bidimensional de 10 filas y 10 columnas de números enteros.
        //Inicialización de variables
        int [][] arrayBidimensional = new int[10][10];

        //-----------------EJERCICIO 4------------------------
        //Declarar un array multidimensional de 3 dimensiones de números reales.
        int [][][] arrayMultidimensional = new int[4][4][4];


        //------------------------------------LECTURA Y ESCRITURA--------------------------------------
        //----------------------------------------EJERCICIO 1------------------------------------------
        //Ingresar por teclado los valores de un array de 10 enteros
        //Inicialización de variables
        int number;

        //Recorremos el array de números naturales y si el número es natural se guarda
        for(int k = 0; k <= 9; k++){
            System.out.println("Ingrese el valor " + (k+1) + ":");
            number = scan.nextInt();
            if (number >= 0){
                integerNumbers[k] = number;
            } else {
                System.out.println("El número ingresado no es natural");
            }
        }
        MostrarArray.mostrarArrayInt(integerNumbers);

        //----------------------------------------EJERCICIO 2------------------------------------------
        //Ingresar por teclado los valores de un array de 10 números reales.
        //Inicialización de variables
        float [] realNumbers = new float[10];

        //Recorremos el array de números naturales y si el número es natural se guarda
        for(int k = 0; k <= 9; k++){
            System.out.println("Ingrese el valor " + (k+1) + ":");
            realNumbers[k] = scan.nextFloat();

        }

        //Mostramos por pantalla el resultado
        MostrarArray.mostrarArrayFloat(realNumbers);



        //----------------------------------------EJERCICIO 3------------------------------------------
        //Leer los datos de un array de caracteres y mostrarlos por pantalla.
        //Inicialización de variables
        char [] arrayChar = new char[10];
        String oneChar;
        int k = 0;

        //Recorremos el array y pedimos un string, ya que no hay métodos para leer char
        //a través de charat convertimos el string a char tomando la cifra 0
        do{
            System.out.println("Ingrese el valor " + (k+1) + ":");
            oneChar = scan.next();
            arrayChar[k] = oneChar.charAt(0);
            k++;
        } while (k != 10);

        //Mostramos por pantalla el resultado
        MostrarArray.mostrarArrayChar(arrayChar);

        //----------------------------------------EJERCICIO 4------------------------------------------
        //Leer los datos de un array de booleanos y mostrarlos por pantalla.
        //Inicialización de variables
        boolean [] arrayBool = new boolean[10];
        String oneString;
        k = 0;

        //Recorremos el array y pedimos una entrada, si se ingresa v se ingresa un True al array y si se ingresa una f
        //se ingresa un False al array
        do{
            System.out.println("Ingrese V para ingresar Verdadero y F para ingresar Falso: ");
            oneString = scan.next().toUpperCase();
            if (oneString.equals("V")){
                arrayBool[k] = true;
            } else if (oneString.equals("F")) {
                arrayBool[k] = false;
            }
            k++;
        } while (k != 10);

        //Mostramos por pantalla el resultado
        MostrarArray.mostrarArrayBoolean(arrayBool);


        //----------------------------------OPERACIONES ARITMETICAS------------------------------------
        //----------------------------------------EJERCICIO 1------------------------------------------
        //Sumar los elementos de un array de 10 enteros
        //Inicialización de variables
        int sum = 0;

        //Reutilizamo el array de numeros enteros que hicimos anteriormente
        //Recorremos el array y en una variable externa sumamos todos sus valores
        for(k = 0; k <= 9; k++) {
            sum += integerNumbers[k];
        }

        //Mostramos el resultado por pantalla
        System.out.println("Resultado de la suma: " + sum);



        //----------------------------------------EJERCICIO 2------------------------------------------
        //Multiplicar los elementos de un array de 10 números reales.
        float product = 1;

        //Reutilizamo el array de numeros reales que hicimos anteriormente
        //Recorremos el array y en una variable externa multiplizamos los elementos
        for(k = 0; k <= 9; k++) {
            product *= realNumbers[k];
        }

        //Mostramos el resultado por pantalla
        System.out.println("Producto: " + product);

        //----------------------------------------EJERCICIO 3------------------------------------------
        //Ordenar un array de 10 enteros de menor a mayor.
        //A través del método sort ordenamos el array reutilizando el array de números enteros ingresados anteriormente
        Arrays.sort(integerNumbers);

        //Mostramos el resultado por pantalla
        MostrarArray.mostrarArrayInt(integerNumbers);

        //----------------------------------------EJERCICIO 4------------------------------------------
        //Ordenar un array de 10 cadenas de forma alfabética.
        String [] arrayCadenas = {"naranja", "banana", "kiwi", "manzana", "arandanos", "sandia", "frutilla", "mandarina","pomelo", "lechuga"};
        Arrays.sort(arrayCadenas);

        //Mostramos el resultado por pantalla
        MostrarArray.mostrarArrayString(arrayCadenas);

        //----------------------------------¿Ejercicios adicionales?------------------------------------
        //-----------------------------------------EJERCICIO 1------------------------------------------
        //Implementar un método que cuente el número de elementos pares en un array de enteros.
        //Inicialización de variables
        int counter = 0;

        //Reutilizamo el array de numeros enteros que hicimos anteriormente
        //Recorremos el array en busca de un numero par, si se encuentra el contador suma 1
        for(k = 0; k <= 9; k++) {
            if(EsPar.esPar(integerNumbers[k])){
                counter++;
            }
        }

        //Mostramos el resultado por pantalla
        System.out.println("Cantidad de números pares: " + counter);

        //----------------------------------------EJERCICIO 2------------------------------------------
        //Implementar un método que cuente el número de elementos mayores que 10 en un array de números reales.
        counter = 0;

        //Reutilizamo el array de numeros reales que hicimos anteriormente
        //Recorremos el array en busca de números reales mayores a 10
        for(k = 0; k <= 9; k++) {
            if(MayorA.esMayorA10(realNumbers[k])){
                counter++;
            }
        }

        //Mostramos el resultado por pantalla
        System.out.println("Cantidad de números mayores a 10: " + counter);

        //----------------------------------------EJERCICIO 3------------------------------------------
        //Implementar un método que calcule la suma de los elementos de un array de enteros que sean múltiplos de 3.
        //Inicializamos el contador en 0
        counter = 0;

        //Reutilizamo el array de numeros entero que hicimos anteriormente
        //Recorremos el array en busca de multiplos de 3 y los cumulamos en una variable
        for(k = 0; k <= 9; k++) {
            if(MayorA.multiploDe3(integerNumbers[k])){
                counter+= integerNumbers[k];
            }
        }

        //Mostramos el resultado por pantalla
        System.out.println("Suma de multiplos de 3: " + counter);
        //----------------------------------------EJERCICIO 4------------------------------------------
        //Implementar un método que encuentre el elemento máximo de un array de enteros.
        //Inicialización de variables
        int mayor;

        //A través del método buscamos el mayor de los números
        mayor = MayorA.esMayor(integerNumbers);

        System.out.println("El número mayor es: " + mayor);

        //----------------------------------------EJERCICIO 5------------------------------------------
        //Implementar un método que encuentre el elemento mínimo de un array de cadenas.
        //Inicialización de variables
        int numeroMenor;

        //recorremos el array en busca del número menor
        numeroMenor = MayorA.esMenor(integerNumbers);

        System.out.println("El número menor es: " + numeroMenor);

        //----------------------------------------EJERCICIO 6------------------------------------------
        //Implementar un método que copie un array de enteros a otro array de enteros.
        int [] copiaArray;

        copiaArray = MayorA.copiarArray(integerNumbers);

        MostrarArray.mostrarArrayInt(copiaArray);

        //Cerramos scanner
        scan.close();
    }
}