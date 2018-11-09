package flash.cards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

    public class FlashCards {
         static flashPanel fp = new flashPanel();
         static int numStat = 1;
         static String def1, def2, def3, def4;
         static String t1 = "", t2 = "", t3 = "", t4= "";
         static settingForm sf = new settingForm();
    public static void main(String[] args) {
        //This class creates the main frame and utilizes the ActionListeners of every button present
            JFrame f = new JFrame("Flash Cards");
            f.add(fp);
            f.setVisible(true);
            f.setSize(600, 300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fp.flip.addActionListener(e-> start());
            fp.startButton.addActionListener(e-> start());
            fp.settings.addActionListener(e-> settings());
            fp.submit.addActionListener(e-> submit());
            fp.clear.addActionListener(e-> cls());
            fp.reset.addActionListener(e-> numStat = 1);
            
    }private static void start() {
       cls();     
       switch(numStat) {
           case 1:
               wf("Term 1: " + t1);
               break;
           case 2:
               wf("Term 2: " + t2);
               break;
           case 3:
               wf("Term 3: " + t3);
               break;
           case 4:
               wf("Term 4: " + t4);
               break;
           case 5:
               wf("Nope we can't do that yet...");
               break;
       }
    }
    private static void respo(String print) {
        fp.responseField.setText(print);
    }
    private static void wf(String print) {
        fp.wordField.setText(print);
    }
    private static void submit() {
        if(numStat == 1) {
            if(fp.responseField.getText().equals(def1)) {
            wf("Thats Correct!");
            numStat++;
            }else {
                wf("Not Right! Correct Answer was: " + def1);
                numStat++;
             }
        }else if(numStat == 2) {
             if(fp.responseField.getText().equals(def2)) {
                wf("Thats Correct!");
                numStat++;
            }else {
                wf("Not Right! Correct Answer was: " + def2);
                numStat++;
             }
        }else if(numStat == 3) {
             if(fp.responseField.getText().equals(def3)) {
                wf("Thats Correct!");
                numStat++;
            
            }else {
                wf("Not Right! Correct Answer was: " + def3);
                numStat++;
             }
        }else if(numStat == 4) {
             if(fp.responseField.getText().equals(def4)) {
                wf("Thats Correct!");
                numStat++;
            }else {
                wf("Not Right! Correct Answer was: " + def4);
                numStat++;
             }
        }
    }
    private static void settings() {
        JFrame frame = new JFrame("Settings");
        frame.add(sf);
        frame.setVisible(true);
        frame.setSize(500, 400);
       
        sf.submitButton.addActionListener(new ActionListener() {
             @Override
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
    private static void cls() {
        respo(""); wf("");
    }
}
