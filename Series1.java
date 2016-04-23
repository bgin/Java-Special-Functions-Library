package Math_Formulae;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.logging.Logger;

import  Math_Formulae.Binom_Coeff;


@SuppressWarnings("unused")
public class Series1  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static double[] array;
	private static double[] array2;
	
	
	// methods
	
	public static double method1(int value) throws IllegalArgumentException {
		int index = value;
		int i;
		int j;
		int k =-1;
		int arg;
		arg = k;
		double sum = 0;
		array = new double[index];
		
		if (index >10000 || index <0){
			throw new IllegalArgumentException("value must greater than 0 or less than 10000");
		}else if(index ==0){
			throw new IllegalArgumentException("value must be greater than 0");
		} else {
		
		for (i=0;i<array.length;i++){  // Sum = 1/n^2+1
			++arg;
			array[i] = 1/(Math.pow(arg, 2)+1);
			System.out.println(array[i] + " \t " + arg);
			
		}
		for (j=0;j<array.length;j++){
			sum = sum+array[j];
			
		}
		System.out.println(sum);
		return sum;
	}
	}
	/**  
	 * 
	 * @param args
	 * 
	 * 
	 */
	   public static double geoProgression(double value1,double value2,int value3) throws IllegalArgumentException , ArithmeticException{
		   int index = value3;
		   int i;
		   int j;
		   double sum = 0;
		   double term = value1*value2; // a*r where { r = -1<0>1, a= constant}.
		   int k =0;
		   int exp = k;
		   array2 = new double[index];
		   
		   if (value1 ==0 || value1 <0){
			   throw new ArithmeticException("parameter a must be greater than 0");
			   
		   }else if(value2 <-1 || value2 >1){
			   throw new IllegalArgumentException("value of parameter r must be between -1<0>1 throwing an exception");
			   
		   }else if (value3>364 || value3 ==0){
			   throw new IllegalArgumentException("index of array must be greater than 0 and less than 10000");
			   
		   }else {
			   
			   for (i = 0;i<array2.length;i++){
				   ++exp;
				   
				   array2[i] = Math.pow(term, exp);
				   System.out.println(array2[i] + "  \t" + " array2[i] " + "exp \t" + exp + " term " + term);
				   
			   }
			   
			   for (j=0;j<array2.length;j++){
				   
				   sum = sum+array2[j];
				   
			   }
			   System.out.println(sum);
			   return sum;
		   }
		   
		   
		   
	   }
	
	   public static double  geoMeanFactorial(int value2) throws IllegalArgumentException , ArithmeticException{
		   
		  
		   
		  
		   long range;
		 
		   double exp;
		   double mean;
		  
		
		   try {
		   
		   if (value2 == 0 || value2 <-1){
			   throw new IllegalArgumentException("value must be greater than 0");
		   } else if (value2 >20){
			   throw new ArithmeticException("Long  wrapp around");
		   }
		   } catch(IllegalArgumentException e){
			   for (StackTraceElement element : e.getStackTrace()){
				  System.out.println( element.getLineNumber()+"  " + element.getMethodName()+ "  " + element.getClassName( )+ "  ");
			   } 
			   e.printStackTrace(System.out);
			   e.getCause();
		   } catch(ArithmeticException e){
			   e.printStackTrace(System.out);
			   e.getCause();
		   }
		   
		   
		   
		  
			   
			range =     Math_Formulae.Binom_Coeff.factorial_k(value2);
		
			exp = value2;
			   double result = 1/exp;
			   mean = Math.pow(range, result);
			   System.out.println(mean);
			   
			   
		  
		    
		    	
		    	
				   
			
				   
				  
		    
		    return mean;
	   }  
		  
	       public static double nthRoot(double number,double root) throws IllegalArgumentException , ArithmeticException {
	    	   
	    	   double base = number;
	    	   double exponent = root;
	    	   double result;
	    	   double mean;
	    	   try {
	    	   if (number == 0 || number <0)
	    		   throw new  ArithmeticException("parameter must be greater than 0");
	    	   else if (root == 0 || root <0)
	    		   throw new  IllegalArgumentException(" parameter must be greater than 0");
	    	   
	    	   }catch (ArithmeticException e){
	    		    e.printStackTrace(System.out);
	    		   for(StackTraceElement element : e.getStackTrace()){
	    			 System.out.println(  element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName() + " ");
	    		   }
	    	   } catch (IllegalArgumentException e){
	    		   e.printStackTrace(System.out);
	    		   for(StackTraceElement element : e.getStackTrace()){
	    			   System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName()+ " ");
	    			   
	    		   }
	    		  
	    	   }
	    	   
	    	                     result = 1/exponent;
	    	                     mean  = Math.pow(base, result);
	    	                     System.out.println("nth root" + mean);
	    	                     
	    	                     
	    	   return mean;
	       }
	   
	   
		 
		   
		   public static double geoMean(double[] a) throws IllegalArgumentException , ArithmeticException {
			   
			   int i;
			  double exp;
			   double[] array;
			   double product = 1; //always  initialize to 1 when multiplying array elements
			   double mean;
				   
			  
			   
			   array = a;
			   try {
			   if (a == null)
				   throw new NullPointerException("initialize array reference ");
			  
			   
		   }catch (NullPointerException e) {
			   e.printStackTrace(System.out);
			   for (StackTraceElement element : e.getStackTrace()){
				   System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
			   }
		   }
		         
			   for (i = 0;i<array.length;i++){
				  
				   product = product*array[i];
				  
				   System.out.println(array[i] + " " + product);
				   
			   }
			   
			  
			  
			   exp = array.length;//do not inverse value
			   
			   System.out.println(product + " exp" + exp);
			    mean = nthRoot(product,exp);
			    return mean;
		   
		   }
		   
		   
		
		  public static double nthRoot2(double number,double root) throws ArithmeticException, IllegalArgumentException {
			  
			  double base = number;
			  double exponent = root;
			  
			  double nthroot;
			  
			  
			  try {
		    	   if (number == 0 || number <0)
		    		   throw new  ArithmeticException("parameter must be greater than 0");
		    	   else if (root == 0 || root <0)
		    		   throw new  IllegalArgumentException(" parameter must be greater than 0");
		    	   
		    	   }catch (ArithmeticException e){
		    		    e.printStackTrace(System.out);
		    		   for(StackTraceElement element : e.getStackTrace()){
		    			 System.out.println(  element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName() + " ");
		    		   }
		    	   } catch (IllegalArgumentException e){
		    		   e.printStackTrace(System.out);
		    		   for(StackTraceElement element : e.getStackTrace()){
		    			   System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName()+ " ");
		    			   
		    		   }
		    		  
		    	   }
			  
			  exponent = 1/exponent;
			  nthroot = Math.pow(Math.exp(exponent), Math.log(number));
			  System.out.println(nthroot);
			  
			  return nthroot;
		  }
		   
		  
		   
		   public static double generalizedMean(double[] a, int value) throws NullPointerException ,IllegalArgumentException{
			   
			   int i;
			   int j;
			   
			   double exp;
			   exp = value;
			   double[] array;
			   double sum= 0;
			   double mean = 0;
			   double multiplier;
			   array = a;
			   
			   try {
			   if (a==null){
				   throw new NullPointerException("array reference not initialized only declared");
			   } else if (value == 0 || value < 0) {
				   throw new IllegalArgumentException("parameter must be greater than 0");
			   }
			   }catch (NullPointerException e){
				   e.printStackTrace(System.out);
				   for (StackTraceElement element : e.getStackTrace()){
					   System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " +element.getClassName()+ " ");
				   }
			   } catch (IllegalArgumentException e){
				   e.printStackTrace(System.out);
				   for (StackTraceElement element : e.getStackTrace()){
					   System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName()+ "  ");
				   }
			   }
			   
			 			   
			   for (i = 0;i<array.length;i++){
				   
				  
				  
				   array[i] = Math.pow(array[i], exp);
				   System.out.println(array[i]+ " ");
			   }
			   
			   for ( j = 0;j<array.length;j++){
				   
				   sum = sum+array[j];
			   }
			   
			   multiplier = array.length;
			   multiplier = 1/multiplier;
			  
			  
			   mean = nthRoot2(sum,exp);
			   mean = mean*multiplier;
			   System.out.println("exponent "+ exp + " sum " + sum);
			   if (mean == 0 || mean <0)
				   return 0;
			   
			   return mean;
		   }
		   
		   
		   
		   public static double cauchyInequality(double value,double value2) throws IllegalArgumentException , ArithmeticException  {
			   
			   double a = value;
			   double b = value2;
			   
			   double left_term;
			   double right_term = 1;
			   double num1=a;
			   double num2=b;
			   double left_sum = 1;
			   double right_product = 1;
			   double left_product = 1;
			   double difference;
			   
			   try {
				   
				   if (num1 == 0 || num1 <=-1)
					   throw new IllegalArgumentException("first parameter must be greater than 0");
			   else if (num2 == 0 || num2 <=-1)
				   throw new ArithmeticException("second parameter can not be 0");
		   
			   }catch (IllegalArgumentException e)	{
				   e.printStackTrace(System.out);
				   do { // fully implemented handler
		            	 
		            	 ++num1;
		            	 ++num2;
		            	 
		            	left_sum+= num1*num2;
		            	left_term = Math.pow(left_sum, 2.0);
		            	
		            	left_product+= Math.pow(num1, 2.0);
		            	right_product+=Math.pow(num2, 2.0);
		            	right_term = left_product*right_product;
		            	
		            	difference = left_term-right_term;
		            	 
		            	System.out.println(" inside handler" +"num1 " + num1 + "num2 " + num2 + "left_sum " + left_sum + " difference " + difference + "right term  "+ right_term + " left term " + left_term);
		            	 
		             } while (left_term<10000 && right_term<10000);
		           
		       
				   
				   for(StackTraceElement element : e.getStackTrace()){
					 System.out.println(  element.getLineNumber()+ " " + element.getMethodName() + " " + element.getClassName() + " ");
				   }
			   } catch(ArithmeticException e) {
				   e.printStackTrace(System.out);
				
				   
				   for (StackTraceElement element : e.getStackTrace()){
					   System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName() + " ");
				   }
			   }
		   
		             do {
		            	 
		            	 ++num1;
		            	 ++num2;
		            	 
		            	left_sum+= num1*num2;
		            	left_term = Math.pow(left_sum, 2.0);
		            	
		            	left_product+= Math.pow(num1, 2.0);
		            	right_product+=Math.pow(num2, 2.0);
		            	right_term = left_product*right_product;
		            	
		            	difference = left_term-right_term;
		            	 
		            	System.out.println("num1 " + num1 + "num2 " + num2 + "left_sum " + left_sum + " difference " + difference + "right term  "+ right_term + " left term " + left_term);
		            	 
		             } while (left_term<10000 && right_term<10000);
		   
		       return difference;
		   }
	        
		   public static double minkovskiInequality(double value1, double value2 , double value3) throws Exception {
			   
			   double a = value1;
			   double b = value2;
			   double left_term;
			   double right_term;
			   double num1 = a;
			   double num2 = b;
			  double left_sum = 0;
			  double  left_product = 1;
			  double  right_product = 1;
			  double root = value3;
			  double left_root = 1;
			  double right_root = 1;
			  double difference = 0;
			  double right_sum;
			  
			  
			  try {
				   
			  if (num1  == 0 || num1 <0){
				  throw new IllegalArgumentException("parameter must be greater than 0");
				 
			  } else if (num2 == 0 ||num2 <0){
					  throw new ArithmeticException("parameter must be greater than 0");
			  } else if (value3 == 0 || value3 <0 || value3 == 1)
					  throw new Exception("parameter for root must be greater than 1");
			  
			  }catch(IllegalArgumentException e){
				  e.printStackTrace(System.out);
				  
				   
				  
				  for(StackTraceElement element : e.getStackTrace()){
					  System.out.println(element.getLineNumber()+ " "+ element.getMethodName()+ " " + element.getClassName()+ " ");
				  }
				  
				  }catch (ArithmeticException e){
					  e.printStackTrace(System.out);
					  for (StackTraceElement element : e.getStackTrace()){
						  System.out.println(element.getLineNumber() + " " + element.getMethodName() + " " + element.getClassName()+ " ");
					  }
					  
				  }catch (Exception e){
					  e.printStackTrace(System.out);
					  
					  for (StackTraceElement element : e.getStackTrace()){
						  System.out.println(element.getLineNumber()+ " " + element.getMethodName() + " " + element.getClassName() + " ");
					  }
				  }
			  
			while ((++num1 >0 && ++num1 <100) &&( ++num2 >0 && ++num2<100))	{	  //correction inside outer while loop with incremented parameters
			try {	
			         
			  do {
				  
				if  ( ++num1<0 )
					throw new IllegalArgumentException("can not be zero");
				else if (++num1 ==0)
					throw new IllegalArgumentException("can not be zero");
				  
				        
				  left_sum = num1+num2;
				  left_sum+= Math.pow(left_sum, root);
				  left_term = nthRoot2(left_sum,root);
				  
				  left_product+= Math.pow(num1, root);
				  right_product+= Math.pow(num2,root);
				  left_root = nthRoot2(left_product,root);
				  right_root = nthRoot2(right_product,root);
				  right_sum = left_root+right_root;
				  
				  difference = left_term - right_sum;
				  
				  System.out.println("num1 \t"  +   num1 +  "\t num2 \t" + num2 + "\t difference  \t" + difference + "\t leftroot \t" + left_root + " \t rightroot \t" + right_root);
				  
				 
				  
				  System.out.println("left_sum \t" + left_sum  +  " \t left_term \t" + left_term + "\t left_product \t" + left_product +  "\t right_product  \t" + right_product +"\t right_sum \t " + right_sum);
				  
				  
				  
			  } while (num1<100 && num2<100);
			} catch (IllegalArgumentException e){
				e.printStackTrace(System.out);
			}
			}
			return difference;
			  
			  }
			  
		  public static double exponentInequality(double value) throws IllegalArgumentException , ArithmeticException{
			 
			  
			  double x = value;
			  double left_term;
			  double mid_term;
			  double right_term;
			  double difference = 0;
			  double exponent;
			  
			  try {
			  
			  if (value == 0){
				  throw new ArithmeticException("argument can not be 0");
				  
			  }else if (value >1){
				  throw new IllegalArgumentException("argument must be less than 1");
				  
			  }else if (value <0)
				  throw new IllegalArgumentException("argument must be greater than 0 (positive)");
				  
			  } catch (ArithmeticException e){
				  Logger logger = Logger.getLogger("logging ArithmeticException");
				  StringWriter trace = new StringWriter();
				 e. printStackTrace(new PrintWriter(trace));
				 logger.severe(trace.toString());
				  
				  
				  for(StackTraceElement element : e.getStackTrace()){
					  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
				  }
			  } catch(IllegalArgumentException e){
				  Logger logger1 = Logger.getLogger("Logging IllegalArgumentException");
				  StringWriter trace1 = new StringWriter();
				  e.printStackTrace(new PrintWriter(trace1));
				  logger1.severe(trace1.toString());
				  

				  for(StackTraceElement element : e.getStackTrace()){
					  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
				  }
			  }
			  
			 // code starts
			  while (x>0 && x<1.0){ // resumptions while loop with try-catch block must use && in order to prevent infinite exception throwing.
				
				try {  
				  
			  for (x = value;x<1.0;x+=0.01){
				  
				  if (x <0 || x>1)
					 
					  throw new IllegalArgumentException("argument must be greater than 0 and less than 1");
				       
				  exponent = x/(1-x);
				  
				  left_term = 1/(Math.exp(exponent));
				  mid_term  = 1-x;
				  right_term = 1/(Math.exp(x));
				  
				  difference = (left_term-mid_term)-right_term;
				  
				  System.out.println("difference \t"  + difference + "\t exponent \t" + exponent + "\t left_term \t" + left_term + " \t mid_term  \t" + mid_term + " \t right_term  \t" + right_term);
			  }
				}catch (IllegalArgumentException e){
					Logger logger2 = Logger.getLogger("Logging IllegalArgumentException");
					StringWriter trace2 = new StringWriter();
					e.printStackTrace(new PrintWriter(trace2));
					logger2.severe(trace2.toString());
				}
			  }
			  return difference;
		  }
		  
		  public static void ExceptionLogger(Exception e){
			  
			  Logger log = Logger.getLogger("Logging Exception");
			  StringWriter trace = new StringWriter();
			  e.printStackTrace(new PrintWriter(trace));
			  log.severe(trace.toString());
		  }
		  
		  public static double exponentInequality2(double value1,double value2) throws IllegalArgumentException , ArithmeticException {
			  
			  double x = value1;
			  double y = value2;
			  double left_term;
			  double mid_term;
			  double right_term;
			  double exponent;
			  double difference = 0;
			  double sum;
			  
			  int counter = 0;
			  
			 	
			  try {
				  
				     if (value1 == 0 || value1 <0){
				    	 throw new IllegalArgumentException("argument x must be greater than 0");
				    	 
				     }else if(value2 == 0 || value2 <0)
				    	 throw new ArithmeticException("argument y must be greater than 0");
				    	 
				     }catch(IllegalArgumentException e){
				    	 Logger logger3 = Logger.getLogger("Logging IllegalArgumentException \t" + e);
				    	 StringWriter trace3 = new StringWriter();
				    	 e.printStackTrace(new PrintWriter(trace3));
				    	 logger3.severe(trace3.toString());
				    	 
				    	 for(StackTraceElement element : e.getStackTrace()){
							  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
						  }
				    	 
				     }catch	(ArithmeticException e) {
				    	 Logger logger4 = Logger.getLogger("ArithmeticException \t" + e);
				    	 StringWriter trace4 = new StringWriter();
				    	 e.printStackTrace(new PrintWriter(trace4));
				    	 logger4.severe(trace4.toString());
				    	
				    	 for(StackTraceElement element : e.getStackTrace()){
							  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
							  
							  
							
							  
				    	 }	
				     } // end of try
				    	 //code starts here
			   while ((x>0 && x<=20)  &&( y>0 && y<=20))     {      
			  
			         try {      
				    	 
				    	 do {
				    		 
				    		   
				    		 x+=0.01; 
				    		   
				    		  y+=0.01;
				    		  
				    		  if (x<0 ) 
				    			  throw new IllegalArgumentException("argument x must be greater than 0");
				    		  else  if (y<0)
				    			  throw new IllegalArgumentException("argument y must be greater than 0 ");
				    		   ++counter;
				    		   left_term = Math.exp(x);
				    		   sum       = 1+(x/y);
				    		   sum       = Math.pow(sum, y);
				    		   mid_term  = sum;
				    		   exponent  = (x*y)/(x+y);
				    		   right_term = Math.exp(exponent);
				    		   
				    		   difference = left_term-mid_term-right_term;
				    		 
				    		   
				    		   System.out.println("\t counter \t"+ counter +" \t difference \t" + difference + "\t x \t" + x + "\t y \t" + y + " \t sum \t " + sum + "\t  exponent \t" + exponent + "\t right_term \t" + right_term + " \t left_term \t "+ left_term);    
				    		   
				    		
				    		   
				    	 }while (x<30 && y<10);
				    	 
				    	
				    	 
			         }catch (IllegalArgumentException e ){
			        	 Logger logger5 = Logger.getLogger("ArithmeticException \t" + e);
				    	 StringWriter trace4 = new StringWriter();
				    	 e.printStackTrace(new PrintWriter(trace4));
				    	 logger5.severe(trace4.toString());
			        	 
				    	 for(StackTraceElement element : e.getStackTrace()){
							  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
							  
							  
							
							  
				    	 }	
 
				    	
			         }
			   }
				    	 
				    	 return difference;
		  }
	   
		  public static double ln_approximation(double value) throws IllegalArgumentException {
			 
			  double x = value;
			  double a1 =  0.99949556 ;
			  double a2 = - 0.49190896;
			  double a3 =  0.28947478;
			  double a4 = - 0.13606275;
			  double a5 =  0.03215845;
			  double ln = 0;
			  double squared = x*x;
			  
			  try {
				  
				      if (value <0 || value >1)
				    	  throw new IllegalArgumentException("argument x must be between 0 and 1");
				      
			  }catch (IllegalArgumentException e){
				  
				  ExceptionLogger(e);
				  
				  for(StackTraceElement element : e.getStackTrace()){
					  
				 
				  System.out.println(element.getLineNumber() + " " + element.getMethodName()+ "  " + element.getClassName() + " ");
				  
				  }
			  }
			  
			  
			  
			  // code 
			  
			  try {
				  
				  
			           if (x>1 || x<0 )
			        	   throw new ArithmeticException("argument x must be between 0 and 1 ");
			           else {
			  ln = (a1*x)+(a2*squared)+(a3*(x*squared))+(a4*(squared*squared))+(a5*x*(squared*squared));
			  System.out.println(" \t approximation ln(1+x)  \t" +  ln);
			           }
			  }catch(ArithmeticException e){
				  
				  ExceptionLogger(e);
				  
				  for(StackTraceElement element : e.getStackTrace()){
					  System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName() + " ");
				  }
			  }
			  
			  if (ln >1.0)
				  return 0;
			  return ln;
			 
		  }
		  
		  public static  double Cotangent(double value) throws IllegalArgumentException {
			  int i,j,l;
			  double x = value;
			  double sum = 0.0;
			  int k = 0;
			  int exp = 1;
			  int exponent;
			  double cotangent = 1/x;
			  double subtraction = 0;
			  double[] pow = new double[11];
			  double[] cot = new double[11];
			  assert (pow == cot);
			  double [] coeff = {0.3333333333333333333333333333333,
					             0.0222222222222222222222222222222,
					             0.00211640211640211640211640211,
					             2.1164021164021164021161904761905e-4,
					             9.406231628453850675978835978836e-6,
					             2.8503732207435911139611992945326e-7,
					             6.2645565291067936570575808671047e-9,
					             1.044092754851132276176367782717e-10,
					             1.3648271305243559165704154022444e-10,
					             1.4366601373940588595478056865731e-14,// 20 power
					             1.2438615908173669779634681260931e-16,//21 power
			  };
			  
			  assert (coeff == pow);
			  assert (coeff == cot);
			  
			  try {
			  
			  if (value > Math.PI || value<0 )
				  throw new IllegalArgumentException("argument can not be greater than Pi");
			  
			  }catch(IllegalArgumentException e){
				  ExceptionLogger(e);
				  
				  for(StackTraceElement element : e.getStackTrace()){
					System.out.println ( element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName() + " ");
				  }
				  
				
				  
				  
			  }
			  
			  
			
				
			
				  
				  try { 
			  
			  for (i = 0;i<pow.length;i++){
				  
				  exp = ++k;
				  exponent = (2*exp)+1;
				  if (x>Math.PI || x<0)
					  throw new IllegalArgumentException("argument must be less than Pi and be  greater than 0 " + x);
				  
				  pow[i] = Math.pow(x, exponent);
				  
				  System.out.println(Arrays.toString(pow));
				  
			  }
			  
			  for (j = 0;j<cot.length;j++){
				  
				  cot[j] = (coeff[j] + pow[j]);
				  
				  System.out.println(Arrays.toString(cot));
			  }
			  
			  for(l = 0;l<cot.length;l++){
				  
				  subtraction = subtraction -   cot[l];
				  
				  System.out.println(Arrays.toString(cot));
			  }
			  subtraction = -1*subtraction;
			  cotangent = cotangent - subtraction;
			 
			  System.out.println("cotangent \t" + cotangent + " subtraction \t"  +  subtraction);
			 
			 }catch(IllegalArgumentException e ){
			
				 ExceptionLogger(e);
				 
				 for(StackTraceElement element : e.getStackTrace()){
					 
					 System.out.println(element.getLineNumber() + " " +  element.getMethodName() + " " + element.getClassName() + " ");
				 }
			  
			 }
			  
			  if (cotangent<0)
				  return 0;
			
			  return cotangent;
			
		  }
		  
		  public static double limitCotangent(double value) throws IllegalArgumentException {
			  
			  double cot_taylor;
			  double cot;
			  
			  double x = value;
			  double limit = 0;
			  
			  try {
				  
				  if (value > Math.PI || value <0)
					    throw new IllegalArgumentException(" argument must be between Pi and 0 \t "  +  value);
					    
				  }catch (IllegalArgumentException e){
					 ExceptionLogger(e);
					 
					 for(StackTraceElement element : e.getStackTrace()){
						 System.out.println(element.getLineNumber() + " " + element.getMethodName() + " " + element.getClassName() +" ");
					 }
				  }
			   
			              try {
			  
			                for(x=value; x>=0; x-=0.001 ){
			                	
			                	if(x>Math.PI || x<0)
			                		throw new ArithmeticException("argument must be between 0 and Pi and argument is \t " + x);
			                	
			                	cot_taylor = Cotangent(x);
			                	cot        = Math.cos(x)/Math.sin(x);
			                	
			                	limit = cot_taylor/cot;
			                	
			                	System.out.printf("%15s %22s %30s %25s\n" , "cot_taylor("+x+")" , " cotangent("+x+")" , "limit ", " arg x ");
			                	System.out.printf("%.16f %35.16f %40.16f %20.3f\n" , cot_taylor , cot , limit , x);
			                }
			              }catch(ArithmeticException e){
			            	  ExceptionLogger(e);
			            	  StringWriter trace = new StringWriter();
			            	  e.printStackTrace(new PrintWriter(trace));
			            	  
			            	  for(StackTraceElement element : e.getStackTrace()){
			            		  System.out.println(element.getLineNumber() + " " + element.getMethodName()+ " " + element.getClassName() + " ");
			            	  }
			              }
			                
			                return limit;
			  }
		 
		  public static double limitSin(double value) throws IllegalArgumentException ,ArithmeticException{
			  
			  double sine;
			  double x = value;
			  double limit = 0;
			  
			  
			  try {
				  
				   if (value <0 || value >Math.PI/2)
					   throw new IllegalArgumentException("argument x must be between 0 and Pi/2 \t" + value);
				   
			  }catch(IllegalArgumentException e){
				  ExceptionLogger(e);
				  
				  for(StackTraceElement element : e.getStackTrace()){
					  System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName() + " ");
				  }
			  }
			  
			            try {
			            	
			            	for(x = value ; x<=Math.PI/2;x+=0.001){
			            		
			            		if (value <0 || value > Math.PI/2)
			            			throw new ArithmeticException("argument x must be between x and Pi/2 \t "  +"value passed is \t " + value);
			            		
			            		sine = Math.sin(x);
			            		limit = sine/x;
			            		
			            		System.out.printf("%15s %32s %30s %30s\n" ,"sin("+x+")" , "rad("+x+")" , "limit" , "arg x");
			            		System.out.printf("%.16f %35.16f %35.16f % 25.3f\n" , sine , x , limit , x);
			            	}
			            }catch(ArithmeticException e){
			            	ExceptionLogger(e);
			            	
			            	for(StackTraceElement element : e.getStackTrace()){
			            		System.out.println(element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName() + " ");
			            	}
			            }
			            
			            return limit;
		  }
		  
		  public static double limitSinPolyApprox(double value) throws IllegalArgumentException , ArithmeticException {
			  
			  double x = value;
			  double a1 = 0.1666666664;
			  double a2 = 0.0083333315;
			  double a3 = 0.0001984090;
			  double a4 = 0.0000027526;
			  double a5 = 0.0000000239;
			  double z =  x*x;
			  double u =  z*z;
			  double v = u*u;
			  int one = 1;
			  double limit = 0;
			  double lim_ratio = 1;
			double  limit2 = 0;
			 
			  
			  if (value == 0){
				  throw new ArithmeticException("division by 0");
				  
			  }else if	(value <0){
				  throw new IllegalArgumentException("argument x must be between 0 and Pi/2");
				  
			  }else if  (value >Math.PI/2){
				  throw new IllegalArgumentException("argument x must be less or equal to Pi/2");
				  
			  }else {
				  
				limit = one + (a1*z)+(a2*u)+(a3*(x*u))+(a4*v)+(a5*(z*v));
				
				limit2 = Math.sin(x)/x;
				
				lim_ratio = limit/limit2;
				
				 System.out.printf(" %15s %30s %35s\n" , "limit sinx/x("+x+")" , "limit 2sinx/x("+x+")" , " limit ");
				 System.out.printf("%.16f %35.16f %30.16f \n" , limit , limit2 , lim_ratio);
			  }
			  
			  return limit;
		  }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            method1(10);
	} catch(IllegalArgumentException e){
		e.printStackTrace(System.out);
		e.fillInStackTrace();
		
		for (StackTraceElement element : e.getStackTrace()){
			   System.out.println ( element.getLineNumber()+ " " + element.getMethodName()+ " " + element.getClassName()+ " ");
		}
			
	}
		
		try {
			geoProgression(0.1,0.7,36);
			
		}catch (IllegalArgumentException e ){
			e.printStackTrace(System.out);
			
		}catch( ArithmeticException e){ //exception chaining
			e.printStackTrace(System.out);
			for (StackTraceElement element : e.getStackTrace()){
				System.out.println(element.getLineNumber()+ " \t" + element.getMethodName()+ " \t" + element.getClassName()+ " \t");
			}
}
                       geoMeanFactorial(3);
                       nthRoot(34,5);
                       double sum =0;// proper way to pass an array to called method
                       double [] ar = {1.24,14.25,8.25,25.25,18.2,100.0,1245.2,45.36,896.23};
                       sum = geoMean(ar);
                       System.out.println("mean is " +  sum);
                       nthRoot2(30.0,5.0);
                       double result =0;
                       result = generalizedMean(ar,2);
                       System.out.println("result is" + result);
                       try {
                       cauchyInequality(10,10);
                       }catch (IllegalArgumentException e){
                    	   e.printStackTrace(System.out);
                       }
                       
                       try {
						minkovskiInequality(12,12,2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                       exponentInequality( 0.2);
                       exponentInequality2(4,2);
                       ln_approximation(1.5);
                      
                       limitCotangent(0.24);
                       limitSin(0.01);
                       limitSinPolyApprox(0.1);
                       int[]a = new int[10];
                       for(int i = 0;i<a.length;i++){
                    	   a[i] = Matrix.setElement(i, 1);
                       }
                    		  
	}
		
		

}
