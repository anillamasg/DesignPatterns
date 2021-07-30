package Creational.Singleton;

public final class Singleton {
    private final static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}

/*

USE CASE:

- When a class has no attribute, so it has no state, and we are passing values as method parameters.
- In that case, there is no need to create multiple objects. By creating a single object, we can call that method multiple times.
    class Circle{
        public area (int radius){
            //display area
            area=3.1412*r*r;
        }
    }

- When the case is read-only state, then also there is no need to create multiple objects, we can declare singleton.
    class Circle {
        private final pi=3.1412;
        public area(){
            //display area
        }
    }


MORE DETAILS:

- Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
- The singleton class must provide a global access point to get the instance of the class.
- Singleton pattern is used for logging, drivers objects, caching and thread pool.(in log4j,Hibernate we are using this pattern)

- There are many ways to perform logging/security etc. You could use AOP techniques.
- The problem with the singleton pattern is that it's hard to test, it breaks the single responsibility pattern too.

    - They cause tightly coupled code
    - They're in control of their own lifecycle
    - You cannot mock or test them easily
    - You cannot extend them (open/closed principle)

 */
