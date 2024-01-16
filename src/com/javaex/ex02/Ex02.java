package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\Song.txt");//FileReader:빨대
		BufferedReader br = new BufferedReader(fr);//BufferedReader:두꺼운 빨대
		
		while(true) {
			String str = br.readLine();
			if(str==null) { //null(주소가 없음) 무한반복을 멈출수 있도록.
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		

	}

}
