import java.util.*;

class Complex1{
	float x;//real no
	float y;//imaginary no
	
    Complex1(){

	};

	Complex1(float a, float b){
		x = a;
		y = b;
	}
	void print(){
		System.out.println(" the complex Number is : " + x + " + " + y+"i");
	}
	void sum(float a, float b, float c,float d){
		x = a+c;
		y = b+d;
	 System.out.println(" the sum is: " + x + " + " + y+"i");	
	}

	void multiply(float a, float b, float c,float d){

		 x=a*c-b*d;
		 y=a*d+c*b;

	
	y = b*d;
	 System.out.println(" the multiply is: " + x + " + " + y+"i");	
	}
}

public class complexclass{
	public static void main(String[] args){
		

		System.out .println(" Enter real part of first  complex Number ");
		Scanner sc = new Scanner(System.in);
		float q = sc.nextFloat();
		System.out .println(" Enter imaginary part of first  complex Number ");
		float r = sc.nextFloat();

		System.out .println(" Enter real part of second  complex Number ");
		float s = sc.nextFloat();
		System.out .println(" Enter imaginary part of second  complex Number ");
		float t = sc.nextFloat();

        Complex1 h = new Complex1(q,r);
        Complex1 h1 = new Complex1(s,t);
        Complex1 h2 = new Complex1();
        

		
        h.print();
        h1.print();
        h2.sum(q,r,s,t);
        h2.multiply (q,r,s,t);

	
	}
}
