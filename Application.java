package com.jyb.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		String j="";
		for(int count=1;count<=3;count++) {
			for (int i = 1; i <=33; i++) {
				if (i % 3 == 0) {
					j = "FIZZ";
					System.out.println(j);
				} else if (i % 5 == 0) {
					j = "BUZZ";
					System.out.println(j);
				} else {
					System.out.println(i);
				}
			}
		}
	}
}