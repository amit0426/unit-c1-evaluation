package com.masai;

public class Main {
	
	Car car=new Car();
	

	public static void main(String[] args) {
		
		Car car=new Car();
		car.model="maruti 101";
		car.companyName="Maruti";
		car.Color="black";
		car.engine="turbo";
		car.companyDeatails();
		
		Engine eng=new Engine();
		eng.rmp=1000;
		eng.Power=20000;
		eng.manufacturer="tata";
		eng.hasTurbo=true;
		
		eng.startEngin();
		

	}

}
