package design.pattern.behavioral.command;

public class MinmizeCommand extends Command {
    private WindowHandler windowHandler;

    public MinmizeCommand() {
        windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
