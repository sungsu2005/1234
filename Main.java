
public class Main {

	public static void main(String[] args) {
		int a=1;
		int b=2;   
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		
		System.out.println("a��b�� ������?"+(a==b));
		System.out.println("a��b���� ũ����?"+(a>b));
		System.out.println("a��b���� �۳���?"+(a<b));
		System.out.println("a��b�� ���� a�� 30���� ū����??"+((a==b)&&(a>30)));
		System.out.println("a��b�� ���� a�� 2���� �۳���??"+((a==b)||(a>2)));
		System.out.println("a=1�ΰ���?"+!(a==1));
		
		System.out.println("�ִ���"+max(a,b));
		
		double c= Math.pow(3.0,6.0);
		System.out.println("3�� 6������"+(int)c);
		}
	static int max(int a, int b) {
		int result = (a>b) ? a:b;
		return result;
	}

}
