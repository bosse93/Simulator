package lab5.simulator;

import java.util.ArrayList;
import java.util.Random;

public class SortedSequence {
	ArrayList<Event> eventList = new ArrayList<Event>();

	// ArrayList<Event> sortedSequence = new ArrayList<Event>();
	// static ArrayList<Integer> test = new ArrayList<Integer>();
	
/*Takes a arraylist with events and makes a call to insertionsort which sorts the list in a 
 * ascending order
 * @param <E> type of stored elements.
 */
	public void sort(ArrayList<Event> list) {
		insertionSort(list);
	}

	private static void insertionSort(ArrayList<Event> list) {
		int insertedValue;
		int insertionPoint;

		for (int i = 1; i < list.size(); i++) {
			insertedValue = list.get(i); 	// kopierar värdet på som ska sättas in.
										
			insertionPoint = i; 			// var i arrayen värdet ska sätta in
			
			// Indexet på arraylisten där värdet ska sättas in måste vara större än noll och
			// värdet på objectet som är innan insertionPoint ska vara större än
			// värdet som ska sättas in.
			// Om alla dessa uppfylls så sätts värdet på position
			// Insertpoint och med värdet som var större.
			// Detta upprepas tills insertionpoint är =0, eller om listan
			// är rätt ordnad(alltså i rätt ordning,minst först och ökande).
			while (insertionPoint > 0 && list.get(insertionPoint - 1) > insertedValue) {
				list.set(insertionPoint, list.get(insertionPoint - 1));
				insertionPoint--;
			}
			list.set(insertionPoint, insertedValue);
		}
	}

	public void addEvent(Event e) {
		add(e);
	}

	private void add(Event e) {
		if (isEmpty()) {
			eventList.add(0, e);
		} else {
			eventList.add(eventList.size(), e);
			sort(eventList);
		}

	}
	

	private boolean empty() {
		return eventList.isEmpty();
	}

	public boolean isEmpty() {
		return empty();
	}

}
