import com.mongodb.MongoClient;
import mongoDB.MongoConnection;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        port(8080);
        MongoClient testClient = MongoConnection.CONNECTION.getClient();
        System.out.println(testClient.getCredential().toString());
        System.out.println("test");
        get("/hello", (req, res) -> "Hello World");
    }
}
