
package ejercicio2.evaluacion;

import java.util.Scanner;


public class Recursos {
    private Scanner teclado;
    private String nombre,direccion,edificio;
    private int cargo,edad;
    private double salario,salarioF,renta,AFP,ISSS;
    

    
   public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese su edad:");
        edad=teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        salario=teclado.nextDouble();
        System.out.print("Ingrese 01 si su cargo es por servicio y 02 si es permanente:");
        cargo =teclado.nextInt();
          System.out.print("Ingrese su direccion:");
        direccion=teclado.next();
          System.out.print("Ingrese Numero de edificio ");
        edificio=teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+nombre+"\n");
        System.out.println("Edad:"+edad+"\n");
         System.out.println("direccion:"+direccion+"\n");
         System.out.println("numero de edificio :"+edificio );
         System.out.println("");
    }
    public void cargo() {
        if (cargo==01) {
            renta= (salario * 0.10);
             salarioF= (salario-renta);
             System.out.println("");
            System.out.print("su cargo es por servicio, su salario final es de:$ "+ salarioF);
             System.out.println("");
            
        } else if(cargo==02) {
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salarioF= (salario-renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" su cargo es permanente, su salario final es de: $ "+salarioF);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Departament objeto= new Departament();
       Recursos Dpersona1;
        Dpersona1=new Recursos();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombre();
        objeto.getCantidadDepto();
        objeto.getCantidadpisos();
        
        System.out.println("");
         
         Area codigo= new Area();
         codigo.getcomputos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLaboratorio();
         codigo.getZonaVerd();
    }
}
    

