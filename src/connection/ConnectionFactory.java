package connection;

public class ConnectionFactory {

    public void openConnection() {
        System.out.println("abrindo conexão com o banco de dados");
    }

    public void executeSQL() {
        System.out.println("executando sql do bd");
    }
    public void closeConnection(long timeout) {
        System.out.println("fechando a conexão com o bd por causa de timeout");
    }


}
