package abc;

public class Day3_p1 {
	int year_ofpurchase;
	String mark;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("year of purchase"+2001);
		System.out.print("make"+"suzuki");
	}
	public void display2()
	{
		System.out.println("model"+1999);
		System.out.println("cost"+20000);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_p1 ob1=new Day3_p1();
		ob1.display1();
		ob1.display2();
	}

}
