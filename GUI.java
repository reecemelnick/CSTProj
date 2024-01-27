import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.BorderLayout;
import java.awt.*;
import java.util.Scanner;

public class GUI extends JFrame implements UI {
    Scanner scan = new Scanner()
    private int choice;

    public GUI() {
        setSize(400, 400);// fix window size
        setVisible(true);// make window visible
        addKeyListener(new KeyBoardInput());// listen to keyboard input
    }



    

    private void evaluateChoice() {

        }



    private class KeyBoardInput extends KeyAdapter {

            /**
             * Responds when a key is pressed on the keyboard.
             * 
             * @param e
             *            KeyEvent - key pressed and other information
             */
            public void keyTyped(KeyEvent e) {
                // set the "choice" data member of the outer class GUI
                // to get the integer value, get the character value of the key
                // pressed, make it a string and ask the Integer class to parse it
                try {
                    choice = Integer.parseInt("" + e.getKeyChar());
                    // if it wasn't an integer key pressed then make an invalid
                    // choice
                } catch (Exception except) {
                    choice = -1;// this will result in nothing happening
                }
                evaluateChoice(); // GUI method to call the addressBook to perform
                                // task
            }
        }
}