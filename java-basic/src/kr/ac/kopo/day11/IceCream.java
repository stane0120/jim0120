package kr.ac.kopo.day11;

public class IceCream {
    private String name;
    private int price;

    public IceCream(){
    }

    public IceCream(String name, int price){
    	this.name = name;
    	this.price = price;
    }
    
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setName(String name){
    	this.name = name;
    }
}
