import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        MyLabels myLabels = new MyLabels();

        myFrame.setLayout(new FlowLayout());

        myFrame.revalidate();
        myFrame.add(myLabels);
        myFrame.repaint();
        myFrame.pack();

        myFrame.setVisible(true);
    }
}
