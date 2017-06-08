package com.mongodb.test.main;

import com.mongodb.model.Araba;
import com.mongodb.test.araba.ArabaTest;

public class Test {

	static ArabaTest arabaTest = new ArabaTest();

	public static void main(String[] args) throws Exception {

		Araba araba = new Araba(5, "MAZDA", "COROLA", "BEYAZ", null);
		//arabaTest.addAraba(araba);
		
		Araba araba2 = arabaTest.getAraba(2);
		araba2.setRenk("BEJ");
		arabaTest.updateAraba(araba2);

		//arabaTest.deleteAraba(5);
		
		
		arabaTest.getsAraba();
	}

}
