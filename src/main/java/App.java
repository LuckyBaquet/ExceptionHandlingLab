/**
 * Created by lucky on 2/16/16.
 */
public class App {

    public static void main(String[] args) {

        int x = 4;
        int y = 3;
        int z = 2;
        int zero = 0;

        Calculator.add(x,y);
        Calculator.add(x,zero);

        Calculator.subtract(x,y);
        Calculator.subtract(x,zero);

        Calculator.multiply(x,y);
        Calculator.multiply(x,zero);


        try {
            Calculator.divide(x, y);
            Calculator.divide(x, zero);
        }catch(DivisionByZeroException e){
            e.printStackTrace();
        }

        System.out.println("\nCalculations completed and all exceptions were handled");


    }

}
