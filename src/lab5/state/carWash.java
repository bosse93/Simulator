package lab5.state;

public class carWash {
	private boolean isBusy;
	private Car currentCar;
	private boolean hasCar;
	
	public carWash(){
		isBusy = false;
	}
	
	/**
	 * kollar om tvätten är tom
	 * @return true om tvätten är tom
	 */
	public boolean isEmpty(){
		if (this.isBusy){
			return false;
		}
		return true;
		
	}
	/**
	 * Koll om tvätten är ledig
	 * @param car att kolla efter
	 * @return boolean true om tvätten har en bil (upptagen).
	 */
	public boolean hasCar(Car car){
		if(this.isBusy && this.currentCar.getId() == car.getId()){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Tar en bil och "sätter på" tvätten
	 * @param car en bil
	 */
	public void addCar(Car car){
		this.currentCar = car;
		this.setBusy(true);
	}
	
	/**
	 * resettar tvätten.
	 */
	public void removeCar(){
		this.currentCar = null;
		this.setBusy(false);
	}
	
	/**
	 * är tvätten ledig? boolean
	 * @param busy true or false
	 */
	public void setBusy(boolean busy){
		this.hasCar = busy;
	}
	

}
