public class Main {

    public static void main(String[] args) {

        SpaceMission marsRadio =
                new MarsMission(new RadioCommunication());

        marsRadio.sendMessage("Hello from Mars");

        SpaceMission marsLaser =
                new MarsMission(new LaserCommunication());

        marsLaser.sendMessage("Hello from Mars");

        System.out.println("--------------");

        SpaceMission moonRadio =
                new MoonMission(new RadioCommunication());

        moonRadio.sendMessage("Hello from Moon");

        SpaceMission moonLaser =
                new MoonMission(new LaserCommunication());

        moonLaser.sendMessage("Hello from Moon");
    }
}