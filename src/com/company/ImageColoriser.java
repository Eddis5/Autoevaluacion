package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageColoriser {
    public void redImageColoriser() throws IOException {
        File file = new File("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\image\\tillindeman.jpg");
        BufferedImage img = ImageIO.read(file);

        for (int x= 0;x<img.getWidth();x++){
            for (int y=0; y<img.getHeight();y++){

                int pixel= img.getRGB(x,y);

                Color color = new Color (pixel,true);

                int red = color.getRed();
                int green= color.getGreen();
                int blue = color.getBlue();

                green= 0;
                blue =0;

                color = new Color(red,green,blue);
                int newPixel =color.getRGB();
                img.setRGB(x,y,newPixel);
            }
        }

        file = new File("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\image\\tillindemanRedd.jpg");
        ImageIO.write(img,"bmp",file);
        System.out.println("Till Lindeman Done...");
    }
}
