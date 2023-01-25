class Test {
private int value = 10;
void method() {
int value = 40;
System.out.println("Value of Instance variable : "+ this.value);
System.out.println("Value of Local variable : "+ value);
}
}
 
class GFG {
public static void main(String args[]) {
Test obj1 = new Test();
obj1.method();
}
}
