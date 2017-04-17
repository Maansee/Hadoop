package pack1;

public class MainClass {

	 public static void main(String[] args) {
	        
	        PTEmployee p = new PTEmployee();//part time employees have wages
	        FTEmployee f = new FTEmployee();//full time employee has salary
	        
	        p.accept();
	        f.accept();
	    }
}
