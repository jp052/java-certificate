Code can be run here: https://www.tutorialspoint.com/compile_java8_online.php
Modifiy compiler settings in Project -> Compile Options to:
javac -encoding UTF-8 MyClassName.java

Buch: OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide

ToDo's:
-package visibility and strange behaviour (im Buch die Stelle finden)
-String: alle metthoden, concat, method chaining etc.
-StringBuilder: alle OCA Methoden ausprobieren, auch chaining (substr vs append).
-convert Varianten für arrays und listen
-Static state change (S. 182f)
-initialisatzion order (S.204)
-immutable class schreiben
-lambdas und predicates (S. 209-215)
-float verhalten mit und ohne f 
-alles aus Kapitel 5 durchgehen 
-compiltetime runtime exception (S.289)
-Exception beispiele coden. z.B wann wird welcher code nach exception ausgeführt (S.326 Frage7, Frage 8,10,11)

In Progress:
-Java 8 Date mit Period

Done:


###Notes:###
#start jdk docker:
docker run -it -v /c/Users/Jan-PC/dockerShare:/dockerShare openjdk
cd dockerShare/java-certificate/oca/