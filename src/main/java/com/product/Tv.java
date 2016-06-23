package com.product;
import java.util.ArrayList;
public class Tv {
	int id;
    String name;
    int cost;
    String description;
    int quantity;
    
    public Tv()
    {  }
    
	public Tv(int id1, String name1,int cost1, String description1, int quantity1)
	{
		id=id1;
		name=name1;
		cost=cost1;
		description =description1;
		quantity=quantity1;
	}
	
	public ArrayList<Tv> fill()
	{
		ArrayList<Tv> tv = new ArrayList<Tv>();
		Tv obj=new Tv(101,"Dell 5000 Inspiron ",56777,"dell",1);
		tv.add(obj);
		obj=new Tv(102,"Lenovo",38000,"Full Balck",1);
		tv.add(obj);
		obj=new Tv(103,"ascr",48000,"red",1);
		tv.add(obj);
	    obj=new Tv(104,"hp 6800",87553,"blue",1);
	    tv.add(obj);
		obj=new Tv(105,"viow",40000,"green",2);
		tv.add(obj);
		return tv;
	}
    
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
}

