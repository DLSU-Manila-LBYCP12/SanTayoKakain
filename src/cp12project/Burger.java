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
public class Burger extends GraphicsProgram {
    int price =0;
    int i  =0;
    private myGraph Price;
    private int max=0;
    private ArrayList IngredientsList= new ArrayList();
    private ArrayStack1 Burger = new ArrayStack1<>();
    GImage bbq = new GImage("burger/bbq.png",385,30);
    GImage bottom = new GImage("burger/bottom.png",375,25); 
    GImage cheese = new GImage("burger/cheese.png", 435 ,90);
    GImage ketchup = new GImage("burger/ketchup.png", 385,30);
    GImage lettuce = new GImage("burger/lettuce.png", 380, 30);
    GImage patty = new GImage("burger/patty.png", 385, 35);
    GImage pattyb = new GImage("burger/pattyb.png",15,500);
    GImage pickles = new GImage("burger/pickles.png", 365,25);
    GImage top = new GImage("burger/top.png", 375, 25);
    GImage bbqb = new GImage("burger/bbqb.png", 160, 400);
    GImage ketchupb = new GImage("burger/ketchupb.png",160,500);
    GImage topb = new GImage("burger/topb.png", 15,400);
    GImage cheeseb = new GImage("burger/cheeseb.png", 315,400);
    GImage picklesb = new GImage("burger/picklesb.png", 315,500);
    GImage tomatob = new GImage("burger/tomatob.png",460,400);
    GImage lettuceb = new GImage("burger/lettuceb.png",460,500);
    GImage tomato = new GImage("burger/tomato.png",400,55);
    GImage undo = new GImage("burger/undo.png",605,400);
    GImage finishb = new GImage("burger/finishb.png",605,500);
    
    
     public void mouseEvents() {
        setSize(800,700);
        drawButton();
        setBackground(Color.CYAN);
        Price = new myGraph(20);
        Price.setMark(i, "bottom bun");
        i ++;
            
         cheeseb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Burger.push("cheese");
                Price.setMark(i, "cheese");
                Price.setEdge(i-1,i, 20);
                i++;
                /*System.out.println(i);
                
                if(Price.isEdge(0,1)== true){
                   System.out.println(Price.weight(0,1)); 
                }
                else 
                {
                  System.out.println("no");
                }
                if(Price.isEdge(1,2)== true){
                   System.out.println("yes"); 
                }
                else 
                {
                  System.out.println("no");
                }  
                if(Price.isEdge(2,3)== true){
                   System.out.println("yes"); 
                }
                else 
                {
                  System.out.println("no");
                }  
                if(Price.isEdge(3,4)== true){
                   System.out.println("yes"); 
                }
                else 
                {
                  System.out.println("no");
                }  
                
                Price.isEdge(0,1);
                Price.isEdge(1,2);
                Price.isEdge(2,3);
                Price.isEdge(3,4);
                System.out.println(i);
*/
                printstack();              
              
            }
            });
         bbqb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("bbq");
                Price.setMark(i, "bbq");
                Price.setEdge(i-1,i, 5);
                i++;
                printstack();
                  
            }
          
            });
         ketchupb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("ketchup");
                Price.setMark(i, "ketchup");
                Price.setEdge(i-1,i, 5);
                i++;
                printstack();
                  
            }
          
            });
          picklesb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("pickles");
                Price.setMark(i, "pickles");
                Price.setEdge(i-1,i, 5);
                i++;
                printstack();       
            }
            });
          pattyb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("patty");
                Price.setMark(i, "patty");
                Price.setEdge(i-1,i, 50);
                i++;
                printstack();         
            }   
            });
           lettuceb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("lettuce");
                Price.setMark(i, "lettuce");
                Price.setEdge(i-1,i, 15);
                i++;
                printstack();         
            }   
            });
            tomatob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("tomato");
                Price.setMark(i, "tomato");
                Price.setEdge(i-1,i, 10);
                i++;
                printstack();         
            }   
            });
            topb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Burger.push("top");
                Price.setMark(i, "top");
                Price.setEdge(i-1,i, 20);
                while(i!=0){
                price = Price.weight(i, i-1)+ price;
                i--;
                }
                printstack();         
                JOptionPane.showMessageDialog(null, "Total cost is P"+price);
            }   
            });
            undo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Burger.peek()=="cheese")
                    remove(cheese);
                else if(Burger.peek()=="tomato")
                    remove(tomato);
                else if(Burger.peek()=="bbq")
                    remove(bbq);
                else if(Burger.peek()=="lettuce")
                    remove(lettuce);
                else if(Burger.peek()=="ketchup")
                    remove(ketchup);
                else if(Burger.peek()=="patty")
                    remove(patty);
                else if(Burger.peek()=="pickles")
                    remove(pickles);
                else if(Burger.peek()=="bottom")
                    remove(bottom);
                else if(Burger.peek()=="top")
                remove(top);
                Burger.pop();
            }
            });
            finishb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {             
                    for(int i=0; i<=Burger.size(); i++)
                    {
                        if(Burger.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Magorder ka muna wag mo sayangin oras ko!");
                        }
                        else{
                            Burger.pop(); 
                   
                        }       
                    }
                    }
         });   
                    }
     public void init(){
           IngredientsList.add("bottom");
           IngredientsList.add("bbq");
           IngredientsList.add("cheese");
           IngredientsList.add("ketchup");
           IngredientsList.add("lettuce");
           IngredientsList.add("patty");
           IngredientsList.add("pickles");
           IngredientsList.add("top");
           IngredientsList.add("tomato");
           mouseEvents();
    }
    private void drawButton(){
    add(bbqb);
    add(bottom);
    add(cheeseb);
    add(topb);
    add(ketchupb);
    add(finishb);
    add(picklesb);
    add(lettuceb);
    add(undo);
    add(tomatob);
    add(pattyb);
   }
     public void printstack() {
            if(Burger.peek()==IngredientsList.get(1))
                add(bbq);
            else if(Burger.peek()==IngredientsList.get(2))
                add(cheese);
            else if(Burger.peek()==IngredientsList.get(3))
                add(ketchup);
            else if(Burger.peek()==IngredientsList.get(4))
                add(lettuce);
            else if(Burger.peek()==IngredientsList.get(5))
                add(patty);
            else if(Burger.peek()==IngredientsList.get(6))
                add(pickles);
            else if(Burger.peek()==IngredientsList.get(7))
                add(top);     
            else if(Burger.peek()==IngredientsList.get(8))
                add(tomato);     
    }
     
       public static void main(String[] args) {
       new Burger().start(args);
   }
}
