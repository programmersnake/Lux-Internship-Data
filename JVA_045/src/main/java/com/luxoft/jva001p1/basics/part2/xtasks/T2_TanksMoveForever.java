package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;

public class T2_TanksMoveForever extends JPanel
{
    int tankX = 0;
    int tankY = 0;
    int side = 1;
    int step = 64;

    void runTheGame()
    {
        while(true) {
            repaint();
            if ( side == 1 ) {
                moveRight();
            } else if (side == 0) {
                moveLeft();
            }
            sleep( 50 );
        }
    }

    private void moveRight() {
        tankX += step;
        if(tankX>=500)
            side = 0;
    }

    private void moveLeft() {
        tankX -= step;
        if(tankX<=0)
            side = 1;
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception
    {
        T2_TanksMoveForever bf = new T2_TanksMoveForever();
        bf.runTheGame();
    }

    public T2_TanksMoveForever() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FOREWER");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {

        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        paintBF(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

    private void paintBF(Graphics g)
    {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++)
        {
            for (int h = 0; h < 9; h++)
            {
                if (i % 2 == 0)
                {
                    cc = new Color(252, 241, 177);
                }
                else
                {
                    cc = new Color(233, 243, 255);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

}