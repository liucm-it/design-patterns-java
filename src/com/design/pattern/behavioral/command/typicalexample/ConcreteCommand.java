package design.pattern.behavioral.command.typicalexample;

public class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
