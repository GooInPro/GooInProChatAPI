package org.hyeong.gooinprochatapi.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @Bean
    public MongoTemplate mongoTemplate() {

        MongoClient mongoClient = MongoClients.create(mongoUri);
        return new MongoTemplate(mongoClient, "gooinprochatdb");
    }
}
