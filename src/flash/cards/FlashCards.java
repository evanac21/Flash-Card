package flash.cards;

import javax.swing.JFrame;

    public class FlashCards {
         static flashPanel fp = new flashPanel();
         static settingForm sf = new settingForm();
    public static void main(String[] args) {
            JFrame f = new JFrame("Flash Cards");
            f.add(fp);
            f.setVisible(true);
            f.setSize(600, 300);
            fp.startButton.addActionListener(e-> start());
            fp.settings.addActionListener(e-> settings());
    }private static void start() {
       respo("");
       wf("");
      
    }
    private static void respo(String print) {
        fp.responseField.setText(print);
    }
    private static void wf(String print) {
        fp.wordField.setText(print);
    }
    private static void settings() {
        JFrame frame = new JFrame("Settings");
        frame.add(sf);
        frame.setVisible(true);
        frame.setSize(600, 300);
    }
}
