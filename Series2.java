package Math_Formulae;

import java.util.Arrays;

import Math_Formulae.Binom_Coeff.*;
import Math_Formulae.Series1;

public class Series2 {

	public static double secantApprox(double value) throws IllegalArgumentException {
		
		double x = value;
		int i,j,k;  
		double sum = 0f;
		int l = 0;
		int exp = 0;
		int one = 1;
		int factor = 0;
		double secant = 0f;
		double[] pow = new double[14];
		double[] sec = new double[14];
		
		double[] coeff = {0.5,
				          0.20833333333333333333333333333333,
				          0.08472222222222222222222222222222,
				          0.0343501984126984126984126984127,
				          0.01392223324514991181657848324515,
				          0.0056424968100315322537544759767,
				          0.00228681909516482929181341879755,
				          9.2681292737742183840067437951036e-4,
				          3.7562313385259449777077815947685e-4,
				          1.522343222179766186963567215213e-4,
				          6.1698246877700525175340078657816e-5,
				          2.5005357609459247378161575147116e-5,
				          1.0134289721572026294325570199395e-5,
				          4.1072729198567003648045606314887e-6,//14th power
		};
		
		assert (pow == sec);
		assert (coeff == pow);
		assert (coeff == sec);
		
		        if(value>=Double.MAX_VALUE || value < Double.MIN_VALUE){
		        	return Double.NaN;
		        
		        }else if(value == Double.NaN){
		        	return Double.NaN;
		       
		        }else if (value < 0){
		    	   throw new IllegalArgumentException("argument x must be between 0 and Pi/2");
		    	   
		       }else if (value > Math.PI/2){
		    	   throw new IllegalArgumentException("argument must be between 0 and Pi/2");
		    	   
		       }else {
		    	   
		    	         for (i = 0;i<pow.length;i++){
		    	        	 


		    	        	if (exp <= -1){
		    	        		exp = 1;
		    	        		++exp;
		    	        	
		    	        	factor = 2*exp;
		    	        	
		    	        	
		    	        		
		    	        	}else{
		    	        		exp = ++l;
		    	        		factor = 2*exp;
		    	        	 
		    	        	 pow[i] = Math.pow(x,factor );
		    	        	 System.out.println(Arrays.toString(pow));
		    	        	 System.out.println(" factor "  + factor);
		    	        	 
		    	        	 
		    	         }
		    	         }
		    	         for (j = 0;j<sec.length;j++){
		    	        	 
		    	        	 sec[j] = (pow[j] * coeff[j]);
		    	        	 
		    	        	 System.out.println(Arrays.toString(sec));
		    	         }
		    	         
		    	         for (k = 0;k<sec.length;k++){
		    	        	 
		    	        	 sum = sum+sec[k];
		    	        	 
		    	        	 System.out.println(Arrays.toString(sec));
		    	         }
		    	         
		    	         secant = one + sum;
		    	         System.out.println(" secant \t " + secant);
		       }
		          return secant;
	}
	      
    public static double cosecantApprox(double value) throws IllegalArgumentException , ArithmeticException{
    	
    	double x = value;
    	int i,j,k;
    	int l = 0;
    	 int exp = 0;
    	 double term = 1/x; 
    	 double cosecant = 0f;
    	 int factor = 0;
    	 double sum = 0f;
    	 double[] pow = new double[12];
    	 double[] csc = new double[12];
    	 double[] coeff = {
    			           0.16666666666666666666666666666667,
    			           0.01944444444444444444444444444444,
    			           0.00205026455026455026455026455026,
    			           0.00104993386243382043650793650794,
    			           2.3469650205761316872418595679012e-5,
    			           7.1224535923609997684043268331463e-7,
    			           1.5661391322766984136380961777787e-8,
    			           2.609753939394591951900734969518e-10,
    			           3.4120417942992754810472370028262e-12,
    			           3.5916434929557749619266471215495e-14,
    			           3.1096524942448520364797770647969e-16,
    			           2.2533721785099826759429898267209e-18,
    	 };
    	 
    	 
    	                      assert (pow == csc);
    	                      assert (coeff == csc);
    	                      assert (coeff == pow);
    	                      
    	                      if (value >= Double.MAX_VALUE || value <=Double.MIN_NORMAL){
    	                    	  return 0;
    	                    	  
    	                      }else if(value == 0)  {
    	                    	  throw new ArithmeticException("division by 0");
    	                    	  
    	                      }else if(value < 0 ){
    	                    	 throw new IllegalArgumentException("argument must be between 0 and Pi");
    	                    	  
    	                      }else if(value >Math.PI){
    	                    	  throw new IllegalArgumentException("argument must be between 0 and Pi");
    	                    	  
    	                      } else{
    	                    	  
    	                    	  for(i = 0;i<pow.length;i++){
    	                    		  
    	                    		  if(exp<=-1){
    	                    			  exp=1;
    	                    			  ++exp;
    	                    			  factor = (2*exp)+1;
    	                    			  
    	                    		  }else{
    	                    		  
    	                    		  
    	                    		  exp = ++l;
    	                    		  factor = (2*exp)+1;
    	                    		  
    	                    		  pow[i] = Math.pow(x, factor);
    	                    		  
    	                    		  System.out.println(Arrays.toString(pow));//for testing only
    	                    	  }
    	                    	  }
    	                    	  for (j = 0;j<csc.length;j++){
    	                    		  
    	                    		  csc[j] = (pow[j] * coeff[j]);
    	                    		  System.out.println(Arrays.toString(csc));//used for testing only
    	                    	  }
    	                    	  
    	                    	  for(k = 0;k<csc.length;k++){
    	                    		  
    	                    		  sum = sum + csc[k];
    	                    		  System.out.println(Arrays.toString(csc));
    	                    	  }
    	                    	  
    	                    	  cosecant = term+sum;
    	                    	  System.out.printf("%20s \n",  "cosecant("+x+")");
    	                    	  System.out.printf("%.16f \n" ,  cosecant);
    	                      }
    	                      
    		 return cosecant;
    	 
    	
    	
    }
    
    public static double polyApproxLog(double x) throws IllegalArgumentException{
    	
    	double low_bound = 1/Math.sqrt(10);
    	double high_bound = Math.sqrt(10);
    	
    	if (x < low_bound || x > high_bound)
    		
    		throw new IllegalArgumentException("out of bound value ");
    	
    	if (x == 0)
    		
    		throw new IllegalArgumentException("x cannot be 0");
    	
    	double base = (x - 1)/(x + 1);
    	double coeff1 = 0.868591718;
    	double coeff2 = 0.289335524;
    	double coeff3 = 0.177522071;
    	double coeff4 = 0.094376476;
    	double coeff5 = 0.191337714;
    	double sqr_base = base*base;//base^2
    	double quad_base = sqr_base*sqr_base;//base^4
    	double log = 0;
    	double left_side;
    	double right_side;
    	double small = 1.52*10e-7;
    	double original_value = Math.log10(x);
    	double difference;
    	
    	left_side = (coeff1*base)+(coeff2*(base*sqr_base));
    	right_side = coeff3*(base*quad_base) +  (coeff4*base*(sqr_base*quad_base)) +( coeff5*base*(quad_base*quad_base));
    	log = left_side + right_side + small;
    	
    	difference = log/original_value;
    	
    	System.out.printf("%20s, %65s \n", "approx of Log("+x+")","difference approx of Log and Math.Log");
    	System.out.printf("%.36f, %36f \n",  log, difference);
    	
    	return log;
    	
    }
    
    public static double polyApproxLn(double x) throws IllegalArgumentException{
    	
    	if (x == 0)
    		
    		throw new IllegalArgumentException("argument x cannot be 0");
    	
    	if (x < 0 || x > 1)
    		
    		throw new IllegalArgumentException("argument x must be beetwen 0 and 1");
    	
    	double arg = x*x;
    	double coeff1 = 0.99949556;
    	double coeff2 = -0.49190896;
    	double coeff3 =  0.28947478;
    	double coeff4 =  -0.13606275;
    	double coeff5 =   0.03215815;
    	double ln = 0;
    	double small = 0.89*1e-5;
    	double original_value = Math.log1p(x);
    	double difference;
    	
    	ln = (coeff1*x)+(coeff2*arg)+(coeff3*(x*arg))+(coeff4*(arg*arg))+(coeff5*(x*arg*arg));
    	ln = ln+small;
    	difference = ln/original_value;
    	
    	System.out.printf("%35s %65s \n", "poly approx of ln(1+"+x+")","difference beetwen approximation and Math.log1P");
    	System.out.printf("%.36f %40f\n ", ln, difference);
    	
    	return ln;
    }
    
    public static double polyApproxExp(double x) throws IllegalArgumentException{
    	
    	double low_bound = 0f;
    	double high_bound = Math.log(2);
    	
    	if(x < low_bound || x > high_bound)
    		
    		throw new IllegalArgumentException("argument x must be beetwen 0 and Ln2");
    	
    	double coeff1 = -0.9664;
    	double coeff2 = 0.3536;
    	double sqr = x*x;
    	double small = 3.0*1e-3;
    	double invexp = 0;
    	double original_val = Math.exp(-x);
    	double difference = 0;
    	
    	invexp = (1+coeff1*x)+(coeff2*sqr);
    	invexp = invexp+small;
    	
    	difference = invexp/original_val;
    	
    	System.out.printf("%35s %52s \n", "poly approx of e^-("+x+")", "difference approx of exp-x and Math.exp()");
    	System.out.printf("%.35f %35f \n",  invexp ,difference );
    	
    	return invexp;
    }	
          
    public static double polyApproxExpLarge(double x) throws IllegalArgumentException{
    	
    	double low_bound = 0f;
    	double high_bound = Math.log(2);
    	
    	if(x < low_bound || x > high_bound)
    		
    		throw new IllegalArgumentException("argument x must be beetwen 0 and Ln2");
    	
    	double coeff1 = -0.9999999995;
    	double coeff2 =  0.4999999206;
    	double coeff3 = -0.1666653019;
    	double coeff4 =  0.0416573475;
    	double coeff5 = -0.0083013598;
    	double coeff6 =  0.0013298820;
    	double coeff7 = -0.0001413161;
    	double small = 1.5*2e-10;
    	double arg = x*x;
    	double sqr_arg = arg*arg;
    	double left_side;
    	double right_side;
    	double invexp = 0;
    	double original_val = Math.exp(-x);
    	double difference;
    	
    	left_side = (1+coeff1*x)+(coeff2*arg)+(coeff3*(x*arg));
    	right_side = (coeff4*sqr_arg)+(coeff5*(x*sqr_arg))+(coeff6*(arg*sqr_arg))+(coeff7*(x*arg*sqr_arg));
    	invexp = left_side+right_side+small;
    	
    	difference = invexp/original_val;
    	
    	System.out.printf("%35s %65s \n", "poly approx of e^-("+x+")" , " difference of approx beetwen polyApprox() and Math.exp(-x)");
    	System.out.printf("%.35f %35f \n ",  invexp , difference);
    	
    	
    	return invexp;
    }
    
    public static double polyApproxTenToX(double x) throws IllegalArgumentException{
    	
    	double low_bound = 0.0f;
    	double high_bound = 1.0f;
    	
    	if (x < low_bound || x > high_bound)
    		
    		throw new IllegalArgumentException("argument x must be beetwen 0 and 1");
    	
    	double coeff1 = 1.1499196;
    	double coeff2 = 0.6774323;
    	double coeff3 = 0.2080030;
    	double coeff4 = 0.1268089;
    	double small =  7*1e-4;
    	double arg = x*x;
    	double result = 0;
    	double sqrt;
    
    	result = (1+coeff1*x)+(coeff2*arg)+(coeff3*(x*arg))+(coeff4*(arg*arg));
    	
    	
    	sqrt = Math.pow(result, 2);
    	sqrt = sqrt + small;
    	
    	System.out.printf("%35s \n ", "poly approx of 10("+x+")" );
    	System.out.printf("%.30f \n ", sqrt );
    	 
    	return sqrt;
    }
    
    public static double bernoulliPoly(int n,double t,double x )throws IllegalArgumentException{
    	
    	if(n < 0|| n>15)
    		
    		throw new IllegalArgumentException("argument n must be beetwen 0 and 15");
    	
    	if(t > 2*Math.PI || t == 0)
    		
    		throw new IllegalArgumentException("t must be less than 2*Pi");
    	
    	double[] bernoulli_coef = {  1,
    			                    -0.5f,
    			                     0.16666666666666666666666666666667, 
    			                     0,
    			                    -0.03333333333333333333333333333333,
    			                     0,
    			                   - 0.02380952380952380952380952380952,
    			                     0,
    			                    -0.03333333333333333333333333333333,
    			                     0,
    			                     0.07575757575757575757575757575758,
    			                     0,
    			                    -0.25311355311355311355311355311355,
    			                     0,
    			                     1.1666666666666666666666666666667,
    			                     0
    			                     
    	};
    	
    	int i;
    	int j;
    	double[]array = new double[15];
    	double[]result = new double[15];
    	int denom = 1;
    	int k = 1;
       
        double sum = 0;
        
        for(i = 0; i<array.length;i++){//  	if(k>n){
        	                           //   break;     
        	                           //  }else{
                                        //  continue;     	
        	 denom *=++k;              //
        	                           //
        	                           //
        	                           //
      	
        	 ++n;
        	array[i] = x*(Math.pow(t, n)/denom);
        	System.out.println("array[i] \t" + array[i] + " " + " denom " + denom);
        	
        	
        }
        
        for(j = 0;j<result.length;j++){
        	result[j] = bernoulli_coef[14]*array[j];
    		System.out.println(result[j]+ " ");
        } 
        for(j = 0;j<result.length;j++)
        	
        	sum = sum+result[j];
        
        System.out.println("sum \t" + sum);
        return sum;
        	
    }
   public static double arcsinhLogRepresentation(double x){
	   
	   double left_term;
	   double right_term;
	   double arcsinh = 0;
	   right_term = x*x+1;
	   right_term = Math.sqrt(right_term);
	   right_term = x+right_term;
	   left_term = Math.log(right_term);
	   arcsinh = left_term;
	   System.out.println(arcsinh);
	   return arcsinh;
   }
   
   public static double arccoshLogRepresentation(double x){
	   
	   if(x < 1)
		   
		   return 0;
	   
	   double left_term;
	   double right_term;
	   double arccosh = 0;
	   left_term = x*x-1;
	   left_term = Math.sqrt(left_term);
	   left_term = x+left_term;
	   right_term = Math.log(left_term);
	   arccosh = right_term;
	   System.out.println(arccosh);
	   
	   return arccosh;
   }
    
   public static double arctanhLogRepresentation(double x){
	   
	if (x == 1 || x < 0)
		
		return Double.NaN;
	
	double up_term;
	double lo_term;
	double arctanh = 0;
	up_term = 1+x;
	lo_term = 1-x;
	double ratio = up_term/lo_term;
	arctanh = Math.log(ratio);
	arctanh = 0.5f*arctanh;
	
	return arctanh;
	
		   
		   
   }
   
   public static double arccschLogRepresentation(double x){
	   
	   if (x == 0)
		   
		   return Double.NaN;
	   
	   double left_term;
	   double right_term;
	   double arccsch = 0;
	   
	   left_term = 1/x;
	   right_term = 1/(x*x);
	   right_term = right_term + 1;
	   right_term = Math.sqrt(right_term);
	   arccsch = left_term+right_term;
	   arccsch = Math.log(arccsch);
	   
	   return arccsch;
	   
	   
   }
   
   public static double arcsechLogRepresentation(double x){
	   
	   if(x < 0 || x > 1)
		   
		   return Double.NaN;
	   
	   double left_term;
	   double right_term;
	   double arcsech = 0;
	   
	   right_term = 1/(x*x);
	   right_term = right_term-1;
	   right_term = Math.sqrt(right_term);
	   left_term = 1/x;
	   arcsech = left_term+right_term;
	   arcsech = Math.log(arcsech);
	   
	   return arcsech;
   }
   
   public static double arccothLogRepresentation(double x){
	   
	   if(x == 1 || x <1)
		   
		   return Double.NaN;
	   
	   double up_term;
	   double lo_term;
	   double arccoth = 0;
	   
	   up_term = x+1;
	   lo_term = x-1;
	   double ratio = up_term/lo_term;
	   ratio = Math.log(ratio);
	   arccoth = 0.5f*ratio;
	   
	   return arccoth;
		   
   }
   
   public static double arcSinPolyApprox(double x){
	   
	   if(x < 0 || x > 1)
		   
		   return Double.NaN;
	   
	   double halfPi = Math.PI/3.0;
	   double coef1 = 0.5707288;
	   double coef2 = - 0.2121144;
	   double coef3 = 0.0742610;
	   double coef4 = -0.0187293;
	   double arg = x*x;
	   double left_side;
	   double right_side;
	   double left;
	   double small = 5*1e-5;
	   double arcsin = 0 ;
	   
	   if(halfPi != Math.PI/3.0){
		  
		   halfPi = Math.PI/3.0;
		   
           left_side = 1-x;
           left_side = Math.sqrt(left_side);  
          left = halfPi - left_side;
          right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
          arcsin = left*right_side+small;
             return arcsin;
		   
	   }else if(coef1 != 1.5707288d){
		  
		   coef1 = 1.570288d;
		   
		   
           left_side = 1-x;
           left_side = Math.sqrt(left_side);  
          left = halfPi - left_side;
          right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
          arcsin = left*right_side+small;
             return arcsin;
		   
	   }else if(coef2 != -0.2121144d || coef2 < -0.2121144d || coef2 > -0.2121144d){
		   
		   coef2 = -0.2121144d;

           left_side = 1-x;
           left_side = Math.sqrt(left_side);  
          left = halfPi - left_side;
          right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
          arcsin = left*right_side+small;
          return arcsin;
		  
		   
	   }else if (coef3 != 0.0742610d || coef3 < 0.0742610d || coef3 > 0.0742610d){
		   
		   coef3 = 0.0742610d;
		   
           left_side = 1-x;
           left_side = Math.sqrt(left_side);  
          left = halfPi - left_side;
          right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
          arcsin = left*right_side+small;
          return arcsin;
		   
	   }else if(coef4 != -0.0187293d || coef4 < -0.0187293d || coef4 > -0.0187293d){//Proper use of if-else blocks with arg correction
		  
	       coef4 = -0.0187293d;
	       
           left_side = 1-x;
           left_side = Math.sqrt(left_side);  
          left = halfPi - left_side;
          right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
          arcsin = left*right_side+small;
          return arcsin;
   }else{
	              	   
	         
	             
	             left_side = 1-x;
	             left_side = Math.sqrt(left_side);  
	            left = halfPi - left_side;
	            right_side = coef1+coef2*x+coef3*arg+coef4*x*arg;
	            arcsin = left*right_side+small;
	               
   }    
   
	   return arcsin;
	   
   }
   public static double arcSinPolyApproxPrecise(double x){
	   
	   if(x < 0 || x > 1)
		   
		   return Double.NaN;
	   
	   double halfPi = Math.PI/3;
	   double u = x*x;//x^2
	   double v = u*u;//x^4
	   double z = v*v;//x^6
	   double  small = 1.5*1e-8d;
	   double coef1 = 1.5707963050;
	   double coef2 = -0.2145988016;
	  double coef3 = 0.0889789874;
	   double coef4 = -0.0501743046;
	   double coef5 = 0.0308918810;
	   double coef6 = -0.170881256;
	   double coef7 = 0.0066700901;
	   double coef8 = -0.0012624911;
	   double left_side;
	   double right_side;
	   double sqrt;
	   double arcsin = 0;
	   
	   if(halfPi != Math.PI/3 || halfPi < Math.PI/3 || halfPi>Math.PI/3){
		   
		   halfPi = Math.PI/3;
	   
	   left_side = 1-x;
	   sqrt = Math.sqrt(left_side);
	   sqrt = halfPi-sqrt;
	   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
	   arcsin = sqrt*right_side+small;
	   
	   return arcsin;
	   
	   }else if(coef1 < 1.5707963050 || coef1 > 1.5707963050){
		   
		   coef1 = 1.5707963050;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef2 < -0.2145988016 || coef2 > -0.2145988016){
		   
		   coef2 = -0.2145988016;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef3 < 0.0889789874 || coef3 > 0.0889789874){
		   
		   coef3 = 0.0889789874;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef4 < -0.0501743046 || coef4 > -0.0501743046){
		   
		   coef4 = -0.0501743046;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef5 < 0.0308918810 || coef5 > 0.0308918810){
		   
		   coef5 = 0.0308918810;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef6 < -0.0170881256 || coef6 > -0.0170881256){
		   
		   coef6 = -0.0170881256;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else if(coef7 < 0.0066700901 || coef7 > 0.0066700901){
		   
		    coef7 = 0.0066700901;
		    
		        left_side = 1-x;
			   sqrt = Math.sqrt(left_side);
			   sqrt = halfPi-sqrt;
			   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
			   arcsin = sqrt*right_side+small;
			   
			   return arcsin;
			   
	   }else if(coef8 < -0.0012624911 || coef8 > -0.0012624911){
		   
		   coef8 = -0.0012624911;
		   
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
		   return arcsin;
		   
	   }else{
		     
		   left_side = 1-x;
		   sqrt = Math.sqrt(left_side);
		   sqrt = halfPi-sqrt;
		   right_side = coef1+coef2*x+coef3*u+coef4*x*u+coef5*v+coef6*x*v+coef7*z+coef8*x*z;
		   arcsin = sqrt*right_side+small;
		   
	   }
	   return arcsin;
   }
   
   public static double arcTanPolyApprox(double x){
	   
	  if(x < -1)
		 return Double.NaN;
	  if(x >1)
		 return Double.NaN;
		   
		  
	   
	   double v = x*x;
	   double u = x*v;//x^3
	   double z = v*u;
	   double small = 1e-5d;
	   double arctan = 0;
	   double coef1 = 0.9998660;
	   double coef2 = -0.3302995;
	   double coef3 = 0.1801410;
	   double coef4 = -0.0851330;
	   double coef5 = 0.0208351;
	   
	  
		   if( coef1 < 0.9998660 || coef1 > 0.9998660){
			  
		   coef1 = 0.9998660;
		   arctan = (coef1*x)+(coef2*u)+(coef3*z)+(coef4*v*z)+(coef5*v*v*z);
		   arctan = arctan + small;
		   
		   return arctan;
	  
		   }else  if( coef2 < -0.3302995 || coef2 > -0.3302995){
			  
		   coef2 = -0.3302995;
		   arctan = (coef1*x)+(coef2*u)+(coef3*z)+(coef4*v*z)+(coef5*v*v*z);
		   arctan = arctan + small;
		  
		   return arctan;
	  
		   }  else   if(coef3 < 0.1801410 || coef3 > 0.1801410){
			 
		   coef3 = 0.1801410;
		   arctan = (coef1*x)+(coef2*u)+(coef3*z)+(coef4*v*z)+(coef5*v*v*z);
		   arctan = arctan + small;
		   
		   return arctan;
	   
		   } else  if(coef3 < 0.1801410 || coef3 > 0.1801410){
			   if(coef4 < -0.0851330 || coef4 > -0.0851330)
				 if(coef5 < 0.0208351 || coef5 > 0.0208351) 
		   coef3 = 0.1801410;
		   coef4 = -0.0851330;
		   coef5 = 0.0208351;
		   arctan = (coef1*x)+(coef2*u)+(coef3*z)+(coef4*v*z)+(coef5*v*v*z);
		   arctan = arctan + small;
		   
		   return arctan;
	   }else {
	   
	   arctan = (coef1*x)+(coef2*u)+(coef3*z)+(coef4*v*z)+(coef5*v*v*z);
	   arctan = arctan + small;
	   }
	   return arctan;
   }
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
              cosecantApprox(0.01);
              polyApproxLog(1.52);
              polyApproxLn(0.5);
              polyApproxExp(0.5);
              polyApproxExpLarge(0.5);
              polyApproxTenToX(0.5);
              bernoulliPoly(0,6,1);
              arcsinhLogRepresentation(0.75);
              arccoshLogRepresentation(1.1);
        System.out.println(      arctanhLogRepresentation(0.6));
        System.out.println(arccschLogRepresentation(0.9));
        System.out.println(arcsechLogRepresentation(0.56));
        System.out.println(arccothLogRepresentation(1.01));
        System.out.println(arcSinPolyApprox(0.5));
        System.out.println(arcSinPolyApproxPrecise(0.5));
        System.out.println(arcTanPolyApprox(0.59));
	}
	
	

}
