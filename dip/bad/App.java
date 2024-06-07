package Taller03_SOLID.secA.dip.bad;

public class App {
    public SQLDatabaseConnection databaseConnection;

    public App(SQLDatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void connectToDatabase() {
        databaseConnection.connectToDatabase();
    }
}
