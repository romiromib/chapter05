package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {
		
		//Reader준비
			//Reader + Buffer -->빨대 PhoneDB UFT-8
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		//반복
		while(true) {
			//파일을 한줄씩 읽는다
			String str = br.readLine();
			
			//null 이면 반복문을 나간다(글자가 없으면)
			if(str==null) {
				break;
			}
			
			String[] personInfo = str.split(",");
			//"이효리,010-2222-3333,031-2323-4441"
			//["이효리"] ["010-2222-3333"] ["031-2323-4441"] --> personInfo
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			//출력한다
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
		}
		
		//반복
	    //파일을 1줄 읽는다
		
	
		//,로 분리한다  
	        //name = 정우성
	        //hp = 010-0220-2222
	        //company = 02-222-2222
	
	    //출력한다
	 
	//null 이면 반복종료
	
	//종료
	br.close();
		
	}

}
