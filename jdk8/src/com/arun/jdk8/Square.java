package com.arun.jdk8;

import java.util.function.Function;

public class Square {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		Function<Integer,Integer> c=i->i*2;
		Function<Integer,Integer> a=i->i*i*i;
		System.out.println("The square of 4 is :\t" +f.apply(4));
		System.out.println("The square of 5 is :\t" +f.apply(5));
		System.out.println("multiplicaion of a number is : "+c.apply(5));
		System.out.println("cube of a nubmer:" +a.apply(2));
	}
}
