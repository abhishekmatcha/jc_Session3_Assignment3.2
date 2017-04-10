	import java.io.IOException;
                 import java.io.BufferedReader;
	import java.io.InputStreamReader;
	public class Boolean{
		public static void main(String[] args)throws IOException {
			
			String S1;
			String S2;
			boolean same;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Input  First String :");
			S1 = br.readLine();
			
			System.out.println("Input Second String :");
			S2 = br.readLine();
			
			same = S1.equals(S2) ? true : false;
			
			System.out.println("  Two Strings entered are same ? Ans:  " + same);
			
		}
	}
	
	

