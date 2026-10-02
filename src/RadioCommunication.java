public class RadioCommunication implements CommunicationSystem {
    @Override
    public void send(String message) {
        System.out.println("Radio Communication: " + message);
    }
}
