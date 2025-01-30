Collectors in Stream API
###############################################################################
A Collector is an interface that defines how to accumulate the elements of a stream into 
a collection ,such as a List ,set or a Map

Three tasks performed by a Collector
 1.Accumulate elements
 2.Transform the accumulated elements
 3.Combine partial results
 
 Collector methods 
  1.supplier():returns a supplier of the collection
  2.accumalator():returns a function that accumulates elements into collection
  3.combiner():returns a function that combines two partial collections
  4.finisher():Returns a function that transforms accumulated collection
  5.characteristics():Returns characteristics of Collector
  
  
   Collector<Integer,?,List<Integer>> collector=  Collectors.toList();
   
   Collector<T,A,R>
   
   T : The type of element to be collected.It is input for collector
   A:The type of accumulator ,which is used to store partial results:
   R:Type of final result,which is returns by collected
   
   Activity
   
   View the class below 
   
    class Product
     { 
        private String productName;
        private float price;
      
      //add getter ,setter methods ,parametrized constructor , toString()
      } 
          from the above class generate an stream of object of Product class 
          and perform below operations and collect result in a List
          
          #filter the object o find product with price > 300 
          #apply a map to calculate price after  discount 10% on price 
          
          
          
          
          
          
 #######################################################################################
 Grouping and Summarizing
 
 groupingBy method is used group as per an attribute 
 groupingBy groups elements of a stream by a classifiler function ,returning a map where 
 the keys are the result of applying the classifier function and values are list of items 
 
 
 
 Activity
 
 view the class Below
 
      class Student
       { 
        private String studentName;
        private float marks;
        private String semester;
        
        //add getter ,setter methods and parameterized constructor and toString
        } 
        
        
        
        //for the above class ,create a List of Student class instances and group them
        as per semester
        
        
        Activity 
        
        View the classes below 
        
        class Employee
         { 
            private String employeeName;
            private double basicSalary;
            private double dearnessAllowance;
            private double providentFund;
            private double netSalary;
            
            //add getter and setter Methods,parameterized constructor and toString()
          } 
          
           #provide the summary for basicSalary ,dearnessAllowance ,providentFund 
           and netSalary
           #Get the Employee with maximum and minimum net Salary;
           #Get the total of pf given to all the Employees
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
 
 
 
 
 
 
 
 
 
 
 
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
   
   
   
   
   
   
   
   
   
   
   
   
   
   