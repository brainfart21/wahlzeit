package org.wahlzeit.model;

public class Bread {
private String name;
private String doughType;
private int age;
private String toppings;


    public Bread(String name, String doughType, int age, String toppings) {
        setName(name);
        setDoughType(doughType);
        setAge(age);
        setToppings(toppings);
    }

    public Bread(){
        this(null, null, 0, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
			this.name = "placeholder";
        else
        	this.name = name;
    }

    public String getDoughType() {
        return doughType;
    }

    public void setDoughType(String doughType) {
        if(doughType == null || doughType == "")
            this.doughType = "kein Teig";
        else
            this.doughType = doughType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        if(toppings == null || toppings == "")
            this.toppings = "keine Toppings";
        else
            this.toppings = toppings;
    }

    public boolean isEqual(Bread bread){
    	return getAge() == bread.getAge() &&
				getName().equals(bread.getName()) &&
				getDoughType().equals(bread.getDoughType()) &&
				getToppings().equals(bread.getToppings());
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.isEqual((Bread) o);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + getName() + '\'' +
                ", doughType='" + getDoughType() + '\'' +
                ", age=" + getAge() +
                ", toppings=" + getToppings() +
                '}';
    }
}
