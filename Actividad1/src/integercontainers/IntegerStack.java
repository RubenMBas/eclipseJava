package integercontainers;

public class IntegerStack {

	
	private Node top;  
	
	
	public void push(Integer i) {
		
		Node node = new Node(i);
		
		if (top==null) {
			top = node;
			//last = node;
		}
		else
		{
			node.last = top;
			top = node;
			
		}
	}
	
	public Integer pop() {
		if (top==null) {
			return null;
				}
		else {
			Integer a = top.data;
			top = top.last;
			return a;
			
			
		}
			
		
	}
	

	public Integer top() {
		if (top==null) {
			return null;
					}
		else 
			return top.data;
		
		
	}
	
	public int size() {
		if (top==null) {
			return 0;
		}else
		{
			int cuenta=0;
			Node temp;
			temp=top;
			
			while(temp != null) {
				//System.out.println(temp.last.toString());
				temp = temp.last;
				cuenta++;
			}
			
			
			
			return cuenta;
		}
	}
	
	public boolean search(Integer i) {
		
		Node temp;
		temp = top;
		
		if(temp == null) 
			return false;
		else {
			while(temp != null) {
					if (temp.data == i)
						{
						return true;
					}
					else 
						temp = temp.last;
			}
		return false;	
		}
		
	}

	public String toString() {
		
		String texto="";
		Node temp;
		temp = top;
		
		if(temp == null) 
			return "Empty Stack";
		else {
			while(temp != null) {
				
				texto += (" " +temp.data.toString());
				temp = temp.last;
				
			}
			return texto;
				
	}
	
	
	
}
}
