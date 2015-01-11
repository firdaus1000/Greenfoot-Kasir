import greenfoot.*; 
import java.awt.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 

        isiMenu();
    }

    private void isiMenu()
    {
        keKasir kekasir = new keKasir() ;
        addObject(kekasir, 730, 753);
        
        Judul judul = new Judul() ;
        addObject(judul, 405, 60);
        
        GreenfootImage image = getBackground();
        Color color = new Color (50, 200, 200, 100);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(50, 120, 710, 150);
        image.setColor(color);
        image.fillRect(50, 120, 710, 150);
        
        GreenfootImage images = getBackground();
        Color colors = new Color (50, 200, 200, 100);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(420, 285, 350, 420);
        images.setColor(colors);
        images.fillRect(420, 285, 350, 420);
        
        Menu1 menu1 = new Menu1();
        addObject(menu1, 120, 350);
        Menu2 menu2 = new Menu2();
        addObject(menu2, 320, 350);
        Menu3 menu3 = new Menu3();
        addObject(menu3, 120, 500);
        Menu4 menu4 = new Menu4();
        addObject(menu4, 320, 500);
        Menu5 menu5 = new Menu5();
        addObject(menu5, 120, 650);
        Menu6 menu6 = new Menu6();
        addObject(menu6, 320, 650);
    }
}
