public class MoonMission extends SpaceMission{
    public MoonMission(CommunicationSystem communication) {
        super(communication);
    }
    @Override
    public void sendMessage(String message) {
        communication.send("Moon Mission: " + message);
    }
}
