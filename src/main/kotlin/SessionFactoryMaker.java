import data.Account;
import data.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryMaker {
    private static SessionFactory factory;
    private static Object value;
    public SessionFactoryMaker(Object value) {
        SessionFactoryMaker.value = value;
    }

    private static void configureFactory()
    {
        try {
            factory = new Configuration()
                    .addAnnotatedClass(Account.class)
                    .addAnnotatedClass(Person.class)
                    .configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static org.hibernate.SessionFactory getFactory() {
        if (factory == null) {
            configureFactory();
        }

        return factory;
    }

}
