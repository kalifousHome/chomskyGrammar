AeL TP 6 : Chomsky Grammar

Binôme : Traoré Kalifou - Graux Pierre

fichiers : 

- chmosky.jar contient tests, binaires et documentations du projet
  Il est executable (main décrit ci-dessous).

- le dossier doc contient toute la documentation du projet (voir doc/index.html)

- le dossier src contient les sources de notre projet. Il contient un package général (chomsky) qui contient toutes nos classes.
  Ce package en comporte 3 : un package cellule qui implémente le tableau utilisé par l'algorithme CYK
  							 un package component qui implémente les symboles terminaux et non terminaux ainsi que les alphabets.
  							 un package production qui implémente les productions du type des grammaires de chomsky
  L'implémentation précise de chaque élement et structure est décrite dans la documentation des packages et des classes.
  Le package principal comporte deux classes : une implémentant les grammaires de chmosky et un main donnant un exemple d'utilisation de ces grammaires.
  
- un package de test est également présent dans le package chomsky, il couvre 90 pourcent du code.

- le dossier bin contient les .class
  le bin/chomsky/Main.java est executable