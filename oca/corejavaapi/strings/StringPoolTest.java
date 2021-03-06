
import otherpackage.*;

/*
These are the six facts on Strings:
1. Literal strings within the same class in the same package represent references to the same String object. 
2. Literal strings within different classes in the same package represent references to the same String object. 
3. Literal strings within different classes in different packages likewise represent references to the same String object. 
4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals. 
5. Strings computed at run time are newly created and therefore are distinct. (So line 4 prints false.)
6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 5 prints true.)

We advise you to read section 3.10.5 String Literals in Java Language Specification.
*/

class StringPoolTest{
  
   public static void main(String[] args){
      String hello = "Hello", lo = "lo";
      System.out.print((Other.hello == hello) + " ");    //true
      System.out.print((otherpackage.OtherStringPool.hello == hello) + " ");   //true
      System.out.print((hello == ("Hel"+"lo")) + " ");           //true
      System.out.print((hello == ("Hel"+lo)) + " ");              //false (line 4)
      System.out.println(hello == ("Hel"+lo).intern());          //true
   }
}

class Other { static String hello = "Hello"; }