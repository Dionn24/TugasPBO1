import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kupu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kupu2 extends Actor
{
    /**
     * Act - do whatever the kupu2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 4;
    public void act()
    {
        move (speed);
        if (isTouching(kupu2.class)){
            setImage("skull.png");
            speed = 0;
        }
        if (isAtEdge()){
            setRotation(getRotation()-90);
            turn(17);
        }
    }
    
    public kupu2()
    {
        GreenfootImage img = this.getImage();
        img.scale(40,40);
        this.setImage(img);
    }
}
