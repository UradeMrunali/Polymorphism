// example of runtime polymorphism or method overriding or Dynamic Method Dispatch
public class PolyTest {
	
 public static void main(String[] args) {
	 
	Poly3 p =new Poly3();
	p.display();
	
//upcasting : When reference variable of Parent class refers to the object of Child class
	Poly2 p1 =new Poly3();
	p1.display();
	
//downcasting or manual casting is not possible directly you have to apply filter like "Poly3"	
	Poly3 p2 =(Poly3) new Poly2();
	p2.display();
	
}
}
