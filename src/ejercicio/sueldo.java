
package ejercicio;


public class sueldo {
    double sueldo;
    double renta = 0.10;
    double horas;
    double pagoxH;
    String nombre;
    double salarioL;
    double salarioB;
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPagoxH() {
        return pagoxH;
    }

    public void setPagoxH(double pagoxH) {
        this.pagoxH = pagoxH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioL() {
        return salarioL;
    }

    public void setSalarioL(double salarioL) {
        this.salarioL = salarioL;
    }

    public double getSalarioB() {
        return salarioB;
    }

    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }
    
    public sueldo(double sueldo, double horas, double pagoxH, String nombre, double salarioL, double salarioB) {
        this.sueldo = sueldo;
        this.horas = horas;
        this.pagoxH = pagoxH;
        this.nombre = nombre;
        this.salarioL = salarioL;
        this.salarioB = salarioB;
    }
    public sueldo(){
        
    }
    public double horasE() {
        double HE1, HE2, HE3;
        double salario = 0.0;
        
        if (this.horas<=40) {
            sueldo=this.horas*this.pagoxH;
        }else if(this.horas>40 &&this.horas<=48) {
            HE2=horas-pagoxH;
            sueldo=(40*this.horas)+(HE2*this.pagoxH*2);
        }else if (this.horas>48) {
            HE3=this.horas-48;
            sueldo=(40*this.horas)+(8*this.horas*2)+(HE3*this.horas*3);
        }
        return sueldo;
    }
    public double salarioB(sueldo dato) {
        double salarioB;
        double sld;
        
        
        salarioB = dato.horasE();
        sld=(this.sueldo+salarioB);
        
        return sld;
                
    }
    public double Renta() {
        double renta;
        
        renta=(this.sueldo*10/100);
        return renta;
        
    }
    public double salarioL(sueldo dato){
        double SR;
        double SB;
        double salarioLqd;
        SB=dato.salarioB(dato);
        salarioLqd=dato.Renta();
        SR=SB-salarioLqd;
        
        return SR;
    }
}

