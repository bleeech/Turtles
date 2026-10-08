public class TurtleDrawer {
public static void main(String[] args)
    {
        //Turtle bob = new Turtle();
        /*for(int i=0;i<360;i++)
        {
            bob.forward(i*1.25);
            bob.left(90.25);
        }
         */
        /*If you don't know what a for loop is yet this is equivalent to repeating lines 17 & 18 4 times in a row.*/
        Turtle bob = new Turtle();
        bob.penColor("red");
        bob.width(10);
        for(int i=0;i<4;i++)
        {
            bob.forward(50);
            bob.left(90);
        }
    }
}
