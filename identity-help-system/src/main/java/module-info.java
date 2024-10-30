module com.identityhelp.identityhelpsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.slf4j;

    opens com.identityhelp.identityhelpsystem to javafx.fxml;
    opens com.identityhelp.identityhelpsystem.controller to javafx.fxml;
    opens com.identityhelp.identityhelpsystem.model to javafx.base;

    exports com.identityhelp.identityhelpsystem;
    exports com.identityhelp.identityhelpsystem.controller;
    exports com.identityhelp.identityhelpsystem.model;
    exports com.identityhelp.identityhelpsystem.config;
    exports com.identityhelp.identityhelpsystem.service;
    exports com.identityhelp.identityhelpsystem.repository;
}