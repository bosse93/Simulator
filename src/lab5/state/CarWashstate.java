package lab5.state;

public class CarWashstate {
	private double queueTime;
	private int queueSize;
	private double idleTime;
	
	public CarWashstate(){
		//ska skapa allt? alla tvättar, fabrik?
		//Skall det finnas en klass för tvättar? Vart finns annars våra carWashes?
		Carfactory fabrik = new Carfactory();
		FIFO carQueue = new FIFO();
		carWash snabb = new carWash();
		carWash seg = new carWash();
	}
	
	/**
	 * Gets queueTime
	 * @return double queueTime
	 */
	public double getQueueTime(){
		return this.queueTime;
	}
	
	/**
	 * gets state of carwash
	 * @return boolean
	 */
	public boolean carWashIdle(){
		//100% fel if-sats
		if(event.start || event.Arrive){
			return false;
		}
		return true;
	}
	
	public double getIdleTime(){
		if(carWashIdle()){
			return idleTime++;
		}
		return idleTime = 0;
	}
	
	

}
