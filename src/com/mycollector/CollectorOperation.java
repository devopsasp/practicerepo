package com.mycollector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.Collector;

 class Product
 { 
	 private String getProductName;
	 private float price;
	 private String storeLocation;
	 Product(){};
	public Product(String getProductName, float price, String storeLocation) {
		super();
		this.getProductName = getProductName;
		this.price = price;
		this.storeLocation = storeLocation;
	}
	public String getGetProductName() {
		return getProductName;
	}
	public void setGetProductName(String getProductName) {
		this.getProductName = getProductName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	@Override
	public String toString() {
		return "Product [getProductName=" + getProductName + ", price=" + price + ", storeLocation=" + storeLocation
				+ "]";
	}
	 
	 
 }

public class CollectorOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<Product> productList=Arrays.asList(new Product("Coffee",20,"Chennai"),
				
				new Product("Tea",30,"Chennai"),
				new Product("Ice Tea",45,"Mumbai"),
				new Product("Black Coffee",25,"Agra"),
				new Product("Regular Coffee",55,"Bengaluru"),
		        new Product("Latte",40,"Mumbai"),
		        new Product("Espresso",55,"Bengaluru")
		 
	
	  
	
	  );
		 Stream<Product> productStream=productList.stream();

		 
	Map<Boolean,List<Product>> mypartition=	 productStream.collect(Collectors.partitioningBy((e)->e.getPrice()>30));
		 System.out.println(mypartition);
   List<Product> matching=mypartition.get(true);
   for(Product p:matching) 
   { 
	    System.out.println(p);
   }
   
   System.out.println("#######################");
   List<Product> nonmatching=mypartition.get(false);
   for(Product p:nonmatching) 
   { 
	    System.out.println(p);
   }
   
   
   
   
   
   
   
//		 
//		 double result=productStream.collect(Collectors.averagingDouble(Product::getPrice));
//System.out.println(result);
//		
//
//
//Optional<Product> result=	productStream.collect(Collectors.reducing((a, b)->a.getPrice()>b.getPrice()?a:b));
//		 System.out.println(result.get());
		 
		 
		 
//	 Comparator<Product> compartor=(a,b)->a.getPrice()<b.getPrice()?-1:1;
//		 
//		 Optional<Product> p=productStream.max(compartor);
//		 Product pobj=p.get();
//		 System.out.println(pobj);
//		 
		 
//		 
//		 double totalprice=productStream.collect(Collectors.summingDouble((p)->p.getPrice()));
//		 
//		 System.out.println(totalprice);
//		 Long count=productStream.collect(Collectors.counting());
//		 System.out.println(count);
//		 
		 
//		 DoubleSummaryStatistics stat=	
//				 productStream.collect(Collectors.summarizingDouble((p)->p.getPrice()));
//                 System.out.println(stat);
//                 
                 
//		   
//	      Map<String, List<Product>> groupedProducts
//	      =productStream.collect(Collectors.groupingBy((p)->p.getStoreLocation()));
//	
//	  groupedProducts.forEach((storeLocation,prList)->{
//		  System.out.println(storeLocation);
//		  System.out.println(prList);
//		  
//	      
//	});
	

}
}
