//example of compile time polymorphism or method overloading or Static Method Dispatch
public class Poly1 {
 void myFun(){
	 System.out.println("Without para");
 }
 void myFun(int a){
	 System.out.println("With one para");
	 System.out.println("a= "+a);
 }
 void myFun(int a,float b){
	 System.out.println("With two para");
	 System.out.println("c= "+(b+a));
 }
 
 public static void main(String[] args) {
	 Poly1 p = new Poly1();
	 p.myFun(21,52);
	
}
} 
