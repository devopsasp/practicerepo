package streamproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 ArrayList list=new ArrayList();
//		 list.add(23);
//		 list.add(11);
//		 list.add(19);
//		 list.add(15);
//		 list.add(20);
//		 list.add(16);
//		 list.add(22);
//		 
//		 Stream stream=list.stream();
//		 
//		 stream.forEach((e)->System.out.println(e));
		 
		 
//		 List<Integer> numlist=Arrays.asList(12,23,11,19,44,16,34,12);
//		 
//		 Stream<Integer> stream=numlist.stream();
//		 
		//Stream<Integer> stream=Stream.of(12,23,11,19,55,67,13,15);
		
		 
//		 Stream.Builder<String> builder=Stream.builder();
//		 builder.add("Switch");
//		 builder.add("Router");
//		 builder.add("Firewall");
//		 builder.add("BTS");
//		 builder.add("BSC");
//		 builder.add("RNC");		 
//		 
//		 Stream stream=builder.build();
//		 
//		 stream.forEach((e)->System.out.println(e));

		
		
		Stream<Integer> stream=Stream.of(12,11,23,13,15,22,26);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	//	Predicate<Integer> predicate=(i)->i%2==0;
	 
		   //stream.filter(predicate).forEach((e)->System.out.println(e));
		   
//		   Function<Integer,Integer> function=(i)->i*i;
//		  stream.map(function).forEach((e)->System.out.println(e));
//		  
		  //BinaryOperator<Integer> binaryOperator=(a,b)->(a+b);
		 
		 
		  
		//int sum=  stream.reduce(binaryOperator).get();
		  //System.out.println(sum);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
