package integercontainers;

public class IntegerQueue {
	
	private Node tail;  	 
	private Node head;
	
	
	public void insert(Integer i) {
		
		Node node = new Node(i);
		
		if (tail==null) {		
			tail=node;
			head=node;
		}
		else
		{
			
			node.last = tail.last;
			tail = node;
			
		}
		
	}
/*	
	public Integer remove() {
		
	}
	
	public Integer seek() {
		
	}
	
	public int size() {
		
	}
	
	public boolean search(Integer i) {
		
	}
	*/
	
	public String toString() {
		
		if (tail == null)
				return "Empty Queue";
		else
		{
			String texto="";
			Node temp=tail;    ///     EMPEZAR CON NEXT  !!!!!!!!!!!!!!!
			
			while(temp != null) {
					
					texto += (" " +temp.data.toString());
					temp = temp.last;
					
				}
			return texto;
		}
		
				
	}
	
		
		
	
	
	

}
