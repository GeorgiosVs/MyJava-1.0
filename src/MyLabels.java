import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.HashSet;
import java.util.Set;

public class MyLabels extends JLabel {
    private static final String DEFAULT_TEXT = "Welcome To GeorgiosVs. Airport Terminal.";
    private static final String FONT_NAME = "Poppins";
    private static final Font FALLBACK_FONT = new Font("SansSerif", Font.PLAIN, 20);
    private static final Color DEFAULT_COLOR = new Color(53, 53, 53);
    private static final String ICON_PATH = "/airforce-one.gif";
    private static Set<String> availableFonts;

    public MyLabels() {
        super(DEFAULT_TEXT);
        initialize();
    }

    private void initialize() {
        this.setForeground(DEFAULT_COLOR);
        Font font = createFont(FALLBACK_FONT);
        this.setFont(font);
        this.setIconTextGap(0);
        setIconFromResource();
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    private Font createFont(Font fallbackFont) {
        Font font = new Font(FONT_NAME, Font.PLAIN, 20);
        if (!fontAvailable(FONT_NAME)) {
            font = fallbackFont;
        }
        return font;
    }

    private boolean fontAvailable(String fontName) {
        if (availableFonts == null) {
            availableFonts = new HashSet<>(
                    Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(Locale.getDefault())));
        }
        return availableFonts.contains(fontName);
    }

    private void setIconFromResource() {
        URL imageURL = getClass().getResource(ICON_PATH);
        if (imageURL != null) {
            ImageIcon image = new ImageIcon(imageURL);
            setIcon(image);
        } else {
            System.err.println("Image not found: " + ICON_PATH);
            // Optionally add a default or placeholder icon here
        }
    }
}
