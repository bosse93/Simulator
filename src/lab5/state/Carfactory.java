package lab5.state;

public class Carfactory{
//	private int numberOfCars = 0;
	private int id = 0;
	
	public void createCar(){
	Car car = new Car(id++);
	}
	
	public int getId(){
		return id;
	}
	

}