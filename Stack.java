package Com.Bridgelabz;

public class Stack {

		  private Node top;
		    private LinkedList linkedList;

		    public Stack() {
		        this.linkedList = new LinkedList();
		    }

		    public void push() {
		        linkedList.push(70);
		        linkedList.push(30);
		        top = linkedList.push(56);
//		        linkedList.print();
		    }


		    public void peek() {
		        push();
		        System.out.println("\nTop element is " + this.top.data);
		    }


}
