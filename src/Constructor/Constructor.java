package Constructor;

public class Constructor 
{

	   static class Parent {
	  Parent() {
	    System.out.println("Base Class Constructor Called ");
	  }
	}
	 
	static class Child extends Parent {
		
	  Child()
	  {
	    System.out.println("Derived Class Constructor Called ");
	  }
	}
	    
	    public static void main(String[] args) {
	        Child c = new Child();
	    }
}
