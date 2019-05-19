package design.pattern.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandlerUtil handler = new InstructionHandlerUtil();
        handler.handle(instruction);
        String outString = handler.output();
        System.out.println(outString);
    }
}
