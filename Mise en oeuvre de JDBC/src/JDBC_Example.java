import java.sql.*;

public class JDBC_Example {

    public static void main(String[] args) {

        try {
            // Charger le driver de la BDD en mémoire
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/MyDatabase?useSSL=false";
            String name = "root";
            String password = "";
            // Établir la connexion avec la BDD
            Connection cx = DriverManager.getConnection(url, name, password);
            Statement st = cx.createStatement();

            // Créer la table Etudiants (si elle n'existe pas déjà)
            st.execute("CREATE TABLE IF NOT EXISTS Etudiants(id int NOT NULL AUTO_INCREMENT, Nom VARCHAR (255) NOT NULL, Prenom VARCHAR (255) NOT NULL, PRIMARY KEY (id))");

            // Ajouter des étudiants à la table
            st.execute("INSERT INTO Etudiants (Nom, Prenom) VALUES ('Daou', 'Joelle');");
            st.execute("INSERT INTO Etudiants (Nom, Prenom) VALUES ('Daou', 'Christelle');");

            // Lire les informations de la table
            ResultSet rs = st.executeQuery("SELECT * FROM Etudiants");
            while (rs.next()) {
                String prenom = rs.getString("Prenom");
                String nom = rs.getString("Nom");
                System.out.println(prenom + " " + nom);
            }

            // Fermer la connexion
            rs.close();
            st.close();
            cx.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
