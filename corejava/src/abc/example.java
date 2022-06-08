package abc;

public class example {
	example(){
	System.out.println("default constructor");
	}
	example(int i,int j){
		System.out.println( "two parameter constructer");
	}
	example(int i,int j,int k){
		System.out.println("three parameter constructer");
	}
	example(int i,String name){
		System.out.println("constructer with int and string");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		example obj1=new example();
		example obj2=new example(12,11);
		example obj3=new example(12, 13, 14);
		example obj4=new example(12, "pavan");
		
		

	}

}
