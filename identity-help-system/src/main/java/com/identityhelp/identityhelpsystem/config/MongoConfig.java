package com.identityhelp.identityhelpsystem.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.io.IOException;
import java.util.Properties;

public class MongoConfig {
    private static MongoClient mongoClient;
    private static final String DATABASE_NAME = "identity_help_system";

    public static MongoDatabase getDatabase() {
        if (mongoClient == null) {
            initializeMongoClient();
        }
        return mongoClient.getDatabase(DATABASE_NAME);
    }

    private static void initializeMongoClient() {
        try {
            Properties props = new Properties();
            props.load(MongoConfig.class.getResourceAsStream("/application-local.properties"));
            String mongoUri = props.getProperty("mongodb.uri");
            mongoClient = MongoClients.create(mongoUri);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load MongoDB configuration", e);
        }
    }
}