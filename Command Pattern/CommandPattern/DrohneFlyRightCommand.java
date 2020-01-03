public class DrohneFlyRightCommand implements ICommand {

    private Drohne drohne;

    DrohneFlyRightCommand(Drohne drohne) {
        this.drohne = drohne;
    }

    public void execute() {
        drohne.leftMoreSpeed();
        drohne.rightLesspeed();
    }
}
