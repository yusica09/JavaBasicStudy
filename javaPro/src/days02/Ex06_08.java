package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 4:35:53
 * @subject 아스키코드 대문자 소문자 변환
 * @content
 */
public class Ex06_08 {

	public static void main(String[] args) {
		// '0' - 48
		// 'A' - 65
		// 'a' - 97
		System.out.println('0' - 5); // 48 - 5 = 43
		
		// 대소문자 변환( +32, -32)
		// 대문자 + 32 = 소문자
		// 소문자  - 32 = 대문자
		char a = 'A';
		System.out.printf("%c\n", a+32); //a
		
		char c = '\u0041';
		System.out.printf("%c\n", c); //A
		
		// 'A' - > Encoding -> 65 -> 2진수 저장
		//     < - Decoding <-
		

	}

}
