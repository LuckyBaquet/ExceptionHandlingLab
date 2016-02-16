import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Created by lucky on 2/16/16.
 */
public class Calculator {

    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x-y;
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static int divide(int x, int y) throws DivisionByZeroException{

        if(y==0) throw new DivisionByZeroException("You Divided by Zero! Your middle school arithmetic teacher would be so upset with you");

        return x/y;
    }

    public static double squareRoot(int num){

        if(num < 0) throw new ComplexNumberException("The answer is a complex number");

        return Math.sqrt(num);
    }

}

class DivisionByZeroException extends ArithmeticException{
    DivisionByZeroException(String note){
        super(note);
    }

}

class ComplexNumberException extends ArithmeticException{
    ComplexNumberException(String note){
        super(note);
    }
}
