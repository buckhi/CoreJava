package Section11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });


    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("sansserif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("sansserif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("the complete java dev course", 60, 40);
        g.setFont(sansSerifSmall);
        g.drawString("bac hai", 60, 100);

    }

}
