package edu.umb.cs680.hw06;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
public class DVDPlayerTest {
   @Test
    public void DVDPlayerRunTest() {

       ByteArrayOutputStream stream = new ByteArrayOutputStream();
       PrintStream printout= new PrintStream(stream);
       System.setOut(printout);

       DVDPlayer player = DVDPlayer.getInstance();
       player.openCloseButtonPushed();
       player.openCloseButtonPushed();
       player.playButtonPushed();
       player.stopButtonPushed();
       player.openCloseButtonPushed();
       String expected = "Drawer open. Drawer close. Start playing. Stop playing. Drawer open. ";
       assertEquals(expected, stream.toString());

   }
}
