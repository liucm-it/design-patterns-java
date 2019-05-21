package design.pattern.behavioral.chainofresponsibility.typicalexample;

public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        // 请求满足条件
        if ("".equals(request)) {
            // 处理请求...
        } else  {
            // 转发请求...
            this.successor.handleRequest(request);
        }
    }
}
