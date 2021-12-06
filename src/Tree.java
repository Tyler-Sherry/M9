import javafx.scene.paint.Color;
import wheelsFX.users.Frame.Animator;
import wheelsFX.users.Frame.Frame;
import wheelsFX.users.Shapes.Ellipse;
import wheelsFX.users.Shapes.Rectangle;

/**
 * Tree.java
 * Tree class that creates a tree object that changes its features/shape representation with the
 * four seasons
 *
 * @author Tyler Sherry
 */
public class Tree implements Seasonal, Animator
{
    private int curSeason;
    private final int DELAY;
    private int callCount;

    private Ellipse topLeaf;
    private Ellipse leftLeaf;
    private Ellipse rightLeaf;
    private Rectangle trunk;
    private Rectangle branch1;
    private Rectangle branch2;

    /**
     * No args constructor that creates the base shapes for the tree
     */
    public Tree()
    {
        this.curSeason = 0;
        this.DELAY = 40;
        this.callCount = 0;

        topLeaf = new Ellipse(145, 100);
        topLeaf.setColor(Color.GREEN);
        topLeaf.setSize(25, 50);

        leftLeaf = new Ellipse(90, 115);
        leftLeaf.setColor(Color.GREEN);
        leftLeaf.setSize(25, 50);

        rightLeaf = new Ellipse(210, 115);
        rightLeaf.setColor(Color.GREEN);
        rightLeaf.setSize(25, 50);

        trunk = new Rectangle(70, 200);
        trunk.setRotation(90);
        trunk.setSize(150, 25);
        trunk.setColor(Color.BROWN);

        branch1 = new Rectangle(70, 170);
        branch1.setRotation(220);
        branch1.setSize(80, 15);
        branch1.setColor(Color.BROWN);

        branch2 = new Rectangle(140, 170);
        branch2.setRotation(315);
        branch2.setSize(80, 15);
        branch2.setColor(Color.BROWN);
    }


    /**
     * Method to change the tree to its fall look
     */
    @Override
    public void fall()
    {
        rightLeaf.setSize(10, 35);
        rightLeaf.setColor(Color.DARKGOLDENROD);
        rightLeaf.setLocation(210, 200);

        topLeaf.setSize(15, 38);
        topLeaf.setColor(Color.DARKGOLDENROD);
        topLeaf.setLocation(120, 240);

        leftLeaf.setSize(10, 20);
        leftLeaf.setColor(Color.DARKGOLDENROD);
        leftLeaf.setLocation(90, 280);
    }

    /**
     * Method to change the tree to its spring look
     */
    @Override
    public void spring()
    {
        topLeaf.setColor(Color.GREEN);
        topLeaf.setSize(10, 20);
        topLeaf.setLocation(145, 120);

        leftLeaf.setColor(Color.GREEN);
        leftLeaf.setSize(10, 20);
        leftLeaf.setLocation(80, 130);

        rightLeaf.setColor(Color.GREEN);
        rightLeaf.setSize(10, 20);
        rightLeaf.setLocation(210, 130);

    }

    /**
     * Method to change the tree to its summer look
     */
    @Override
    public void summer()
    {
        topLeaf.setLocation(145, 100);
        topLeaf.setSize(25,50);
        topLeaf.setColor(Color.GREEN);

        leftLeaf.setLocation(90, 115);
        leftLeaf.setColor(Color.GREEN);
        leftLeaf.setSize(25, 50);

        rightLeaf.setLocation(210, 115);
        rightLeaf.setColor(Color.GREEN);
        rightLeaf.setSize(25, 50);
    }

    /**
     * Method to change the tree to its winter look
     */
    @Override
    public void winter()
    {
        topLeaf.setColor(Color.WHITE);
        topLeaf.setSize(1, 1);
        leftLeaf.setColor(Color.WHITE);
        leftLeaf.setSize(1, 1);
        rightLeaf.setColor(Color.WHITE);
        rightLeaf.setSize(1, 1);
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
