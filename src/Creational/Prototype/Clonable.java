package Creational.Prototype;

public interface Clonable extends Cloneable{
    Clonable clone() throws CloneNotSupportedException;
}

/*

- A prototype is a template of any object before the actual object is constructed. In java also, it holds the same meaning. Prototype design pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state or differs very little.

- In this design pattern, an instance of actual object (i.e. prototype) is created on starting, and thereafter whenever a new instance is required, this prototype is cloned to have another instance. The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.



So deep cloning requires satisfaction of following rules –

- No need to separately copy primitives.
- All the member classes in original class should support cloning and in clone method of original class in context should call super.clone() on all member classes.
- If any member class does not support cloning then in clone method, one must create a new instance of that member class and copy all its attributes one by one to
new member class object. This new member class object will be set in cloned object.

 */
