package design.pattern.behavioral.visitor;

public abstract class Department {
    public abstract void visit(FulltimeEmployee fulltimeEmployee);

    public abstract void visit(ParttimeEmployee parttimeEmployee);
}
