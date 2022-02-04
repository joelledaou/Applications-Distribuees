Ceci est un exemple simple d’une servlet Java, déployée sur le serveur WEB Apache Tomcat (version 9.0.58). 
Tout d’abord, sur Eclipse (Eclipse IDE for Enterprise Java and Web Developers), configurer le serveur WEB : Window -> Show View -> Other.. -> Servers puis choisir Apache Tomcat.
Ensuite, pour créer un nouveau projet : File -> New -> Dynamic Web Project.
Dans src/main/webapp créer un nouveau fichier HTML (right click -> new -> HTML File) qui sera responsable de l’affichage de la page HTML.
Dans src/main/java : right click -> new -> Servlet. Ceci correspond à une classe Java qui étend la classe HttpServlet et qui redéfinit la méthode service. 
Enfin, right click sur le fichier HTML et faire un ‘Run on Server’. La page HTML – avec laquelle vous pouvez interagir – sera affichée sur le WEB browser.
