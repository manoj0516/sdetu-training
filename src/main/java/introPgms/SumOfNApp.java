package introPgms;

public class SumOfNApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sumOfN(4));
	}

	public static int sumOfN(int n) {
		if(n==0) {
			return 0;
		}
		return (n * (n+1))/2;
	}
}
