package lab5.state;

public class carWash {
	private boolean isBusy;
	private Car currentCar;
	private boolean hasCar;
	
	public carWash(){
		isBusy = false;
	}
	
	/**
	 * kollar om tv�tten �r tom
	 * @return true om tv�tten �r tom
	 */
	public boolean isEmpty(){
		if (this.isBusy){
			return false;
		}
		return true;
		
	}
	/**
	 * Koll om tv�tten �r ledig
	 * @param car att kolla efter
	 * @return boolean true om tv�tten har en bil (upptagen).
	 */
	public boolean hasCar(Car car){
		if(this.isBusy && this.currentCar.getId() == car.getId()){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Tar en bil och "s�tter p�" tv�tten
	 * @param car en bil
	 */
	public void addCar(Car car){
		this.currentCar = car;
		this.setBusy(true);
	}
	
	/**
	 * resettar tv�tten.
	 */
	public void removeCar(){
		this.currentCar = null;
		this.setBusy(false);
	}
	
	/**
	 * �r tv�tten ledig? boolean
	 * @param busy true or false
	 */
	public void setBusy(boolean busy){
		this.hasCar = busy;
	}
	

}
