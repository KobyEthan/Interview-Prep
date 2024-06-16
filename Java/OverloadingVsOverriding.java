package Java;
// Method Overloading:

// In Java, Method Overloading allows different methods to have the same name, 
// but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

// Method overloading is a compile-time polymorphism.	
// Method overloading helps to increase the readability of the program.	
// It occurs within the class.	
// Method overloading may or may not require inheritance.	
// In method overloading, methods must have the same name and different signatures.	
// In method overloading, the return type can or can not be the same, but we just have to change the parameter.	
// Static binding is being used for overloaded methods.
// Poor Performance due to compile time polymorphism.	
// Private and final methods can be overloaded.	
// The argument list should be different while doing method overloading.	

import java.io.*;

class MethodOverloadingEx {

    static int add(int a, int b) { return a + b; }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // Main Function
    public static void main(String args[])
    {
        System.out.println("add() with 2 parameters");
        // Calling function with 2 parameters
        System.out.println(add(4, 6));

        System.out.println("add() with 3 parameters");
        // Calling function with 3 Parameters
        System.out.println(add(4, 6, 7));
    }
}

// Output
// add() with 2 parameters
// 10
// add() with 3 parameters
// 17

// Method Overrriding: 

// In Java, Overriding is a feature that allows a subclass or child class to provide
// a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass 
// has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, 
// then the method in the subclass is said to override the method in the super-class.

// Method overriding is a run-time polymorphism.
// Method overriding is used to grant the specific implementation of the method which is already provided by its parent class or superclass.
// It is performed in two classes with inheritance relationships.
// Method overriding always needs inheritance.
// In method overriding, methods must have the same name and same signature.
// In method overriding, the return type must be the same or co-variant.
// Dynamic binding is being used for overriding methods.
// It gives better performance. The reason behind this is that the binding of overridden methods is being done at runtime.
// Private and final methods can’t be overridden.
// The argument list should be the same in method overriding.

// Base Class
class Animal {
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

// Inherited Class
class Dog extends Animal {
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}

// Driver Class
class MethodOverridingEx {
    // Main Function
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();      
        a1.eat();

          // Polymorphism: Animal reference pointing to Dog object
        Animal animal = new Dog();
      
          // Calls the eat() method of Dog class
        animal.eat(); 
    }
}

// Output:
// eat() method of derived class
// Dog is eating.
// eat() method of base class
// eating.
// eat() method of derived class
// Dog is eating.