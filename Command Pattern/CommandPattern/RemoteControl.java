public class RemoteControl {

    private ICommand flyRightCommand;
    private ICommand flyLeftCommand;

    RemoteControl(ICommand right, ICommand left) {
        flyRightCommand = right;
        flyLeftCommand = left;
    }

    public void joyStickRight(){
        flyRightCommand.execute();
    }

    public void joyStickLeft(){
        flyLeftCommand.execute();
    }
}
