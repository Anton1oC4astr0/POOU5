
package unidad5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones{
    //Caso1: Excepción
   /* public void imprimirArreglo (int arr []){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }*/
    //Caso2: Uso de la clase general
    /*public void imprimirArreglo (int arr []){
        try {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        }catch (Exception e){
            System.out.println("Error...el arreglo no tiene elementos");
        }
    }*/
    /*public void imprimirArreglo (int arr []){
        try {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        }catch (NullPointerException e){//Se trata exclisivamente la excepción
            System.out.println("Error...el arreglo no tiene elementos");
        }
    }*/
    public void validar(){
        int num;
        Scanner e = new Scanner(System.in);
        try{
            System.out.println("Introduce un valor entero: ");
            num = e.nextInt();
            System.out.println("Número correcto " + num);
        }catch (InputMismatchException m){
            System.out.println("Error...debes ingresar un número entero");
        }
    }
    public void imprimirArreglo (int arr[])throws Exception{
        if(arr != null){
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }else{
            throw new Exception ("Error... El arreglo no tiene elementos");
        }
    }
}
    
