package design.pattern.creational.builder;

public class ActorBuilder extends Builder {
    public Builder buildType(String type) {
        actor.setType(type);
        return this;
    }

    public Builder buildSex(String sex) {
        actor.setSex(sex);
        return this;
    }

    public Builder buildFace(String face) {
        actor.setFace(face);
        return this;
    }

    public Builder buildCostume(String costume) {
        actor.setCostume(costume);
        return this;
    }

    public Builder buildHairstyle(String hairstyle) {
        actor.setHairstyle(hairstyle);
        return this;
    }
}
