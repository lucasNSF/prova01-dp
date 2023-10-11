public class App {
  public static void main(String[] args) {
    Protocol protocol = ProtocolCreator.create(
      TypeProtocol.HTTP, "ifba.edu.br", 8080
    );
    
    protocol.open();
    protocol.message();
    protocol.close();
  }
}
