package Taller03_SOLID.secA.dip.good;

public class App {
    public DatabaseConnection databaseConnection;

    public App(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    public void connectToDatabase(){
        databaseConnection.connectToDatabase();
    }
}
