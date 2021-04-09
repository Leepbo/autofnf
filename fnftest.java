import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.image.BufferedImage;

public class fnftest {

    public static void main(String[] args) {
        try {
            while (true) {
                Robot r = new Robot();

                Rectangle capture = new Rectangle(1000, 190, 301, 1);
                BufferedImage Image = r.createScreenCapture(capture);

                // public Color getPixel(int x, int y) {
                // return new Color(Image.getRGB(x, y));
                // }

                Color L = new Color(Image.getRGB(40, 0)), R = new Color(Image.getRGB(300, 0)),
                        D = new Color(Image.getRGB(130, 0)), U = new Color(Image.getRGB(210, 0));

                Color UP = new Color(18, 250, 5);
                Color LEFT = new Color(194, 75, 153);
                Color RIGHT = new Color(249, 57, 63);

                // Double keys

                if (L.equals(LEFT) && D.equals(Color.CYAN)) {
                    // System.out.println("left & down");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(37);// left
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(40);// down
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(37);// left
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyPress(40);// down
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }
                if (D.equals(Color.CYAN) && U.equals(UP)) {
                    // System.out.println("down & up");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(40);// down
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(38);// up
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(40);// down
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyPress(38);// up
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }
                if (U.equals(UP) && R.equals(RIGHT)) {
                    // System.out.println("up & right");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(38);// up
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(39);// right
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(38);// up
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyPress(39);// right
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }
                if (D.equals(Color.CYAN) && R.equals(RIGHT)) {
                    // System.out.println("down & right");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(40);// down
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(39);// right
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(40);// down
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyPress(39);// right
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }
                if (U.equals(UP) && L.equals(LEFT)) {
                    // System.out.println("up & left");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(38);// up
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(38);// up
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }
                if (R.equals(RIGHT) && L.equals(LEFT)) {
                    // System.out.println("right & left");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(39);// right
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(39);// right
                    // TimeUnit.MILLISECONDS.sleep(1);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(10);
                    continue;
                }

                // Single keys

                if (L.equals(LEFT)) {
                    // System.out.println("left");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(37);// left
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (D.equals(Color.CYAN)) {
                    // System.out.println("down");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(40);// down
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(40);// down
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (R.equals(RIGHT)) {
                    // System.out.println("right");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(39);// right
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(39);// right
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (U.equals(UP)) {
                    // System.out.println("up");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(38);// up
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(38);// up
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }

            }

        } catch (AWTException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}