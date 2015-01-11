import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu4 extends Actor
{
    public int Harga4;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu4-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga4 = 35000;
        }
    }  
}
