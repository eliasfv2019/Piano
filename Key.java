/**
 * An example of a method - replace this comment with your own
 *
 * @param  y  a sample parameter for a method
 * @return    the sum of x and y
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Key extends Actor
{
    private boolean isDown;
    private String colour;
    private String key;
    private String note;
    /**
     * Create a new key.
     */
    public Key(String colour, String key, String note)
    {/**
         * An example of a method - replace this comment with your own
         *
         * @param  y  a sample parameter for a method
         * @return    the sum of x and y
         */

        isDown = false;
        this.key = key;
        this.colour = colour;
        this.note = note;
        setImage(colour+"-key.png");
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key)) {
            setImage(colour + "-key-down.png");
            Greenfoot.playSound(note);
            isDown = true;
        } 
        if (isDown && !Greenfoot.isKeyDown(key))
        {
            setImage(colour + "-key.png");
            isDown = false;
        }
    }
}

