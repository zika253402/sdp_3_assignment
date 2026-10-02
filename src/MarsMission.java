public class MarsMission extends SpaceMission{
    public MarsMission(CommunicationSystem communication) {
        super(communication);
    }
    @Override
    public void sendMessage(String message) {
        communication.send("Mars Mission: " + message);
    }
}
