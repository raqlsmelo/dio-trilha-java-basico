package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "preguiçoso"
 * @author raqlsmelo
 */

public class SingletonLazy {
    
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}