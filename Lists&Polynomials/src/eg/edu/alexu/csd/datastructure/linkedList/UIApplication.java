package eg.edu.alexu.csd.datastructure.linkedList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UIApplication {
	  public static void main(String []args) {
	    	PolynomialSolver s=new PolynomialSolver();
	    	while(true) {
	    	System.out.println("please choose an action:");
	    	System.out.println("1_ Set a polynomial variable");
	    	System.out.println("2_ Print the value of a polynomial variable");
	    	System.out.println("3_ Add two polynomials");
	    	System.out.println("4_ Subtract two polynomials");
	    	System.out.println("5_ Multiply two polynomials");
	    	System.out.println("6_ Evaluate a polynomial variable");
	    	System.out.println("7_ Clear a polynomial variable");
	     	Scanner input=new Scanner(System.in);
	    	int num = 0;
	    	try {
	    	 num=input.nextInt();
	    	 if(num<1||num>7) {
		    		System.out.println("invalid input");
	    	 }
	    	}
	    	catch(InputMismatchException e){
	    		System.out.println("invalid input");
	    		input.next();
	    	}
	    	
	    	
	    	switch (num) {
	    	
	    	case 1:
	    		System.out.println("Insert the variable name: A, B or C");
	    		
char poly1;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly1!='A'&& poly1!='B'&&poly1!='C'&&poly1!='a'&& poly1!='b'&&poly1!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		System.out.printf("Insert the polynomial terms in the form:\n(coeff1,exponent1),(coeff2,exponent2),...\n");
	    		Scanner ss=new Scanner(System.in);
	    	    String b=null;
	    	    try {
	    	    b=ss.nextLine();String []x=b.trim().split("\\s+");
	    	    String c="";for(int i=0;i<x.length;i++) {c+=x[i];}
	    	    String []v1=c.split(",");int[][] u=new int[v1.length/2][2];int r=0;
	    	    for(int i=0;i<v1.length;i++) {v1[i]=v1[i].replaceAll("[()]", "");
	    	    v1[i]=v1[i].replaceAll("\\s+", "");}
	    	 for(int i=0;i<v1.length/2;i++) {
	    	 	for(int j=0;j<2;j++) {u[i][j]=Integer.parseInt(v1[r++]);	
	    	 		}}
               s.setPolynomial(poly1,u);break;
	    	    }
	    	    catch(Exception e) {
	    			System.out.println("invalid input");
	    			break;
	    			
	    		}
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		case 2:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		
        char poly2 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly2!='A'&& poly2!='B'&&poly2!='C'&& poly2!='R'&&poly2!='a'&& poly2!='b'&&poly2!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		s.print(poly2);break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		case 3:
	    		System.out.println("Insert first operand variable name:A ,B or c");
char poly3 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly3!='A'&& poly3!='B'&&poly3!='C'&&poly3!='a'&& poly3!='b'&&poly3!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		System.out.println("Insert second operand variable name:A ,B or c");
char poly4 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly4!='A'&& poly4!='B'&&poly4!='C'&&poly4!='a'&& poly4!='b'&&poly4!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		} 
	    		s.add(poly3, poly4);break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    	case 4:
	    		System.out.println("Insert first operand variable name:A ,B or c");
char poly5 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly5!='A'&& poly5!='B'&&poly5!='C'&&poly5!='a'&& poly5!='b'&&poly5!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		} 
	    		System.out.println("Insert second operand variable name:A ,B or c");
char poly6 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly6!='A'&& poly6!='B'&&poly6!='C'&&poly6!='a'&& poly6!='b'&&poly6!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		} 
	    		s.subtract(poly5, poly6);break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    	case 5:
	    		System.out.println("Insert first operand variable name:A ,B or c");
char poly7 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly7!='A'&& poly7!='B'&&poly7!='C'&&poly7!='a'&& poly7!='b'&&poly7!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		System.out.println("Insert second operand variable name:A ,B or c");
char poly8 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly8!='A'&& poly8!='B'&&poly8!='C'&&poly8!='a'&& poly8!='b'&&poly8!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		s.multiply(poly7, poly8);break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    	case 6:	
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		
char poly9 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly9!='A'&& poly9!='B'&&poly9!='C'&&poly9!='a'&& poly9!='b'&&poly9!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		System.out.println("Enter value you want");
	    		float value=input.nextFloat();
	    	    System.out.println(s.evaluatePolynomial(poly9, value));break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		case 7:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		
char poly10 = 0;
	    		
	    		try {
	    			
	    		poly1=input.next().charAt(0);
	    		if (poly10!='A'&& poly10!='B'&&poly10!='C'&&poly10!='a'&& poly10!='b'&&poly10!='c')  {
	    			System.out.println("invalid input");
	    			break;
	    		}
	    		s.clearPolynomial(poly10);break;
	    		}
	    		catch(Exception e) {
	    			System.out.println("invalid input");
	    		}
	    		//default:
	    			
	    			
	        		//	System.out.println("invalid input");
	        			
	        	
	        }
	    	
	    	}
	    	
	    	}
}