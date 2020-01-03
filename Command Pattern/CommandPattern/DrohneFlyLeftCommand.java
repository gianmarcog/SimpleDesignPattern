public class DrohneFlyLeftCommand implements ICommand {

    private Drohne drohne;

    DrohneFlyLeftCommand(Drohne drohne) {
        this.drohne = drohne;
    }

    public void execute() {
        drohne.leftLessSpeed();
        drohne.rightMoreSpeed();
    }

}
