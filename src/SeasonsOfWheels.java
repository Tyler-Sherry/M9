import wheelsFX.users.Frame.AnimationTimer;
import wheelsFX.users.Frame.Frame;
import wheelsFX.users.Shapes.Ellipse;

/**
 * SeasonOfWheels.java
 * Creates three objects (tree, flower pot, and fruit stand) and then uses an animation timer to cycle through the objects
 * four seasons of winter, spring, summer, fall
 *
 * @author Tyler Sherry
 */
public class SeasonsOfWheels
{
    public static void main(String[] args)
    {

        //Creates a tree object
        Tree tree = new Tree();

        //Creates a flower pot object
        FlowerPot flowerPot = new FlowerPot();

        //Creates a fruit stand object
        FruitStand fruitStand = new FruitStand();

        AnimationTimer timer = new AnimationTimer(tree);
        AnimationTimer flowerPotTimer = new AnimationTimer(flowerPot);
        AnimationTimer fruitStandTimer = new AnimationTimer(fruitStand);

        Frame.createFrame();
    }
}
