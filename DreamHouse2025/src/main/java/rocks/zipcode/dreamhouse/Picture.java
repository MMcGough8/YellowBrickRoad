package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Myrectangle door;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        /*
        y =0;
        i = 0;
        for story = 1 to 10 do {
            y = y + 30;
            x =0;
            for window = 1 to 6 do {
                wall[i] = new Square();
                x = x + 20;
                i++;
            }
        }
        */ 

        wall = new Square();
        wall.changeColor("skyblue");
        wall.moveHorizontal(-60);
        wall.moveVertical(-50);
        wall.changeSize(700);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("dgreen");
        wall.moveHorizontal(-75);
        wall.moveVertical(300);
        wall.changeSize(700);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(150);
        wall.changeSize(200);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(150);
        wall.moveHorizontal(105);
        wall.changeSize(200);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(315);
        wall.moveHorizontal(135);
        wall.changeSize(35);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(290);
        wall.moveHorizontal(135);
        wall.changeSize(35);
        wall.makeVisible();

        sun = new Circle();
        sun.changeColor("black");
        sun.changeSize(7);
        sun.moveHorizontal(175);
        sun.moveVertical(310);
        sun.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(75);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(190);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(245);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20);
        window.moveVertical(175);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(75);
        window.moveVertical(175);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(190);
        window.moveVertical(175);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(245);
        window.moveVertical(175);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(75, 200);
        roof.moveHorizontal(100);
        roof.moveVertical(110);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(75, 200);
        roof.moveHorizontal(225);
        roof.moveVertical(110);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(45);
        sun.moveHorizontal(169);
        sun.moveVertical(210);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(80);
        sun.moveHorizontal(-15);
        sun.moveVertical(-45);
        sun.makeVisible();

        wall = new Square();
        wall.changeColor("brown");
        wall.moveHorizontal(375);
        wall.moveVertical(280);
        wall.changeSize(25);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeColor("pine");
        roof.changeSize(50, 100);
        roof.moveHorizontal(398);
        roof.moveVertical(265);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("pine");
        roof.changeSize(50, 100);
        roof.moveHorizontal(398);
        roof.moveVertical(230);
        roof.makeVisible();

        wall = new Square();
        wall.changeColor("brown");
        wall.moveHorizontal(500);
        wall.moveVertical(280);
        wall.changeSize(25);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeColor("pine");
        roof.changeSize(50, 100);
        roof.moveHorizontal(523);
        roof.moveVertical(265);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("pine");
        roof.changeSize(50, 100);
        roof.moveHorizontal(523);
        roof.moveVertical(230);
        roof.makeVisible();

        door = new Myrectangle();
        door.changeColor("red");
        door.moveHorizontal(-60);
        door.moveVertical(-50);
        door.makeVisible();

        
    
    }


    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
