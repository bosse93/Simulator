package lab5.state;

import java.util.ArrayList;

public class CarWashstate {
	private double queueTime;
	private int queueSize;
	private double idleTime;
	
	public CarWashstate(){
		//ska skapa allt? alla tvättar, fabrik?
		//Skall det finnas en klass för tvättar? Vart finns annars våra carWashes?
		Carfactory fabrik = new Carfactory();
		FIFO carQueue = new FIFO();
		ArrayList<carWash> fast = new ArrayList<carWash>();
		ArrayList<carWash> slow = new ArrayList<carWash>();
		//hur kollar vi efter tomma tvättar? Lista? Kollar båda listorna?
		
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
		return idleTime;
	}
	
	

}
