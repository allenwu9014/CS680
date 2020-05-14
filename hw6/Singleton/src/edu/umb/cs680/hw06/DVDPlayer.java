package edu.umb.cs680.hw06;

public class DVDPlayer {
  private static DVDPlayer player = null;
    private static State state;
    private   DVDPlayer() {

    }
    public static DVDPlayer getInstance() {

        if(player == null) {
            state = DrawerClosedNotPlaying.getInstance();
        player = new DVDPlayer();
        }
        return player;
    }
   public void changeState(State state) {

        this.state = state;
    }
  public  void openCloseButtonPushed() {

        state.openCloseButtonPushed();
    }
  public  void playButtonPushed() {

        state.playButtonPushed();
    }
  public  void stopButtonPushed() {

        state.stopButtonPushed();
    }
    void open() {

        System.out.println("Drawer open.");
    }
    void close() {

        System.out.println("Drawer close.");
    }
    void play() {

        System.out.println("Start playing.");
    }
    void stop() {

        System.out.println("Stop playing.");
    }

    public static void main(String[] args) {
        DVDPlayer player = DVDPlayer.getInstance();
        player.openCloseButtonPushed();
        player.openCloseButtonPushed();
        player.playButtonPushed();
        player.stopButtonPushed();
        player.openCloseButtonPushed();
    }

}
