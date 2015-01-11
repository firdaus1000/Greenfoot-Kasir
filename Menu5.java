import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu5 extends Actor
{
    public int Harga5;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu5-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga5 = 25000;
        }
    }
}
