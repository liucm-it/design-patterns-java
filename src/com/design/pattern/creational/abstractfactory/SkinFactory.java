package design.pattern.creational.abstractfactory;

public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
