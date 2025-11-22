import java.lang.foreign.MemorySegment.Scope;

public class Variables01 {

    // Variables declared inside a class but outside all methods are called instance variables.Accessible to all methods of the object.

    // Variables01 v = new Variables01();
    // System.out.println(v.InstanceVar);

    int InstanceVar =1000;
    static String College = "Ipu";

    public static void Age() {
        int age = 0;//local variable: Only accessible within the method/block
        age = age + 7;
        System.out.println("Age is : " + age);
    }

    public static void main(String[] args){

        // VARIABLE

        // What is a Java Variable?
        // A variable provides us with named storage that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.

        // Syntax:
        //data type variable [ = value][, variable [ = value] ...] ;

        // TYPES:
        // Local variables
        // Instance variables
        // Class/Static variables

        // Local variables
        Age();

        // Instance variables
        //Accessing Instance Var
        //Instance variables belong to objects, not to the class itself — that is the core reason why you must create an object to access them.

        Variables01 v = new Variables01();
        System.out.println("Accessing Instance Var: " + v.InstanceVar);

        // Class/Static variables

        // Variables declared using the static keyword inside a class.Shared among all objects of the class (only one copy exists).

        System.out.println(College);




    }
}

