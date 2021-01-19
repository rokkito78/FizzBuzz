public class FizzBuzz {
	
	public  String fizzBuzz(int number) {
	String a= "";
	int i= number;
	
	 if(i %3==0 && i%5==0) {
		a="FizzBuzz";
	}
	 else if(i % 3 ==0) {
			a="Fizz";
		}
		else if(i % 5 ==0) {
			a="buzz";	
		}
		else {
		 a= String.valueOf(number);
		}
		return a;
 }
	
}