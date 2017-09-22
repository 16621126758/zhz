package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by yanliwei on 2017/7/25.
 */
@Component("liangliang")
public class LiangLiang implements CompactDisc {
    private String title="凉凉";
    private String artist = "张碧晨";

    public void play() {
        System.out.println("正在播放的是由"+this.artist+"演唱的"+title);
    }
}
