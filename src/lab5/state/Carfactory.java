package lab5.state;

public class Carfactory{
	private int id = -1;
	
	public Car createCar(){
		id++;
		Car car = new Car(id);
		return car;
	}
	
	//on�dig? Beh�ver vi veta hur m�nga bilar vi skapat?
	public int getTotalCars(){
		return id;
	}
	

}