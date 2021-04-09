import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

import java.awt.image.BufferedImage;

public class fnftest {

    public static void main(String[] args) {
        try {
            while (true) {
                Robot r = new Robot();

                Rectangle capture = new Rectangle(1000, 190, 301, 1);
                BufferedImage Image = r.createScreenCapture(capture);

                Color L = new Color(Image.getRGB(40, 0)), R = new Color(Image.getRGB(300, 0)),
                        D = new Color(Image.getRGB(130, 0)), U = new Color(Image.getRGB(210, 0));

                Color UP = new Color(18, 250, 5);
                Color LEFT = new Color(194, 75, 153);
                Color RIGHT = new Color(249, 57, 63);
                Color DOWN = new Color(0, 255, 255);
                /*
                 * Color UP2 = new Color(113, 227, 0); Color LEFT2 = new Color(255, 136, 78);
                 * Color RIGHT2 = new Color(226, 118, 255); Color DOWN2 = new Color(61, 202,
                 * 255); Week 6 WIP
                 */

                // Double keys

                if (L.equals(LEFT) && D.equals(DOWN)) {
                    System.out.println("left & down");
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
                if (D.equals(DOWN) && U.equals(UP)) {
                    System.out.println("down & up");
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
                    System.out.println("up & right");
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
                if (D.equals(DOWN) && R.equals(RIGHT)) {
                    System.out.println("down & right");
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
                    System.out.println("up & left");
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
                    System.out.println("right & left");
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
                    System.out.println("left");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(37);// left
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(37);// left
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (D.equals(DOWN)) {
                    System.out.println("down");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(40);// down
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(40);// down
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (R.equals(RIGHT)) {
                    System.out.println("right");
                    // TimeUnit.MILLISECONDS.sleep(5);
                    r.keyRelease(39);// right
                    TimeUnit.MILLISECONDS.sleep(5);
                    r.keyPress(39);// right
                    TimeUnit.MILLISECONDS.sleep(20);
                    continue;
                }
                if (U.equals(UP)) {
                    System.out.println("up");
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