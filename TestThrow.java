public class TestThrow{
	public static void validate (int age) {
	if(age<18) {
		throw new ArithmeticException ("Person is eligible to vote!!");
		}
		}
		public static void main(Strings args[]){
		validate(13);
		System.out.println("rest .....");
		}
		}