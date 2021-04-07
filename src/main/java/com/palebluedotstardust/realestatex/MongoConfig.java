package com.palebluedotstardust.realestatex;


import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("com.palebluedotstardust.realestatex.repos")
public class MongoConfig extends AbstractReactiveMongoConfiguration {
    @Override
    public MongoClient reactiveMongoClient() {
        // Instantiate MongoClient with default settings: mongodb://localhost
        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return "reactiveDB";
    }
}

