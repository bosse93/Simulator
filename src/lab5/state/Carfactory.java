package lab5.state;

public class Carfactory{
	private int id = -1;
	
	public Car createCar(){
		id++;
		Car car = new Car(id);
		return car;
	}
	
	//onödig? Behöver vi veta hur många bilar vi skapat?
	public int getTotalCars(){
		return id;
	}
	

}