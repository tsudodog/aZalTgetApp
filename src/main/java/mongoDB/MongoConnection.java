package mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import org.omg.CORBA.Environment;

public enum MongoConnection {
    CONNECTION;
    private MongoClient client = null;

    private MongoConnection() {

        try {
            String username = System.getenv("mdb_usr");
            String password = System.getenv("mdb_pass");
            StringBuilder sb = new StringBuilder();
            sb.append("mongodb://");
//            sb.append(username);
            sb.append("targetUser");
            sb.append(":");
//            sb.append(password);
            sb.append("targetUser1");
            sb.append("@ds033046.mlab.com:33046/mdv-target-app");
            client = new MongoClient(new MongoClientURI(sb.toString()));
        } catch (Exception e){
            e.printStackTrace();
            // TODO: Log exception
        }
    }

    public MongoClient getClient() {
        if (client == null){
            throw new RuntimeException();
        }
        return client;
    }


}
