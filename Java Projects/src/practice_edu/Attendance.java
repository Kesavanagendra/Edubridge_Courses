package practice_edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result1 { 
	public static int solve(int n) { 
		//int mod=1000000007;  
		int[] dp=new int[n+1]; 
		dp[0]=1; //combination of holiday
		dp[1]=3;  //presesnt , absent, permisission leave
		
		for(int i=2;i<dp.length;i++){ 
			dp[i]=dp[i-1];                //2-1=1
			//System.out.println(dp[i]);	
		
			dp[i]=(dp[i] + dp[i-1]) % (int)(1e9 + 7); //2
		
			//System.out.println(dp[i]);
			dp[i]=(dp[i] + dp[i-1]) %(int)(1e9 + 7);  //3
			
			//System.out.println(dp[i]);
			} 
		   return dp[dp.length-1];
		} 
	}
public class Attendance {  
	public static void main(String[] args) throws IOException { 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  
		int n = Integer.parseInt(bufferedReader.readLine().trim());   
		int result = Result1.solve(n);   
		System.out.println(result);
		bufferedReader.close();
	}
}
