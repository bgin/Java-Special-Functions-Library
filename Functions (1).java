package Math_Formulae;
import java.util.Arrays;

import java.util.Random;

import Math_Formulae.Complex;

public class Functions extends Complex {
	
	private double x;
	private double y;
	private double z;
    private final  double epsilon = 1.11e-16;
	public Functions(double x,double y,double z,double Im,double Re)throws IllegalArgumentException{
		super(Im,Re);
		if(x == Double.NaN)
			throw new IllegalArgumentException("arg x is NaN");
		if(x < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg x is smaller than Min_Normal");
		if(x > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg x is greater than Max_Value" );
		if(y == Double.NaN)
			throw new IllegalArgumentException("arg y is NaN");
		if(y < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg y is smaller than Min_Normal");
		if(y > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg y is greater than Max_Value");
		if(z == Double.NaN)
			throw new IllegalArgumentException("arg z is NaN");
		if(z < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg z is smaller than Min_Normal" );
		if(z > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg z is greater than Max_Value");
		
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.Im = Im;
		this.Re = Re;
		
	}
	
	public Functions(double Im,double Re){
		super(Im,Re);
		this.Im = Im;
		this.Re = Re;
		
	}
	
	
	
	public Functions(double x,double Im,double Re)throws IllegalArgumentException{
		super(Im,Re);
		if(x < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg x is less than Min_Normal");
		if( x > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg x is greater than Max_Value");
		if(x == Double.NaN)
			throw new IllegalArgumentException("arg x is NaN");
		this.Im = Im;
		this.Re = Re;
	}
	
	public void SetArg3D(double x,double y,double z)throws IllegalArgumentException{
		
		if(x == Double.NaN)
			throw new IllegalArgumentException("arg x is NaN");
		if(x < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg x is smaller than Min_Normal");
		if(x > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg x is greater than Max_Value" );
		if(y == Double.NaN)
			throw new IllegalArgumentException("arg y is NaN");
		if(y < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg y is smaller than Min_Normal");
		if(y > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg y is greater than Max_Value");
		if(z == Double.NaN)
			throw new IllegalArgumentException("arg z is NaN");
		if(z < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg z is smaller than Min_Normal" );
		if(z > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg z is greater than Max_Value");
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
  
	public void setArg1D(double x) throws IllegalArgumentException{
		
		if(x < -Double.MIN_NORMAL)
			throw new IllegalArgumentException("arg x is smaller than Min_Normal");
		if( x > Double.MAX_VALUE)
			throw new IllegalArgumentException("arg x is greater than Max_Value");
		if( x == Double.NaN)
			throw new IllegalArgumentException("arg x is NaN");
		
		this.x = x;
		
	}
	public double getX(){
		
		return x;
	}
	
	public double getY(){
		
		return y;
		
	}
	
	public double getZ(){
		
		return z;
	}
	
	public double fastsin(double x){
		double sum = 0;
		
		if( x >= (Math.PI/2)){
			return Double.NaN;
			
		}else if(-x <= -Math.PI/2){
			return Double.NaN;
			
		}else{
			
			 
			 final double coef1 = -0.16666666666666666666666666666667; // reciprocal value of factorial  3!
			 final double coef2 = 0.00833333333333333333333333333333; //  reciprocal value of factorial 5!
			 final double coef3 = -1.984126984126984126984126984127e-4; // reciprocal value of factorial 7!
			 final double coef4 = 2.7557319223985890652557319223986e-6; // reciprocal value of factorial 9!
			 final double coef5 = -2.5052108385441718775052108385442e-8; // reciprocal value of factorial 11!
			 final double coef6 = 1.6059043836821614599392377170155e-10; // reciprocal value of factorial 13!
			 final double coef7 = -7.6471637318198164759011319857881e-13; // reciprocal value of factorial 15!
			 final double coef8 = 2.8114572543455207631989455830103e-15 ; // reciprocal value of factorial17!
			 final double coef9 = -8.2206352466243297169559812368723e-18; // reciprocal value of factorial 19!
			 final double coef10 = 1.9572941063391261230847574373505e-20; // reciprocal value of factorial 21! 
			 final double coef11 = -3.8681701706306840377169119315228e-23; // reciprocal value of factorial 23!
			 double rad,x1;
			 
			rad = x;
			x1 = x*x; //x^2
			
			sum = rad+rad*x1*(coef1+x1*(coef2+x1*(coef3+x1*(coef4+x1*(coef5+x1*(coef6+x1*(coef7+x1*(coef8+x1*(coef9+x1*(coef10+x1*(coef11))))))))))); //polynomial fit of Taylor Series
			
		}
		
		return sum;
	}
	
	public double SinWrapper(double x){
		
		return Math.sin(x);
	}
	public double Ei(double x){
		double sum = 0;
		
		if(x < 0.0){
			return Double.NaN;
			
		}else {
			 
			   double euler = 0.5772156649;
			   double ln;
			   long k = 0;
			   double[]coef = {1.0,
					           4.0,
					           18.0,
					           96.0,
					           600.0,
					           4320.0,
					           35280.0,
					           322560.0,
					           3265920.0,
					           362888000.0,
					            439084800.0, 
					           5748019200.0,
					           80951270400.0,
					           1220496076800.0,
					           19615115520000.0,
					           334764638208000.0,
					           6046686277632000.0,
					           115242726703104000.0,
					           2311256907767808000.0,
					           48658040163532800000.0,
					           1072909785605898240000.0
			   };
			   double[]array = new double[coef.length];
			   double value = 0;
			   double nom;
			   
			   int i,j;
			   for(i = 0;i<array.length;i++){
				   ++k;
				   nom = Math.pow(x, k);
				   value = nom/coef[i];
				   array[i] = value;
				   
			   }
			   for(j = 0;j<array.length;j++){
				   sum += array[j];
			   }
			   ln = Math.log(x);
			   sum = euler+ln+sum;
			   
		}
		return sum;
	}
	
	
		
	
	
	public double E1(double x){
		double sum = 0;
		
		if(x > Math.PI){
			return Double.NaN;
			
		}else if( x < 0.0){
			return Double.NaN;
			
		}else{
			
			  double euler =  0.57721566490153286060651209008240243104215933593992;
			  double ln;
			  long k = 0;
			  int a;
			  double b;
			  int one = -1;
			  int i,j;
			  double value = 0;
			  double nom;
			  double []coef = {1.0,
					           4.0,
					           18.0,
					           96.0,
					           600.0,
					           4320.0,
					           35280.0,
					           322560.0,
					           3265920.0,
					           36288000.0,
					           439084800.0,
					           5748019200.0,
					           80951270400.0,
					           1220496076800.0,
					           19615115520000.0,
					           334764638208000.0,
					           6046686277632000.0,
					           115242726703104000.0,
					           2311256907767808000.0,
					           48658040163532800000.0,
					           1072909785605898240000.0
					           
			  };
			  double[]array = new double[coef.length];
			  for(i = 0;i<array.length;i++){
				  ++k;
				  a = (int)Math.pow(one, k);
				  b = Math.pow(x, k);
				  nom = a*b;
				  value = nom/coef[i];
				  array[i] = value;
				  
			  }
			  for(j = 0;j<array.length;j++){
				  sum += array[j];
			  }
			  ln = Math.log(x);
			  sum = -euler-ln-sum;
			  
		} 
			  return sum;
			  
	}
	
	public double Li(double x){
		double sum = 0;
		
		if(x < 0.0){
			return Double.NaN;
			
		}else{
			   long start,end;
			   start = System.nanoTime();
			   double euler = 0.57721566490153286060651209008240243104215933593992;
			   double ln;
			   double lnln;
			   long k = 0;
			   double value = 0;
			   double nom;
			   double[]coef = {1.0,
			           4.0,
			           18.0,
			           96.0,
			           600.0,
			           4320.0,
			           35280.0,
			           322560.0,
			           3265920.0,
			           36288000.0,
			           439084800.0,
			           5748019200.0,
			           80951270400.0,
			           1220496076800.0,
			           19615115520000.0,
			           334764638208000.0,
			           6046686277632000.0,
			           115242726703104000.0,
			           2311256907767808000.0,
			           48658040163532800000.0,
			           1072909785605898240000.0
			           
	  
		};
			   double[]array = new double[coef.length];
			   int i,j;
			   ln = Math.log(x);
			   for(i = 0;i<array.length;i++){
				   ++k;
				   nom = Math.pow(ln, k);
				   value = nom/coef[i];
				   array[i] = value;
			   }
			   for(j = 0;j<array.length;j++){
				   sum += array[j];
			   }
			   lnln = Math.log(ln);
			  
			   sum = euler+lnln+sum;
			   end = System.nanoTime();
			   System.out.println("running time of Li() method is :" + (end-start) + "\tnanoseconds");
			   
	}
		return sum;
	}
	 public double En(double x,int n){
		 double sum = 0;//recurrence formula cannot achieve higher precision
		 double e1 = 0;
		 if(x < 0.0){
			 return Double.NaN;
			 
		 }else if(n < 2){
			 return Double.NaN;
			 
		 }else{
			    long start,end;
			    start = System.nanoTime();
			    e1 = this.E1(x);
			    e1 = x*e1;
			   int i;
			  
			   double temp; 
			   double exp;
			   exp = Math.exp(-x);
			  
			   for(i = 1;i<n;i++ ){
				   temp = i;
				   temp = 1/temp;//while dividing always assign index to variable
				   sum = temp*(exp-e1);
				   e1 = sum;
				   
				  
				   
			   }
			   end = System.nanoTime();
			   System.out.println("running time of En()method is: " + (end-start)+ "\tnanoseconds");
		 }
		
		 return e1;
	 }
	
	
	
	
	

	
	
	
	
	public double normArray1D(double[]a) throws IllegalArgumentException{
		
		if(a == null)
			throw new IllegalArgumentException("array must be initialized");
		
		double[]array = a;
		int i;
		double norm = 0;
		
		for(i = 0;i<array.length;i++){
			
			norm += Math.abs(array[i]);
		}
			return norm;
	}
	
	public double hypotenuseArray1D(double[]a,double value,int n,double step) throws IllegalArgumentException{
		
		if(a == null)
			throw new IllegalArgumentException("array must be initialized");
		if(n == 0)
			throw new IllegalArgumentException("arg n must be greater than 0 ");
		if( n <0)
			throw new IllegalArgumentException("arg n must be greater than 0");
		x = value;
		double[]array = a;
		int Len = n;
		double[]arg = new double[Len];
		int i;
		double hypotenuse = 0;
		double x_interval;
		double y_interval;
		
		for(i = 0;i<array.length;i++){
			
			x += step;
		arg[i] = x;
			
		}
		x_interval = arg[Len-1]-arg[0];
		y_interval = array[Len-1]-array[0];
		
		hypotenuse = Math.hypot(x_interval, y_interval);
		
		return hypotenuse;
	}
	
	public static double[] jacobiMethod(){//used to testing iteration
		        int n = 10;
				int m = 10;
		
		double[][]a = new double[n][m];
		
		double[]x   = new double[n];
		double[]b   = new double[n];
		double[][]temp =a;
		
		double[]jacobi = new double[m*n];
		double[]jacobi2 = new double[m*n];
		double[]jacobi3 = new double[m*n];
		double tempor = 0;
		
		
		int i;
		int j;
		double k = 0;
		double s = 0; 
		double v = 0;
		double z = 0;
		for(i = 0;i<n;i++){
			x[i] = 1;
			b[i] = i;
			for(j = 0;j<m;j++){
				a[i][j] = Math.cbrt(i*j);
				temp[i][j] = a[i][j];
				k = 1/a[i][j];
				s += temp[i][j]*x[i];
				s= b[i]-s;
				jacobi[j] = k*s;
				jacobi2[j]= jacobi[j];
				
				
			}
		}
		double tempor1;
		for(int p = 0;p<n;p++){
			for( int q = 0;q<m;q++){
				a[p][q] = Math.cbrt(p*q);
				temp[p][q] = a[p][q];
				v = 1/a[p][q];
				z = temp[p][q]*jacobi2[q];
				tempor = z;
				tempor += tempor;
		tempor1 = b[p] - tempor;
				jacobi3[q] = v*tempor1;
				
			}
		}
		return jacobi3;
	}
	
	public double[] lnIntegralArray1D(double value,int n,double step){
		
		if(value == 0)
			return null;
		if(value == 1 || value > 1)
			return null;
		if(n == 0)
			return null;
		if(n < 0 )
			return null;
		
		x = value;
		int i;
		int Len = n;
		double[]array = new double[Len];
		
		
			for(i = 0;i < array.length;i++){
			x += step;	
			
			
			array[i] = Math.log(x);
			array[i] = 1/array[i];
			
	  
			
	}
			return array;
	}
	/**
	 * @param args
	 */
	public double[] DividedDifference(double[]x,double[]y,int p){
		
		if(x == null){
			
				
			return null;
		}else if(y == null){
			
				
			return null;
			
		}else if (p >2 ){
			
			return null;
			
		}else{	
		
			
			double[]a = x;
			double[]b = y;
			
			
			int Len = a.length;
			double[]c = new double[Len];
			int i;
			int j;
			int k;
		
			switch(p){
			
			case 0 :   if ( p == 0);
			              int last = a.length-1;
			               for(i = 0;i<a.length-1;i++){
			            	   
			            	   c[i] = b[i+1] - b[i] / a[last] - a[0];
			               }
			           break;
			           
			            
			case 1 : if( p == 1);
			double[]temp = new double[Len];
			int last1 = a.length-1;
			           for(i = 0;i<a.length-1;i++){
			        	   
			        	  temp[i] = b[i+1] - b[i] / a[last1] - a[0];
			           }
			           
			           for(j = 0;j<temp.length-1;j++){
			        	   
			        	   c[j] = temp[j+1] - temp[j] / a[last1] - a[0];
			           }
			          break;
			          
			           
			case 2 : if( p == 2);
			double []temp2 = new double[Len];
			 double[]temp3 = new double[Len];
			 int last2 = a.length-1;
			              for(i = 0;i<a.length-1;i++){
			            	  
			            	  temp2[i] = (b[i+1] - b[i]) / (a[last2] - a[0]);
			              }
			              
			              
			              for(j = 0;j<temp2.length-1;j++){
			            	  
			            	  temp3[j] = (temp2[j+1] - temp2[j]) / (a[last2] - a[0]); 
			              }
			             
			              
			              for(k = 0;k<temp3.length-1;k++){
			            	  
			            	  c[k] = (temp3[k+1] - temp3[k]) / (a[last2] - a[0]);
			              }
			             
			             break;
		}
			return c;
		}
	}
	
	public static double simpleDerivative(double arg,double arg2,double arg3){
		
		double fx = arg;
		double dx = arg2;
		double h = arg3+dx;
		double derivative = (fx+h)-(fx-h)/2*h;
		return derivative;
	}
	
	
	public double SecDeriv(double left,double centre,double right) throws IllegalArgumentException{
		
		double sec_deriv_left,sec_deriv_center,sec_deriv_right,delta;
		sec_deriv_left = left;
		sec_deriv_center = centre;
		sec_deriv_right = right;
		delta = (sec_deriv_right - sec_deriv_left) * (sec_deriv_right - sec_deriv_left);
		
		return ((sec_deriv_right - (2*sec_deriv_center)) + sec_deriv_left) / delta;
				
		
		
			    
			   
	}
	public double dividedDifferenceInterpolation3Points(double[]x,double[]y,double arg){
		
		if(x.length > 3){
			
			return Double.NaN;
		}else if(y.length > 3){
			
			return Double.NaN;
		}else if(arg == 0){
			
			return Double.NaN;
		
		}else{
			long start,end;
			start = System.nanoTime();
			double[]a = x;
			double[]b = y;
			
			double fx = arg;
			double diff1;
			double diff2;
			double diff3;
			double diff4;
			double interpolation;
			diff1 = (b[1] - b[0]) / (a[1]- a[0]);
			diff2 = (b[2] - b[1]) / (a[2] - a[1]);
			diff3 = (diff2-diff1) / (a[2] - a[0]);
			diff4 = fx-a[1];
			interpolation = a[0] + (fx*diff1) + (fx*diff4*diff3);
			end = System.nanoTime();
			System.out.println("running time of dividedDifference() method is: " + (end-start) + " nanoseconds");
			return interpolation;
		}
	}
	
	
	public double lagrangeInterpolationCubic(double[]x,double[]y,double arg){
		
		double lagrange = 0;//must be in scope of method
		if(x.length > 4 || x.length < 4){
			
			return Double.NaN;
			
		}else if( y.length>4 || y.length < 4){
			
			return Double.NaN;
			
		}else if (arg < x[0] || arg > x[3]){
			
			return Double.NaN;
			
		}else if ( x.length > 4){
		          if(y.length > 4)
		        	  
		        	  return Double.NaN;
		}else if ( x.length < 4){
			     if(y.length < 4)
			    	 
			    	 return Double.NaN;
			     
		}else{	     
			 long start,end;
			 start = System.nanoTime(); 
			 double[]a = x;
			 double[]b = y;
			 double fx = arg;
			 double val1;
			 double val2;
			 double val3;
			 double val4;
			 double temp1;
			 double temp2;
			 double temp3;
			 double temp4;
			 double temp5;
			 double temp6;
			 double temp7;
			 double temp8;
			
			 
			 temp1 = (fx - a[1])*(fx - a[2])*(fx - a[3]);
			 temp2 = (a[0] - a[1])*(a[0] - a[2])*(a[0] - a[3]);
			 val1 = temp1/temp2;
			 val1 = val1*b[0];
			 
			 temp3 = (fx - a[0])*(fx - a[2])*(fx - a[3]);
			 temp4 = (a[1] -a[0])*(a[1] - a[2])*(a[1] - a[3]);
			 val2 = temp3/temp4;
			 val2 = val2*b[1];
			 
			 temp5 = (fx - a[0])*(fx - a[1])*(fx - a[3]);
			 temp6 = (a[2] - a[0])*(a[2] - a[1])*(a[2] - a[3]);
			 val3 = temp5/temp6;
			 val3 = val3*b[2];
			 
			 temp7 = (fx - a[0])*(fx - a[1])*(fx - a[2]);
			 temp8 = (a[3] - a[0])*(a[3] - a[1])*(a[3] - a[2]);
			 val4 = temp7/temp8;
			 val4 = val4*b[3];
			
			 lagrange = val1+val2+val3+val4;
			 end = System.nanoTime();
			 System.out.println("running time of lagrangeInterpolationCubic() method is: "+ (end-start)+ "\tnanoseconds");
			
			
		}
		return lagrange;
	}
	
	
	public double[] array1DMul(double[]x,double[]y){
		
		if(x == null)
			return null;
		if(y == null)
			return null;
		
		int Len = x.length;
		assert(x.length == y.length  );
		double[]temp = new double [Len];
		int i;
		
		for(i = 0;i<temp.length;i++){
			
			temp[i] = x[i]*y[i];
		}
		
		return temp;
	}
	
	public double getElement(double[]x,int i){
		
		if(x == null)
			return Double.NaN;
		if(i < 0)
			return Double.NaN;
		
		return x[i];
	}
	
	public double[] array1DScalarMul(double[]x,double s){
		
		if(x == null)
			return null;
		
		int Len = x.length;
		double[]temp = new double[Len];
		int i;
		double val = s;
		for(i = 0;i<temp.length;i++){
			
			temp[i] = x[i]*val;
		}
		
		return temp;
	}
	
	public double[] array1DRandomFill(double x,int seed,int size){
		
		if(seed == 0 || seed < 0)
			
			return null;
		if(size == 0 || size < 0)
			
			return null;
		
		Random rand = new Random(seed);
		double[]temp = new double[size];
		int i;
		
		try{
			 
			for(i = 0;i<temp.length;i++){
				
				temp[i] = rand.nextDouble()*x;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			throw new ArrayIndexOutOfBoundsException("buffer overflow occured");
		}
		return temp;
	}
	
	public double[] subArray(double[] x,int start,int end ){
		 double[]b = null ;
		if(x == null){
			return null;
		}else	if(start < 0){
			return null;
		}else if(end < 0){
			return null;
			
		}else if(start > end || end < start){
			return null;
		}else if(start < 0){
			   if(end < start)
				  
					   return null;
		}else{
			
			     double[]a = x;
			  b   = new double[end - start];
			     
			     try{
			    	 
			    	  for(int i = start;i<end;i++ ){
			    		  
			    		  b[i-start] = a[i];
			    	  }
			     }catch(ArrayIndexOutOfBoundsException e){
			    	 throw new ArrayIndexOutOfBoundsException("array overflow occured");
			     }
		}
			
			return b;
		
		
	}
	
	public double[][] matrixTranspose(double[][]x){
		
		if(x  == null)
			return null;
		
		double[][]a = new double[x.length][x.length];
		int i;
		int j;
		
		for(i = 0;i<a.length;i++){
			for(j = 0; j<a[i].length;j++){
				
				a[j][i] = x[i][j];
			}
		}
		return a;
	}
	
	public double[][] kernelGaussian(double[][]x){
		
		if(x == null)
			return null;
		if(x.length>100)
			return null;
		if(x[0].length>100)
			return null;
		Random rand = new Random(47);
		double[][]gaussian = new double [3][3];
		for(int index = 0;index<gaussian.length;index++){
			for(int index2 = 0;index2<gaussian[index].length;index2++){
				gaussian[index][index2] = 10*rand.nextGaussian();
			}
		}
		int m = gaussian.length;
		int Len = x[0].length*x[0].length;
		double[][]a = new double[x.length][Len];
		int i;
		int j;
		int k;
		float coef = 9.0f;
		
		for(i = 0;i<m;i++){
			for(j = 0;j<a.length;j++){
				for(k = 0;k<a[i].length;k++){
					
					a[i][k] = (x[j][k]+gaussian[i][j])/coef;
				}
			}
		}
		return a;
	}
	
	

	public double[] splineInterpolation(double[]x,double[]y){
		
		double[]c = new double[25];
		
		if(x == null){
			
			return null;
			
		}else if(y == null){
			
			return null;
			
		
		}else  if(x.length < 5 || x.length > 5){
			
			return null;
			
		}else if(y.length < 5 || y.length > 5){
			
			return null;
			
		}else if( x.length <5 || x.length > 5){
			     if(y.length <5  || y.length > 5)
			    	 
			    	 return null;
			     
		}else{
			
			double[]a = x;
			double[]b = y;
			double[]temp = new double[a.length];
			double[]temp2 = new double[a.length];
			double[]temp3 = new double[a.length]; 
			double g;
			double g1;
			double g2;
			double u;
			double u1;
			double u2;
			double d;
			
			
			int i;
			int k;
			
			
			for(i = 0;i<a.length-1;i++)
				
			          temp[i] = a[i+1] - a[i];
			
			g = temp[1]/(temp[0]+temp[1]);
			g1 = temp[2]/(temp[1]+temp[2]);
			g2 = temp[3]/(temp[2]+temp[3]);
			
			u = 1-g;
			u1 = 1-g1;
			u2 = 1-g2;
			
			for(int j = 0;j<temp2.length-1;j++)
				
				temp2[j] = b[j+1] / temp[j];
			
			
			for(k = 0;k<temp3.length-1;k++){
				
				d = 6*(temp2[k+1]-temp2[k])/(temp[k]+temp[k+1]);
				
				temp3[k] = d;
			}
			
			double[][]equation = {{u,2,g},{u1,2,g1},{u2,2,g2}};
					
			
					{
			}
		}
	}
	
	public double polyE1(double x){
		
		if(x < 0)
			
			return 0;
		if(x > 1)
			
			return 0;
		long start,end;
		//start = System.nanoTime();
		double[]coef = { 
				          0.99999193,
				         -0.24991055,
				          0.05519968,
				         -0.00976004,
				          0.00107857
	                	};
		
		double[]arg = new double[coef.length];
		double[]sum = new double[coef.length]; 
		assert(arg == coef);
		assert(sum == coef);
		int i;
		int j;
		int k = 0 ;
		double value = x;
		double small = 2.0*1e-7;
		double result = 0;
		double coef1 = -0.57721566;
		
		for(i = 0;i<arg.length;i++){
			
			++k;
			
			arg[i] = Math.pow(value, k); 
		}
		
		for(j = 0;j<sum.length;j++){
		
			sum[j] = arg[j]*coef[j];
		}
		
		for(int n = 0;n<sum.length;n++){
			
			result+=sum[n];
		}
		result = coef1+result+small;
		end = System.nanoTime();
		System.out.println("running time of polyE1() method is:" + (end-start) + "\tnanoseconds");
		return result;
	}
	
	public double polyE1Exp(double x){
		
		if(x < 1)
			
			return 0;
		long start,end;
		start = System.nanoTime();
		double value = x;
		
		double coef1 = 8.5733287401;
		double coef2 = 18.0590169730;
		double coef3 = 8.6347608925;
		double coef4 = 0.2677737343;
		
		double coef5 = 9.5733223454;
		double coef6 = 25.6329561486;
		double coef7 = 21.0996530827;
		double coef8 = 3.9584969228;
		
		double u = value*value;
		double v = u*u;
		double small = 1.9*1e-8;
		double nom;
		double denom;
		
		nom = v+coef1*u*value+coef2*u+coef3*value+coef4;
		denom = v+coef5*u*value+coef6*u+coef7*value+coef8;
		end = System.nanoTime();
		System.out.println("running time of polyE1Exp() method is:" +(end-start) + "\tnanoseconds");
		return (nom/denom)+small;
	}
	
	public double SiAuxilliaryFunc(double x){
		double sum = 0.0;
		double sum2 = 0.0;
		double result;
		
		if( x == 0){
			return Double.NaN;
		}else if( x < 1  ){
			return Double.NaN;
		}else if(x < 0){
			return Double.NaN;
		}else{
			long start,end;
			start = System.nanoTime();
			double[]coef1 = {335.677320,236.187033,38.027264,1};
			double[]coef2 = {570.236280,322.624911,40.021433,1};
			double[]temp = new double[coef1.length];
			double[]temp2 = new double[coef2.length];
			double[]temp3 = new double[coef2.length];
			double small = 5*1e-7;
			int k = 0;
			
			int exp = 0;
			int i;
			int j;
			int m;
			double term = 1/x;
			double coeff1 =38.102495;
			double coeff2 = 157.105423;
			
			for(i = 0;i<temp.length;i++){
				
				++k;
				exp = k;
				exp = 2*exp;
				temp[i] = Math.pow(x, exp);
				temp2[i] = coef1[i]*temp[i];
				
			}
			
			for(j = 0;j<temp3.length;j++){
				
				temp3[j] = coef2[j]*temp[j];
			}
			for(m = 0;m<temp3.length;m++){
				
				sum = sum+temp2[m];
				sum2 = sum2+temp3[m];
				
			}
			
			sum = term*sum+coeff1;
			sum2 = term*sum2+coeff2;
			result = (sum/sum2)+small;
			end = System.nanoTime();
			System.out.println("running time of siAuxFunc() method is :" + (end-start) + "\tnanoseconds");
		}
		return result;
	}
	
    public double SiSeriesExpansion(double x){
	 long start,end;
	 start = System.nanoTime();
	 double[]array = new double[25];
	 int i;
	 int j;
	 int k = 0;
	 int exp = 0;
	double  factorial = 1;
	 double denom;
	 double sum = 0;
	 double b;
	 double d;
	 double value;
	 int one = -1;
	 int q = 1;
	 
	 for(i = 0;i<array.length;i++){
		 ++k;
		 exp = (2*k)+1;
		 factorial *= ++q;
		 double fact = (2*factorial)+1;
		 denom = exp*fact;
		 d = Math.pow(one, k);
		b= Math.pow(x, exp);
		value = d*b;
		 array[i] = value/denom;
		 
	 }
	 
	for(j = 0;j<array.length;j++){
		
		sum += array[j];
	}
	
	sum = x+sum;
	end = System.nanoTime();
	System.out.println("running time of SiSeriesExpansion() method is : " + (end-start) + "\tnanoseconds");
	
	return sum;
	
 }
		public double CiSeriesExpansion(double x){
			long start,end;
			start = System.nanoTime();
			double euler_const = 0.57721566490153286060;
			int i;
			int j;
			double[]array = new double[20];
			int k = 0;
			int exp = 0;
			double factorial = 1;
			double denom;
			double b;
			double d;
			double sum = 0;
			double value;
			int one = -1;
			double ln;
			double result = 0;
			int q = 1;
			
			
			for(i = 0;i<array.length;i++){
				
				++k;
				exp = 2*k;
				factorial*=++q;
				
				
				denom = factorial*exp;
				b = Math.pow(one, k);
				d = Math.pow(x, exp);
				value = b*d;
				array[i] = value/denom;
				
				
			}
			
			for(j = 0;j<array.length;j++){
				
				sum += array[j];
			}
			
			ln = Math.log(x);
			result = euler_const+ln+sum;
			end = System.nanoTime();
			System.out.println("running time of CiS() method is :" + (end-start) + "\tnanoseconds");
			return result;
			
		}
		
		public double ShiSeriesExpansion(double x){
			long start,end;
			start = System.nanoTime();
			double[]array = new double[20];
			int i;
			int j;
			int k = 0;
			int exp = 0;
			double factorial = 1;
			
			int q = 1;
			double sum = 0;
			
			double value;
			double d;
			double b;
			
			for(i = 0;i<array.length;i++){
				
				++k;
				exp = (2*k)+1;
				factorial *=++q;
				double fact = (2*factorial)+1;
				d = Math.pow(x, exp);
				b = exp*fact;
				value = d/b;
				array[i] = value;
			}
			
			for(j = 0;j<array.length;j++){
				
				sum += array[j];
			}
			end = System.nanoTime();
			System.out.println("running time of ShiExpan() method is :" + (end-start) + "\tnanoseconds");
			return sum;
		}
		
		public double EiIntegralSeriesExpansion(double x){
			
			if(x == 0)
				return Double.NaN;
			if(x < 0)
				return Double.NaN;
			long start,end;
			start = System.nanoTime();
			double euler_const = 0.5772156649;
			double ln;
			double []array = new double[25];
			int i;
			int j;
			double sum = 0;
			double factorial = 1;
			int k = 1;
			int q = 1;
			double denom;
			double d;
			double value;
			double result = 0;
			
			for(i = 0;i<array.length;i++){
				
				++k;
				factorial *=++q;
				
				denom = k*factorial;
				d = Math.pow(x, k)/denom;
				
				array[i] = d;
				
			}
			
			for(j = 0;j<array.length;j++){
				
				sum += array[j];
				
			}
			
			
			ln = Math.log(x);
			result = euler_const+ln+x+sum;
			end = System.nanoTime();
			System.out.println("running time of EiSerExp() method is :" + (end-start) + "\tnanoseconds");
			
			return result;
		}
		
		public double GammaStirlingApprox(double x){
			
			double sum = 0;
			double result = 0;
			
			if(x > Double.MAX_VALUE){
				return Double.NaN;
			}else{
				long start,end;
				start = System.nanoTime();
				
				double ln;
				double pow;
				double pi_sqrt;
				double two_pi = 2* Math.PI;
				double []coef = {12.0,288.0,51840.0,2488320.0,209018880.0,75246796800.0,902961561600.0,86684309913600.0
				};
				double[]coef2 = {1.0,1.0,139.0,571.0,163879.0,5246819.0,534703531.0,4483131259.0};
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				int i;
				int j;
				int k = 0;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					array[i] = Math.pow(x, k);
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = array[j]*coef[j];
					array2[j] = coef2[j]/array2[j];
				}
				
			
				
				ln = Math.exp(-x);
				pow = Math.pow(x, x-0.5);
				pi_sqrt = Math.sqrt(two_pi);
				sum = ln*pow*pi_sqrt;
				result = 1+array2[0]+array2[1]-array2[2]-array2[3]+array2[4]+array2[5]-array2[6]-array2[7];
				
				end = System.nanoTime();
				//System.out.println("running time of GammaStirling() method is :" + (end-start) + "\tnanoseconds");
			}
			return sum*result;
		}
		
		public double GammaPolyApprox(double x){
			
			double sum = 0;
			double result = 0;
			int one = 1;
			double small = 3*1e-7;
			
			if( x < 0){
				return Double.NaN;
			}else if(x > 1){
				return Double.NaN;
			}else{
				
				double[]coef = { -0.577191625,
						          0.988205891,
						          -0.897056937,
						          0.918206857,
						          -0.756704078,
						          0.482199394,
						          -0.193527818,
						          0.035868343
				};
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				int i;
				int j;
				
				
				int k = 0;
				
				for( i = 0;i<array.length;i++){
					
					++k;
					array[i] = Math.pow(x, k);
					array2[i] = array[i]*coef[i];
					
					
				}
				
				for(j = 0;j<array2.length;j++){
					
					sum += array2[j];
				}
				
			}
			
			return one+sum+small;
		}
		
		public double ReciprocalGamma(double x){
			
			double small = 1*1e-30;
			double value = 0;
			
			if(x == Double.MAX_VALUE || x > Double.MAX_VALUE){
				return Double.NaN;
				
			}else if(x < small || x == small){
				return Double.NaN;
				
			}else if(x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
				   
				value = this.GammaStirlingApprox(x);
				
			}
			
			return 1/value;
		}
	
		public double LogGammaApprox(double x){
			
			double sum = 0;
			double result = 0;
			
			if( x > Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else {	
				double twopi = 2*Math.PI;
				double ln;
				double lnpi;
				double zmin;
				double zplus;
				double[]coef = {12,360,1260,1680,1180,521};
						        
						        
				
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length]; 
				int i;
				int j;
				int k = -1;
				int exp = 0;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = (2*k)+1;
					array[i] = Math.pow(x, exp);
					
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = array[j]*coef[j];
					array2[j] = 1/array2[j];
					
				}
				ln = Math.log(x);
				lnpi = Math.log(twopi);
				zmin = x-0.5d;
				
				sum = (zmin*ln-x)+(0.5*lnpi) +array2[0]-array2[1]+array2[2]-array2[3]+array2[4]-array2[5] ;
				
			}
			
			return sum;
		}
		
		public double PsiAsymptoticApprox(double x){
			
			double sum = 0;
			
			double small = 1*1e-30;
			double value = 0;
			
			double ln;
			double halfx = 1/(2*x);
			double term;
			
			if( x >Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if (x == small || x < small){
				return Double.NaN;
			
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){	
				return Double.NaN;
				
				
			}else{	
				double[]coef = {12,120,252,240,660,32760,84,8160};
				double[]coef2 = {1,1,1,1,5,691,7,3617};		      
						       
						       
						       
				
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				
				int k = 0;
				int exp = 0;
				int i;
				int j;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = 2*k;
					value = Math.pow(x, exp);
					array[i] = value;
				
					
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = array[j]*coef[j];
					array2[j] = coef2[j]/array2[j];
				}
				
				ln = Math.log(x);
				term = halfx;
				sum = ln-term-array2[0]+array2[1]-array2[2]+array2[3]-array2[4]+array2[5]-array2[6]+array2[7];
				
			}
			
			return sum;
			
			
			}
	
		
		public double TriGamma(double x){
			
			double sum = 0;
			double small = 1*1e-30;
			double value = 0;
			
			if(x > Math.PI){
				return Double.NaN;
				
			}else if(x == small || x < small){
				return Double.NaN;
				
			}else{
				
				double term = 1/x;
				double sqr = x*x;
				double term2 =1/(2*sqr);
				double[]coef = {
						        6,
						        30,
						        42,
						        30,
						        66
						       
						       
				};
				int Len = coef.length;
				double[]array = new double[Len];
				double[]array2 = new double[Len];
				int i,j;
				int k = 0;
				int exp = 0;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = (2*k)+1;
					value = Math.pow(x, exp);
					array[i] = value;
					
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = (array[j]*coef[j]);
					array2[j] = 1/array2[j];
					
					
				}
				
				sum = term+term2+array2[0]-array2[1]+array2[2]-array2[3]+array2[4];
				
			}
			
			return sum;
		}
		
		public double TetraGamma(double x){
			
			double sum = 0;
			double small = 1*1e-30;
			double value = 0;
			
			if(x == Double.MAX_VALUE || x > Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x == small || x < small){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
			
				
				double sqr = x*x;
				double term = 1/sqr;
				double term2 = 1/(sqr*x);
				double[]coef = {2,6,6,10,6};
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				int i,j;
				int k = 1;
				int exp = 0;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = 2*k;
					value = Math.pow(x, exp);
					array[i] = value;
					
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = (array[j]*coef[j]);
					
					
				}
				double term3;
				double term4;
				double term5;
				double term6;
				double term7;
				term3 = 1/array2[0];
				term4 = 1/array2[1];
				term5 = 1/array2[2];
				term6 = 3/array2[3];
				term7 = 5/array2[4];
				
				sum = -term-term2-term3+term4-term5+term6-term7;
				
				
			}
			return sum;
				
			
			
		}
		
		public double PentaGamma(double x){
			
			double sum = 0;
			double small = 1*1e-30;
			
			if(x > Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else if(x < small || x == small){
				return Double.NaN;
				
			}else{
				
				int[]coef = {2,2,1,4,3,10};
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				double u = x*x;
				double v = u*u;
				double term = 3/v;
				int i,j;
				int k = 0;
				int exp = 0;
				double value = 0;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = (2*k)+1;
					value = Math.pow(x, exp);
					array[i] = value;
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = coef[j]/array[j];
				}
				
				sum = array2[0]+term+array2[1]-array2[2]+array2[3]-array2[4]+array2[5];
			}
			
			return sum;
		}
		
		public double ErfRatApprox(double x){
			
			double sum = 0;
			double result = 0;
			double small = 1.5*1e-7;
			
			if(x < 0){
				return Double.NaN;
				
			}else if(x > Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
				
				 double t;
				 double value = 0;
				 double v = x*x;
				 int one = 1;
				 double p = 0.3275911;
				 double[]coef = {0.254829592,-0.284496736,1.421413741,-1.453152027,1.061405429};
				 double[]array = new double[coef.length];
				 double[]array2 = new double[coef.length];
				 int k = 0;
				 int i,j;
				 double exp;
				 double u = p*x;
				 t = 1/(1+u);
				 
				 for(i = 0;i<array.length;i++){
					 
					 ++k;
					 value = Math.pow(t, k);
					 array[i] = value;
					 
				 }
				 for(j = 0;j<array2.length;j++){
					 
					 array2[j] = coef[j]*array[j];
					 sum += array2[j];
				 }
				 
				 exp = Math.exp(-v);
				 result = one-(sum*exp)+small;
				
			}
			return result;
		}
		
		public double ErfSeriesApprox(double x){
			
			double sum = 0;
			double result = 0;
			double pi_sqr;
			double term = 0;
		
			if( x > 2){
				return Double.NaN;
				
			}else if( x < -2){
				return Double.NaN;
				
			}else{
				
				  
				  int one = -1;
				  int k = 0;
				  int exp = 0;
				  double a;
				  double b;
				  double[]array = new double[12];
				  double factorial = 1;
				  int q = 0;
				  int i,j ;
				  double nom;
				  double denom;
				  
				  for(i = 0;i<array.length;i++){
					  
					  ++k;
					  exp = (2*k)+1;
					  a = Math.pow(one, k);
					  b = Math.pow(x, exp);
					  nom = a*b;
					  factorial *=++q;
					  denom = factorial*exp;
					  result = nom/denom;
					  array[i] = result;
					 
					  
				  }
				  
				  for(j = 0;j<array.length;j++){
					  
					  sum += array[j];
					  System.out.println("array" + array[j] + " ");
				  }
				  
				  pi_sqr = Math.sqrt(Math.PI);
				  pi_sqr = 2/pi_sqr;
				 
				  
				  term = x+sum;
				  
			}
			 if(x == -x)
				 return -pi_sqr*term;
			return pi_sqr*term;
			
			
		}
		
		public double Erfc(double x){
			
			double sum = 0;
			
			if( x > 2){
				return Double.NaN;
				
			}else if(x < -2){
				return Double.NaN;
				
			}else{
				
				
				sum = this.ErfSeriesApprox(x);
			}
			
			return 1-sum;
		}
		
		public double ErfcSeriesApprox(double x){
			
			double sum = 0;
			double term = 0;
			
			if(x > Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else if( x < 2.700){
				return Double.NaN;
				
			}else{	
				double exponential;
				double piterm;
				int one = -1;
				int k = 0;
				double sqr = 2*x*x;
				double doubfactorial = 1;
				double a;
				double b;
				double value = 0;
				double nom;
				double denom;
				double[]array = new double[12];
				int i,j;
				long q = 0;
				
				
				for(i = 0;i<array.length;i++){
					
					++k;
					a = Math.pow(one, k);
					++q;
					double exp = (2*q)+1;
					doubfactorial *= exp;
					b = doubfactorial;
					nom = a*b;
					denom = Math.pow(sqr, k);
					value = nom/denom;
					array[i] = value;
					System.out.println("b \t" + b + "denom \t" + denom+"array \t" + array[i] + " ");
					
				}
				
				for(j = 0;j<array.length;j++){
					
					sum += array[j];
					System.out.println("sum \t" + array[j] + " ");
				}
				double arg = x*x;
				exponential = 1/Math.exp(arg);
				piterm = Math.sqrt(Math.PI);
				piterm = x*piterm;
				
				 term = exponential/piterm;
				 System.out.println("term \t" + term + "exponenet \t" + exponential + "piterm" + piterm);
			}
			
			return term*1-sum; 
		}
		
		
		
		public double InverseErfSeriesApprox(double x){
			
			double sum = 0;
			double result;
			
			if(x > 1){
				return Double.POSITIVE_INFINITY;
				
			}else if( x < -1){
				return Double.NEGATIVE_INFINITY;
				
			}else{
				  
				double[]coef = {0.33333333333333333333333333333333,
					         	0.23333333333333333333333333333333,
					         	0.2015873015873015873015873015873,
					         	0.19263668430335097001763668430335,
					         	0.19532547699214365881032547699214,
					         	0.20593586454697565808676919788031,
					         	0.22320975741875212774683674154574,
					         	0.24697023314275492924730397497282,
					         	0.27765382560322399480934889900295,
					         	0.31614262355311719556009431370449,
					         	0.36371758703969220002632916638902,
					         	
				};
				double[]array = new double[coef.length];
				double[]array2 = new double[coef.length];
				int i,j;
				int k = 0;
				int exp = 0;
				double value = 0;
				double up = 2*x;
				double lo = Math.sqrt(Math.PI);
			    result = up/lo;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = (2*k)+1;
					value = Math.pow(result, exp);
					array[i] = value;
					System.out.println("exp \t" + exp);
				}
				
				for(j = 0;j<array2.length;j++){
					
					array2[j] = array[j]*coef[j];
					sum += array2[j];
				}
				
			}
				return x+sum;
		}
		
		public double FresnelSIntegral(double x){
			
			double sum = 0;
			
			if( x < 0){
				return Double.NaN;
				
			}else if( x > Double.MAX_VALUE){
				return Double.NaN;
				
			}else if(x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL){
				return Double.NaN;
				
			}else if( x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
				  
				int one = -1;
				int a;
				double b;
				long k = -1;
				long exp = 0;
				double halfpi = Math.PI/2;
				double exp2 = 0;
				double nom;
				double denom;
				double value = 0;
				int i,j;
				double c;
				
				double[]temp ={1.0,6.0,120.0,5040.0,362880.0,39916800.0,6227020800.0,1307674368000.0,355687428096000.0,121645100408832000.0,51090942171709440000.0,25852016738884976640000.0,15511210043330985984000000.0,10888869450418352160768000000.0,8841761993739701954543616000000.0,8.22283865417792281772556288e+33,8.68331761881188649551819440128e+36};
				double[]array = new double[temp.length];
				
				for( i = 0;i<array.length;i++){
					++k;
					exp = (4*k)+3;
					exp2 = (2*k)+1;
					a = (int) Math.pow(one, k);
					b = Math.pow(x, exp);
					c = Math.pow(halfpi, exp2);
					nom = a*b*c;
					
					
					denom = exp*temp[i];
					value = nom/denom;
					array[i] = value;
					System.out.println("exp \t" + exp + "denom \t"+ denom);
				}
				
				for(j = 0;j<array.length;j++){
					
					sum += array[j];
				}
				
			}
			
			return sum;
		}
		
		public double FresnelCIntegral(double x){
			
			double sum = 0;
			
			if( x < 0){
				return Double.NaN;
				
			}else if(x > Double.MAX_VALUE){
				return Double.NaN;
				
			}else if( x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if(x < Double.MIN_NORMAL){
				return Double.NaN;
				
			}else if( x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
				
				double halfpi = Math.PI/2;
				int one = -1;
				int a;
				long k = 0;
				double[]temp = {2.0,
						        24.0,
						        720.0,
						        40320.0,
						        3628800.0,
						        479001600.0,
						        87178291200.0,
						        20922789888000.0,
						        6402373705728000.0,
						        2432902008176640000.0,
						        1124000727777607680000.0,
						        620448401733239439360000.0,
						        403291461126605635584000000.0,
						        304888344611713860501504000000.0,
						        2.6525285981219105863630848e+32
						        
						        
				};
				double[]array = new double[temp.length];
				long exp = 0;
				double b;
				double nom;
				double denom;
				double value = 0;
				double exp2 = 0;
				double c;
				int i,j;
				
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = 2*k;
					a = (int)Math.pow(one, k);
					exp2 = (4*k)+1;
					b = Math.pow(x, exp2);
					c = Math.pow(halfpi, exp);
					nom = a*b*c;
					denom = exp2*temp[i];
					value = nom/denom;
					array[i] = value;
					System.out.println("exp \t" + exp +"exp2 \t" + exp2+ "a " + a);
				}
				
				for(j = 0;j<array.length;j++){
					
					sum += array[j];
				}
			}
			
			return x+sum;
		}
		
		public double FresnelAuxFuncF(double x){
			
			double sum = 0;
			
			
			if( x < 0){
				return Double.NaN;
				
			}else if( x < Double.MIN_NORMAL || x == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else if( x > Double.MAX_VALUE || x == Double.MAX_VALUE){
				return Double.NaN;
				
			}else{
				 
				 double coef1 = 0.926;
				 double coef2 = 1.792;
				 double coef3 = 3.104;
				 double v = x*x;
				 
				 double nom;
				 double denom;
				 nom = 1+(coef1*x);
				 denom = 2+(coef2*x)+(coef3*v);
				 sum = nom/denom;
				 
				
			}
			return sum;
		}
		
		public double FresnelAuxFuncG(double x){
			
			double sum = 0;
			double small = 0.501*1e-3;
			
			if(x < 0){
				return Double.NaN;
				
			} else if(Math.abs(x) > Double.MAX_VALUE || Math.abs(x) == Double.MAX_VALUE){
				return Double.NaN;
				
			}else if(Math.abs(x) < Double.MIN_NORMAL || Math.abs(x) == Double.MIN_NORMAL){
				return Double.NaN;
				
			}else{
				 
				double coef1 = 4.142;
				double coef2 = 3.492;
				double coef3 = 6.670;
				double u = x*x;
				double v = x*u;
				double nom = 1;
				double denom;
				denom = 2+(coef1*x)+(coef2*u)+(coef3*v);
				sum = nom/denom;
			}
			
			return sum+small;
		}
		
		public double BesselJ0(double x){
			
			double sum = 0;
			double result = 0;
			
			if(x <= -3 || x <= 3){
				
				double third = x/3;
				int k = 0;
				int exp = 0;
				int i,j;
				
				double[]coef = {-2.2499997,
						        1.2656208,
						        -0.3163866,
						        0.0444479,
						        -0.0039444,
						        0.0002100
				};
				double[]array = new double[coef.length];
				double small = 4.5*1e-8;
				double b = 0;
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = 2*k;
					b = Math.pow(third, exp);
					array[i] = b;
					array[i] = array[i]*coef[i];
					System.out.println("exp \t" + exp +"array \t" + array[i] + " ");
					
				}
				for(j = 0;j<array.length;j++){
					
					sum += array[j];
				}
			sum =	sum+small;
			
			return 1+sum;
		
		}else if(x > 3.0 || x < Double.MAX_VALUE){
			    double sqr = Math.sqrt(x);
			    sqr = 1/sqr;
			    double f = 0;
			    double cos = 0;
			    double theta = 0;
			    double three = 3.0/x;
			    double term = 0.79788456;
			    double term2 = 0.78539816;
			    double[]coef2 = {-0.00000077,
			    		         -0.00552740,
			    		        - 0.00009512,
			    		         0.00137237,
			    		         -0.00072805,
			    		         0.00014476
			    		         
			    };
			    double[]coef3 = {-0.04166397,
			    		         -0.00003954,
			    		         0.00262573,
			    		         -0.00054125,
			    		         -0.00029333,
			    		         0.00013558
			    		          
			    };
			    
			    double c = 0;
			    double d = 0;
			    double three2 = 3.0/x;
			    double small = 1.5*1e-8;
			   
			    c = three*coef2[0]+three*(coef2[1]+three*(coef2[2]+three*(coef2[3]+three*(coef2[4]+three*(coef2[5])))));
			    d = three2*coef3[0]+three2*(coef3[1]+three2*(coef3[2]+three2*(coef3[3]+three2*(coef3[4]+three2*(coef3[5])))));
			    System.out.println("c \t" + c + "d \t" + d);
			    f = term - c;
			    theta = x-term2-d;
			    cos = Math.cos(theta);
			    
			    result = sqr*f*cos;
			    System.out.println("sqr \t" + sqr +"f \t" + f + "cos \t" + cos);

			   
			   
			   
			   
			   
			  
		}
			   return result;
		}
		
		
		public double BesselY0(double x){
			
			double sum = 0;
			double result = 0;
			double result2 = 0;
			
			if(x >= 0 && x <= 3){
				
				double twopi;
				double ln;
				double halfx;
				double besselj0;
				double term = 0.36746691;
				double third = x/3.0;
				double[]coef = {0.60559366,
						       -0.74350384,
						        0.25300117,
						       -0.04261214,
						        0.00427916,
						       -0.00024846 
				};
				double small = 1.3*1e-8;
				int i,j;
				int k = 0;
				int exp = 0;
				double[]array = new double[coef.length];
				double a;
				double b;
				for(i = 0;i<array.length;i++){
					
					++k;
					exp = 2*k;
					a = Math.pow(third, exp);
					array[i] = a;
					array[i] = (array[i]*coef[i]);
				}
				for(j = 0;j<array.length;j++){
					sum += array[j];
				}
				
				twopi = 2/Math.PI;
				halfx = x/2.0;
				ln = Math.log(halfx);
				besselj0 = this.BesselJ0(x);
				b = term+sum;
				result = twopi*ln*besselj0+b;
				System.out.println("besselj \t" + besselj0);
				
			
			return result;
			
		}else if(x > 3.0 && x < Double.MAX_VALUE){
			    
			double sqrt;
			double f = 0;
			double term = 0;
			double theta = 0;
			double term2 = 0;
			double sin = 0;
			double[]coef2 = {-0.00000077,
					         -0.00552740, 
					         -0.00009512,
					          0.00137237,
					          -0.00072805,
					          0.00014476
			};
			double[]coef3 = {-0.04166397,
					         -0.00003954,
					         0.00262573,
					         -0.00054125,
					         -0.00029333,
					         0.00013558
			};
			double small2 = 5*1e-8;
			double c = 0;
			
			double d = 0;
			double threex = 3.0/x;
			double threex2 = 3.0/x;
			sqrt = Math.sqrt(x);
			sqrt = 1/sqrt;
			
			c = threex*coef2[0]+threex*(coef2[1]+threex*(coef2[2]+threex*(coef2[3]+threex*(coef2[4]+threex*(coef2[5])))));
			d = threex2*coef3[0]+threex2*(coef3[1]+threex2*(coef3[2]+threex2*(coef3[3]+threex2*(coef3[4]+threex2*(coef3[5])))));
			term = 0.79788456;
			term2 = 0.78539816;
			f = term-c;
			theta = x-term2-d;
			sin = Math.sin(theta);
			result2 = sqrt*f*sin;
			System.out.println("sqrt \t" + sqrt +" f \t" + f +"sin \t" + sin);
			
			
			
		}
			return result2;
			
		}
		
		public double BesselJ1(double x){
			//taken from "Numerical Recipes in C".
			double sum = 0;
			double result = 0;
			
			
			
			if(  x <= 3.0){
				double y = x*x;
				double poly;
				double poly2;
				poly = x*(72362614232.0+y*(-7895059235.0+y*(242396853.1+y*(-2972611.439+y*(15704.48260+y*(-30.16036606))))));
				poly2 = 144725228442.0+y*(2300535178.0+y*(18583304.74+y*(99447.43394+y*(376.9991397+y*1.0))));
				sum = poly/poly2;
				
				return sum;
				
			}else if( x > 3.0 || x < Double.MAX_VALUE){
				   //Handbook  of Mathematical Functions.
				double sqrt = 0;
				double theta = 0;
				double f = 0;
				double term;
				double term2;
				double cos = 0;
				double threeonx = 3.0/x;
				double threeonx2 = 3.0/x;
				double[]coef2 = {0.00000156,
						         0.01659667,
						         0.00017105,
						         -0.00249511,
						         0.00113653,
						         -0.00020033
				};
				double[]coef3 = {0.12499612,
						         0.00005650,
						         -0.00637879,
						         0.00074348,
						         0.00079824,
						         -0.00029166,
				};
				double c = 0;
				double d = 0;
				
				c = threeonx*coef2[0]+threeonx*(coef2[1]+threeonx*(coef2[2]+threeonx*(coef2[3]+threeonx*(coef2[4]+threeonx*(coef2[5])))));
				d = threeonx2*coef3[0]+threeonx2*(coef3[1]+threeonx2*(coef3[2]+threeonx2*(coef3[3]+threeonx2*(coef3[4]+threeonx2*(coef3[5])))));
				term = 0.79788456;
				term2 = 2.35619449;
				f = term+c;
				theta = x-term2+d;
				cos = Math.cos(theta);
				sqrt = Math.sqrt(x);
				sqrt = 1/sqrt;
				result = sqrt*f*cos;
				
			}
		         return result;
		}
		
		public double BesselY1(double x){
			
			double sum = 0;
			
			if(x < 3.0){
				return Double.NaN;
				
			}else{
				
				   double sqrt ;
				   double f ;
				   double theta;
				   double sine;
				   double term = 0.79788456;
				   double term2 = 2.35619449;
				   double threex = 3.0/x;
				   double threex2 = 3.0/x;
				   double a = 0;
				   double b = 0;
				   double[] coef ={0.00000156,
						           0.01659667,
						           0.00017105,
						           -0.00249511,
						           0.00113653,
						           -0.00020033
				   };
				   double[]coef2 = {0.12499612,
						            0.00005650,
						            -0.00637879,
						            0.00074348,
						            0.00079824,
						            -0.00029166
				   };
				   sqrt = Math.sqrt(x);
				   sqrt = 1/sqrt;
				   a = threex*coef[0]+threex*(coef[1]+threex*(coef[2]+threex*(coef[3]+threex*(coef[4]+threex*(coef[5])))));
				   b = threex2*coef2[0]+threex2*(coef2[1]+threex2*(coef2[2]+threex2*(coef2[3]+threex2*(coef2[4]+threex2*(coef2[5])))));
				   f = term+a;
				   theta = x-term2+b;
				   sine = Math.sin(theta);
				   sum = sqrt*f*sine;
				   
			}
			
			return sum;
		}
		
		public double Bessel2Y1(double x){
			
			double sum = 0;
			
			if( x < 0.0 ||  x > 3.0){
				return Double.NaN;
				
			}else{
				 double y = x*x;
				 double twonpi = 2.0/Math.PI;
				 double besselJ1;
				 double ln;
				 double arg = 1.0/x;
				 double[]coef = {-0.4900604943e13,
						          0.1275274390e13,
						          -0.5153438139e11,
						          0.7349264551e9,
						          -0.4237922726e7,
						          0.8511937935e4
				 };
				 double[]coef2 = {0.2499580570e14,
						          0.4244419664e12,
						          0.3733650367e10,
						          0.2245904002e8,
						          0.1020426050e6,
						          0.3549632885e3
				 };
				 double poly;
				 double poly2;
				 poly = x*(coef[0]+y*(coef[1]+y*(coef[2]+y*(coef[3]+y*(coef[4]+y*coef[5])))));
				 poly2 = coef2[0]+y*(coef2[1]+y*(coef2[2]+y*(coef2[3]+y*(coef2[4]+y*(coef2[5]+y)))));
				 besselJ1 = this.BesselJ1(x);
				 ln = Math.log(x);
				 sum = (poly/poly2)+twonpi*(besselJ1*ln-arg);
				 
				  
			}
			return sum;
		}
		
		public double BesselI0(double x){
			double sum = 0;
			
			if(x < 0.0){
				return Double.NaN;
				
			}else{
				   double arg = x*x;
				   arg = arg/4.0;
				   double nom;
				   double denom;
				   double k = 0;
				   double[]array = new double[10];
				   long q = 0;
				   long fact = 1;
				   int i;
				   double value = 0;
				   long arg2;
				   for(i = 0;i<array.length;i++){
					   
					   ++k;
					   nom = Math.pow(arg, k);
					  
					   fact *=++q;
					   arg2 = fact;
					   denom = Math.pow(arg2, 2.0);
					   value = nom/denom;
					   array[i] = value;
					   
				   }
				   for(int j = 0;j<array.length;j++){
					   
					   sum += array[j];
				   }
				   
				   
			}
			
			return 1+sum;
				
		}
		
		public double BesselK0(double x){
			double sum = 0;
			double result = 0;
			
			
			if(x < 0){
				return Double.NaN;
				
			}else{
				
				 double ln;
				 double econst = 0.57721566490153286060651209008240243104215933593992;
				 double arg = x*x;
				 arg = arg/4.0;
				 double arg2 = x/2.0;
				 double besselI0;
				 double nom;
				 double denom;
				 double value = 0;
				 double[]coef = {1.0,1.5,1.8333333,
						         2.08333,2.28333333,
						         2.4499999666666666666666666666667,
						         2.5928571095238095238095238095238,
						         2.7178571095238095238095238095238,
						         2.8289682206349206349206349206349,
						         2.9289682206349206349206349206349
				 };
				double[]array = new double[coef.length];
				double a;
				int i,j;
				long k = 0;
				long fact = 1;
				long q = 0;
				double term;
				for(i = 0;i<array.length;i++){
					
					++k;
					nom = Math.pow(arg, k);
					nom = nom*coef[i];
					fact *=++q;
					denom = Math.pow(fact, 2.0);
					a = denom;
					value = nom/a;
					array[i] = value;
					System.out.println("k \t" + k + " fact \t" + fact + "denom \t" + denom);
					
				}
				for(j = 0;j<array.length;j++){
					
					sum += array[j];
				}
				System.out.println("sum \t" + sum);
				ln = Math.log(arg2);
				System.out.println("ln \t" + ln);
			
				System.out.println("-ln " + ln);
				besselI0 = this.BesselI0(x);
				System.out.println("bes \t" + besselI0);
				term = -(ln+econst)*besselI0;
				System.out.println("term \t" + term);
				 result = term+sum;
			}
			
			return result;
		}
		
		public double BesselI1(double x){
			double sum = 0;
			
			if( Math.abs(x) < 3.75){
				
				double t = x/3.75;
				t = t*t;
				double oneonx = 1/x;
				double[]coef = {0.87890594,
						        0.51498869,
						        0.15084934,
						        0.02658733,
						        0.00301532,
						        0.00032411
				};
				double term;
				term = t*coef[0]+t*(coef[1]+t*(coef[2]+t*(coef[3]+t*(coef[4]+t*(coef[5])))));
				sum = 0.5+term;
				sum = sum/oneonx;
				return sum;
				
				
			}else if(Math.abs(x) > 3.75 || Math.abs(x) < Double.MAX_VALUE){
				double t = 3.75/x;
				double sqrt;
				double exp;
				double term = 0.39894228;
				double a;
				double[]coef1 = {0.03988024,
						        -0.00362018,
						        0.00163801,
						        -0.01031555,
						        0.02282967,
						       - 0.02895312,
						        0.01787654,
						        -0.00420059
				};
				double poly;
				poly = t*coef1[0]+t*(coef1[1]+t*(coef1[2]+t*(coef1[3]+t*(coef1[4]+t*(coef1[5]+t*(coef1[6]+t*(coef1[7])))))));
				a = term-poly;
				sqrt = Math.sqrt(x);
				exp = Math.exp(x);
				exp = exp/sqrt;
				sum = exp*a;
			}
			
			return sum;
		}
		
		public double BesselK1(double x){
			
			double sum = 0;
			double sum2 = 0;
			
			if(x < 0){
				return Double.NaN;
				
			}else if(Math.abs(x) < 2.0){
				  
				double half = x/2.0;
				double ln;
				double besselI1;
				double arg = half*half;
				double[]coef = {0.15443144,
						        -0.67278579,
						        -0.18156897,
						        -0.01919402,
						        -0.00110404,
						        -0.00004686
						        
				};
				double poly;
				ln = Math.log(half);
				besselI1 = this.BesselI1(x);
				poly = arg*coef[0]+arg*(coef[1]+arg*(coef[2]+arg*(coef[3]+arg*(coef[4]+arg*(coef[5])))));
				sum = (ln*besselI1)+(1/x)+poly;
				
				return sum;
				
			}else if(Math.abs(x) > 2.0 || Math.abs(x) < Double.MAX_VALUE){
				double sqrt;
				double exp;
				double t = 2.0/x;
				double term = 1.25331414;
				double[]coef2 = {0.23498619,
						        -0.03655620,
						        0.01504268,
						        -0.00780353,
						        0.00325614,
						        -0.00068245
				};
				double poly;
				double a;
				poly = t*coef2[0]+t*(coef2[1]+t*(coef2[2]+t*(coef2[3]+t*(coef2[4]+t*(coef2[5])))));
				sqrt = Math.sqrt(x);
				exp = Math.exp(-x);
				a = term+poly;
				sum2 = (exp/sqrt)*a;
			}
				return sum2;
			}
	
		
	public double BesselK(int n,double x){
		double sum = 0;
		double besselK1;
		
		if(n < 0){
			return Double.NaN;
			
		}else if( x< 0){
			return Double.NaN;
			
		}else{
			 
			double arg = 2.0/x;
			int j;
			double besselK0;
			
			besselK0 = this.BesselK0(x);
			besselK1 = this.BesselK1(x);
			for(j = 1;j<n;j++){
				sum = j*arg*besselK1+besselK0;//EXAMPLE OF RECURRENT FORMULA
				
				besselK0 = besselK1;
				besselK1 = sum;
				
				System.out.println("sum \t" + sum +"besselk0 \t" + besselK0+"besselk1 \t"+ besselK1);
			}
		}
		return besselK1;
	}
	
	public double BesselY(int n,double x){
		double sum = 0;
		double besselY1 = 0;
		double sum2 = 0;
		double bessel2Y1 = 0;
		
		if( n < 2){
			return Double.NaN;
			
		}else if(x < 0){
			return Double.NaN;
			
		}else if( x < 3.0){
			  double arg = 2.0/x;
			  int i;
			  double besselY0 = this.BesselY0(x);
			  besselY1 = this.Bessel2Y1(x);
			  System.out.println("by1 \t" + besselY1);
			  for(i = 1;i<n;i++){
				  
				  sum = i*arg*besselY1-besselY0;
				  besselY0 = besselY1;
				  besselY1 = sum;
				  System.out.println("sum \t" + sum + "beY0 \t" +besselY0 + "beY1 \t" + besselY1);
			  }
			  
		
		
		return besselY1;
	}else if( x > 3.0){
		     int j;
		     double arg2 = 2.0/x;
		     double bessel2Y0;
		     bessel2Y0 = this.BesselY0(x);
		     bessel2Y1 = this.BesselY1(x);
		     for(j = 1;j<n;j++){
		    	 
		    	 sum2 = j*arg2*bessel2Y1-bessel2Y0;
		    	 bessel2Y0 = bessel2Y1;
		    	 bessel2Y1 = sum2;
		     }
		   
	}
		
		return bessel2Y1;
		
		     
	}
	
	public double Ber0(double x){
		
		   double sum = 0;
		   double sum2 = 0;
		   double result = 0;
		   
		   if( x <= -8.0f){
			   return Double.NaN;
			   
		   }else if(x > -8.0f && x<0.0f){
			   
			   double[]coef = {-64.0,
					           113.77777,
					           -32.36345,
					           2.64191397,
					           -0.08349609,
					           0.0012252,
					           -0.00000901
					           
			   };
			   double arg2,error,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10;
			   error = 0.9*10e-9;
			   arg2 = x/8.0;
			   arg3 = arg2*arg2;//x^2
			   arg4 = arg3*arg3;//x^4
			   arg5 = arg4*arg4;//x^8
			   arg6 = arg5*arg4;//x^12
			   arg7 = arg6*arg4;//x^16
			   arg8 = arg7*arg4;//x^20
			   arg9 = arg8*arg4;//x^24
			   arg10 = arg9*arg4;//x^28
			   sum2 = arg4*coef[0]+arg5*coef[1]+arg6*coef[2]+arg7*coef[3]+arg8*coef[4]+arg9*coef[5]+arg10*coef[6];
			   result = 1+sum2+error;
			   
			  
			   System.out.println("inside -8 routine");
			   return result;
			   
		   }else if(x >= 0.0f && x <= 8.0f) {  
			    
			     double t = x*x;
			     double arg = t/4.0;
			     double nom;
			     double denom;
			     double val = 0;
			     long k = 0;
			     double b;
			     long exp = 0;
			     double[]coef = {2.0,
			    		         24.0,
			    		         720.0,
			    		         40320.0,
			    		         3628800.0,
			    		         479001600.0,
			    		         87178291200.0,
			    		         20922789888000.0,
			    		         6402373705728000.0,
			    		         2432902008176640000.0
			     };
			     double[]array = new double[coef.length];
			     int i,j;
			     int one = -1;
			     int a;
			     for(i = 0;i<array.length;i++){
			    	 ++k;
			    	 a = (int) Math.pow(one, k);
			    	 exp = 2*k;
			    	 b = Math.pow(arg, exp);
			    	 nom = a*b;
			    	 denom = Math.pow(coef[i], 2.0);
			    	 val = nom/denom;
			    	 array[i] = val;
			    	 
			     }
			     System.out.println("inside +8 routine");
			     for(j = 0;j<array.length;j++){
			    	 sum += array[j];
			     }
			      
			   
		   }
		   
		   return 1+sum;
	}
	
	public double Beta(double x,double y){
		
		double result = 0;
		double gamma_x;
		double gamma_y;
		double gamma_xy;
		double arg_xy = x+y;
		gamma_x = this.GammaStirlingApprox(x);
		gamma_y = this.GammaStirlingApprox(y);
		gamma_xy = this.GammaStirlingApprox(arg_xy);
		result = (gamma_x*gamma_y)/gamma_xy;
		
		return result;
	}
	public double Bei0(double x){
		
		double result = 0;
		double sum = 0;
		
		if( x < 0.0){
			return Double.NaN;
			
		}else{
			  double t = x*x;
			  double arg = t/4.0;
			  double term;
			  long k = 0;
			  long exp = 0;
			  double[]coef = {6.0,
					          120.0,
					          5040.0,
					          362880.0,
					          39916800.0,
					          6227020800.0,
					          1307674368000.0,
					          355687428096000.0,
					          121645100408832000.0,
					          51090942171709440000.0,
					          25852016738884976640000.0
			  };
			  int i,j;
			  double nom;
			  double denom;
			  double value = 0;
			  int one = -1;
			  int a;
			  double b;
			  double[]array = new double[coef.length];
			  for(i = 0;i<array.length;i++){
				  ++k;
				  a = (int)Math.pow(one, k);
				  exp = (2*k)+1;
				  b = Math.pow(arg, exp);
				  nom = a*b;
				  denom = Math.pow(coef[i], 2.0);
				  value = nom/denom;
				  array[i] = value;
				  //System.out.println("exp \t" +exp + "a \t" + a+"array \t" + array[i]+" ");
				  
			  }
			  for(j = 0;j<array.length;j++){
				  result += array[j];
				 // System.out.println("res \t" + result);
			  }
			 
			  term = arg;
			 sum = term+result;
		}
		return sum;
	}
	
	public double BerN(double x,int n){//accurate only for Bern, n=2
		double sum = 0;
		double result = 0;
		if(x <0.0){
			return Double.NaN;
			
		}else if(n <1){
			return Double.NaN;
			
		}else{
			  double half_x;
			  double half_xto_n;
			  double pi;
			  double cos_arg;
			  double cos;
			  
			 
			
			  long k = 0;
			  double gamma_arg;
			  double gamma;
			  long fact = 1;
			  
			  double denom;
			  double[] array = new double[10];
			  double[]array2 = new double[array.length];
			  double[]array3 = new double[array.length];
			  double arg2;
			  double value = 0;
			  double a;
			  double term;
			  int i,j;
			  half_x = x/2;
			  half_xto_n = Math.pow(half_x, n);
			  pi = Math.PI;
			  arg2 = x*x;
			term   = arg2/4.0;
			
			  for(i = 0;i<array.length;i++){
				  ++k;
				  cos_arg = 0.75*n*pi;
				value = cos_arg+(0.5*k)*pi;
				
				  
				  cos = Math.cos(value);
				  
				 
				  
				
				  fact*=k;
				   array2[i] = cos; 
				  
				   a = Math.pow(term, k);
				 
				  gamma_arg = n+k+1;
				  gamma = this.GammaStirlingApprox(gamma_arg);
				  denom = fact*gamma;
				 
				  array3[i] = denom;
				  array[i] = (array2[i]/array3[i])*a;
				
				 sum += array[i];
				
				
				  
			  }
			System.out.println("sum \t" + sum);
			  
			result = half_xto_n*sum;
		}
		
		return result;
	}
	
	public double BeiN(double x,int n){
		double sum = 0;
		double result = 0;
		
		if(x < 0.0){
			return Double.NaN;
			
		}else if(n < 1){
			return Double.NaN;
			
		}else{
			   double halfx;
			   double arg ;
			   double sin;
			   double gamma;
			   double gamma_arg;
			   long k = 0;
			   double nom;
			   double a,b;
			   double denom;
			   double[]array = new double[16];
			   int i,j;
			   double sin_arg;
			   double term;
			   double pi = Math.PI;
			   long fact = 1;
			   double run_value = 0;
			   
			   halfx = x/2.0;
			   term = Math.pow(halfx, n);
			   sin_arg = 0.75*n*pi;
			   arg = (x*x)*0.25;
			   for(i = 0;i<array.length;i++){
				   ++k;
				   fact*=k;
				   a = fact;
				   sin_arg = sin_arg+0.5*k*pi;
				   sin = Math.sin(sin_arg);
				   b = Math.pow(arg, k);
				   nom =sin*b;
				   gamma_arg = n+k+1;
				   gamma = this.GammaStirlingApprox(gamma_arg);
				   denom = a*gamma;
				   run_value = nom/denom;
				   array[i] = run_value;  
				   
				   
				   
			   }
			   for(j = 0;j<array.length;j++){
				   sum += array[j];
			   }
			   
			   result = term*sum;
			   
		}
		return result;
	}
	public double Ber2N(double x,int n){
		double sum = 0;
		double result = 0;
		
		if(x <0.0f){
			return Double.NaN;
			
		}else if(n <1){
			throw new IllegalArgumentException("order n can not be less than 1"); 
			
		}else if (n == 2){
			return this.BerN(x, n);//accurate only when n=2
			
		}else{	
			  long[]fact = {1,
					        1,
					        2,
					        6,
					        24,
					        120,
					        720,
					        5040,
					        40320,
					        362880,
					        3628800,
					        39916800,
					        479001600,
					        6227020800L,
					        87178291200L,
					        1307674368000L,
					        20922789888000L,
					        355687428096000L,
					        6402373705728000L,
					        121645100408832000L,
					        2432902008176640000L,
					        
			   };
			  double[]array = new double[fact.length];
			  double cos_arg;
			  double cos;
			  double arg;
			  double term;
			  double gamma_arg;
			  double gamma;
			  double a;
			  double run_val;
			  double nom,denom;
			  int i,j;
			  long k = -1;
			  double pi = Math.PI;
			  //params initialization
			  cos_arg = (0.75*n)*pi;
			  arg = (x*x)*0.25;
			  term = 0.5*x;
			  term = Math.pow(term, n);
			  System.out.println("term \t" + term);
			  for(i = 0;i<array.length;i++){
				  ++k;
				  cos_arg = cos_arg+0.5*k*pi;
				  cos = Math.cos(cos_arg);
				  a = Math.pow(arg, k);
				  nom = cos*a;
				  gamma_arg = n+k+1;
				  gamma = this.GammaStirlingApprox(gamma_arg);
				  denom = fact[i]*gamma;
				  run_val = nom/denom;
				  array[i] = run_val;
				 
			  }
			
			  for(j = 0;j<array.length;j++){
				  sum += array[j];
			  }
			  
			 result = term*sum;
			  
		}
		return result;
	}
	public double Bei2N(double x,int n){
		double sum = 0;
		double result = 0;
		if(x < 0.0f){
			return Double.NaN;
			
		}else if(n < 1){
			throw new IllegalArgumentException("argument of order n must be equal or greater than 1" + n);
			
		}else{
			  long[]fact = {  1,
				              1,
				              2,
				              6,
				              24,
				              120,
				              720,
				              5040,
				              40320,
				              362880,
				              3628800,
				              39916800,
				              479001600,
				              6227020800L,
				              87178291200L,
				              1307674368000L,
				              20922789888000L,
				              355687428096000L,
				              6402373705728000L,
				              121645100408832000L,
				              2432902008176640000L,
		};
			  double[]array = new double[fact.length];
			  double half_x;
			  double sin_arg;
			  double sin;
			  double gamma_arg;
			  double gamma;
			  double run_val = 0;
			  double a;
			  double nom,denom;
			  long k = -1;
			  double pi;
			  double arg1;
			  int i,j;
			  pi = Math.PI;
			  sin_arg = (0.75*n)*pi;
			  half_x = 0.5*x;
			  half_x = Math.pow(half_x, n);
			  arg1 = (x*x)*0.25;
			  for(i = 0;i<array.length;i++){
				  ++k;
				  sin_arg = sin_arg+0.5*k*pi;
				  sin = Math.sin(sin_arg);
				  a = Math.pow(arg1, k);
				  nom = sin*a;
				  gamma_arg = n+k+1;
				  gamma = this.GammaStirlingApprox(gamma_arg);
				  denom = fact[i]*gamma;
				 
				  run_val = nom/denom;
				  array[i] = run_val;
				  System.out.println("sin \t" + sin +"k \t" + k + "a \t" + a);
				 
			  }
			  for(j = 0;j<array.length;j++){
				  sum += array[j];
			  }
			  
			  result = half_x*sum;
		}	  
		
		return result;
	}
	
	public double Ker0(double x){
		double sum = 0;
		double result = 0;
		if(x < 0.0f){
			return Double.NaN;
		
		
			
		}else if(x == 0.0f){
			return Double.POSITIVE_INFINITY;
			
		}else{	
		
			 double ln,ber0,bei0,arg1,arg2,arg3;
			 double pi;
			 double run_val;
			 long k,exp;
			 int one,a;
			 double c;
			 
			 double[]fact = {1.0,
					         2.0,
					         24.0,
					         720.0,
					         40320.0,
					         3628800.0,
					         479001600.0,
					         87178291200.0,
					         20922789888000.0,
					         6402373705728000.0,
					         2432902008176640000.0,
					         1124000727777607680000.0,
					         620448401733239439360000.0,
					         403291461126605635584000000.0,
					         304888344611713860501504000000.0,
					         2.6525285981219105863630848e+32
					        
					        
			 };
			 double[]array = new double[fact.length];
			 double[]polygamma = {-0.57721566490153286060651209008240,//corected because of PsiPolyApprox(1) returned wrong value
					               0.92278433509846713939348790991760,
					               1.5061176684318004727268212432509,
					               1.8727843350984671393934879099176,
					               2.1406414779556099965363450527747,
					               2.3517525890667211076474561638859,
					               2.5259950133091453500716985881283,
					               2.6743466616607937017200502364799,
					               2.8035133283274603683867169031466,
					               2.9178924132947806298246253998786,
					               3.0205239922421490508772569788260,
					               3.1135975853157421244703305718996,
					               3.1987425128519740085283015863923,
					               3.2772040513135124700667631248539,
					               3.3499553740648352213895144476052,
					               3.4177714660188582098952615740420
					         
					 
			 };
			 int i,j;
			 double nom,denom;
			 double term1,term2;
			 arg1 = x/2.0;
			 ln = -Math.log(arg1);
			 
			 ber0 = this.Ber0(x);
			 pi = Math.PI;
			 arg2 = pi/4.0;
			 bei0 = this.Bei0(x);
			 one = -1;
			 k = -1;
			 
			 arg3 = x*x;
			 arg3 = arg3/4.0;
			 run_val = 0;
			 for(i = 0;i<array.length;i++){
				 ++k;
				
				 exp = 2*k;
				a = (int) Math.pow(one, k);
				
				c = Math.pow(arg3, exp);
				nom = a*polygamma[i]*c;
				denom = Math.pow(fact[i], 2.0);
				
				run_val = nom/denom;
				array[i] = run_val;
			
				
			 }
			 for(j = 0;j<array.length;j++){
				 sum += array[j];
				
			 }
			
			
			
			 term1 = ln*ber0;
			 term2 = arg2*bei0;
			 result = term1+term2;
			result = result+sum;
			 
			 
		}
		
		  return result;
	}
	
	public double Kei0(double x)throws IllegalArgumentException{
		double sum = 0;
		double result = 0;
		double up_limit = 7.02d;
		if(x < 0.0f){
			return Double.NaN;
			
		}else if (x > up_limit){
			throw new IllegalArgumentException("loss of precision  occurred at \t" + x );
		}else {
			
			  double ln,bei0,ber0,arg1,arg2,arg3,pi,nom,denom;
			  int one,a;
			  long k,exp;
			  int i,j;
			  double run_val,term1,term2,polygamma,poly_arg,c;
			  double[]fact = {1.0,
					          6.0,
					          120.0,
					          5040.0,
					          362880.0,
					          39916800.0,
					          6227020800.0,
					          1307674368000.0,
					          355687428096000.0,
					          121645100408832000.0,
					          51090942171709440000.0,
					          25852016738884976640000.0,
					          15511210043330985984000000.0,
					          10888869450418352160768000000.0,
					          8841761993739701954543616000000.0,
					          8.22283865417792281772556288e+33
			  };
			  
			  double[]array = new double[fact.length];
			  arg1 = 0.5*x;
			  pi = Math.PI;
			  arg2 = 0.25*pi;
			  ln = -Math.log(arg1);
			  bei0 = this.Bei0(x);
			  ber0 = this.Ber0(x);
			  one = -1;
			  k = -1;
			  arg3 = x*x;
			  arg3 = 0.25*arg3;
			  run_val = 0;
			  
			  for(i = 0;i<array.length;i++){
				  ++k;
				  exp = (2*k)+1;
				  a = (int)Math.pow(one, k);
				  poly_arg = 2*k+2;
				  polygamma = this.PsiAsymptoticApprox(poly_arg);
				  c = Math.pow(arg3, exp);
				  nom = a*polygamma*c;
				  denom = Math.pow(fact[i], 2.0);
				  run_val = nom/denom;
				  array[i] = run_val;
				  
				  
			  }
			  for(j=0;j<array.length;j++){
				  sum += array[j];
			  }
			  
			  term1 = ln*bei0;
			  term2 = arg2*ber0;
			  result = term1-term2;
			  result = result+sum;
			  
			 
			  
		}
		return result;
	}
	
	public double DBer0(double x) throws IllegalArgumentException{
		double sum = 0;
		
		if(x <= -8.0f){
			throw new IllegalArgumentException("argument must be less than -8 \t" + x);
			
		}else if(x >= 8.0f){
			throw new IllegalArgumentException("argument must be less than 8 \t" + x);
			
		}else{
			  double arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9;
			  double[]coef = {-4.0,
					           14.22222,
					           -6.063817,
					           0.66047,
					           -0.02609253,
					           0.00045957,
					           -0.00000394
			  };
			  double error;
			  error = 2.0*10e-8;
			  arg1 = x/8.0;
			  arg2 = arg1*arg1;//x^2
			  arg3 = arg2*arg2;//x^4
			  arg4 = arg3*arg2;//x^6
			  arg5 = arg4*arg3;//x^10
			  arg6 = arg5*arg3;//x^14
			  arg7 = arg6*arg3;//x^18
			  arg8 = arg7*arg3;//x^22
			  arg9 = arg8*arg3;//x^26
			  sum = arg2*coef[0]+arg4*coef[1]+arg5*coef[2]+arg6*coef[3]+arg7*coef[4]+arg8*coef[5]+arg9*coef[6];
			  sum = x*sum+error;
			  
		}
		return sum;
	}
	
	public double DBei0(double x){
		double sum = 0;
		double result = 0;
		
		if(x == Double.NaN){
			return Double.NaN;
			
		}else if(x == Double.NEGATIVE_INFINITY){
			return Double.NEGATIVE_INFINITY;
			
		}else if(x == Double.POSITIVE_INFINITY){
			return Double.POSITIVE_INFINITY;
			
		}else if(x > 8.0f  && x <=  Double.MAX_VALUE){
		
			x = x/x;
		
			System.out.println("x>8"+x);
			double half,error,arg1,arg2,arg3;
			double[]coef = {-10.66666666,
					         11.37777772,
					         -2.31167514,
					         0.14677204,
					         -0.00379386,
					         0.00004609
			};
			half = 0.5f;
			error = 5*10e-8;
			arg1 = x/8.0f;
			
			arg2 = arg1*arg1;//x^2
			arg3 = arg2*arg2;//x^4
			sum = half-arg3*coef[0]+arg3*(coef[1]+arg3*(coef[2]+arg3*(coef[3]+arg3*(coef[4]+arg3*(coef[5])))));
			result = x*sum+error;
			return result;
			
		}else if(x < -8.0f && x > -Double.MAX_VALUE)	{
		x = x/x;
		System.out.println("x>-8"+x);

			double half,error,arg1,arg2,arg3;
			double[]coef = {-10.66666666,
					         11.37777772,
					         -2.31167514,
					         0.14677204,
					         -0.00379386,
					         0.00004609
			};
			half = 0.5f;
			error = 5*10e-8;
			arg1 = x/8.0f;
			arg2 = arg1*arg1;//x^2
			arg3 = arg2*arg2;//x^4
			sum = half-arg3*coef[0]+arg3*(coef[1]+arg3*(coef[2]+arg3*(coef[3]+arg3*(coef[4]+arg3*(coef[5])))));
			result = x*sum+error;
			return result;
			
		}else{
			double half,error,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8;
			double[]coef = {-10.66666666,
					         11.37777772,
					         -2.31167514,
					         0.14677204,
					         -0.00379386,
					         0.00004609
			};
			half = 0.5f;
			error = 5*10e-8;
			arg1 = x/8.0f;
			arg2 = arg1*arg1;//x^2
			arg3 = arg2*arg2;//x^4
			arg4 = arg3*arg3;//x^8
			arg5 = arg4*arg3;//x^12
			arg6 = arg5*arg3;//x^16
			arg7 = arg6*arg3;//x^20
			arg8 = arg7*arg3;//x^24
			sum = arg3*coef[0]+arg4*coef[1]+arg5*coef[2]+arg6*coef[3]+arg7*coef[4]+arg8*coef[5];
			sum = half+sum;
			result = x*sum+error;
			System.out.println("inside");
		}
			
		return result;	
		
	}
	public double IncGammaLim(double x,double a){
		double sum = 0;
		double result = 0;
		
		if(x < 0.0 || a < 0.0){
			throw new IllegalArgumentException("arg x or a must be greater than 0.0 \t " + x  +"\t " + a);
			
		}else{
			    double exp,gamma_arg,gamma,nom,denom;
			    long k;
			    int i,j;
			    double[]array = new double[32];
			    double run_value;
			    
			    k = -1;
			    run_value = 0;
			    
			    for(i = 0;i<array.length;i++){
			    	++k;
			    	nom = Math.pow(x, k);
			    	gamma_arg = a+k+1;
			    	gamma = this.GammaStirlingApprox(gamma_arg);
			    	denom = gamma;
			    	run_value = nom/denom;
			    	array[i] = run_value; 
			                                                                                                                                                       
			    }
			    for(j = 0;j<array.length;j++){
			    	
			    	sum += array[j];
			    }
			  
			    exp = Math.exp(-x);
			    
			   result = exp*sum;
		}
		return result;
	}
	
	public double IncGammaLow(double x,double a){
		double sum = 0;
		double result = 0;
		
		if(x < 0.0f){
			throw new IllegalArgumentException("arg x must be greater than 0 \t" + x);
			
		}else if( a < 0.0f || a == 0.0f || a < 1.0f){
			throw new IllegalArgumentException("arg a must be not less than 1.0 \t" +  a);
			
		}else{
			 long start,end; 
			double exp,gamma_arg,gamma,nom,denom,power,gamma2;
			long k;
			int i,j;
			double[]array = new double[32];
			double run_value;
			
			k = -1;
			run_value = 0;
			start = System.nanoTime();
			for(i = 0;i<array.length;i++){
				++k;
				nom = Math.pow(x, k);
				gamma_arg = a+k+1;
				gamma = this.GammaStirlingApprox(gamma_arg);
				denom = gamma;
				run_value = nom/denom;
				array[i] = run_value;
			}
			
			for(j = 0;j<array.length;j++){
				
				sum += array[j];
			}
			
			exp = Math.exp(-x);
			power = Math.pow(x, a);
			gamma2 = this.GammaStirlingApprox(a);
			result = power*gamma2*exp*sum;
			end = System.nanoTime();
			System.out.println("running time of IncGamma() method is: " + (end-start) + " \t nanoseconds ");
		}
		
		return result;
	}
	
	public double IncGammaUp(double x,double a){
		double sum = 0;
		double result = 0;
		
		if(x < 0.0f){
			throw new IllegalArgumentException("parameter x must be greater than 0 \t" + x);
			
		}else if(a < 0.0f || a == 0.0f || a < 1.0f){
			throw new IllegalArgumentException("parameter a must be equal or greater than 1.0 \t" + a);
			
		}else{
			  
			double x_pow,gamma1,gamma2,gamma_arg,nom,denom,exp,term;
			long k;
			int i,j;
			double run_value;
			double[]array = new double[32];
			
			k = -1;
			run_value = 0;
			
			for(i = 0;i<array.length;i++){
				++k;
				nom = Math.pow(x, k);
				gamma_arg = a+k+1;
				gamma1 = this.GammaStirlingApprox(gamma_arg);
				denom = gamma1;
				run_value = nom/denom;
				array[i] = run_value;
			}
			  for(j = 0;j<array.length;j++){
				  sum += array[j];
			  }
			  
			  x_pow = Math.pow(x, a);
			  exp = Math.exp(-x);
			  gamma2 = this.GammaStirlingApprox(a);
			  term = 1-(x_pow*exp*sum);
			  result = gamma2*term;
		}
		
		return result;
	}
	
	public double Dker0(double x){
		double sum = 0;
		double term2;
		if (x < 0.0)
			
				{
			throw new IllegalArgumentException("argument x cannot be less than 0 \t" + x);
			
		}else if( x > 8.0){
			throw new IllegalArgumentException("argument x can not be greater than 8.0" + x);
			
		
			
		}else{	
			  double ln,arg1,dber0,octal_x;
			  double arg2,ber0,arg3,dbei0,pi,arg4,arg5,arg6;
			  
			  double[]coef = { -3.69113734,
					            21.42034017,
					            -11.36433272,
					            1.41384780,
					            -0.06136358,
					            0.00116137,
					            -0.00001075
			  };
			  pi = Math.PI;
			  arg1 = 0.5*x;
			  dber0 = this.DBer0(x);
			  arg2 = 1/x;
			  ber0 = this.Ber0(x);
			  arg3 = 0.25*pi;
			  dbei0 = this.DBei0(x);
			  ln = Math.log(arg1);
			  octal_x = x/8.0;
			  arg4 = octal_x * octal_x;//x^2
			  arg5 = arg4 * arg4;//x^4
			  arg6 = arg5 * arg4;//x^6
			  sum = arg4 * coef[0] + arg6 * (coef[1] + arg5 * (coef[2] + arg5 * (coef[3] + arg5 * (coef[4] + arg5 * (coef[5] + arg5 * (coef[6]))))));
			 
			  sum = x*sum;
			  term2 = -ln*dber0-arg2*ber0+arg3*dbei0;
			


			  
		}
		return  term2+sum;
	}
	
	public double Dkei0(double x) throws IllegalArgumentException{
		double sum;
		sum = 0;
		
		double ln,ln_arg,inv_x,dbei,dber,dber_const,octal_x,bei,term1;
		if( x < 0.0f){
			throw new IllegalArgumentException("Argument x cannot be less than 0 \n" + x);
			
		}else if( x > 8.0f){
			throw new IllegalArgumentException("Argument x cannot be greater than 8 \n" + x);
			
		}else{
			
			    ln_arg = 0.5 * x;
			    dber_const = 0.25 * Math.PI;
			    octal_x = x/8.0;
			    inv_x = 1/x;
			    double[]coef = {0.21139217,
			    		        -13.39858846,
			    		        19.41182758,
			    		        -4.65950823,
			    		        0.33049424,
			    		        -0.00926707,
			    		        0.00011997
			    		        
			    };
			    
			   ln = Math.log(ln_arg);
			    dbei = this.DBei0(x);
			    bei = this.Bei0(x);
			    dber = this.DBer0(x);
			    term1 = -ln * dbei - inv_x * bei - dber_const * dber;
			   
			    octal_x = octal_x * octal_x * octal_x * octal_x ;
			    sum = coef[0] + octal_x * (coef[1] + octal_x * (coef[2] + octal_x * (coef[3] + octal_x * (coef[4] + octal_x * (coef[5] + octal_x * (coef[6]))))));
			    
			  
			    sum = x * sum;
			    
			    		   
			    }
		
		  return   term1  + sum;
			    
		}
	
	
	public double Ai(double x,int n) {
		double result = 0;
		
		switch(n){
		
		
		case 0 :
		{
		double f_part,g_part,f_arg,g_arg,c1,c2;
		c1 = 0.355028053887817;
		c2 = 0.258819403792807;
		final double fcoef1 = 0.166666666666666666666667; // recalculate coefficients because of error
		final double fcoef2 = 0.00555555555555555555555556;
		final double fcoef3 = 0.0000771604938271604938271605;
		final double fcoef4 = 5.84549195660306771417883e-6;
		final double fcoef5 = 2.78356759838241319722801e-8;
		final double fcoef6 = 9.09662613850461829159481e-11;
		final double fcoef7 = 2.16586336631062340276067e-13;
		final double fcoef8 = 3.92366551867866558471136e-16;
		final double fcoef9 = 5.58926712062487975030108e-19;
		final double fcoef10 = 6.42444496623549396586331e-22;
		final double fcoef11 = 6.08375470287452080100692e-25;
		final double fcoef12 = 4.82837674831311174683089e-28;
		
		final double gcoef1 = 0.0833333333333333333333333;
		final double gcoef2 = 0.00198412698412698412698413;
		final double gcoef3 = 0.0000220458553791887125220459;
		final double gcoef4 = 1.41319585764030208474653e-7;
		final double gcoef5 = 5.88831607350125868644387e-10;
		final double gcoef6 = 1.72172984605299961591926e-12;
		final double gcoef7 = 3.72668797846969613835338e-15;
		final double gcoef8 = 6.21114663078282689725563e-18;
		final double gcoef9 = 8.21580242167040594875083e-21;
		final double gcoef10 = 8.83419615233376983736649e-24;
		final double gcoef11 = 7.87361510903188042546033e-27;
		final double gcoef12 = 5.91112245422813845755280e-30;
		
		f_arg = x * x * x;//x^3
		g_arg = x * x * x * x;//x^4
		
		f_part = 1 + f_arg * (fcoef1 + f_arg * (fcoef2 + f_arg * (fcoef3 + f_arg * (fcoef4 + f_arg * (fcoef5 + f_arg * (fcoef6 + f_arg * (fcoef7 + f_arg * (fcoef8 + f_arg * (fcoef9 + f_arg * (fcoef10 + f_arg * (fcoef11 + f_arg * (fcoef12)))))))))))); 
		g_part = x + g_arg*(gcoef1 + g_arg*(gcoef2 + g_arg*(gcoef3 + g_arg*(gcoef4 + g_arg*(gcoef5 + g_arg*(gcoef6 + g_arg*(gcoef7 + g_arg*(gcoef8 + g_arg*(gcoef9 + g_arg*(gcoef10 + g_arg*(gcoef11 + g_arg*(gcoef12))))))))))));
		
		
		result =  (c1 * f_part) - c2 * g_part;
		}
		 break;
		 
		case 1 :
		{           
			double f_part,g_part,f_arg,g_arg,c1,c2;
			c1 = 0.355028053887817;
			c2 = 0.258819403792807;
			final double fcoef1 = 0.166666666666666666666667; // recalculate coefficients because of error
			final double fcoef2 = 0.00555555555555555555555556;
			final double fcoef3 = 0.0000771604938271604938271605;
			final double fcoef4 = 5.84549195660306771417883e-6;
			final double fcoef5 = 2.78356759838241319722801e-8;
			final double fcoef6 = 9.09662613850461829159481e-11;
			final double fcoef7 = 2.16586336631062340276067e-13;
			final double fcoef8 = 3.92366551867866558471136e-16;
			final double fcoef9 = 5.58926712062487975030108e-19;
			final double fcoef10 = 6.42444496623549396586331e-22;
			final double fcoef11 = 6.08375470287452080100692e-25;
			final double fcoef12 = 4.82837674831311174683089e-28;
			
			final double gcoef1 = 0.0833333333333333333333333;
			final double gcoef2 = 0.00198412698412698412698413;
			final double gcoef3 = 0.0000220458553791887125220459;
			final double gcoef4 = 1.41319585764030208474653e-7;
			final double gcoef5 = 5.88831607350125868644387e-10;
			final double gcoef6 = 1.72172984605299961591926e-12;
			final double gcoef7 = 3.72668797846969613835338e-15;
			final double gcoef8 = 6.21114663078282689725563e-18;
			final double gcoef9 = 8.21580242167040594875083e-21;
			final double gcoef10 = 8.83419615233376983736649e-24;
			final double gcoef11 = 7.87361510903188042546033e-27;
			final double gcoef12 = 5.91112245422813845755280e-30;
			
			f_arg = x * x * x;//x^3
			g_arg = x * x * x * x;//x^4
			
			f_part = 1 + f_arg * (fcoef1 + f_arg * (fcoef2 + f_arg * (fcoef3 + f_arg * (fcoef4 + f_arg * (fcoef5 + f_arg * (fcoef6 + f_arg * (fcoef7 + f_arg * (fcoef8 + f_arg * (fcoef9 + f_arg * (fcoef10 + f_arg * (fcoef11 + f_arg * (fcoef12)))))))))))); 
			g_part = x + g_arg*(gcoef1 + g_arg*(gcoef2 + g_arg*(gcoef3 + g_arg*(gcoef4 + g_arg*(gcoef5 + g_arg*(gcoef6 + g_arg*(gcoef7 + g_arg*(gcoef8 + g_arg*(gcoef9 + g_arg*(gcoef10 + g_arg*(gcoef11 + g_arg*(gcoef12))))))))))));
			
			result =  (c1 * f_part) + c2 * g_part;
		}
		 break;
		 
		 default:
		 {
			  System.out.println("Default case hit because of undefined switch variable");
			  System.out.println("For Airy() pass 0 value, for Bairy() pass 1 value to the method");
		 }
		 
		}
		return result;
	}
	
		
	public double Bi(double x,int n){
		
		
		return Math.sqrt(3) * this.Ai(x, n);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Functions func = new Functions(0.0,0.0,0.0);
       func.SetArg3D(1.0, 1.0, 1.0);
       
       Functions f = new Functions(0.0,0.0,0.0);
       f.SetArg3D(0.1, 0, 0);
       f.lnIntegralArray1D(0.1, 25, 0.01);
     
     
   
   
       double[]temp = new double[25];
      
       double norm;
       norm = func.normArray1D(temp);
       System.out.println(norm);
      
       double hypot;
       
      
      

     
      Functions func1 = new Functions(0.5,0,0);
      Functions func2 = new Functions(0.5,0,0);
      double result = 0;
  
    
    Functions func3 = new Functions(0.61,0,0);
    double result1 = 0;
   
    
   
    double[]t = {0.0,0.20,0.30};
    double[]t2 = {0.0,0.20134,0.30452};
    double point = 0;
    point = func3.dividedDifferenceInterpolation3Points(t, t2, 0.23);
    System.out.println("point \t" + point);
    double arg = 0;
    
    double[]t3 = new double[100];
    double[]t4 = new double[100];
    for(int i = 0;i<t3.length;i++){
    	arg += 0.01;
    	t3[i] = arg;
    	t4[i] = Math.sin(arg);
    }
       
       double[]t5 = new double[100];
       t5 = func.DividedDifference(t3, t4, 2);
      
     
     
      double argument = 0.3;
  
   System.out.println(func3.simpleDerivative(argument, 0.000001,0.58));
    		  
   double[]ar = {0.40,0.50,0.70,0.80};
   double[]br = {-0.916291,-0.693147,-0.356675,-0.223144};
   double result2 = 0;
   result2 = func3.lagrangeInterpolationCubic(ar, br, 0.60);
   System.out.println("result2 \t" + result2);
   Functions func4 = new Functions(0.89,0.0,0.0);
   double val = 0;
 
  System.out.println("val \t" + val);
  Complex com = new Complex(0.5,0.25);
  Complex com2 = new Complex(1.25,2.23);
  Complex cc;
  cc = com.complexCosine();
  

 double val2 = 0;
 val2 = func4.SiAuxilliaryFunc(100.8988);
 System.out.println(val2);
 double val3 = 0;
 val3 = func4.SiSeriesExpansion(0.550);
 System.out.println(val3);
 double val4 = 0;
 val4 = func.CiSeriesExpansion(0.650);
 System.out.println("Cis \t"+val4);
 double val5 = 0;
 val5 = func.EiIntegralSeriesExpansion(1.0);
 System.out.println(val5);
 double val6 = 0;
 val6 = func.GammaStirlingApprox(1.5);
// System.out.println("gammastirling \t"+val6);
 double val7 = 0;
 val7 = func.GammaPolyApprox(0.991);
 System.out.println("gammapolyapprox \t" + val7);
 double val8 = 0;
 val8 = func.ReciprocalGamma(1.58);
 System.out.println("reciprogamma \t" + val8);
 
 double val9 = 0;
 val9 = func.LogGammaApprox(1.820);
 System.out.println("loggamma \t" + val9);
 double val10 = 0;
 val10 = func.PsiAsymptoticApprox(0.15);
 System.out.println("Psi \t" + val10);
 double val11 = 0;
 val11 = func.TriGamma(1.0750);
 System.out.println("trigamma \t" + val11);
 double val12 = 0;
 val12 = func.TetraGamma(1.4000);
 System.out.println("tetragamma \t" + val12);
 double val13 = 0;
 val13 = func.PentaGamma(1.8500);
 System.out.println("pentagamma \t" + val13);
 double val14 = 0;
 val14 = func.ErfRatApprox(0.620);
 System.out.println("erf \t" + val14);
 double val15 = 0;
 val15 = func.ErfSeriesApprox(0.500);
 System.out.println("erfseries \t" + val15);
double val16 = 0;
val16 = func.Erfc(1.900);
System.out.println("erfc "+ val16);
double val17 = 0;
val17 = func.ErfcSeriesApprox(205.7000);
System.out.println("erfcseries \t" + val17);
double val18 = 0;
val18 = func.InverseErfSeriesApprox(0.400);
System.out.println("inverseerf \t" + val18);
double val19 = 0;
 val19 = func.FresnelSIntegral(1.900);
 System.out.println("fresnel S \t" + val19);
 double val20 = 0;
 val20 = func.FresnelCIntegral(0.620);
 System.out.println("fresnelC \t" + val20);
 double val21 = 0;
 val21 = func.FresnelAuxFuncF(0.1300);
 System.out.println("fresnel aux f \t" + val21);
 double val22 = 0;
 val22 = func.FresnelAuxFuncG(0.60);
 System.out.println("fresnel G \t" + val22);
 double val23 = 0;
 val23 = func.BesselJ0(17.0);
 System.out.println("besselJ0 \t" + val23);
double val24 = 0;
val24 = func.BesselY0(1.50);
System.out.println("besselY0 \t" + val24);
double val25 = 0;
val25 = func.BesselJ1(2.5);
System.out.println("besselJ1 \t" + val25);
double val26 = 0;
val26 = func.BesselY1(5.0);
System.out.println("besselY1 \t" + val26);
double val27 = 0;
val27 = func.BesselI0(2.0);
System.out.println("besselIO \t" + val27);
double val28 = 0;
val28 = func.BesselK0(0.10);
System.out.println("besselK0 \t" + val28);
double val29 = 0;
val29 = func.BesselI1(0.1000);
System.out.println("besselI1 \t" + val29);
double val30 = 0;
val30 = func.BesselK1(5.5);
System.out.println("besselK1 \t" + val30);
double val31 = 0;
val31 = func.BesselK(10, 0.5);
System.out.println("besselK \t" + val31);
double val32 = 0;
val32 = func.BesselY(10, 5.5);
System.out.println("besselY \t" + val32);
double val33 = 0;
val33 = func.Bessel2Y1(2.5);
System.out.println("besselY1 \t" + val33);
double val34 = 0;
val34 = func.Ber0(7.0);
System.out.println("Ber0 \t" + val34);
double val35 = 0;
val35 = func.Beta(1.200, 1.700);
System.out.println("beta \t" + val35);
double val36 = 0;
val36 = func.Bei0(3.0);
System.out.println("bei0 \t" + val36);
double val37 = 0;
val37 = func.Ei(0.15);
System.out.printf("%15s \n", "Ei");
System.out.printf("%.32f \n", val37 );
double val38 = 0;
val38 = func.E1(0.85);
System.out.printf("%15s \n","E1");
System.out.printf("%.32f \n", val38);
double val39 = 0;
val39 = func.Li(1.8);
System.out.printf("%15s \n", "Li");
System.out.printf("%.32f \n", val39);
double val40 = 0;
val40 = func.En(1.45, 10);
System.out.printf("%15s \n", "En");
System.out.printf("%.32f \n", val40);
double val41 = 0;
val41 = func.BerN(1.8, 2);
System.out.printf("%15s \n", "BerN");
System.out.printf("%.32f \n", val41);
double val42 = 0;
val42 = func.BeiN(3.0, 5);
System.out.printf("%15s \n", "BeiN");
System.out.printf("%.32f \n", val42);
double val43 = 0;
val43 = func.Ber2N(2.80, 1);
System.out.printf("%15s \n", "Ber2N");
System.out.printf("%.32f \n", val43);
double val44 = 0;
val44 = func.Bei2N(1.90, 5);
System.out.printf("%15s \n", "Bei2N");
System.out.printf("%.32f \n ",val44);
double val45 = 0;
val45 = func.Ker0(1.3);
System.out.printf("%15s \n", "Ker0");
System.out.printf("%.32f \n", val45);
double val46 = 0;
val46 = func.Kei0(1.01);
System.out.printf("%15s \n", "Kei0");
System.out.printf("%.32f \n", val46);
double val47 = 0;
val47 = func.DBer0(3.0);
System.out.printf("%15s \n", "DBer0");
System.out.printf("%.32f \n", val47);
double val48 = 0;
val48 = func.DBei0(3.0);
System.out.printf("%15s \n", "DBei0");
System.out.printf("%.64f \n", val48);
double val49 = 0;
val49 = func.IncGammaLim(0.1, 0.5);
System.out.printf("%15s \n", "IncGammaLimit");
System.out.printf("%.64f \n", val49);
double val50 = 0;
val50 = func.IncGammaLow(1.0, 1.0);
System.out.printf("%15s \n", "IncGammaLower");
System.out.printf("%.64f \n", val50);
double val51 = 0;
val51 = func.IncGammaUp(1.9, 1);
System.out.printf("%15s \n", "IncGammaUp");
System.out.printf("%.64f \n", val51);
double val52 = 0;
val52 = func.Dker0(0.5);
System.out.printf("%15s \n"," Dker0");
System.out.printf("%.64f \n",val52);
int counter = 1000;
long start,end;
double[]test_array = new double[counter];
double difference = 0;
double summ = 0;
double average = 0;
double result21;
for (int i = 0;i<counter;i++){
	start = System.nanoTime();
	 result21 = func.En(0.5, 10);
	end = System.nanoTime();
	difference = end-start;
	test_array[i] = difference;
}

for(int j = 0;j<counter;j++){
	summ += test_array[j];
	
}
  average = summ/counter;
  System.out.printf("%15s \n", "average of 1000 runs");
  System.out.printf("%.24f \n", average);
 double value53 = 0;
 value53 = func.polyE1Exp(1.56);
 System.out.printf("%15s \n", "polyE1Exp" );
 System.out.printf("%.32f \n", value53);
 double value54 = 0;
  value54 = func.polyE1(0.5);
  System.out.printf("%15s \n", "polyE1");
  System.out.printf("%.32f \n",value54);
 double value55 = 0;
 long start1,end1;
 final int  max_Iter = 2000000;
  //start1 = System.currentTimeMillis();
   //for(int k = 0; k < max_Iter;k++){
	 //  value55 = func.fastsin(0.45);
  // }
 //end1 = System.currentTimeMillis();
 //System.out.println("running time of fastsin9) is :" + (end1-start1) + "\tmillisec");
 // System.out.printf("%15s \n", "fastsin()");
  //System.out.printf("%.24f \n",value55);
  
  double value56 = 0;
  long start_time  ,end_time  ;
  start_time = System.currentTimeMillis();
  
  for(int k1 = 0;k1<1;k1++){
	  
	  value56 = func.Ei(1.5);
  }
  
  end_time = System.currentTimeMillis();
  
  System.out.println("running time of Ei() method is " + (end_time-start_time)+ "\tmillisec");
  
  System.out.printf("Ei() method %.24f \n", value56);
  double value57  = 0;
  long start_time2,end_time2;
  
  start_time2 = System.currentTimeMillis();
  
  for(int k2 = 0;k2 < 1;k2++){
	  
	  value57 = func.E1(1.54);
  }
    
   end_time2 = System.currentTimeMillis();
   
   System.out.println("running time of E1() method is" +(end_time2-start_time2) + "\tmillisec");
   
   System.out.printf("E1() method %.24f \n", value57);
	
	
	double val60;
	
	val60 = func.Dkei0(3.0);
	System.out.printf("Dkei0() method %.30f \n",val60);
	double val61;
	val61 = func.Dker0(2.5);
	System.out.printf("Dker0() method is %.24f \n", val61);
	
	double val62;
	val62 = func.Bi(10.5, 1);
	System.out.printf("Bi() method is %.24f \n", val62);
	
	double val63,arg1,arg2,arg3,left,centre,right;
	arg1 = 1.3;
	arg2 =  0.00001;
	arg3 = 0.58;
	left = 1.0;
	centre = 1.030301;
	right = 1.061208;
	val63 = func.SecDeriv(arg1, arg2,arg3);
	double val64 = func.simpleDerivative(arg1, arg2, arg3);
	System.out.printf("val63 and val64 are  %.24f %.24f\n", val63,val64);
	
	}	

}
