package flash.cards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

    public class FlashCards {
         static flashPanel fp = new flashPanel();
         static String def1, def2, def3, def4;
         static String t1, t2, t3, t4;
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
        sf.submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getTermsandDefs();
                frame.setVisible(false);
            }
        });
    }
    private static void getTermsandDefs() {
        def1 = sf.Def1.getText();
        def2 = sf.Def2.getText();
        def3 = sf.Def3.getText();
        def4 = sf.Def4.getText();
        t1 = sf.Term1.getText();
        t2 = sf.Term2.getText();
        t3 = sf.Term3.getText();
        t4 = sf.Term4.getText();
    }
}
