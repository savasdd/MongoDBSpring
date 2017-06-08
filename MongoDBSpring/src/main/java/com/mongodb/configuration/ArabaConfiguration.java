package com.mongodb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class ArabaConfiguration extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "araba";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost");
	}

}
