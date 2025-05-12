
package unidad5;

public class PruebaExcepciones1{

    public static void main(String[] args){
        String pass, repass;
        pass = "1234567";
        repass = "1234567";
        Valida v = new Valida ();
        try{
            v.validarPassWord(pass, repass);
            System.out.println("Registro exitoso");
        }catch(Excepciones1 e){
            System.out.println("No se puede registrar al usuario debido a: " + e.getMessage());
        }
    }
    
}
