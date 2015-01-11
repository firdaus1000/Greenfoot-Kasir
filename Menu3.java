import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu3 extends Actor
{
    public int Harga3;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu3-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga3 = 60000;
        }
    }       
}
