import java.lang.reflect.Constructor;

public class Coche {
    private int nPuertas;

    public Coche(int nPuertas){
        this.nPuertas=nPuertas;
    }
    
    public void aumentarPuertas(){
            this.nPuertas++;
    }

    public int mostrarNPuertas(){
        return this.nPuertas;
    }
}
