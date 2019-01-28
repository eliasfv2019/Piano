import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Key extends Actor
{
    private String key;
    private String note;

    /**
     * Create a new key.
     */
    public Key(String key, String note)
    {
        isDown = false;
        this.key = key;
        this.note = note;
    }

    /**
     * Do the action for this key.
     */
    private boolean isDown = false;
    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key)) {
            setImage("white-key-down.png");
            Greenfoot.playSound(note);
            isDown = true;
        } 
        if (isDown && !Greenfoot.isKeyDown(key))
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
}

