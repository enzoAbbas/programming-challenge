Coding-Aufgabe

Ziel

Lösung muss ... sein:
- Robust \& Korrekt 
- Lesbar \& Wartbar
- Sauberes Softwaredesign \& Architektur

* Bereit sein es zu präsentieren
* Zeigen können wie ich es an einem Arbeitstag gelöst hätte
* Eigene Ideen und Lösungen -> Keine Richtigen oder falschen Lösungen





Wetter

* In weather.csv -> tägliches Wetter für einen Monat
* Datei lesen und folgendes Outputten
* Gib Tageszahl aus von Tag mit geringstem Spread -> Unterschied zwischen minimaler und maximaler Temperatur am selben Tag (Spalte 1 "Day") 
* Zweite Spalte -> Maximale Temperatur (MxT)
* Dritte Spalte -> Minimale Temperatur (MnT)



Länder

* In countries.csv -> 27 Länder der EU
* Spalten Population und Area nutzen um die Bevölkerungsdichte jedes Landes zu berechnen
* Datei lesen und dann das Land mit der höchsten Bevölkerungsdichte (People per square kilometre)



Aufgabe

1\. Ein Program, dass Wetter-Challenge löst
2\. Refactoren und erweitern, dass es ebenfalls Countries-Challenge beinhaltet



Prozess

* Designziele sollten priorisiert werden
* Unit Tests sollten ebenfalls implementiert werden



Modulideen

Klasse für Lösung selbst:

* Weather (Wetter eines Tages)
* Country (Land und seine Fläche wie Dichte)
* Builder-Pattern vermutlich besser als ewig langer Konstruktor
* Operationslogik sollte in eine eigene Klasse verlagert werden (Kapselung)
* Muss mir das ganze bildlich vorstellen können -> Diagramm zeichnen
* Ermittlungen der Lösungen die ich benötige vermutlich einfach innerhalb des Builders:
  * Keine komplizierten Rechnungen









