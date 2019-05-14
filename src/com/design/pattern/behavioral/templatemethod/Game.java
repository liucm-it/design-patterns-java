package design.pattern.behavioral.templatemethod;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    private void playMusic() {
        System.out.println("一边听歌，一边玩游戏！");
    }

    // 钩子方法
    public boolean hasMusic() {
        return false;
    }

    // 模板
    public final void play() {
        initialize();

        if (hasMusic()) {
            playMusic();
        }

        startPlay();

        endPlay();
    }
}
