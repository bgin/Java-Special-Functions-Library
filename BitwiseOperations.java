package Math_Formulae;

 import java.util.*;

 class  BinaryOp extends Object {
	 
	 private long a;
	 private long b;
	 private long c;
	 private int  y;
	 private int  z;
	 private int  v;
	 
	 public BinaryOp(){}
	 
	public BinaryOp(int y , int z , int v) throws IllegalArgumentException{
		 
		 this.y = y;
		 this.z = z;
		 this.v = v;
		 // input checking
		 if ( y <Integer.MIN_VALUE || y>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument y must be signed int");
		 if ( z<Integer.MIN_VALUE || z>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument z must be signed int");
		 if ( v<Integer.MIN_VALUE || v>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument v must be signed int");
		 
	 }
	 
	public BinaryOp(long a , long b , long c) throws IllegalArgumentException {
		 
		 this.a = a;
		 this.b = b;
		 this.c = c;
		 
		 if ( a<Long.MIN_VALUE || a> Long.MAX_VALUE)
			 throw new IllegalArgumentException("argument a must be signed long");
		 if ( b<Long.MIN_VALUE || b>Long.MAX_VALUE)
			 throw new IllegalArgumentException("argument b must be signed long");
		 if ( c<Long.MIN_VALUE || c>Long.MAX_VALUE)
			 throw new IllegalArgumentException("argument must c be signed long");
		 
	 }
	 
	 //setter / getter
	public void setLong_a(long a) throws IllegalArgumentException{
		this.a = a;
		if( a< Long.MIN_VALUE || a>Long.MAX_VALUE)
			throw new IllegalArgumentException("argument a must be signed long");
		
	}
	
	public void setLong_b(long b) throws IllegalArgumentException{
		this.b = b;
		
		if ( b<Long.MIN_VALUE || b>Long.MAX_VALUE)
			throw new IllegalArgumentException("argument b must be signed long");
	}
	 
	public void setLong_c(long c) throws IllegalArgumentException{
		this.c = c;
		
		if ( c<Long.MIN_VALUE || c>Long.MAX_VALUE)
			throw new IllegalArgumentException("argument c must be signed long");
	}
	
	public long getLong_a(){
		
		return a;
	}
	
	public long getLong_b(){
		
		return b;
	}
	
	public long getLong_c(){
		
		return c;
	}
	
	public void setIntegers(int y , int z , int v) throws IllegalArgumentException{
		
		this.y = y;
		this.z = z;
		this.v = v;
		
		if ( y <Integer.MIN_VALUE || y>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument y must be signed int");
		 if ( z<Integer.MIN_VALUE || z>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument z must be signed int");
		 if ( v < Integer.MIN_VALUE || v>Integer.MAX_VALUE)
			 throw new IllegalArgumentException("argument v must be signed int");
		 
	}
	
	public int getInt_y(){
		
		return y;
		
	}
	
	public int getInt_z(){
		
		return y;
	}
	
	public int getInt_v(){
		
		return v;
	}
	
	
	//methods
	
	public long testZero( long a , long i){
		
		if (i == 0)
			return -1;
		if (a == 0)
			return -1;
		
		return ( getLong_a() &(1L<<i));
		
	}
	
	public int  testZeroInt(int y , int j) {
		
		if ( j == 0)
			return -1;
		
		if (j < 0 || j > Integer.MAX_VALUE)
			return -1;
		
		return (getInt_y() & (1 << j));
	}
	
	public boolean testOneOrZero(long a , long i) throws IllegalArgumentException {
		
		
		if (i == 0)
			throw new IllegalArgumentException("argument i must be unsigned Long");
			
		
		if (0 != testZero(a,i))
			return true;
		
		return false;
	}
	
	public boolean testOneorZeroInt(int y , int j) throws IllegalArgumentException{
		
		if ( j == 0 || j <0)
			throw new IllegalArgumentException("argument j must be unsigned int");
		
		if ( 0!= testZeroInt(y,j))
			return true;
		
		return false;
	}
	
	public long getNextEven(long a) {
	
		if (a == 0)
			if ( a<0)
				if(a>Long.MAX_VALUE)
		return -1;
		
		return a+2-(a&1);
	
 }
	public int getNextEvenInt(int y){
		
		if ( y == 0 || y < 0 || y>Integer.MAX_VALUE)
			
			
				return -1;
		
		return y + 2-(y & 1);
	}
	
	public long getPrevEven(long a){
		
		if (a == 0 || a < 0 ||a > Long.MAX_VALUE)
			
		
			return -1;
		
		return a-2+(a&1);
	}
	
	
	public int getPrevEvenInt(int y){
		
		if ( y == 0 || y < 0 || y > Integer.MAX_VALUE)
			
			return -1;
		
		return y - 2+( y & 1);
	}
	
	
	public int getPrevOddInt(int y){
		
		if (y == 0 || y <0 || y> Integer.MAX_VALUE)
			
			return -1;
		
		return y - 1- (y&1);
	}
	
	
	public int getNextOddInt(int y){
		
		if ( y == 0 || y < 0 || y > Integer.MAX_VALUE)
			
			return -1;
		
		return y+1+(y&1);
	}
	
	
	public long getNextOdd(long a){
		
		if (a == 0 || a < 0 || a > Long.MAX_VALUE)
			
					
		return -1;
		
		return a+1+(a&1);
	}
	
	public long getPrevOdd(long a){
		
		if (a == 0 || a < 0 || a > Long.MAX_VALUE)
			
					
		    return -1;
		
		return a-1-(a&1);
	}
	
	public long setBit(long a, long i) throws IllegalArgumentException{
		
		if( i == 0 || i < 0)
			throw new IllegalArgumentException("argument i must be unsigned long");
		
		if (a == 0 || a < 0 || a> Long.MAX_VALUE)
			throw new IllegalArgumentException("argument a must be unsigned long");
		
		return(a | (1L<<i));
			
	}
	
	public long  clearBit(long a , long i) throws IllegalArgumentException{
		
		if( i == 0 || i < 0)
			throw new IllegalArgumentException("argument i must be unsigned long");
		
		if (a == 0 || a < 0 || a> Long.MAX_VALUE)
			throw new IllegalArgumentException("argument a must be unsigned long");
		
		return (a &~(1L<<i));
	}
	
	public long changeBit(long a , long i) throws IllegalArgumentException{
		
		if( i == 0 || i < 0)
			throw new IllegalArgumentException("argument i must be unsigned long");
		
		if (a == 0 || a < 0 || a> Long.MAX_VALUE)
			throw new IllegalArgumentException("argument a must be unsigned long");
		
		
		return (a ^ (1L<<i));
	}
	
	public long clearRightmostBit( long a){
	
	    if (a == 0 || a<0 || a>Long.MAX_VALUE)
	    	
	    	return -1;
	    
	    return  a & (a-1);
 }
	
	public long isolateRightmostBit( long a) {
		
		 if (a == 0 || a>Long.MAX_VALUE)
			 
			 return -1;
		 
		 return  a & (-a);
		 
		
	}
	
	public long isolateRightmostZero(long a){
		
		  if (a == 0 || a<0 || a>Long.MAX_VALUE)
			  
			  return -1;
		  
		  return  ~a & (a+1);
	}
	
	
	public long identifyTraillingZeroes( long a){
		
		 if (a == 0 || a<0 || a>Long.MAX_VALUE)
			 
			 return -1;
		 
		 return  ~a & (a - 1);
	}
	
	
	public long identifyTraillingOnes( long a){
	
	   if (a == 0 || a<0 || a>Long.MAX_VALUE)
		   
		   return -1;
	   
	   return  a ^ (a - 1);
 
 }
	
	
	public long rightPropagateRightmostOnes( long a){
		
		if (a == 0 || a<0 || a>Long.MAX_VALUE)
			
			return -1;
		
		return   a | ( a - 1);
	}
	
	
	public long turnoffRightmostOnes(long a ){
		
		if (a == 0 || a<0 || a>Long.MAX_VALUE)
			
			return -1;
		
		return  (( a | (a - 1)) + 1) & a;
		
	}
	
	public long  turnonRighmostZeroes( long a){
		
		if (a == 0 || a<0 || a>Long.MAX_VALUE)
			
			return -1;
		
		return a | ( a + 1);
	}
	
	public long propagateSignExtension(long a) throws IllegalArgumentException{
		
		if (a == 0 || a < 0xFFFFFFFF  )
			throw new IllegalArgumentException("argument a must be unsigned long");
		
		int mask_a = 0x80;
		int mask_b = 0xFF;
		
		
		return (( a + mask_a) & mask_b) - mask_a;
	}
	
	public long shiftRightSignedFromUnsign(long a , int n) throws IllegalArgumentException{
		
		if (a == 0 || a < 0xFFFFFFFF)
			throw new IllegalArgumentException("argument a must be unsigned long");
		
		if (n <0 || n> 31)
			
			return 0;
		
		int mask = 0x80000000;
		
		return (( a + mask) >>> n) - (mask >>> n);
		
		
	}
	
	public long signumFunc(long a){
		
		return (a >> 63) | (-a >>> 63);
		
		
	}
	
	public int signumFuncInt(int y){
		
		return (y >> 31) | (-y >>> 31);
	}
	
	
	public int absoluteValue(int y){
	
	 if (y < Integer.MIN_VALUE)
		 return Integer.MIN_VALUE-1;
	
	if  (y > Integer.MAX_VALUE)
		return Integer.MAX_VALUE+1;
	
	int temp;
	
	
	temp = y >> 31;
	
	
	return (y ^ temp)-temp;
	
	
	
	
	
	}
	
	public long absoluteValueLong(long a){
		
		if ( a > Long.MAX_VALUE)
			return Long.MAX_VALUE+1;
		
		if (a < Long.MAX_VALUE)
			return Long.MIN_VALUE-1;
		
		long temp;
		
		temp = a >> 63;
		
		return (a ^ temp) - temp;
	}
 }	
public class BitwiseOperations extends BinaryOp {
	
	private int a;
	private int b;
	private int c;
	
	private long x;
	private long y;
	private long z;
	
	//constructors
	
	BitwiseOperations(){} //uninitialized constructor
	
	BitwiseOperations(int a , int b , int c) throws IllegalArgumentException{  //int constructor
		
		if (a < Integer.MIN_VALUE)
			throw new IllegalArgumentException("argument a must signed int ");
		
		if (a > Integer.MAX_VALUE)
			throw new IllegalArgumentException("argument a must be signed int");
		
		if (b < Integer.MIN_VALUE)
			throw new IllegalArgumentException("argument b must be signed integer");
		
		if (b > Integer.MAX_VALUE)
			throw new IllegalArgumentException("argument b must be signed integer");
		
		if (c < Integer.MIN_VALUE)
			throw new IllegalArgumentException("argument c must be signed int");
		
		if (c > Integer.MAX_VALUE)
			throw new IllegalArgumentException("argument c must be signed int");
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}

	BitwiseOperations( long x , long y , long z) throws IllegalArgumentException{
		
		if ( x < Long.MIN_VALUE)
			throw new IllegalArgumentException("argument x must be signed long  \t" + "arg passed \t " + x);
		
		if (x > Long.MAX_VALUE)
			throw new IllegalArgumentException("argument x must be signed long , arg passed \t" + x);
		
		if (y < Long.MIN_VALUE)
			throw new IllegalArgumentException("argument y must be signed long , arg passed \t " + y);
		
		if (y > Long.MAX_VALUE)
			throw new IllegalArgumentException("argument y must be signed long , arg passed \t" + y);
		
		if (z < Long.MIN_VALUE)
			throw new IllegalArgumentException("argument z must be signed long , arg passed \t" + z);
		
		if (z > Long.MAX_VALUE)
			throw new IllegalArgumentException("argument z must be signed long , arg passed \t"  +z);
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	//setters getters
	
	 public void setInt(int a,int b, int c) throws IllegalArgumentException{
		 
		 if ( a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
			 
			 throw new IllegalArgumentException("argument a must be a valid signed int");
		 
		 if ( b < Integer.MIN_VALUE || b > Integer.MAX_VALUE)
			 
			 throw new IllegalArgumentException("argument a must be a valid signed int");
		 
		 if ( c < Integer.MIN_VALUE || c > Integer.MAX_VALUE)
			 
			 throw new IllegalArgumentException(" argument must be a valid signed int");
		 
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	
	 
	  public void setLong(long x, long y , long z) throws IllegalArgumentException{
		  
		  if ( x < Long.MIN_VALUE || x > Long.MAX_VALUE)
			  
			  throw new IllegalArgumentException("argument x must be valid signed long");
		  
		  
	  }
	//methods
	
	
	public int signTransferInt(int a ,int b){
		int isign;
		int temp = b >> 31;
		isign = (absoluteValue(b) + temp) ^ temp;
		
		return isign;
		
		
	}
	
	public int compIntSimple(int a , int b) throws IllegalArgumentException {
		
		int result = 0;
		
		if (a < Integer.MIN_VALUE){
			throw new IllegalArgumentException("argument a must be signed int");
		
		}else	if  (a > Integer.MAX_VALUE){
			throw new IllegalArgumentException("argument a must be signed int");
		
		}else	if  (b < Integer.MIN_VALUE){
			throw new IllegalArgumentException("argument b must be signed int ");
		
		}else	if  (b > Integer.MAX_VALUE){
			throw new IllegalArgumentException("argument b must be signed int");
		
		}else {	
			
		if ( a == b){
			if (absoluteValue(a) - absoluteValue(b) == 0)
				
			result = 	(absoluteValue(a) - absoluteValue(b)) ;
			
				
			
		}else
		 if	(a != b){
			if ( a > b )
			if (absoluteValue(-a) - absoluteValue(-b) > 0 )
				
			result =	 (absoluteValue(-a) - absoluteValue(-b));
			
			
		 }
				    
			}
		return result;
		}
		
		
	  public int compInteger( int a , int b) throws IllegalArgumentException{
		  
		  if ( a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
			  
			  throw new IllegalArgumentException(" argument a must be signed int");
		  
		  if ( b < Integer.MIN_VALUE || b > Integer.MAX_VALUE)
			  
			  throw new IllegalArgumentException("argument must be signed int");
		  
		  int result  = 0; 
		  int val = 0;
		  switch (val ){
		  
		  case 0 :  if ( a < b );  result =   (a -b) ^ ((a ^ b) & ((a - b) ^ a));
		                            result = result >>>31;
				  
		            break;
		  case 1 :  if ( a <= b ) 
			  
			          if (a - b < 0 || a-b == 0);  result =  ( a | ~b) & (( a ^ b) | ~(b -a));
			                                       result = result >>>31;
			          break;
		  case 2 :  if    ( (a >= 0 || a<=Integer.MAX_VALUE) && (b >= 0 || b <= Integer.MAX_VALUE))
			  
			              if ( a < b);             result =   ( ~a & b)| (~(a^b)& (a - b)); 
			                                       result = result >>>31;
			              break;
		  }
		  
		  return result;
	  }
	
	  public boolean divOverflowDetect( int a , int b)  throws IllegalArgumentException , ArithmeticException{
		  
		  if ( a < Integer.MIN_VALUE || a> Integer.MAX_VALUE)
			  
			  throw new IllegalArgumentException("argument a must be signed int");
		  
		  if ( b < Integer.MIN_VALUE || b > Integer.MAX_VALUE )
			  
			  throw new IllegalArgumentException("argument must be signed int");
		  
		  int left_term;
		  int right_term;
		  int mask = 0x80000000;
		  int result;
		  int helper = ~(b ^ mask);
		  
		  left_term = absoluteValue(b & mask);
		  right_term = (absoluteValue(a) & absoluteValue(helper));
		  result = left_term | right_term;
		  
		  if (result < 0)
			  
			  throw new ArithmeticException("overflow has occured because of signed division ");
		  
		  if (result < 0)
			  
			  return true;
		  return false;
	  }
	  
	  
	public int rotateLeft(int a, int n) throws IllegalArgumentException{
		
		if (a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
			
			throw new IllegalArgumentException("argument a must be valid signed int");
		
		int q;
		
		q = (a << n) | (a >> (32-n));
		
		return q;
	}
       
	public int rotateRight(int a , int n) throws IllegalArgumentException{
		
		if ( a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
			
			throw new IllegalArgumentException("argument a must valid signed int");
		
		int q;
		
		q = (a >>> n) | (a << (32-n));
		
		return q;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		BinaryOp bin = new BinaryOp(14258963124L,25458963124L,45896452147L);
		     if  ( bin.testZero(bin.getLong_a(), 142596325411l) == 0){;
		     System.out.println("true");
		     } else{
		    	 System.out.println("false");
		     } 	 
		     
		     System.out.println(bin.testOneOrZero(bin.getLong_a(), 158965214444444L));
		     
		     System.out.println(bin.getNextEven(bin.getLong_a()));
		     System.out.println(bin.getPrevEven(bin.getLong_a()));
		    long temp = bin.turnonRighmostZeroes(bin.getLong_a());
		    System.out.println(Long.toBinaryString(temp));
		    long temp2 = bin.propagateSignExtension(bin.getLong_a());
		    System.out.println(Long.toBinaryString(temp2));
		    long temp3 = bin.shiftRightSignedFromUnsign(bin.getLong_a(), 3);
		    System.out.println(Long.toBinaryString(temp3));
		    System.out.println(bin.signumFunc(14569785123L));
		    
		    BinaryOp bin2 = new BinaryOp(250,128,999);
		    System.out.println(bin2.getInt_y());
		    System.out.println(bin2.getNextEvenInt(bin2.getInt_v()));
		    
		    if (bin.signumFunc(bin.getLong_a() & (bin.getLong_b())) == 1){
		    	System.out.print("true");
		    
		    } else{  System.out.println("false");
		    
	}
		    
		    System.out.println(bin2.signumFuncInt(-255));
		    
		    BitwiseOperations bit = new BitwiseOperations(128,256,1024);
			int temp4 =bit.getNextEvenInt(bit.a);
			System.out.println(Integer.toBinaryString(temp4));
			int temp5  = bit.signTransferInt(255,-1024);
			System.out.println(Integer.toBinaryString(temp5));
			System.out.println(bit.signumFuncInt(255));
			System.out.println(bit.absoluteValue(2550));
			
			
			System.out.println(bit.compIntSimple(100,100 ));
			System.out.println(bit.rotateLeft(bit.b, 3));
			System.out.println(bit.rotateRight(bit.c, 10));
			bit.setInt(1024, -10, 0xffffffff);
			System.out.println(bit.c);
			
			
			
		    
	}
	
}


