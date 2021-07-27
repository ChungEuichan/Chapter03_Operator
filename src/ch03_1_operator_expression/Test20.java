package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {

		int n1 = 0, n2 =0;
		boolean r;

		r = ((n1 +=10) < 0 && (n2 +=10) >0 );
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
	
		r = ((n1 +=10) >0 || (n2 +=10)>0);
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
	
	
	}

}
