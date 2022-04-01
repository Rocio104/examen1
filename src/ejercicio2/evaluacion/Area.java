
package ejercicio2.evaluacion;


public class Area {
    String computos,Biblioteca,zonaVerd,laboratorio,cancha;
public Area(String computos, String Biblioteca, String zonaVerde, String laboratorio, String cancha) {
        this.computos = computos;
        this.Biblioteca = Biblioteca;
        this.zonaVerd = zonaVerde;
        this.laboratorio = laboratorio;
        this.cancha = cancha;
    }

    public Area() {
    }

    public String getcomputos() {
        System.out.println("el codigo de los computos es Cp302");
        return computos;
    }

    public void setcomputos(String Ccomputos) {
        this.computos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("el codigo de la biblioteca es B555");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerd() {
        System.out.println("el codigo de la zona verde es Zv321");
        return zonaVerd;
    }

    public void setZonaVerd(String zonaVerd) {
        this.zonaVerd = zonaVerd;
    }

    public String getLaboratorio(){
        System.out.println("el codigo de laboratorio es L123");
        return laboratorio;
    }

    public void setLaboratorio(String lab) {
        this.laboratorio = laboratorio;
    }

    public String getCancha() {
        System.out.println("el codigo de la cancha es C001");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }
    
}
