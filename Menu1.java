import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu1 extends Actor
{
    
    public int Harga1;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu1-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga1 = 50000;
        }
    }
}
