package mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;

public enum MongoConnection {
    CONNECTION;
    private MongoClient client = null;

    private MongoConnection() {

        try {
            client = new MongoClient(new MongoClientURI("mongodb://dbaccess:m3ttKJRjwLK78wPL6gMk@ds033046.mlab.com:33046/mdv-target-app"));
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
