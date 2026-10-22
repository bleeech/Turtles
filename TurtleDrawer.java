public class TurtleDrawer {
public static void main(String[] args)
    {
        /*If you don't know what a for loop is yet this is equivalent to repeating lines 17 & 18 4 times in a row.*/
        Turtle bob = new Turtle();
        bob.penColor("light blue");
        bob.width(10);

        drawPolygon(bob, 5, 100);
        moveTurtle(bob, 250);


        bob.penColor("orange");
        bob.width(15);
        drawPolygon(bob, 8, 100);
        moveTurtle(bob, 200);
        

        bob.penColor("red");
        bob.width(5);
        drawPolygon(bob, 4, 100);
        moveTurtle(bob, 200);
        

        bob.penColor("purple");
        bob.width(20);
        drawPolygon(bob, 6, 100);
        
        moveTurtle(bob,300);
        bob.penColor("magenta");
        bob.width(15);
        drawBody(bob, 200);

        bob.up();
        bob.left(90);
        bob.forward(200);
        bob.right(90);
        bob.forward(40);
        bob.down();
        drawRoof(bob,200);

        bob.up();
        bob.penColor("blue");
        bob.width(10);
        bob.backward(40);
        bob.right(90);
        bob.forward(100);
        bob.down();
        bob.right(90);
        drawDoor(bob,200);
        
        bob.up();
        bob.right(180);
        bob.forward(50);
        bob.down();
        drawWindow(bob,150);

        bob.up();
        bob.left(90);
        bob.forward(230);
        bob.left(90);
        bob.forward(120);
        bob.down();
        drawChimney(bob,100);

    }
    public static void drawPolygon(Turtle t, int sides, int size)
    {
        for(int i=0;i<sides;i++)
        {
            t.forward(size);
            t.left(360/sides);
        }
    }
    
    
    public static void drawRoof(Turtle t, int size)
    {
        t.forward(size);
        t.left(135);
        t.forward(size);
        t.left(90);
        t.forward(size);
        t.left(135);
        t.forward(size);
    }
    public static void drawBody(Turtle t, int size)
    {
        t.forward(size);
        t.left(90);
        t.forward(size);
        t.left(90);
        t.forward(size);
        t.left(90);
        t.forward(size);
        t.left(90);
    }
    public static void drawDoor(Turtle t, int size)
    {
        t.forward(size/4);
        t.left(90);
        t.forward(size/2);
        t.left(90);
        t.forward(size/4);
        t.left(90);
        t.forward(size/2);
        t.left(90);
    }
    public static void moveTurtle(Turtle t, int x)
    {
        t.up();
        t.backward(x);
        t.down();
    }
    public static void drawWindow(Turtle t, int size)
    {
        t.forward(size/4);
        t.left(90);
        t.forward(size/4);
        t.left(90);
        t.forward(size/4);
        t.left(90);
        t.forward(size/4);
        t.left(90);
    }
    public static void drawChimney(Turtle t, int size)
    {
        t.forward(size/4);
        t.left(90);
        t.forward(size/2);
        t.left(90);
        t.forward(size/4);
        t.left(90);
        t.forward(size/2);
        t.left(90);
    }

}
