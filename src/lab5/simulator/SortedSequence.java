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
			insertedValue = list.get(i); 	// kopierar v�rdet p� som ska s�ttas in.
										
			insertionPoint = i; 			// var i arrayen v�rdet ska s�tta in
			
			// Indexet p� arraylisten d�r v�rdet ska s�ttas in m�ste vara st�rre �n noll och
			// v�rdet p� objectet som �r innan insertionPoint ska vara st�rre �n
			// v�rdet som ska s�ttas in.
			// Om alla dessa uppfylls s� s�tts v�rdet p� position
			// Insertpoint och med v�rdet som var st�rre.
			// Detta upprepas tills insertionpoint �r =0, eller om listan
			// �r r�tt ordnad(allts� i r�tt ordning,minst f�rst och �kande).
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
