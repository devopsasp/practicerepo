package com.collectordemo;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class CollectorDemo {
	
	public void asList() 
	{ 
		List<Integer> numlist=Arrays.asList(12,23,11,19,55,32,16,22);
		Stream<Integer>stream=numlist.stream();
		
	   List<Integer> mylist= stream.filter((e)->e%2==0).collect(Collectors.toList());
	    mylist.forEach(System.out::println);	
	}
	
	public void asSet() 
	{ 
		List<Integer> numlist=Arrays.asList(12,23,11,19,55,32,16,22);
		Stream<Integer>stream=numlist.stream();
		
		
		
	   Set<Integer> myset= stream.filter((e)->e%2==0).collect(Collectors.toSet());
	    myset.forEach(System.out::println);	
	}
	
	
	public void asMap()
	{
		List<Integer> numlist=Arrays.asList(12,23,11,19,55,32,16,22);
	//	Stream<Integer>stream=numlist.stream();
		 
		 Function<Integer,Integer> keyFunction=(e)->e;
		 
		 Function <Integer,Integer> valueFunction=(e)->numlist.get(e);
		 
	Collector<Integer,?,Map<Integer,Integer>> collector=	
			Collectors.toMap(keyFunction, valueFunction);
		 
		 Map<Integer,Integer> map=
				 IntStream.range(0, numlist.size()-1).boxed().collect(collector);
		 System.out.println(map);
	   	
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
     List<String>	strlist=Arrays.asList("Apple","Bannana","Mango","PineApple","Strawberry");
     
     Stream<String> stream=strlist.stream();
     
    String completeString=stream.collect(Collectors.joining("-"));
     System.out.println(completeString);
		
//     String completeString=
//    		 stream.collect(Collectors.collectingAndThen(Collectors.joining(","), 
//    				 String::toUpperCase));
//     System.out.println(completeString);
	}

}



















