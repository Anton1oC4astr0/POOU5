
package unidad5;

public class Valida{
    public void validarPassWord(String pass, String repass)throws Excepciones1{
        if (!pass.equals(repass)){
            throw new Excepciones1("Los campos del passWord no coinciden");
        }
        if (pass.length() < 8){
            throw new Excepciones1("No coincide el tamaño del passWord");
        }
    }
}
//Hacer un programa que que se encargue de detectar la CURP a traves del nombre (con las primeras letras), pidiendo que ingresen el nombre (1 nombre y 2 apellidos)