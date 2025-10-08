import javax.swing.*;
import java.awt.*;

public class Stage extends JFrame {
    public Stage(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        setSize(screenSize.width/2, screenSize.width/2);
        Image img = toolkit.getImage("C:\\Users\\Korisnik\\Downloads\\JavaSwing-Cas1-20251008T105832Z-1-001\\JavaSwing-Cas1\\images/icon.png");
        setIconImage(img);
        setTitle("Moja Swing aplikacija");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
