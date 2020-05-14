package edu.umb.cs680.hw06;

public class DrawerOpen implements State {

    public DrawerOpen() {}
   public void openCloseButtonPushed() {
        player.close();
        player.changeState(new DrawerClosedNotPlaying());
    }
   public void playButtonPushed() {
        player.close();
        player.play();
        player.changeState(new DrawerClosedPlaying());
    }
   public void stopButtonPushed() {
     // do noting
    }
}
