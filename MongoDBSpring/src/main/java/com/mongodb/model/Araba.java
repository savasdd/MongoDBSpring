package com.mongodb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "arabalar")
public class Araba {

	@Id
	private int id;
	private String marka;
	private String model;
	private String renk;
	private Date uretimyili;

	public Araba() {
		// TODO Auto-generated constructor stub
	}

	public Araba(int id, String marka, String model, String renk, Date uretimyili) {
		super();
		this.id = id;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.uretimyili = uretimyili;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public Date getUretimyili() {
		return uretimyili;
	}

	public void setUretimyili(Date uretimyili) {
		this.uretimyili = uretimyili;
	}

	@Override
	public String toString() {
		return "Araba [ ID:" + id + " ,Marka:" + marka + " ,Model:" + model + " ,Renk:" + renk + " ,Üretim Yılı:"
				+ uretimyili + " ]";
	}

}
