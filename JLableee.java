
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLableee {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create JLabel
        label.setText("Bro , do you even code ?");
        label.setIcon(image); // add image to label it's not logo
        label.setHorizontalTextPosition(JLabel.CENTER); // text go to center, right,left of image
        label.setVerticalTextPosition(JLabel.TOP); // text in center but top on image
        label.setForeground(Color.WHITE); // set text color
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set text font
        label.setIconTextGap(-5); // គម្លាតពី text and image
        label.setOpaque(true); // display background color visible
        label.setBackground(Color.black); // set background color on label
        label.setBorder(border); // set border collor
        label.setVerticalAlignment(JLabel.CENTER); // set text and image center
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal alignment


        JFrame frame = new JFrame(); // create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label); // add label to frame
        //frame.setResizable(false);
    }
}
