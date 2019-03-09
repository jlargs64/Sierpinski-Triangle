import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Prints a Sierpinski Triangle iteratively or recursively to the screen.
 *
 * @author Justin Largo
 * @version (1.0)
 */

public class SierpinskiTriangle extends JPanel {
    // Instance variables
    private static final long serialVersionUID = 4742367089554814358L;
    private int width, height;
    private Random r = new Random();

    public SierpinskiTriangle() {
        super();
        setOpaque(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300, 300));
        width = getPreferredSize().width;
        height = getPreferredSize().height;
        setBackground(Color.black);
    }

    public static void generateIteratively(int points) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create and set up the window.
                JFrame frame = new JFrame("Rainbow");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                SierpinskiTriangle panel = new SierpinskiTriangle();
                frame.getContentPane().add(panel);

                // Display the window.
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void generateRecursively(int points) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create and set up the window.
                JFrame frame = new JFrame("Sierpinski Triangle");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                SierpinskiTriangle panel = new SierpinskiTriangle();
                frame.getContentPane().add(panel);

                // Display the window.
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255,215,0));
        //Top point
        g.fillArc(width/2,0,1,1,0,360);
        //Bottom left point
        g.fillArc(width,height,1,1,0,360);
        //Bottom Right point
        g.fillArc(width,height,1,1,0,360);
    }

    public static void main(String[] args) {

        // Sanitize data and set instance variables
        String generationType = JOptionPane.showInputDialog(null, "Iterative or Recursive: ",
                "Generate A Sierpinski Triangle", JOptionPane.QUESTION_MESSAGE);
        ;
        String strPoints = JOptionPane.showInputDialog(null, "Amount of points: ", "Generate A Sierpinski Triangle",
                JOptionPane.QUESTION_MESSAGE);
        int points = Integer.parseInt(strPoints);

        if (generationType.equalsIgnoreCase("iterative")) {

            generateIteratively(points);
        } else if (generationType.equalsIgnoreCase("recursive")) {

            generateRecursively(points);
        } else {
            System.err.println("usage error: generation type must be iterative or recursive");
        }
    }
}