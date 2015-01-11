import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends Actor
{
    public int Harga2;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("menu2-harga.jpg");          
            getWorld().getBackground().drawImage(HargaM,50,120);
            
            Harga2 = 45000;
        }
    }   
}
