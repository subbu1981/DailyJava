package com.practice;

public class testJavaEnum {

	public static void main(String [] args){
		System.out.println("a".equals(JavaEnum.a.toString()));
		System.out.println(JavaEnum.a.toString());
		System.out.println(JavaEnum.a.getValue());
		JavaEnum jEnum =JavaEnum.a;
		
		switch(jEnum)
		{
		
		case b:
		System.out.println("a");
		break;
		case a:
			System.out.println("a");
			break;
		default:
			break;
		}
	}
	
}
