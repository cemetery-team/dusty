package com.network;

import com.mongodb.Block;
import com.mongodb.client.*;
import main.java.com.network.Person;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.Document;


public class Main {

    public static void main(String[] args) {
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
    }
}
