import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu6 extends Actor
{
    public int Harga6;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu6-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga6 = 45000;
        }
    }   
}
