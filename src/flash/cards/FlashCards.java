package flash.cards;

import javax.swing.JFrame;

    public class FlashCards {
         static flashPanel fp = new flashPanel();
    public static void main(String[] args) {
           
            JFrame f = new JFrame("Flash Cards");
            f.add(fp);
            f.setVisible(true);
            f.setSize(600, 300);
            fp.startButton.addActionListener(e-> start());
    }private static void start() {
        fp.responseField.setText("");
        fp.wordField.setText("");
    }
    
}
