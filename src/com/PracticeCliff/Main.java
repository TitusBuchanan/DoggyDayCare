package com.PracticeCliff;

public class Main {

    public static void main(String[] args) {
	Animal frog = new Animal(4,"small",false,"Raul",2.0);
	Cat cat = new Cat(4,"Extra Large",true,"henry",12,"Calico]",true,1);
	Dog dog = new Dog(2,"Medium",true,"Benji",27.7,"Bulldog","short","b34");

	frog.speak();
	cat.speak();
	dog.speak();
    }
}
