package com.product;
import java.util.ArrayList;
public class Phone {
	int id;
    String name;
    int cost;
    String description;
    int quantity;
    
    public Phone()
    {  }
    
	public Phone(int id1, String name1,int cost1, String description1, int quantity1)
	{
		id=id1;
		name=name1;
		cost=cost1;
		description =description1;
		quantity=quantity1;
	}
	
	public ArrayList<Phone> fill()
	{
		ArrayList<Phone> ph = new ArrayList<Phone>();
		Phone obj=new Phone(101,"motorola g4 ",14000,"dell",1);
		ph.add(obj);
		obj=new Phone(102,"Lenovo light",18000,"Full Balck",1);
		ph.add(obj);
		obj=new Phone(103,"sony Ax",20000,"red",1);
		ph.add(obj);
	    obj=new Phone(104,"iphone 6s+ 6800",780000,"blue",1);
	    ph.add(obj);
		obj=new Phone(105,"canvarse",10000,"green",2);
		ph.add(obj);
		return ph;
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

