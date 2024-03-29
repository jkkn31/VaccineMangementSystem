package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

//@author Krishnakanth Naik Jarapala, Venkata Bhargavi Sikhakolli.

public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
//    private static final String FILENAME = "E:\\Projects\\reviewsss\\Vaccine-Distribution-System-using-JAVA-Technologies-and-Object-Oriented-Programming\\AED_Project_NVMS\\src\\dataBank\\Databank12.db4o";
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) 
        {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);

            config.common().add(new TransparentPersistenceSupport());

            config.common().activationDepth(Integer.MAX_VALUE);

            config.common().updateDepth(Integer.MAX_VALUE);

            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
            
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
        EcoSystem system;
        if (systems.isEmpty()) {
            system = ConfigureASystem.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
//        return system;
        return system;
    }
}