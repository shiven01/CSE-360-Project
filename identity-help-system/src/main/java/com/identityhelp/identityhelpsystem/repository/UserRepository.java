package com.identityhelp.identityhelpsystem.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import com.identityhelp.identityhelpsystem.config.MongoConfig;
import com.identityhelp.identityhelpsystem.model.User;

public class UserRepository {
    private final MongoCollection<Document> collection;

    public UserRepository() {
        collection = MongoConfig.getDatabase().getCollection("users");
    }

    public User findByUsername(String username) {
        Document doc = collection.find(Filters.eq("username", username)).first();
        return doc != null ? documentToUser(doc) : null;
    }

    public void save(User user) {
        Document doc = userToDocument(user);
        collection.insertOne(doc);
    }

    private Document userToDocument(User user) {
        return new Document()
                .append("username", user.getUsername())
                .append("password", user.getPassword())
                .append("email", user.getEmail())
                .append("roles", user.getRoles());
    }

    private User documentToUser(Document doc) {
        User user = new User();
        user.setUsername(doc.getString("username"));
        user.setPassword(doc.getString("password"));
        user.setEmail(doc.getString("email"));
        user.setRoles(doc.getList("roles", String.class));
        return user;
    }
}