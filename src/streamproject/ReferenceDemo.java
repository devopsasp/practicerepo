package streamproject;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

class TestNumber
{ 
	public static boolean checkNumber(int i) 
	{ 
		if(i>0) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class ReferenceDemo {

	public static void main(String[] args) {
   
		List<Integer> numlist=Arrays.asList(12,11,-4,-12,5,67,-23);
		Stream<Integer> stream=numlist.stream();
		Stream<Integer> mystream=stream.filter(TestNumber::checkNumber);
		 mystream.forEach(System.out::println);
	}

}








