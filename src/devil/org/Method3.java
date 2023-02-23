package devil.org;

public class Method3 {
	static void myAge(int age) {
		if(age<18) {
		System.out.println("Access denied - not old enough to vote");
		}else {
		System.out.println("Access Grandted - enough to vote");
		}
	}

	public static void main(String[] args) {
		myAge(26);
		

	}
}

