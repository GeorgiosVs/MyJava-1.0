import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("GeorgiosVs. Airport Terminal");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = null;
        try {
            icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/profile-pic.png")));
            if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.err.println("Image not found or could not be loaded.");
        }
        if (icon != null) {
            this.setIconImage(icon.getImage());
        }

        this.getContentPane().setBackground(new Color(220, 220, 220));
    }
}
