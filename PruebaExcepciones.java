
package unidad5;

public class PruebaExcepciones{

    public static void main(String[] args){
       // int arr[] = {5,8,4,9,20};
       int arr [] = null;//se da una excepción, no se puede imprimir un arreglo vacio.
        Excepciones e = new Excepciones();
        e.imprimirArreglo(arr);
        /*Excepciones num = new Excepciones();
        num.validar();*/
        e.validar();
    }
}
