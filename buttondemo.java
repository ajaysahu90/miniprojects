package OOPs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttondemo implements ActionListener {
    JLabel jlab;

    buttondemo() {

        //create new frame container.
        JFrame jfrm = new JFrame("it is JFrame example");

        //specify flowchart for the layout manager.
        jfrm.getContentPane().setLayout(new FlowLayout());

        //given Frame initial size.
        jfrm.setSize(220, 90);

        //terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // makes two button
        JButton jbtFirst = new JButton("First");
        JButton jbtSecond = new JButton("Second");

        //Add actionlistener.
        jbtFirst.addActionListener(this);
        jbtSecond.addActionListener(this);

        // Add the Buttons to content pane.
        jfrm.getContentPane().add(jbtFirst);
        jfrm.getContentPane().add(jbtSecond);

        //create a text- based label.
        jlab = new JLabel("press a button");

        //add the label to the fram.
        jfrm.getContentPane().add(jlab);

        //Display the jfram.
        jfrm.setVisible(true);
    }
    //Handle button events

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("First"))
            jlab.setText("First Button was pressed");
        else
            jlab.setText("second Button was pressed");
    }


}
