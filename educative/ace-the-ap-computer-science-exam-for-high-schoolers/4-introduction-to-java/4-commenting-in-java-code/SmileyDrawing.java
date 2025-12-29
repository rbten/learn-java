// Loading code files with Canvas utility
import com.educative.graphics.*;

/**
 * This program draws a smiley onto the user's screen.
 */

class SmileyDrawing {
    /**
     * The main function is invoked when this program is run. 
     * It has the code that draws on the user's screen.
    */

    public static void main(String[] args) {
        /*
            For better understanding comment out all the code using //s, and uncomment and run the program as you read the comments.
         */

        // Following line creates an empty canvas of 500x500
        Canvas c = new Canvas(500,500);

        // drawing the yellow circle

        /*
            We choose yellow color (FFFF00) to fill up any shape we draw next.
            When we draw a circle of radius 150 centered at point (250,250)
         */

        c.fill("#FFFF00");
        c.circle(250,250,150);

        // Let's put a smile on that face! :)

        /*
            We draw another circle centered at (250,250) of radius 100. Then we erase the unneeded part of the circle by drawing a rectange which has border yellow. We set border color to yellow by using stroke method.
         */
        
        c.circle(250,250,100);
        c.stroke("#FFFF00");
        c.rect(150,150,200,140);

        // drawing eyes

        /*
            We select black color (000000) for fill and then we draw two circles of radius 10 each centered at (200,200) and (300,300) respectively.
         */

        c.fill("#000");
        c.circle(200,200,10);
        c.circle(300,200,10);

        // drawing nose

        /*
            We draw a triangle and give it 6 numbers representing 3 corners of the triangles on the canvas
         */
        c.triangle(245,250,255,250,250,240);
    }
}