// import java.lang.reflect.Method;
import java.util.Arrays;

public class Functions {

    public static void printName(){//no return, no parameter
        System.out.println("My name is Nitish Kumar ");
    }
    //method overloading 
    public static void printName(String n){
        System.out.println("Your Name is : " + n);
    }
    public static void printAge(int age){//no return, with parameter
        System.out.println("My age is " +age);
    }
    public static int min(int x, int y){
        if(x>y){
            return y;
        }else return x;
    }
    void nonStatic(){
        System.out.println("This is non static function need to be accessed by creating an object!");
    }

    // pass by value 
    public static void change(int n){
        n+=5;
        System.out.println("Changed value of "+n+ " is : " + n );
    }

    public static void main(String[] args){
        // # What is a Method in Java?

        // A method is a block of code that performs a specific task and executes only when it is called.

        // # Java methods are used to:

        // Reuse code
        // Break a large program into smaller parts
        // Improve readability
        // Avoid repetition
        // Maintain clean structure

        // # SYNTAX:
        // modifiers returnType methodName(parameters) {//modifiers are optional
        // method body
        // return value;   // optional
        // }

        // When you call a method:

        // # Memory Diagram
        // Parameters + Local variables → stored in stack   
        // Instance variables → stored in heap
        // Static methods/variables → stored in method area

        // # Types of Methods in Java

        // Java methods are mainly divided into:

        // 01. User-defined methods
        printName();
        printAge(21);
        int a=64;
        int b=5;
        System.out.println("Minimum of two is :" + min(a,b));

        // 02. Built-in (predefined) methods

        int[] array = {6,8,9,5,7,3};
        System.out.println("Square root of "+ a + " is "+ Math.sqrt(a));

        Arrays.sort(array);
        System.out.print("Sorted array is : ");
        for(int v:array){
            System.out.print(v +" ");
        }
        System.out.println();
        

        // # Static vs Non-Static Methods

        // Static Method
        // Belongs to class, not object → can be called using class name.
        Functions.printName();

        // Non-Static Method
        // Belongs to object → must create object.
        Functions f1 = new Functions();
        f1.nonStatic();

        // # Method Overloading (Same name, different parameters)
        // Decided at compile-time
        // Part of polymorphism

        printName();
        printName("Amit");

        // # Method Overriding (Same name, same parameters, different class)
        // Happens with inheritance
        // Decided at runtime
        // Supports dynamic polymorphism

        // class A {
        //     void show() {}
        // }

        // class B extends A {
        //     @Override
        //     void show() {}
        // }

        // # Pass by Value in Java
        int pass = 20;
        change(pass); //Output: 20 (NOT changed) || a copy of pass is passed and modified

        // # Pass by Reference in Java
        // wiil study later




    }
}
