import java.util.Scanner;

public class ArithmeticCalculator {
    double result;
    public static double add(double x,double y){
        return x+y;
    }
    public static double sub(double x,double y){
        return x-y;
    }
    public static double mul(double x,double y){
        return x*y;
    }
    public static double div(double x,double y){
        return x/y;
    }
    public static void main(String[] args) {
    	ArithmeticCalculator calc=new ArithmeticCalculator();
    	Scanner input=new Scanner(System.in);
    	while(true) {
    		System.out.println("\nExit (y/n): ");
        	char r=input.next().charAt(0);
        	if(r=='y')
        		break;
            System.out.print("\nOperand 1: ");
            double o1=input.nextDouble();
            System.out.print("Operand 2: ");
            double o2=input.nextDouble();
            System.out.println("\nEnter the required operation\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n");
            int o=input.nextInt();
            switch(o){
                case 1:calc.result=add(o1,o2);
                    System.out.println("\nSum = "+calc.result);
                    break;
                case 2:calc.result=sub(o1,o2);
                    System.out.println("\nDifference = "+calc.result);
                    break;
                case 3:calc.result=mul(o1,o2);
                    System.out.println("\nProduct = "+calc.result);
                    break;
                case 4:calc.result=div(o1,o2);
                    System.out.println("\nQuotient = "+(int)calc.result+"\nRemainder = "+(int)(o1%o2));
                    break;
                default:System.out.println("\nSelect 1 to 4");
            }
    	}
        input.close();
    }
}
