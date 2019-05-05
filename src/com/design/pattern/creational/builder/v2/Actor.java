package design.pattern.creational.builder.v2;

public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    public Actor(ActorBuild actorBuild) {
        this.type = actorBuild.type;
        this.sex = actorBuild.sex;
        this.face = actorBuild.face;
        this.costume = actorBuild.costume;
        this.hairstyle = actorBuild.hairstyle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", costume='" + costume + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                '}';
    }

    public static class ActorBuild {
        private String type;
        private String sex;
        private String face;
        private String costume;
        private String hairstyle;

        public ActorBuild buildType(String type) {
            this.type = type;
            return this;
        }

        public ActorBuild buildSex(String sex) {
            this.sex = sex;
            return this;
        }

        public ActorBuild buildFace(String face) {
            this.face = face;
            return this;
        }

        public ActorBuild buildCostume(String costume) {
            this.costume = costume;
            return this;
        }

        public ActorBuild buildHairstyle(String hairstyle) {
            this.hairstyle = hairstyle;
            return this;
        }

        public Actor build() {
            return new Actor(this);
        }
    }
}
