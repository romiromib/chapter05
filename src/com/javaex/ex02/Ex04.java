package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		//in
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");//빨대
		InputStreamReader isr = new InputStreamReader(in,"MS949");// in 을 문자(MS949)로 읽는빨대
		BufferedReader br = new BufferedReader(isr);//두꺼운 빨대
		
		//out
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");//빨대 꽂는 순간 리셋됨.다 삭제되서 없어짐->파일이름수정-copy
		OutputStreamWriter osw = new OutputStreamWriter(out,"MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//in
		while(true) {
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			bw.write(str);
			bw.newLine();
			
			System.out.println(str);
		}
		
		bw.close();
		br.close();
		
	}

}
