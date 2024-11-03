import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;

import CrunchCod_Compress.CrunchCod;

public class Test {

    public static void main(String[] args) {
        //Prueba Real del metodo
        try {
        	File entrada= CrunchCod.compress(new File("C:\\Comprimir\\prueba.txt"), "C:\\Comprimir","salida",700,500,12);
         //   File salida= CrunchCod.descompress(new File("adelanto.cod"), "");



        }
        catch (StreamCorruptedException e) {
            System.out.println("Archivo corrupto o dañado");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
       // catch (ClassNotFoundException e) {
         //   e.printStackTrace();
        //}
    }
}
