/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp12project;
import acm.graphics.GLabel;
import acm.graphics.GImage;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;



import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import acm.program.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author user
 */
public class Icecream extends GraphicsProgram {
    private int max=0;
    private ArrayList IngredientsList= new ArrayList();
    private ArrayStack Icecream = new ArrayStack<>();
    GImage ccb = new GImage("icecream/chococonebutton.png",25,475);
    GImage cb = new GImage("icecream/chocolatebutton.png",25,530);
    GImage chococone = new GImage("icecream/chococone.png", 400, 175 );
    GImage chocolate = new GImage("icecream/chocolate.png", 560,120);
    GImage vcb = new GImage("icecream/vanillaconebutton.png", 275, 475);
    GImage vb = new GImage("icecream/vanillabutton.png", 275, 530);
    GImage vanillacone = new GImage("icecream/vanillacone.png", 400, 175);
    GImage vanilla = new GImage("icecream/vanilla.png", 558,120);
    GImage gcb = new GImage("icecream/grapesconebutton.png", 525, 475);
    GImage gb = new GImage("icecream/grapesbutton.png", 525, 530);
    GImage grapescone = new GImage("icecream/grapescone.png", 400, 175);
    GImage grapes = new GImage("icecream/grapes.png", 558,105);
    GImage scb = new GImage("icecream/sbconebutton.png", 775, 475);
    GImage sb = new GImage("icecream/strawberrybutton.png", 775, 530);
    GImage sbcone = new GImage("icecream/strawberrycone.png", 400, 175);
    GImage strawberry = new GImage("icecream/strawberry.png", 558,110);
    GImage fb = new GImage("images/finishbutton.png", 1025, 510);
    
    public void mouseEvents() {
        setSize(1250,700);
        setBackground(Color.CYAN);
        drawButton();        
        
        ccb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                      Icecream.push("chococone");
                printstack();
                  
            }
          
            });
        cb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                     if(Icecream.peek()==IngredientsList.get(0)||Icecream.peek()==IngredientsList.get(2)||Icecream.peek()==IngredientsList.get(4)||Icecream.peek()==IngredientsList.get(6)){
                     Icecream.push("chocolate");
                     add(chocolate);
                     }
                     else if(Icecream.size()==2){
                     chocolate = new GImage("icecream/chocolate.png",558,50);
                     Icecream.push("chocolate");
                     add(chocolate);
                     }
                     else if(Icecream.size()==3){
                     chocolate = new GImage("icecream/chocolate.png",558,0);
                     Icecream.push("chocolate");
                     add(chocolate);
                    }    
                        }
            });   
            
        vcb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                      Icecream.push("vanillacone");
                printstack();
                  
            }
          
            });       
         vb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 if(Icecream.peek()==IngredientsList.get(0)||Icecream.peek()==IngredientsList.get(2)||Icecream.peek()==IngredientsList.get(4)||Icecream.peek()==IngredientsList.get(6)){
                     Icecream.push("vanilla");
                     add(vanilla);
                     }
                     else if(Icecream.size()==2){
                     vanilla = new GImage("icecream/vanilla.png",558,50);
                     Icecream.push("vanilla");
                     add(vanilla);
                     }
                     else if(Icecream.size()==3){
                     vanilla = new GImage("icecream/vanilla.png",558,0);
                     Icecream.push("vanilla");
                     add(vanilla);
                    }
                  
            }
          
            });       
         gcb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                      Icecream.push("grapescone");
                printstack();
                  
            }
          
            });       
         gb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 if(Icecream.peek()==IngredientsList.get(0)||Icecream.peek()==IngredientsList.get(2)||Icecream.peek()==IngredientsList.get(4)||Icecream.peek()==IngredientsList.get(6)){
                     Icecream.push("grapes");
                     add(grapes);
                     }
                     else if(Icecream.size()==2){
                     grapes = new GImage("icecream/grapes.png",560,60);
                     Icecream.push("grapes");
                     add(grapes);
                     }
                     else if(Icecream.size()==3){
                     grapes = new GImage("icecream/grapes.png",560,10);
                     Icecream.push("grapes");
                     add(grapes);
                    }
            }
          
            });     
         scb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                      Icecream.push("sbcone");
                printstack();
                  
            }
          
            });          
         sb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 if(Icecream.peek()==IngredientsList.get(0)||Icecream.peek()==IngredientsList.get(2)||Icecream.peek()==IngredientsList.get(4)||Icecream.peek()==IngredientsList.get(6)){
                     Icecream.push("strawberry");
                     add(strawberry);
                     }
                     else if(Icecream.size()==2){
                     strawberry = new GImage("icecream/strawberry.png",560,60);
                     Icecream.push("strawberry");
                     add(strawberry);
                     }
                     else if(Icecream.size()==3){
                     strawberry = new GImage("icecream/strawberry.png",560,10);
                     Icecream.push("strawberry");
                     add(strawberry);
                    }
          
            }
         });
         fb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {             
                    for(int i=0; i<=Icecream.size(); i++)
                    {
                        if(Icecream.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Magorder ka muna wag mo sayangin oras ko!");
                        }
                        else{
                            Icecream.pop();
                            }       
                    }
                    }
         });   
        
    }
        
    

    public void init(){
           IngredientsList.add("chococone");
           IngredientsList.add("chocolate");
           IngredientsList.add("vanillacone");
           IngredientsList.add("vanilla");
           IngredientsList.add("grapescone");
           IngredientsList.add("grapes");
           IngredientsList.add("sbcone");
           IngredientsList.add("strawberry");
           mouseEvents();
    }
    
   
    private void drawButton(){
    add(ccb);
    add(cb);
    add(vcb);
    add(vb);
    add(gcb);
    add(gb);
    add(scb);
    add(sb);
    add(fb);
   }
      
    
    public void printstack() {
            if(Icecream.peek()==IngredientsList.get(0))
                add(chococone); 
            else if(Icecream.peek()==IngredientsList.get(1))
            add(chocolate);
            else if(Icecream.peek()==IngredientsList.get(2))
                add(vanillacone);
            else if(Icecream.peek()==IngredientsList.get(3))
                add(vanilla);
            else if(Icecream.peek()==IngredientsList.get(4))
                add(grapescone);
            else if(Icecream.peek()==IngredientsList.get(5))
                add(grapes);
            else if(Icecream.peek()==IngredientsList.get(6))
                add(sbcone);
            else if(Icecream.peek()==IngredientsList.get(7))
                add(strawberry);            
    }
            
 
     public static void main(String[] args) {
       new Icecream().start(args);
   }
   

}
