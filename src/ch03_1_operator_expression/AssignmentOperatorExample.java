package ch03_1_operator_expression;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int r = 0;
		r += 10;
		System.out.println("r=" + r);
		r -=5;
		System.out.println("r=" + r);
		r *=3;
		System.out.println("r=" + r);
		r /=5;
		System.out.println("r=" + r);
		r %=3;
		System.out.println("r=" + r);
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score >80)? 'B' : 'C');
		System.out.printf("%d점은 %c 등급입니다.\n", score, grade);
		
	
	
		
	}

}
