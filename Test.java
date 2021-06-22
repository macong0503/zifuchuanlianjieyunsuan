package com.fs.test;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * 只要+号两边任意一边出现字符串，那么+号就被当成字符串连接符使用
		 */
		System.out.println("abc"+"123");
		System.out.println("abc"+123);
		System.out.println(123+"abc");
		
		System.out.println(123+123+"");
		
		System.out.println(""+123+123);
		


	}

}