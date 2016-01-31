class SolveExpression{
	public static void main(String[] args){
	int x=5,y=10,a;
	System.out.println("x "+x+" y "+y);
	//a. x + y * 2
	a=x+y*2;
	System.out.println("x + y * 2 "+a);
	//b. x - y + 2
	a=x-y +2;
	System.out.println("x - y + 2 "+a);
	//c. (x+y) * 2
	a=(x+y)*2;
	System.out.println("(x+y) * 2 "+a);
	//d. y % x
	a=y%x;
	System.out.println("y % x "+a);
	}
}