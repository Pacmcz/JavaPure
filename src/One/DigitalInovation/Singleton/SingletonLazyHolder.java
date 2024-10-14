package One.DigitalInovation.Singleton;
/**
 * Singleton "Apressado"
 * @author LucasR
 *
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public  static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
