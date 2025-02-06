package com.yedam.api;


public class TimeExe {
	public static void main(String[] args) {
		// 몇분 몇초 출력. -> `
		// 1부터 100000000 까지 250의 배수의 합을 구하는 시간.		
		long fristTime = System.nanoTime();	
		//System.currentTimeMillis()
		long sum=0;
		
		for(long i=1; i<=10000000000L; i++) {					
			if(i%250 == 0) {
			sum += i;			
		} 
		}
		long lastTime = System.nanoTime();	 
		
//		long elapsedTime = lastTime - fristTime;  
		System.out.println(lastTime+" "+fristTime);
		long  Min = (lastTime-fristTime) / (1000000000L * 60); 
		long  Scd = (lastTime-fristTime) / (1000000000L);
		System.out.println("1부터 10,000,000,000까지 250의 배수 합: " + sum);
		System.out.println("계산에 걸린 시간: "+ Min + "분 " + Scd + "초");    
		
	}// end of main
	
	
	void test () {
	}
}// end of class
