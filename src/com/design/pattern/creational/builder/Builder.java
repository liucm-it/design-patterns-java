package design.pattern.creational.builder;

public abstract class Builder {
    protected Actor actor = new Actor();

    public abstract Builder buildType(String type);

    public abstract Builder buildSex(String sex);

    public abstract Builder buildFace(String face);

    public abstract Builder buildCostume(String costume);

    public abstract Builder buildHairstyle(String hairstyle);

    public Actor build() {
        return actor;
    }
}
