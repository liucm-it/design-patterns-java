package design.pattern.creational.builder.v2;

public class Clinet {
    public static void main(String[] args) {
        Actor actor = new Actor.ActorBuild()
                .buildType("英雄")
                .buildSex("男")
                .buildFace("英俊")
                .buildCostume("盔甲")
                .buildHairstyle("飘逸").build();
        System.out.println(actor);
    }
}
