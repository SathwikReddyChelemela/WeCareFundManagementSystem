/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStore;


import configuration.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import configuration.ConfigureSystem;
import java.nio.file.Paths;



/**
 *
 * @author team-11
 */
public class DB4OUtil {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer container) {
        if (container != null) {
            container.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration configuration = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(configuration, FILENAME);
            configuration.common().add(new TransparentPersistenceSupport());
            configuration.common().activationDepth(Integer.MAX_VALUE);
            configuration.common().updateDepth(Integer.MAX_VALUE);
            configuration.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer connection = createConnection();
        connection.store(system);
        connection.commit();
        connection.close();
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer connection = createConnection();
        System.out.println("----");
        System.out.println(FILENAME);
        System.out.println("----");
        ObjectSet<EcoSystem> systems = connection.query(EcoSystem.class);
        EcoSystem system;
        if (systems.isEmpty()) {
            system = ConfigureSystem.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        connection.close();
        return system;
    }
}
