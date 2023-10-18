public class MayorA {
    public static boolean esMayorA10(float number){
        boolean salida;
        salida = number>10;
        return salida;
    }

    public static boolean multiploDe3(int numero){
        boolean salida;
        salida = numero%3==0;
        return salida;
    }

    public static int esMenor(int[] array){
        int menor = 0;
        for (int i = 1; i < (array.length -1); i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int esMayor(int[] array){
        int mayor = 0;
        for (int i = 1; i < (array.length -1); i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static int[] copiarArray(int[] array){
        //Inicializamos varibales
        //un array donde se van a copiar los valores del array pasado por parametro
        int [] copiaArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            copiaArray[i] = array[i];
        }
        return copiaArray;
    }
}
