package com.yedam.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileExe {
	public static void main(String[] args) {
		//ListExe.java 읽기.
		char txt;
		try {
		Reader reader = new FileReader("C:/Temp/ListExe.java");
		while(true) {
		int chr = reader.read(); // char(2byte)
		System.out.print((char)chr); // 65->A
		if(chr == -1) {
			break;
		}
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of prog.");		
	}
}
		
//		//문자기반 텍스트 생성
//		static void write(){
//		//문자기반 파일출력
//		try {
//			Writer wr = new FileWriter("C:/Temp/test2.txt");
//			wr.write(65);
//			wr.write(new char[] {'B','C'});
//			wr.write("DEFGHI",2,3);
//			
//			wr.flush();
//			wr.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//			
//		}System.out.println("end of prog.");
//		}
//		
//		void copy() {//파일복사
//			C:/temp/image.webp -> C:/temp/copy.webp 생?성 
//			try {
//				InputStream is = new FileInputStream("C:/temp/image.webp");
//				OutputStream os = new FileOutputStream("C:/temp/copy.webp");
//				
//				int data = -1;
//				byte[] buf = new byte[100];
//				while(true) {
//					//읽기
//					data = is.read(buf); // -1 반환				
//					os.write(buf);//출력(바이트 쓰기)
//					
//					if(data == -1) {
//						break;
//					}
//				}
//				is.close();
//				os.flush();
//				os.close();				
//				
//			} catch (IOException e) {
//				e.printStackTrace(); 
//			}
//			System.out.println("end of prog.");		
//		}
//	}
//	
//		try {
//		InputStream is= new FileInputStream("C:/temp/test1.dat");
//		while (true) {
//			int data = is.read();	// 바이트 읽고 반환. -1 반환.
//			System.out.println(data);
//			if(data == -1)
//			 break;
//		}
//		is.close();
//		
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//			System.out.println("end of prog.");		
//		}
//
//}
//	

//
//	void output(){
//			//출력스트링(이제 byte를 곁들인) OutputStream.
//		OutputStream os = new FileOutputStream("C:/Temp/test1.dat");
//		os.write(10);
//		os.write(20);
//		os.write(30); //쓰기
//		os.flush();// 버퍼비우기
//		os.close(); // 리소스 반환
//	}
//
//
//	 
	

