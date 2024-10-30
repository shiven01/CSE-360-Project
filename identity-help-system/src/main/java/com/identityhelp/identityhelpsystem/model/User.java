package com.identityhelp.identityhelpsystem.model;

import org.bson.types.ObjectId;
import java.time.LocalDateTime;
import java.util.List;

public class User {
    private ObjectId id;
    private String email;
    private String username;
    private String password;
    private boolean isOneTimePassword;
    private LocalDateTime oneTimePasswordExpiry;
    private Name name;
    private List<String> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Name inner class
    public static class Name {
        private String first;
        private String middle;
        private String last;
        private String preferred;

        // Getters and Setters
        public String getFirst() { return first; }
        public void setFirst(String first) { this.first = first; }
        public String getMiddle() { return middle; }
        public void setMiddle(String middle) { this.middle = middle; }
        public String getLast() { return last; }
        public void setLast(String last) { this.last = last; }
        public String getPreferred() { return preferred; }
        public void setPreferred(String preferred) { this.preferred = preferred; }
    }

    // Getters and Setters
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public boolean isOneTimePassword() { return isOneTimePassword; }
    public void setOneTimePassword(boolean oneTimePassword) { isOneTimePassword = oneTimePassword; }
    public LocalDateTime getOneTimePasswordExpiry() { return oneTimePasswordExpiry; }
    public void setOneTimePasswordExpiry(LocalDateTime oneTimePasswordExpiry) { this.oneTimePasswordExpiry = oneTimePasswordExpiry; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}