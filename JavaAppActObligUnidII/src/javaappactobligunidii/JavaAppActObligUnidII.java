package javaappactobligunidii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*@author mgallo*/
public class JavaAppActObligUnidII {

    public static void main(String[] args) throws IOException {
        String nombre = null;
        String apellido = null;
        String edad = null;
        String hobbie = null;
        String editorCod = null;
        String sistOper = null;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese su Nombre...");
        nombre = br.readLine();
        
        System.out.println("Ingrese su Apellido...");
        apellido = br.readLine();
        
        System.out.println("Ingrese su Edad...");
        edad = br.readLine();
        
        System.out.println("Ingrese su Hobbie...");
        hobbie = br.readLine();
        
        System.out.println("Ingrese su Editor de Código favorito. Ej: Notepad++, VS Code, Sublime, etc.");
        editorCod = br.readLine();
        
        System.out.println("Ingrese el Sistema Operativo que utiliza. Ej: Windows, Linux, MacOS, etc. ");
        sistOper = br.readLine();

        System.out.println("Bienvenido: " + nombre + " " + apellido);
        System.out.println("Tu Edad: " + edad + " y " + "Tu Hobbie: " + hobbie);
        System.out.println("Tu Editor: " + editorCod + " y " + "Tu Sist.Operativo actual: " + sistOper);

        //String entrada = br.readLine();
    }
    
}
