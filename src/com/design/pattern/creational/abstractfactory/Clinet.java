package design.pattern.creational.abstractfactory;

public class Clinet {
    public static void main(String[] args) {
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
