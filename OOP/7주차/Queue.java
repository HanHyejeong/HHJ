
public class Queue {
	private int[] elements;
	private int size;
	private int count;
	
	public static final int DEFAULT_CAPACITY = 8;
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		for (int i = 1; i <= 20; i++) {
		queue.enqueue(i);
		}
		while (!queue.empty()) {
		System.out.print(queue.dequeue() + " ");}
		}
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	
	public Queue(int capacity) {
		elements = new int[capacity];
    }
	
	public void enqueue(int v) {
		if (size >= elements.length) {
		      int[] temp = new int[elements.length * 2];
		      System.arraycopy(elements, 0, temp, 0, elements.length);
		      elements = temp;
		    }

		    elements[size++] = v;
	}
	
	public int dequeue() {
		int[] temp = new int[elements.length - 1];
		
		if(count == 0) {
			size--;
			count++;
			
			return elements[0];
		}
		else{
			for(int i=0, j=1; i<temp.length;i++, j++) {
		
			temp[i]=elements[j];
			}
			
			elements = temp;
			size--;
		
			return elements[0];
		}
	}
	
	public boolean empty() {
	    return size == 0;
	}
	
	public int getSize() {
	    return size;
	}
}
