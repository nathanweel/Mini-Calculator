public class MiniCalc {
    public class MiniCalc1 {
        public static void main(String args[]) {

            //the primitive "x" always comes before the primitive "y"

            //change number
            double x = 5982;

            //change number
            double y = 75;

            //change for different operation (add, sub, mult, div, simplify)
            String op = "simplify";

            //if String 'op' equals "simplify" change n1 and n2
            //n1 is the numerator and n2 is the denominator (mixed numbers do not work)

            int n1 = 9;
            int n2 = 72;

            if (op.equals("add")){
                System.out.println("The answer is:");
                System.out.println(x + y);

            }else if (op.equals("sub")){
                System.out.println("The answer is:");
                System.out.println(x - y);

            }else if (op.equals("mult")){
                System.out.println("The answer is:");
                System.out.println(x * y);

            }else if (op.equals("div")){
                System.out.println("The answer is:");
                System.out.println(x / y);

            }else if (op.equals("simplify")){

                //I got the simplify code from the below URL
                // https://stackoverflow.com/questions/6618994/simplifying-fractions-in-java

                int temp1 = n1;
                int temp2 = n2;

                while (n1 != n2){
                    if(n1 > n2)
                        n1 = n1 - n2;
                    else
                        n2 = n2 - n1;
                }

                int n3 = temp1 / n1 ;
                int n4 = temp2 / n1 ;

                System.out.println("The answer is:");

                System.out.print(n3 + "/" + n4 + "\n\n" );

            }else {
                System.out.println("String 'op' has an undefined value");
            }
        }
    }

}