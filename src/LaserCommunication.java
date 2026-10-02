public class LaserCommunication implements CommunicationSystem {
    @Override
    public void send(String message) {
        System.out.println("Laser Communication: " + message);
    }
}
