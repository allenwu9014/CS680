package edu.umb.cs680.hw06;

public class DrawerClosedNotPlaying implements State {

   public DrawerClosedNotPlaying() {}
  public  void openCloseButtonPushed() {
        player.open();
        player.changeState(new DrawerOpen());
    }
  public  void playButtonPushed() {
      player.play();
      player.changeState(new DrawerClosedPlaying());
    }
  public  void stopButtonPushed() {
        // do noting
    }

}
