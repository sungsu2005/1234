
public class Main {

	public static void main(String[] args) {
		int a=1;
		int b=2;   
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		
		System.out.println("a와b가 같나요?"+(a==b));
		System.out.println("a가b보다 크나요?"+(a>b));
		System.out.println("a가b보다 작나요?"+(a<b));
		System.out.println("a와b가 같고 a가 30보다 큰가요??"+((a==b)&&(a>30)));
		System.out.println("a와b가 같고 a가 2보다 작나요??"+((a==b)||(a>2)));
		System.out.println("a=1인가요?"+!(a==1));
		
		System.out.println("최댓값은"+max(a,b));
		
		double c= Math.pow(3.0,6.0);
		System.out.println("3의 6제곱은"+(int)c);
		}
	static int max(int a, int b) {
		int result = (a>b) ? a:b;
		return result;
	}

}
