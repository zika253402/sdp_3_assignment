public abstract class SpaceMission {
    protected CommunicationSystem communication;
    public SpaceMission(CommunicationSystem communication) {
        this.communication = communication;
    }
    public abstract void sendMessage(String message);
}
