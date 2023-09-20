import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batu extends World
{

    /**
     * Constructor for objects of class batu.
     * 
     */
    public batu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kupu2 kupu2 = new kupu2();
        addObject(kupu2,445,210);
        kupu2 kupu22 = new kupu2();
        addObject(kupu22,204,271);
        kupu2 kupu23 = new kupu2();
        addObject(kupu23,275,307);
        kupu2 kupu24 = new kupu2();
        addObject(kupu24,433,301);
        kupu2.setLocation(400,101);
        kupu22.setLocation(147,160);
        kupu23.setLocation(99,342);
    }
}
