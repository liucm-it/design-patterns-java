package design.pattern.behavioral.mediator;

public class Seller extends Customer {
    private static final long serialVersionUID = 1L;

    public Seller(String name) {
        super(name);
        ClientWindow(50, 100);
    }

    @Override
    public void send(String ad) {
        ReceiveArea.append("(卖方)说：" + ad + "\n");
        // 使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        ReceiveArea.append(from + "说: " + ad + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }
}
