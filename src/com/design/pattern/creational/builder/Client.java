package design.pattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        Actor heroActor = new ActorBuilder().buildType("英雄")
                .buildSex("男")
                .buildFace("英俊")
                .buildCostume("盔甲")
                .buildHairstyle("飘逸")
                .build();
        System.out.println(heroActor);

        Actor angelActor = new ActorBuilder().buildType("天使")
                .buildSex("女")
                .buildFace("漂亮")
                .buildCostume("白裙")
                .buildHairstyle("披肩长发")
                .build();
        System.out.println(angelActor);

        Actor devilActor = new ActorBuilder().buildType("恶魔")
                .buildSex("妖")
                .buildFace("丑陋")
                .buildCostume("黑衣")
                .buildHairstyle("光头")
                .build();
        System.out.println(devilActor);
    }
}
