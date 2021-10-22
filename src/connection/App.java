package connection;

public class App {
    public static void main(String[] args) {
        ConnectionFactory connection = new ConnectionFactory();

        connection.openConnection();
        connection.executeSQL();
        connection.closeConnection(30001);
    }
}
