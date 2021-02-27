interface Calc{
	public int add(int a, int b);
}
class CalcClass implements Calc{
	@Overide
	public int add(int a, int b) {
		return 0;
	}
}


public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Calc calcObj = new Calc() {
			public int add(int x, int y) {return x+y;}
		};
		
		Calc newObj = (x,y) -> x+y;
			
		
	}
}
