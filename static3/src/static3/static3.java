package static3;
//http://www.javatpoint.com/static-keyword-in-java
class calculate{
	static int cube(int x){
		return x*x*x;
		
	}
}

public class static3 {
	public static void main(String[] args) {
		int result = calculate.cube(5);
		System.out.println(result);
		
	}

}
