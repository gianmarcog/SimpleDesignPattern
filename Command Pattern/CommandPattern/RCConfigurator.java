public class RCConfigurator {

    public static void main(String[] args) {
        Drohne drohne = new Drohne();
        DrohneFlyLeftCommand leftCommand = new DrohneFlyLeftCommand(drohne);
        DrohneFlyRightCommand rightCommand = new DrohneFlyRightCommand(drohne);

        RemoteControl rc = new RemoteControl(leftCommand, rightCommand);
        rc.joyStickLeft();
    }
}
