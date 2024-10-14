package One.DigitalInovation.Singleton;
/**
 * Singleton "Preguiçoso"
 * @author LucasR
 *
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
