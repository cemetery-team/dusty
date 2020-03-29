package com.network;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import main.java.com.network.Person;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;


public class Main {

    public static void main(String[] args) {
        String server = "3.8.161.24";

        Person person = new Person("Charles", 2);

        MongoClient mongoClient = MongoClients.create("mongodb://" + server + ":27017");

        System.out.println(mongoClient.getClusterDescription());

        System.out.println(person.getName() + ", " + person.getColor());
    }
}
