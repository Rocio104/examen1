
package ejercicio;
import java.util.Scanner;


public class ejercicio {
        public static void main(String [] asrg) {
        Scanner leer = new Scanner(System.in);
        
        
        sueldo objeto = new sueldo();
        
        System.out.println("Ingrese su nomnbre");
        objeto.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de horas trabajadas en el mes");
        objeto.setHoras(leer.nextDouble());
        
        System.out.println("Ingrese su sueldo por hora");
        objeto.setPagoxH(leer.nextDouble());
        
            System.out.println("Nombre de empleado: " +objeto.getNombre());
            System.out.println("Salario Bruto: $" +objeto.getSalarioB());
            System.out.println("salario Liquido: $" +objeto.getSalarioL());
            System.out.println("La retencion de salario es: $" + objeto.getRenta());
        }
}

    
        
