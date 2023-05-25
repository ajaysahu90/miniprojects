package OOPs;

import javax.swing.*;

public class botdemo {
    public static void main(String[] args) {

        //create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new buttondemo();
            }
        });
    }
}
