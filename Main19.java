
public class Main19 {
	public static int a(int number) {      //����Լ�
		if(number ==1)
			return 1;
		else
			return number *a(number -1);
	}
	public static int b(int number) {    //�ݺ��Լ�
		int sum =1;
		for(int i=2; i<=number; i++) {
			sum *= i;
		}
		return sum;
	}
	public static int c(int number) {
		int one =1;
		int two =1;
		int result = 1;
		if(number ==1) {
			return one;
		}
		else if (number==2) {
			return two;
		}
		else {
			for(int i =2; i<number; i++) {   //�ݺ��Լ�
				result=one+two;
				one =two;
				two =result;
			}
		return result;
		}	
	}
	public static int d(int number) {      //����Լ�
		if(number ==1) {
			return 1;
		}
		else if(number ==2) {
			return 1;
		}
		else {
			return d(number -1)+d(number -2);
		}
	}
	public static void main(String[] args) {
		System.out.println("5���丮����"+a(5));
		System.out.println("5���丮����"+b(5));
		System.out.println("�Ǻ���ġ ���� 5��° ����"+c(5));
		System.out.print("�Ǻ���ġ ���� 5��° ����"+d(5));
	}

}
