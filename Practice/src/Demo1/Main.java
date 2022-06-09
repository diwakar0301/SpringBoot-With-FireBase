package Demo1;
interface A{
	void a();
	int b();
}
class Polygon implements A {
	   public void display() {
	      System.out.println("Inside the display method of Polygon class");
	   }

	@Override
	public void a() {
		// TODO Auto-generated method stub
		 System.out.println("Inside the a method Polygon class");
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		 System.out.println("Inside the b method Polygon class");
		return 0;
	}
	   
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      A p1 = new A() {
	    	  @Override
	         public void a() {
	            System.out.println("Inside an a method of anonymous class.");
	         }
	    	  @Override
		         public int b() {
		            System.out.println("Inside an display method of anonymous class.");
		            return 1;
		         }
	      };
		  p1.a();
		   
		   
		   
//		   A interfaceA=()->{System.out.println("Inside an a method of anonymous class.");};
//	    interfaceA.a();
	     
	   }
	}

	class Main {
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}
