package herencia_polimorfismo;

public class Cliente extends Persona {

    private double creadito;

    public Cliente(int edad, String nombre, String telefono, double creadito){
        super(edad,nombre,telefono);
        this.creadito=creadito;
    }


    public void setCreadito(double creadito) {
        this.creadito = creadito;
    }

    public double getCreadito() {
        return creadito;
    }

    @Override
    public String toString() {
     return "Nombre: "+nombre+" Edad: "+edad+" Telefono: "+telefono+" Credito: "+creadito;
    }
    
    
}
