
package unidad6;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ArchivoTexto{
    String texto = "";
    public void lecturaPorCaracter(){
        try{
            FileReader br = new FileReader("curpParte1.java");
            int c = br.read();
            while(c != -1){
            texto = texto + (char)c;
            c = br.read();
            }
            br.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }
    public void lecturaPorLinea(){//Es mas rapido leerlo por linea que por caracter 
        try{
            BufferedReader br = new BufferedReader(new FileReader("curpParte1.java"));
            String linea = "";
            while(linea != null){
            texto = texto + linea + '\n';
            linea = br.readLine();
            }
            br.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }
    public void guardar(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("El ingenioso hidalgo don Quijote de la Mancha.txt"));
            String cad = "En un lugar de la mancha";
            for (int i = 0; i < cad.length(); i++){
                bw.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no quiero acordarme";
            bw.newLine();
            bw.write(cad);
            bw.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}