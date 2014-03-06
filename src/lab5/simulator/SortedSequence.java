package lab5.simulator;

import java.util.ArrayList;

public class SortedSequence {
	ArrayList <Event> eventList = new ArrayList<Event>();
	
	
	public void SortedSequence(){
		
	}
	
	public void addEvent(Event e){
		add(e);
	}
	
	private boolean empty(){ 
		return eventList.isEmpty();
	}
	public boolean isEmpty(){
		return empty();
	}
	private void add(Event e) throws IllegalArgumentException{
		if(e == null){
			throw new NullPointerException();
		}
		if (isEmpty()){
			eventList.add(e);
		}
	}
}
