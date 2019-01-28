import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        int i = 0;
        int x = 55;
        while(i<12){
            addObject(new Key("g","3a.wav"),x,140);
            i = i+1;
            x = x + 63;
        }
    }

    void prepare(){

    }
}