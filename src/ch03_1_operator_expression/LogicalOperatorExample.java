package ch03_1_operator_expression;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode <=90))	{
			System.out.println("�빮�ڱ���.");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("�ҹ��ڱ���.");
			
		}
		
		if((charCode<48) && (charCode>57)) {
			System.out.println("0~9 ���ڱ���.");
			
		}
		
		int v = 6;
		
		if ((v%2 ==0) || (v%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������.");
			
		}
		if((v%2==0) | (v%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������.");
			
		}
		
		
		
		
		
		
		
		
		

	}

}
