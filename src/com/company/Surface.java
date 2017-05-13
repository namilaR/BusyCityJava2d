package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 * Created by Namila Radith on 4/25/2017.
 */
public class Surface extends JPanel {
    private final double farBulidingspoints[][] = {
            { -1, 162 }, { 117, 282}, { 204, 282 }, { 204, 265 },
            { 212, 265 }, { 212, 283 }, { 256, 283 }, { 256, 233 },
            { 274, 233 }, { 274, 212 }, { 353, 212 },{ 353, 234 }, { 358 , 234 },
            { 358, 203 },{ 358, 203 },{ 358, 200 },{ 395, 200 },{ 395, 202 },
            { 392, 202 },{ 392, 208 },{ 428, 208 },{ 428, 212 },{ 430, 212 },
            { 430, 214 },{ 433, 214 },{ 433, 216 },{ 436, 216 },
            { 436, 250  },{ 450, 250 },{ 450, 203 },{ 470, 181 },{ 638, 181 },
            { 638, 258 },{ 698, 258 },{ 698, 206 },{ 724 , 206 },{ 724 , 168 },
            { 820 , 168 },{ 844 , 184},{ 844 , 206},{ 857 , 206},{ 857 , 216},
            { 1024 , 216},{ 1024 , 396},{ -1 , 396},{ -1, 162 }
    };


    public void doDrawing(Graphics g) {
    drawSky(g);
    drawfarBuildings(g);
    drawLeftSideBuiding(g);
    drawWhiteBuilding(g);
    drawLightGrayBuilding(g);
    drawGrayBuilding(g);
    drawCoffeShop(g);
    drawDonutsShop(g);
    g.dispose();

    }

    public void drawSky(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint skyGradient = new GradientPaint(0, 0, new Color(127,238,255), 0, 450, Color.white );
        g2d.setPaint(skyGradient);
        g2d.fillRect(0 , 0, 1024, 535);
    }

    public void drawfarBuildings(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(102,184,198));
        g2d.translate(0, 0);

        GeneralPath star = new GeneralPath();

        star.moveTo(farBulidingspoints[0][0], farBulidingspoints[0][1]);

        for (int k = 1; k < farBulidingspoints.length; k++)
            star.lineTo(farBulidingspoints[k][0], farBulidingspoints[k][1]);

        star.closePath();
        g2d.fill(star);

    }
    public void drawLeftSideBuiding (Graphics g){
        drawLeftSideBuildingSideView(g);
        drawRightSideBuildingSideView(g);
        int initialX = 68, initialY = 239;
        for(int j = 0; j < 5 ; j++){
            for (int i = 0; i < 7; i++){
                drawBuildingWindow(g,initialX,initialY,12,22,new Color(178,189,184));
                initialX += 16;
                initialY += 1;
            }
            initialX = 68;
            initialY += 44;
        }

    }

    public void drawLeftSideBuildingSideView(Graphics g){
        double coordinates[][] = {
                { 13, 540 }, { 13, 237}, { 53, 213}, { 53, 540 },
                { 13, 540}
        };
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(153,154,167));
        g2d.translate(0, 0);

        GeneralPath star = new GeneralPath();

        star.moveTo(coordinates[0][0], coordinates[0][1]);

        for (int k = 1; k < coordinates.length; k++)
            star.lineTo(coordinates[k][0], coordinates[k][1]);

        star.closePath();
        g2d.fill(star);
    }

    public void drawRightSideBuildingSideView(Graphics g){
        double coordinates[][] = {
                { 53, 540 }, { 53, 212}, { 189, 220}, { 188, 538 },
                { 53, 540}
        };
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(120,120,138));
        g2d.translate(0, 0);

        GeneralPath star = new GeneralPath();

        star.moveTo(coordinates[0][0], coordinates[0][1]);

        for (int k = 1; k < coordinates.length; k++)
            star.lineTo(coordinates[k][0], coordinates[k][1]);

        star.closePath();
        g2d.fill(star);
    }

    public void drawBuildingWindow(Graphics g,int x,int y,int width,int height,Color color){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        //g2d.setPaint( );
        g2d.setColor(color);
        g2d.translate(0, 0);
        g2d.fillRect(x, y, width, height);

    }

    public void drawWhiteBuilding(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(255,255,255));
        g2d.fillRect(143, 267, 198, 270);
        int initialX = 162, initialY = 285;
        for(int j = 0; j < 5 ; j++){
            for (int i = 0; i < 4; i++){
                drawBuildingWindow(g,initialX,initialY,22,26,new Color(90,83,96));
                initialX += 42;

            }
            initialX = 162;
            initialY += 44;
        }
    }

    public void drawLightGrayBuilding(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(225,243,238));
        g2d.fillRect(368, 239, 261, 322);
        int initialX = 404, initialY = 275;
        for(int j = 0; j < 5 ; j++){
            for (int i = 0; i < 5; i++){
                drawBuildingWindow(g,initialX,initialY,22,26,new Color(121,144,150 ));
                initialX += 42;

            }
            initialX = 404;
            initialY += 44;
        }
    }

    public void drawGrayBuilding(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(225,243,238));
        g2d.fillRect(636, 272, 388, 261);
        int initialX = 660, initialY = 298;
        for(int j = 0; j < 5 ; j++){
            for (int i = 0; i < 8; i++){
                drawBuildingWindow(g,initialX,initialY,22,26,new Color(121,144,150 ));
                initialX += 42;

            }
            initialX = 660;
            initialY += 44;
        }
    }

    public void drawCoffeShop(Graphics g){
        double coordinates[][] = {
                { 276, 389 }, { 275, 376}, {373, 307}, { 465, 376 },
                { 465, 389},{ 459, 386},{ 459, 584},{ 288, 586},{ 288, 380},
                { 276, 389 }
        };
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(239,174,107));
        g2d.translate(0, 0);

        GeneralPath star = new GeneralPath();

        star.moveTo(coordinates[0][0], coordinates[0][1]);

        for (int k = 1; k < coordinates.length; k++)
            star.lineTo(coordinates[k][0], coordinates[k][1]);

        star.closePath();
        g2d.fill(star);
        drawBuildingWindow(g,305,415,52,60,new Color(22,67,139 ));
        drawBuildingWindow(g,393,415,52,60,new Color(22,67,139 ));
        drawBuildingWindow(g,305,502,31,48,new Color(22,67,139 ));
        drawBuildingWindow(g,413,502,31,48,new Color(22,67,139 ));
        drawBuildingWindow(g,352,505,44,80,new Color(94,42,42 ));
    }

    public void drawDonutsShop(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint( new Color(254,240,222));
        g2d.fillRect(490, 327, 205, 242);
        drawBuildingWindow(g,505,408,47,38,new Color(22,67,139 ));
        drawBuildingWindow(g,565,408,47,38,new Color(22,67,139 ));
        drawBuildingWindow(g,626,408,47,38,new Color(22,67,139 ));
        drawBuildingWindow(g,505,496,47,38,new Color(22,67,139 ));
        drawBuildingWindow(g,568,492,47,76,new Color(22,67,139 ));
        drawBuildingWindow(g,628,496,47,38,new Color(22,67,139 ));
    }

    public void drawCarType1(Graphics g){

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
