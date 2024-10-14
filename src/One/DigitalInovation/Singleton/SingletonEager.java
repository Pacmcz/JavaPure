package One.DigitalInovation.Singleton;
/**
 * Singleton "Apressado"
 * @author LucasR
 *
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {

        return instance;
    }
}


