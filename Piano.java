import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{

    private String[] whiteKeys = {"a","s","d","f","g","h","j","k","l",";","'","\\"};
    private String[] whiteNotes = {"3c","3d","3e","3f","3g","3a","3b","4c","4d", "4e","4f","4g"};
        private String[] blackKeys  = { "q", "w", "", "t", "u", "", "o", "p", "", "]"};
    private String[] blackNotes = { "3c", "3d", "", "3f", "3g", "3a", "", "4c", "4d", "", "4f"};
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        createKeys();
    }

    private void createKeys() {
        for(int i = 0; i < whiteKeys.length; i++){
            addObject(new Key("white", whiteKeys[i], whiteNotes[i]+".wav"),i*63+55,140);
        }
        for(int q = 0; q < 10;q++){
            if(blackKeys[q] != ""){
                addObject(new Key("black", blackKeys[q], whiteNotes[q]+".wav"),(q*63)+85,86);
            }
        }
    }
}