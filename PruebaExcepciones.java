
package unidad5;

public class PruebaExcepciones{

    public static void main(String[] args){
       // int arr[] = {5,8,4,9,20};
       int arr [] = null;//se da una excepción, no se puede imprimir un arreglo vacio.
        Excepciones e = new Excepciones();
        try{
        e.imprimirArreglo(arr);
        }catch(Exception ex){
        /*Excepciones num = new Excepciones();
        num.validar();*/
        //e.validar();
            System.out.println(ex.getLocalizedMessage());
        }
        try{
            e.imprimirArreglo(arr);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

