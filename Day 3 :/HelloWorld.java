public class HelloWorld     // classname : HelloWorld
{
  public static void main(String[] args)    // classname : String
  {
    System.out.println('Hello World");      // classname : System
  }
}
                       
                       
                       
// we can create class under a class which is called " inner class". the class under which we have created class called " outer class".
// Inner class can be public , private, protected,default(if we don't write anything then) But outer class can be only public or default.
// for readability we use camelcase while writing class name.(spaces are not allowed while writing class names) 
// it is necessary for main function too to be under a class name because no function could be no member function. 
// main function prototype is fixed  "public static void main(String[] args)"   it is public so that JVM can call it outside of the class's body. we make any member function public so that we call it outside of the class.
// static - when we made a member static then it is not called an object of that class if we will not make an object of that class still we can call it.Any static function can be call without making object of that class.
// void meaning function is not returning anything. then there is function main under it formal arguments (String[] args) is present.so here is making an array in which  a lots strings as of arguments can be received
// System.out.println - Here System is a class name (starts with caps), whenever you find a dot(.) after a class name that means you're accessing a static member of that class.and after the classname you put a dot and then you are going to write any static member of that class static member can be variable , function. Here out is reference variable 
// static reference variable it is going to represent an object means that object address is kept in this out named reference variable it is like a pointer and we call it reference variable and it represnts an object. 
 // out will become object of print String class  we are calling memeber function println.And the string which will print on screen as it is.                 
