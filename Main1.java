
public class Main1 {

	public static void main(String[] args) {
		int a =200;
		System.out.println("10진수:"+a);
		System.out.format("8진수:%o\n",a);
		System.out.format("16진수 :%x\n",a);
		
		String c ="Maple Story";
		System.out.println(c.substring(0,5));
		System.out.println(c.substring(6,11));
				
		for(char i='a'; i<='z'; i++)
		{
			System.out.print(i+" ");
		}
	}

}
