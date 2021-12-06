import javafx.scene.paint.Color;
import wheelsFX.users.Frame.Animator;
import wheelsFX.users.Shapes.Ellipse;
import wheelsFX.users.Shapes.Rectangle;

/**
 * FruitStand.java
 * FruitStand class that creates a fruit stand and implements seasonal changes to the look of the fruit stand by
 * putting in apples for spring, watermelons for summer, pumpkins for fall, and no fruit for the winter season
 *
 * @author Tyler Sherry
 */
public class FruitStand implements Seasonal, Animator
{
    private int curSeason;
    private final int DELAY;
    private int callCount;

    private Rectangle fruitStandBase;
    private Rectangle fruitStandLeftPost;
    private Rectangle fruitStandRightPost;

    private Ellipse pumpkin1;
    private Ellipse pumpkin2;
    private Ellipse pumpkin3;

    private Ellipse watermelon1;
    private Ellipse watermelon2;

    private Ellipse apple1;
    private Ellipse apple2;
    private Ellipse apple3;


    /**
     * No args constructor that creates the base shapes for the fruit stand
     */
    FruitStand()
    {
        this.curSeason = 0;
        this.DELAY = 40;
        this.callCount = 0;

        fruitStandBase = new Rectangle(250, 450);
        fruitStandBase.setColor(Color.BROWN);
        fruitStandBase.setSize(250, 125);

        fruitStandLeftPost = new Rectangle(250, 350);
        fruitStandLeftPost.setColor(Color.BROWN);
        fruitStandLeftPost.setSize(20, 100);

        fruitStandRightPost = new Rectangle(480, 350);
        fruitStandRightPost.setColor(Color.BROWN);
        fruitStandRightPost.setSize(20, 100);

        pumpkin1 = new Ellipse(0, 0);
        pumpkin1.setSize(1, 1);
        pumpkin1.setColor(Color.WHITE);
        pumpkin2 = new Ellipse(0, 0);
        pumpkin2.setSize(1, 1);
        pumpkin2.setColor(Color.WHITE);
        pumpkin3 = new Ellipse(0, 0);
        pumpkin3.setSize(1, 1);
        pumpkin3.setColor(Color.WHITE);

        watermelon1 = new Ellipse(0, 0);
        watermelon1.setSize(1, 1);
        watermelon1.setColor(Color.WHITE);
        watermelon2 = new Ellipse(0, 0);
        watermelon2.setSize(1, 1);
        watermelon2.setColor(Color.WHITE);

        apple1 = new Ellipse(0, 0);
        apple1.setSize(1, 1);
        apple1.setColor(Color.WHITE);
        apple2 = new Ellipse(0, 0);
        apple2.setSize(1, 1);
        apple2.setColor(Color.WHITE);
        apple3 = new Ellipse(0, 0);
        apple3.setSize(1, 1);
        apple3.setColor(Color.WHITE);
    }

    /**
     * Method to change the object to its fall look
     */
    @Override
    public void fall()
    {
        pumpkin1.setColor(Color.ORANGE);
        pumpkin1.setSize(35, 40);
        pumpkin1.setLocation(450, 410);
        pumpkin1.setOutlineThickness(2);
        pumpkin1.setOutlineColor(Color.BLACK);

        pumpkin2.setColor(Color.ORANGE);
        pumpkin2.setSize(35, 50);
        pumpkin2.setLocation(380, 410);
        pumpkin2.setOutlineThickness(2);
        pumpkin2.setOutlineColor(Color.BLACK);

        pumpkin3.setColor(Color.ORANGE);
        pumpkin3.setSize(45, 30);
        pumpkin3.setLocation(300, 420);
        pumpkin3.setOutlineThickness(2);
        pumpkin3.setOutlineColor(Color.BLACK);

        watermelon1.setSize(1, 1);
        watermelon1.setLocation(0, 0);
        watermelon1.setColor(Color.WHITE);
        watermelon2.setSize(1, 1);
        watermelon2.setLocation(0, 0);
        watermelon2.setColor(Color.WHITE);
    }

    /**
     * Method to change the object to its spring look
     */
    @Override
    public void spring()
    {
        pumpkin1.setSize(1, 1);
        pumpkin1.setColor(Color.WHITE);
        pumpkin1.setOutlineColor(Color.WHITE);
        pumpkin2.setSize(1, 1);
        pumpkin2.setColor(Color.WHITE);
        pumpkin2.setOutlineColor(Color.WHITE);
        pumpkin3.setSize(1, 1);
        pumpkin3.setColor(Color.WHITE);
        pumpkin3.setOutlineColor(Color.WHITE);

        watermelon1.setSize(1, 1);
        watermelon1.setLocation(0, 0);
        watermelon1.setColor(Color.WHITE);
        watermelon2.setSize(1, 1);
        watermelon2.setLocation(0, 0);
        watermelon2.setColor(Color.WHITE);

        apple1.setSize(20, 20);
        apple1.setColor(Color.RED);
        apple1.setLocation(450, 440);
        apple1.setOutlineThickness(2);
        apple1.setOutlineColor(Color.BLACK);

        apple2.setSize(20, 20);
        apple2.setColor(Color.RED);
        apple2.setLocation(350, 440);
        apple2.setOutlineThickness(2);
        apple2.setOutlineColor(Color.BLACK);

        apple3.setSize(20, 20);
        apple3.setColor(Color.RED);
        apple3.setLocation(300, 440);
        apple3.setOutlineThickness(2);
        apple3.setOutlineColor(Color.BLACK);
    }

    /**
     * Method to change the object to its summer look
     */
    @Override
    public void summer()
    {
        pumpkin1.setSize(1, 1);
        pumpkin1.setColor(Color.WHITE);
        pumpkin1.setOutlineColor(Color.WHITE);
        pumpkin2.setSize(1, 1);
        pumpkin2.setColor(Color.WHITE);
        pumpkin2.setOutlineColor(Color.WHITE);
        pumpkin3.setSize(1, 1);
        pumpkin3.setColor(Color.WHITE);
        pumpkin3.setOutlineColor(Color.WHITE);

        watermelon1.setSize(30, 50);
        watermelon1.setColor(Color.GREEN);
        watermelon1.setLocation(450, 420);
        watermelon1.setRotation(45);

        watermelon2.setSize(35, 55);
        watermelon2.setColor(Color.GREEN);
        watermelon2.setLocation(300, 420);
        watermelon2.setRotation(200);

        apple1.setSize(1, 1);
        apple1.setLocation(0, 0);
        apple1.setColor(Color.WHITE);
        apple1.setOutlineColor(Color.WHITE);
        apple2.setSize(1, 1);
        apple2.setLocation(0, 0);
        apple2.setColor(Color.WHITE);
        apple2.setOutlineColor(Color.WHITE);
        apple3.setSize(1, 1);
        apple3.setLocation(0, 0);
        apple3.setColor(Color.WHITE);
        apple3.setOutlineColor(Color.WHITE);
    }

    /**
     * Method to change the object to its winter look
     */
    @Override
    public void winter()
    {
        pumpkin1.setSize(1, 1);
        pumpkin1.setColor(Color.WHITE);
        pumpkin1.setOutlineColor(Color.WHITE);
        pumpkin2.setSize(1, 1);
        pumpkin2.setColor(Color.WHITE);
        pumpkin2.setOutlineColor(Color.WHITE);
        pumpkin3.setSize(1, 1);
        pumpkin3.setColor(Color.WHITE);
        pumpkin3.setOutlineColor(Color.WHITE);

        watermelon1.setSize(1, 1);
        watermelon1.setLocation(0, 0);
        watermelon1.setColor(Color.WHITE);
        watermelon2.setSize(1, 1);
        watermelon2.setLocation(0, 0);
        watermelon2.setColor(Color.WHITE);

        apple1.setSize(1, 1);
        apple1.setLocation(0, 0);
        apple1.setColor(Color.WHITE);
        apple1.setOutlineColor(Color.WHITE);
        apple2.setSize(1, 1);
        apple2.setLocation(0, 0);
        apple2.setColor(Color.WHITE);
        apple2.setOutlineColor(Color.WHITE);
        apple3.setSize(1, 1);
        apple3.setLocation(0, 0);
        apple3.setColor(Color.WHITE);
        apple3.setOutlineColor(Color.WHITE);
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
