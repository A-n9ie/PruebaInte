//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Main {
    public static void verificar(String pass) throws ExcepcionNum
    {
        int cant = pass.length();
        for(int i = 0; i < cant; i++){
            char bit = pass.charAt(i);
            if(Character.isDigit(bit)){
                throw new ExcepcionNum();
            }
        }
    }
    public static void main(String[] args) {
        String password = "";
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Cree una contraseña\n");
            System.out.print("Esta no debe contener números\n");
            password = entrada.nextLine();
            verificar(password);

        }
        catch (ExcepcionNum e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("La contraseña es: " + password + "\n");
        }
        System.out.print("Programa terminado");
    }
}

