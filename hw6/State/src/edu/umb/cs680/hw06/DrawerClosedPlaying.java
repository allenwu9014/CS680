package edu.umb.cs680.hw06;

public class DrawerClosedPlaying implements State{

   public DrawerClosedPlaying() {}
   public void openCloseButtonPushed() {
        player.stop();
        player.open();
        player.changeState(new DrawerOpen());
    }
   public void playButtonPushed() {
        // do nothing
    }
   public void stopButtonPushed() {
        player.stop();
        player.changeState(new DrawerClosedNotPlaying());
    }

}
