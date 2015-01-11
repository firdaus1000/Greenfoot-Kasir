import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Kasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasir extends World
{
    public String[] kasirAngka = {
        "7","8","9","/", "*", "+/-", "4", "5", "6", "+", "-", ".", "1", "2", "3", "0", "C", "="
    };
    public int x = 65;
    public int y = 260;
    public int z = 0;

    /**
     * Constructor for objects of class Kasir.
     * 
     */
    public Kasir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        backMenu();

        screnKasir();
        
        inButton();
        ngecek();
        bayar();
        
    }
    
    private void backMenu(){
        keMenu kemenu = new keMenu();
        addObject(kemenu, 80, 555);
    }

    
    public void screnKasir(){
        GreenfootImage image = getBackground();
        Color color = new Color (100, 200, 200, 100);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(650,20,340,500);
        image.setColor(color);
        image.fillRect(20, 20, 600, 150);
        
    }
    
    public void inButton(){
        for(int z = 0; z < kasirAngka.length; z++){
            if (x < 600){
                x = x;
                y = y;
            }else{
                x = 65;
                y = y + 100;
            }
            
            Actor button = new kasirButton();
            addObject(button, x, y);
            Actor textBox = new kasirLabel(kasirAngka[z]);
            addObject(textBox, x + 25,y);
            
            x = x + 100;
        }
    }
    
    private void ngecek()
    {
        kasirLabelCek labelcek = new kasirLabelCek();
        addObject(labelcek, 300, 85);
    }
    
    public void bayar(){
        GreenfootImage image = getBackground();
        Color color = new Color (100,200,200,100);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(650,20,340,500);
        image.setColor(color);
        image.fillRect(650,20, 340, 500);
        
        GreenfootImage Names = getBackground();
        Font font = getBackground().getFont(); 
        font = font.deriveFont(35.0f);
        getBackground().setFont(font);
        
        Names.setColor(java.awt.Color.BLACK);
        Names.drawString("TOTAL : ", 660, 100);
        Names.drawString("Rp. ", 670, 150);
        Names.drawString("BAYAR : ", 660, 250);
        Names.drawString("Rp. ", 670, 300);
        Names.drawString("KEMBALIAN : ", 660, 400);
        Names.drawString("Rp. ", 670, 450);
    }
}