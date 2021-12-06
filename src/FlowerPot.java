import javafx.scene.paint.Color;
import wheelsFX.users.Frame.Animator;
import wheelsFX.users.Shapes.Ellipse;
import wheelsFX.users.Shapes.Rectangle;
import wheelsFX.users.Shapes.Triangle;

/**
 * FlowerPot.java
 * FlowerPot class that creates a flower pot and implements seasonal changes to the look of the flower pot
 *
 * @author Tyler Sherry
 */
public class FlowerPot implements Seasonal, Animator
{
    private int curSeason;
    private final int DELAY;
    private int callCount;

    private Rectangle flowerPotBottomBase;
    private Rectangle flowerPotTopBase;
    private Rectangle flowerStem;
    private Ellipse flowerPetalMain;
    private Triangle flowerPetal1;
    private Triangle flowerPetal2;
    private Triangle flowerPetal3;

    /**
     * No args constructor that creates the base shapes for the flower pot
     */
    FlowerPot()
    {
        this.curSeason = 0;
        this.DELAY = 40;
        this.callCount = 0;

        flowerPotBottomBase = new Rectangle(415, 250);
        flowerPotBottomBase.setSize(120, 50);
        flowerPotBottomBase.setColor(Color.ORANGE);

        flowerPotTopBase = new Rectangle(400, 200);
        flowerPotTopBase.setSize(150, 50);
        flowerPotTopBase.setColor(Color.ORANGE);

        flowerStem = new Rectangle(465, 120);
        flowerStem.setSize(20, 80);
        flowerStem.setColor(Color.BROWN);

        flowerPetalMain = new Ellipse(475, 100);
        flowerPetalMain.setSize(10, 20);
        flowerPetalMain.setColor(Color.GREEN);

        flowerPetal1 = new Triangle(0, 0);
        flowerPetal1.setColor(Color.WHITE);
        flowerPetal1.setSize(1,1);

        flowerPetal2 = new Triangle(0, 0);
        flowerPetal2.setColor(Color.WHITE);
        flowerPetal2.setSize(1,1);

        flowerPetal3 = new Triangle(0, 0);
        flowerPetal3.setColor(Color.WHITE);
        flowerPetal3.setSize(1,1);

    }
    /**
     * Method to change the flower pot to its fall look
     */
    @Override
    public void fall()
    {
        flowerPetalMain.setSize(35, 35);
        flowerPetalMain.setColor(Color.CRIMSON);

        flowerPetal1.setColor(Color.WHITE);
        flowerPetal1.setSize(1,1);

        flowerPetal2.setColor(Color.WHITE);
        flowerPetal2.setSize(1,1);

        flowerPetal3.setColor(Color.WHITE);
        flowerPetal3.setSize(1,1);
    }

    /**
     * Method to change the flower pot to its spring look
     */
    @Override
    public void spring()
    {
        flowerPetalMain.setSize(15, 30);
        flowerPetalMain.setColor(Color.GREEN);

        flowerPetal1.setColor(Color.WHITE);
        flowerPetal1.setSize(1,1);

        flowerPetal2.setColor(Color.WHITE);
        flowerPetal2.setSize(1,1);

        flowerPetal3.setColor(Color.WHITE);
        flowerPetal3.setSize(1,1);
    }

    /**
     * Method to change the flower pot to its summer look
     */
    @Override
    public void summer()
    {
        flowerPetalMain.setSize(35, 35);
        flowerPetalMain.setColor(Color.GREEN);

        flowerPetal1.setSize(10, 20);
        flowerPetal1.setColor(Color.CORNFLOWERBLUE);
        flowerPetal1.setLocation(540, 95);
        flowerPetal1.setRotation(90);

        flowerPetal2.setSize(10, 20);
        flowerPetal2.setColor(Color.CORNFLOWERBLUE);
        flowerPetal2.setLocation(400, 95);
        flowerPetal2.setRotation(270);

        flowerPetal3.setSize(10, 20);
        flowerPetal3.setColor(Color.CORNFLOWERBLUE);
        flowerPetal3.setLocation(470, 30);
        flowerPetal3.setRotation(0);

    }

    /**
     * Method to change the flower pot to its winter look
     */
    @Override
    public void winter()
    {
        flowerPetalMain.setColor(Color.WHITE);
        flowerPetalMain.setSize(1, 1);

        flowerPetal1.setColor(Color.WHITE);
        flowerPetal1.setSize(1,1);

        flowerPetal2.setColor(Color.WHITE);
        flowerPetal2.setSize(1,1);

        flowerPetal3.setColor(Color.WHITE);
        flowerPetal3.setSize(1,1);
    }

    @Override
    public void animate()
    {
        this.callCount++;

        if (this.callCount % this.DELAY == 0)
        {
            this.curSeason++;

            if (this.curSeason % 4 == 1)
            {
                System.out.println("Spring");
                this.spring();

            }
            if (this.curSeason % 4 == 2)
            {
                System.out.println("Summer");
                this.summer();
            }
            if (this.curSeason % 4 == 3)
            {
                System.out.println("Fall");
                this.fall();
            }
            if (this.curSeason % 4 == 0)
            {
                System.out.println("Winter");
                this.winter();
            }
        }
    }
}
