package devil.org;

public class Overload {
	static float myRankfloat(float x,float y) {
		return x+y;
	}
    static double myRankdouble(double x, double y) {
    	return x*y;
    }
	public static void main(String[] args) {
		float myNum1 = myRankfloat(8.0f,7.0f);
		double myNum2 = myRankdouble(45.6,56.7);
		System.out.println(myNum1);
		System.out.println(myNum2);
		

	}

}

