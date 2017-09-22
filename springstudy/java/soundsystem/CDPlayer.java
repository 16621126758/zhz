package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  public CompactDisc getCd() {
    return cd;
  }

  public void setCd(CompactDisc cd) {
    this.cd = cd;
  }

  private CompactDisc cd;

  public CDPlayer(){}
  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
