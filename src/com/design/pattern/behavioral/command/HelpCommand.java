package design.pattern.behavioral.command;

public class HelpCommand extends Command {
    private HelpHandler handler;

    public HelpCommand() {
        handler = new HelpHandler();
    }

    @Override
    public void execute() {
        handler.display();
    }
}
