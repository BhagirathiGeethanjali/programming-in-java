class Sse{  
String color="white";  
}  
class Sse1 extends Sse{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Sse1 class  
System.out.println(super.color);//prints color of Sse class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Sse1  d=new Sse1 ();  
d.printColor();  
}}
