package abc;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			str.equals("palla");
		}catch(NullPointerException ne) {
			str=new String("palla");
			System.out.println(str.equals("palla"));
		}
		System.out.println("continue");
		

	}

}
