package com.mongodb.test.araba;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.configuration.ArabaConfiguration;
import com.mongodb.model.Araba;

public class ArabaTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(ArabaConfiguration.class);
	MongoOperations op = (MongoOperations) context.getBean("mongoTemplate");

	public void addAraba(Araba araba) throws Exception {

		op.save(araba);
	}

	public void getsAraba() throws Exception {

		List<Araba> list = op.findAll(Araba.class);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@SuppressWarnings("unused")
	public Araba getAraba(int id) throws Exception {
		Query query = new Query(Criteria.where("id").is(id)); // sadece _id
		Araba araba = op.findById(id, Araba.class);
		return araba;
	}

	public void updateAraba(Araba araba) throws Exception {

		Query query = new Query(Criteria.where("id").is(araba.getId()));
		op.updateFirst(query, Update.update("uretimyili", Timestamp.valueOf(LocalDateTime.now())), Araba.class);
		op.updateFirst(query, Update.update("renk", araba.getRenk()), Araba.class);


	}

	public void deleteAraba(int id) {
		Query query = new Query(Criteria.where("id").is(id));
		op.remove(query, Araba.class);
	}

}
