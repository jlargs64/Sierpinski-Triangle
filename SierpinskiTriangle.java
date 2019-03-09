import javax.swing.*;
import java.awt.*;

/**
 * Prints a Sierpinski Triangle iteratively or recursively to the screen.
 *
 * @author Justin Largo
 * @version (1.0)
 */

public class SierpinskiTriangle extends JPanel {
    int width, height;

    public SierpinskiTriangle() {
        super();
        setOpaque(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300, 300));
        width = getPreferredSize().width;
        height = getPreferredSize().height;
        setBackground(Color.black);
    }

    public static void generateIteratively() {

    }

    public static void generateRecursively() {

    }

    public static void main(String[] args) {

        String generationType = JOptionPane.showInputDialog(null, "Generate A Sierpinski Triangle",
                "Generate iteratively or recursively?", JOptionPane.QUESTION_MESSAGE);
        ;
        if (generationType.equalsIgnoreCase("iterative")) {

            generateIteratively();
        } else if (generationType.equalsIgnoreCase("recursive")) {
            
            generateRecursively();
        } else {
            System.err.println("usage error: generation type must be iterative or recursive");
        }
    }
}