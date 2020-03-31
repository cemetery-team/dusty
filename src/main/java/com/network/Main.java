package com.network;

/*
import com.mongodb.Block;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.java.com.network.Person;
import org.bson.Document;
*/
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        /*
        String server = "3.8.161.24";

        Person person = new Person("Charles", 2);

        MongoClient mongoClient = MongoClients.create("mongodb://" + server + ":27017");
        MongoDatabase database = mongoClient.getDatabase("dustydb");
        MongoCollection<Document> collection = database.getCollection("persons");

        System.out.println(database.getName());

        Block<Document> printBlock = new Block<Document>() {
            @Override
            public void apply(Document document) {
                System.out.println(document.toJson());
            }
        };

        collection.find().forEach(printBlock);
        */
    }


}