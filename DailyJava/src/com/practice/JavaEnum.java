package com.practice;

public enum JavaEnum {
	
			a(1),b(2),c(3);
			private int value =0;	
		
		private JavaEnum(int aa){
			value =aa;
		}
		public int getValue(){
			return value;
		}
		
}
