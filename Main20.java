import java.util.Scanner;

public class Main20 {
	public static int max(int a,int b) {
		return (a>b)? a:b;
	}

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.print("������ �迭�� ũ�� �Է�");
		int number = a.nextInt();
		int[]array=new int[number];
		for(int i=0; i<number; i++) {
			System.out.print("�迭�� ���� ������ �Է��ϼ���");
			array[i]=a.nextInt();
			}
		int result =-1;
		for(int i=0; i<number; i++) {
			result =max(result, array[i]);
		}
		System.out.print("����ū����" +result);
	}
}
