Code can be run here: https://www.tutorialspoint.com/compile_java8_online.php
Modifiy compiler settings in Project -> Compile Options to:
javac -encoding UTF-8 MyClassName.java

Buch: OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide

ToDo's:
-streaming
-lambdas und predicates (S. 209-215)
-alles aus Kapitel 5 durchgehen
-logical and bitwise AND, OR 
-String: alle metthoden, concat, method chaining etc.
-StringBuilder: alle OCA Methoden ausprobieren, auch chaining (substr vs append).
-Static state change (S. 182f)
-initialisatzion order (S.204)
-immutable class schreiben
-float verhalten mit und ohne f  
-compiltetime runtime exception (S.289)
-aufschriebe durchgehen und unklarheiten die zu coden sind hier in den todos hinzfügen

In Progress:
- Date formatting Seite 149

Done:
-protected behaviour
-varags
-Autoboxing
-int array mit new operator ausprobieren (S. 173), arrays allgemein.
-package visibility and strange behaviour (im Buch die Stelle finden)
-Exception beispiele coden. z.B wann wird welcher code nach exception ausgeführt (S.326 Frage7, Frage 8,10,11)
-convert Varianten für arrays und listen
-Java 8 Date 

###Notes:###
#start jdk docker:
docker run -it -v /c/Users/Jan-PC/dockerShare:/dockerShare openjdk
cd dockerShare/java-certificate/oca/