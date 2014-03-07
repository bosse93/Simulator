package lab5.state;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FIFO {

	
	List<Object> list = new ArrayList<Object>();


	public void add(Object arg0) {
		// TODO Auto-generated method stub
		list.add(arg0);
	}


	public Object first() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (list.size() > 0) {
			return list.get(0);
		} else {
			throw new NoSuchElementException("Listan är tom");
		}
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list.size() > 0) {
			return false;
		}
		return true;
	}



	public int maxSize() {
		// TODO Auto-generated method stub
		int i = 0;
		while( i < list.size() ) {
			i = i + 1;
			return i;
		}
		return i;
	}



	public void removeFirst() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (list.size() > 0){
			list.remove(0);
		} else {
			throw new NoSuchElementException("Listan är tom");
		}
	}


	public int size() {
		// TODO Auto-generated method stub
		return list.size();
		//return 0;
	}
	
	//onödig? addar på plats p, int id
	public void insert(int p, int id){
		list.add(p, id);
	}
	
}
