
package ejercicio2.evaluacion;






public class Departament {
    String ubicacion;
    String nombre;
    String cantidadDepto; 
    String cantidadPisos;

    public Departament(String ubicacion, String nombreE,String cantidadDep, String cantidadpisos) {
        this.ubicacion = ubicacion;
        this.nombre = nombreE;
          this.cantidadDepto = cantidadDep;
        this.cantidadPisos = cantidadpisos;
    }

    

    Departament() {
      
    }

    public String getUbicacion() {
        System.out.println("San Luis Talpa Lot. El Mariscal, la Paz ");        
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.ubicacion = ubicacion;
    }

    public String getNombre(){ 
        System.out.println("ITCA FEPADE Edificio C");
        return nombre;
    }

    public void setNombre(String nombreE) {
        this.nombre = nombreE;
    }

     
    public String getCantidadDepto() {
        System.out.println("cuatro departamentos ");
        return cantidadDepto;
    }

    public void setCantidadDepto(String cantidadDep) {
        this.cantidadDepto = cantidadDep;
    }

    public String getCantidadpisos() {
        System.out.println("tres pisos en el edificio C dos pisos en el edificio B");
        return cantidadPisos;
    }

    public void setCantidadpisos(String cantidadpisos) {
        this.cantidadPisos = cantidadpisos;
    }


}
    

