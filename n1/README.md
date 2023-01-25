# TascaS4.01-Nivell1-Spring

- Exercici Spring i Maven
Aquest exercici és un primer contacte amb Spring i Maven.

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:


PROJECT (gestor de dependències)

Maven.

LANGUAGE

Java.

SPRING BOOT

La darrera versió estable.

PROJECT METADATA

Group

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

Artifact

S04T01N01GognomsNom

Name

S04T01N01GognomsNom

Description

S04T01N01GognomsNom

Package name

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

PACKAGIN

Jar

JAVA

Mínim versió 11 

Dependències:

Spring Boot DevTools

Spring Web


Importa’l a Eclipse amb l’opció File > Import > Existing Maven Project.

A l’arxiu application.properties, configura la variable server.port amb el valor 9000.

Convertirem aquesta aplicació en una API REST:
Depenent del package principal, crea un altre subpackage anomenat Controllers, i dins seu, afegeix la classe HelloWorldController.


Haurà de tenir dos mètodes:
String saluda
String saluda2

Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:

“Hola, “ + nom + “. Estàs executant un projecte Maven”.


El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nom=El meu nom

 

El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.

Haurà de respondre a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/el meu nom

 Molt Important

A més de l’enllaç a Git de la tasca resolta, hauràs d’incloure al menys dos enllaços diferents dels recursos que t’hem proporcionat al campus, que t’hagin servit o ho haguessin pogut fer, per resoldre la totalitat de la tasca o algunes parts.

https://youtu.be/d8okKeUTUvs https://stackoverflow.com/questions/4904092/with-spring-can-i-make-an-optional-path-variable
