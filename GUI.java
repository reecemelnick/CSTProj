import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.BorderLayout;
import java.awt.*;

public class GUI extends JFrame  {
    
    public GUI() {
        setSize(400, 400);// fix window size
        setVisible(true);// make window visible
        addKeyListener(new KeyBoardInput());// listen to keyboard input
    }
}