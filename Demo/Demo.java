package Demo;

public class Demo {
    public static void main(String[] args) {
        // // Relational Operators
        // // >, <, = , ! , ...

        // double x = 6.6;
        // double y = 6.6;
        // boolean result = x == y;
        // // Relational Operators

        // int a = 8;
        // int b = 7;

        // int z= 5;
        // int w= 6;

        // boolean result2 = a > b && z < w;

        // // ## -> ampersand
        // // ! exclamation mark
        // // pipe -> ||

        // // Logical Operators (And | Or | Not)

        // boolean resultInt = a > b;
        // System.out.println(result);
        // System.out.println(result2);
        // ===> learning already

        /// if else conditions
        /// 
        // int x = 8;
        // int y = 9;
        // int z = 29;
        // if (x == 8 && x > y) {
        // System.out.println("Hello");
        // return;
        // } else if (y > x)
        // System.out.println(z);
        // System.out.println("Bye");

        ///tenary => condition ? statement1 : statement2
        /// 
        // int n = 5;
        // int result = 0;
        // if (n % 2 == 0)
        // result = 10;
        // else
        // result = 20;
        // System.out.print(result);
        // // instead using if else like this example above, we can use ternary operator
        // // like this!
        // // ==>
        // result = n % 2 == 0 ? 10 : 20; // this way is called ternary operator !

        // ==> done

        /// switch - case statement
        // int days = 1;

        // switch (days) {
        // case 1:
        // System.out.println("Mon");
        // break;
        // case 2:
        // System.out.println("Tue");
        // break;
        // case 3:
        // System.out.println("Wed");
        // break;
        // case 4:
        // System.out.println("Thurs");
        // break;
        // case 5:
        // System.out.println("Fri");
        // break;
        // case 6:
        // System.out.println("Sat");
        // break;
        // case 7:
        // System.out.println("Sun");
        // break;
        // default:
        // System.out.println("Enter a value number to checking days in week");
        // break;
        // }
        // ==> done

        // Loops - while , do while, for
        // 1. while
        // this demo will apply Arthemetic operator !
        // int increment = 1;
        // while (increment <= 4) {
        // System.out.println("Hello" + increment);
        // increment++;
        // }

        // System.out.println("End Result" + increment);
        // ==> Done

        // 2.Do -while
        // Run at least one time even the condition wrong!
        // int increment = 1;
        // do {
        // System.out.println("Hello" + increment);
        // increment++;
        // } while (increment <= 4);

        // System.out.println("End Result" + increment);

        // ==> done

        // 3.For loop

        // int variable = 4;
        // // int a, b;
        // // a = b = 10; ==> a= 10 b =10
        // for (int i = 0; i < variable; i++) {
        // System.out.println("variable" + (i));
        // }

        int a = 3;

        int b = 6;
    
        int result = (~a & b) | (a & ~b);
    
        System.out.println(result);
        // System.out.println(i);
    }
}
