Code can be run here: https://www.tutorialspoint.com/compile_java8_online.php
Modifiy compiler settings in Project -> Compile Options to:
javac -encoding UTF-8 MyClassName.java

Book: OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide

ToDo's:
-schleifen mit lables
-coden: int i, j, k; i = j = k = 9;
-long m = new Long("123"); ausführen, kompiliert das?
-numeric promotion (S. 55)
-casting primitives
-DateTime with(), from() methode verwenden
-temporalAccessor coden 
-alles aus Kapitel 5 durchgehen
--hiding vs overriding (S.254)
--Interfaces
--Polymorphism
--Subclass abstract mit superclass nicht abstract erstellen
-logical and bitwise AND, OR 
-String: alle metthoden, concat, method chaining etc.
-StringBuilder: alle OCA Methoden ausprobieren, auch chaining (substr vs append).
--setLength
-Static state change (S. 182f)
-initialisatzion order (S.204)
-immutable class schreiben (S. 207)
-float verhalten mit und ohne f  
-compiltetime runtime exception (S.289)
-aufschriebe durchgehen und unklarheiten die zu coden sind hier in den todos hinzfügen
-switch mit allen datentypen (S. 73)
-StringBuilder und chaining (S.111)
-Polymorphysim (S. 279)
--Object vs. Reference
--Casting (S. 282)
--Virtual Methods
--Polymorphic Parameters
--Method overriding
-Interfaces
-multi dimensional arrays:
int[][] ia; //this is a valid declaration.
int[][] ia = new int[2][3];//This is a valid declaration and a valid instantiation
int[][] iaa=new int[3][]; 
int[][][] iaaa = new int[3][][]; 

-switch implementieren:
Note that the following is invalid though because a char cannot be assigned to an Integer:
Integer x = 1;  // int x = 1; is valid.
switch(x){
   case 'a' : System.out.println("a");
}


In Progress:


Done:
-protected behaviour
-varags
-Autoboxing
-int array mit new operator ausprobieren (S. 173), arrays allgemein.
-package visibility and strange behaviour (im Buch die Stelle finden)
-Exception beispiele coden. z.B wann wird welcher code nach exception ausgeführt (S.326 Frage7, Frage 8,10,11)
-convert Varianten für arrays und listen
-Java 8 Date 
- Date formatting Seite 149
-streaming
-lambdas und predicates (S. 209-215)

###Notes:###
#start jdk docker:
docker run -it -v /c/Users/Jan-PC/dockerShare:/dockerShare openjdk
cd dockerShare/java-certificate/oca/


