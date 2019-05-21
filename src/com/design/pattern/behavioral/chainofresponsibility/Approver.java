package design.pattern.behavioral.chainofresponsibility;

public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}

class Manager extends Approver {


    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 10000) {
            System.out.println("总监" + this.name + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount() + "元，采购目的："
                    + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);
        }
    }
}

class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("总监" + this.name + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount() + "元，采购目的："
                    + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);
        }
    }
}

class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单："
                    + request.getNumber() + "，金额：" + request.getAmount() + "元，" +
                    "采购目的：" + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);
        }
    }
}

class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单："
                    + request.getNumber() + "，金额：" + request.getAmount() + "元，" +
                    "采购目的：" + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);
        }
    }
}

class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，" +
                "金额：" + request.getAmount() + "元，" +
                "采购目的：" + request.getPurpose() + "。");        //处理请求
    }
}
