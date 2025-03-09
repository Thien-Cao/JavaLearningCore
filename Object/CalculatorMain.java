
// class Computer {
//     public void PlayMusic() {
//         System.out.println("Music playing");
//     }

//     public String getMeAPen(int cost) {
//         if (cost >= 10)
//             return "Pen";
//         return "Don't do anything, never get food";
//     }
// }
// ===> basic Object class => done

class Calculator {
    public int add(int numA, int numB, int numC) {
        return numA + numB + numC;
    }
    // IF WE WANT TO USE ONLY ONE METHOD TO CONTROL MANY CASE (1 PARAMS, TWO PARAMS
    // ,....) => METHOD OVERLOADING
    // public int addTwo() //NOT GOOD
    public int add(int numA, int numB) {
        return numA + numB; //over loading with add
    }
    public double add(double numA, int numB) {
        return numA + numB;
        //  double + int => double
    }
    
}

public class CalculatorMain {
    public static void main(String[] args) {
        // Basic object
        // Computer obj = new Computer();
        // obj.PlayMusic();
        // String str = obj.getMeAPen(2);
        // System.out.println(str);
        // ==============

        // ==> Method overloading
        Calculator cal = new Calculator();
        int r1 = cal.add(3, 4);
        System.out.println(r1);
    }
}

// Object oriented programing
// Object - Property and Behavior
// Class