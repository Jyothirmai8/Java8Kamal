package com.kosaraju;

import java.util.function.Consumer;
import java.util.*;

public class ExampleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*for(int i=0; i<numbers.size(); i++) {
			System.out.println(i);
		}*/
		
		/*numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer a) {
				System.out.println(a);
			}
		});*/
		// transforming normal code to lambda expressions
		/* numbers.forEach((Integer value) -> System.out.println(value));*/
		
	/* numbers.forEach(value -> System.out.println(value)); */
		
		//printing all the numbers in a stream.
		/*		numbers.stream()
					   .map(String::valueOf)
					   .forEach(System.out :: println);*/
				
	/*	System.out.println( numbers.stream()
				//.map(Integer:: valueOf)
				.filter(e -> e%2 == 0)
				
				//.filter(e -> e*2)
				.mapToDouble(e -> e * 2.0)
				
				.average());*/
				//.reduce(0,Integer::sum));
				//.forEach(System.out::println);
	/*System.out.println(numbers.stream()
			.map(String::valueOf)
			.reduce("",String::concat));*/
		
	/*	System.out.println(numbers.stream()
				.map(String::valueOf)
				.reduce("",(carry,str) -> carry.concat(str)));*/
		
		/*
		 * int result = numbers.stream() .filter(e -> e > 5) .filter(e -> e %2 == 0)
		 * .filter(e -> e < 9) .filter(e -> e * 2 >15) .findFirst() .get();
		 * 
		 * System.out.println(result);
		 */
								
		//second largest number from list
		
		/*int[] number= {545, 23, 92, 1, 200, 532};
	
		Arrays.stream(number)
			  .sorted()
			  .limit(number.length -1)
			  .skip(number.length -2)
			  .forEach(System.out:: println);
		
		*/
		
		//display second largest number using stream
		
		
		/*List<Integer> num= Arrays.asList(9,8,3,4,5,6,7,2,1,10);
		 num.stream()
		 	.sorted()
		 	.limit(num.size()-2)
		 	.skip(num.size()-3)
		 	.forEach(System.out::println);*/
		
		 
		 //display square of 4th position element in a list
		
		List<Integer> num1= Arrays.asList(9,8,3,6,5,4,7,2,1,10);
			int a=		  num1.stream()
					  		.limit(4)
					  		.skip(3)
					  		.mapToInt(e -> e * e)
					  		.findAny()
					  		.getAsInt();
					  		//.sum();
			System.out.println(a);
					  		
					  		
					  		
					  		
					  		
		//System.out.println(a)	;		  		//.forEach(System.out::println);
					  
		
	}

	
	

}
