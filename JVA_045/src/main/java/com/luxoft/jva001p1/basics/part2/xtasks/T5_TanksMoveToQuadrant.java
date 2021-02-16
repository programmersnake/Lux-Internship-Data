package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;

public class T5_TanksMoveToQuadrant extends JPanel
{
    int tankX = 0;
    int tankY = 0;
    int step = 1;

    void runTheGame()
    {
        moveToQuadrant("h3");
        moveToQuadrant("b6");
        moveToQuadrant("a3");
        moveToQuadrant("a1");
        moveToQuadrant("i7");
    }

    /**
     * One method call should smoothly move the tank one quadrant according to given direction.
     *
     * @param direction can be 1 - up, 2 - right, 3 - down, 4 - right
     */
    void move(int direction)
    {
        if(direction == 1)
            moveUp();
        else if(direction == 2)
            moveRight();
        else if(direction == 3)
            moveDown();
        else
            moveLeft();
    }

    void moveToQuadrant(String quadrant)
    {
        // h3
        while(true) {
            repaint();
            char c1 = quadrant.charAt( 0 );
            char c1Int = quadrant.charAt( 1 );
            char cTank = getTankQuadrant().charAt( 0 );
            char cTankInt = getTankQuadrant().charAt( 1 );

            if ( c1 > cTank )
                moveRight();
            else if ( c1 < cTank )
                moveLeft();
            else if (c1Int > cTankInt)
                moveDown();
            else if (c1Int < cTankInt)
                moveUp();
            else
                break;

            sleep(10);

        }
        // TODO YOUR CODE HERE
    }

    private String getTankQuadrant() {
        int xxx = tankX/64;
        int yyy = tankY/64 + 1;
        String abcd = "abcdefghi";
        StringBuffer buffer = new StringBuffer();
        buffer.append( abcd.charAt( xxx ) );
        buffer.append( yyy );
        System.out.println(buffer.toString());

        return buffer.toString();
    }

    private void moveRight() {
        if(tankX<=576)
            tankX += step;
        System.out.println("Right");

    }

    private void moveLeft() {
        if(tankX>=0)
            tankX -= step;
        System.out.println("Left");
    }

    private void moveUp() {
        if(tankY>=0)
            tankY -= step;
        System.out.println("UP");
    }

    private void moveDown() {
        if(tankY<=576)
            tankY += step;
        System.out.println("Down");
    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception
    {
        T5_TanksMoveToQuadrant bf = new T5_TanksMoveToQuadrant();
        bf.runTheGame();
    }

    public T5_TanksMoveToQuadrant() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
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
