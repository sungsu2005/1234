import java.util.Scanner;

public class Main20 {
	public static int max(int a,int b) {
		return (a>b)? a:b;
	}

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.print("생성할 배열의 크기 입력");
		int number = a.nextInt();
		int[]array=new int[number];
		for(int i=0; i<number; i++) {
			System.out.print("배열에 넣을 정수를 입력하세요");
			array[i]=a.nextInt();
			}
		int result =-1;
		for(int i=0; i<number; i++) {
			result =max(result, array[i]);
		}
		System.out.print("가장큰값은" +result);
	}
}
