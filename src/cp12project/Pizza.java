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
public class Pizza extends GraphicsProgram {
    int i=0;
    int price=0;
    private myGraph Price;
    private int max=0;
    private ArrayList IngredientsList= new ArrayList();
    private ArrayStack2 Pizza = new ArrayStack2<>();
    GImage dough = new GImage("pizza/dough.png", 500, 25);
    GImage tomato = new GImage("pizza/tomato.png", 500, 25);
    GImage bacon = new GImage("pizza/bacon.png", 500, 25);
    GImage mozarella = new GImage("pizza/mozarella.png", 500, 25);
    GImage bell = new GImage("pizza/bell.png", 500, 25);
    GImage ham = new GImage("pizza/ham.png", 500, 25);
    GImage jalapeno = new GImage("pizza/jalapeno.png",500, 25);
    GImage pepperoni = new GImage("pizza/pepperoni.png",500, 25);
    GImage pineapple = new GImage("pizza/pineapple.png",500, 25);
    GImage tomatob = new GImage("pizza/tomatob.png", 15,500);
    GImage mozarellab = new GImage("pizza/mozarellab.png",15,600);    
    GImage baconb = new GImage("pizza/baconb.png",215,500);
    GImage hamb = new GImage("pizza/hamb.png", 215,600);
    GImage bellb = new GImage("pizza/bellb.png", 415,500);
    GImage jalapenob = new GImage("pizza/jalapenob.png", 415,600);
    GImage pineappleb = new GImage("pizza/pineappleb.png",615,600);
    GImage pepperonib = new GImage("pizza/pepperonib.png",615,500);
    GImage undob = new GImage("pizza/undob.png",815,500);
    GImage finishb = new GImage("pizza/finishb.png",815,600);
    
     public void mouseEvents() {
        setSize(1100,800);
        setBackground(Color.CYAN);
        drawButton();
        Price = new myGraph(20);
        Price.setMark(i, "dough");
       
       
        i ++;
            
            baconb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("bacon");
                Price.setMark(i, "bacon");
                Price.setEdge(i-1,i, 30);
                                i++;
                printstack();              
            }
            });
            bellb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("bell");
                Price.setMark(i, "bell");
                Price.setEdge(i-1,i, 10);
                i++;
                printstack();              
            }
            });
            hamb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("ham");
                Price.setMark(i, "ham");
                Price.setEdge(i-1,i, 20);
                i++;
                printstack();              
            }
            });
            jalapenob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("jalapeno");
                Price.setMark(i, "jalapeno");
                Price.setEdge(i-1,i, 15);
                i++;
                printstack();              
            }
            });            
            pineappleb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("pineapple");
                Price.setMark(i, "pineapple");
                Price.setEdge(i-1,i, 20);
                while(i!=0){
                price = Price.weight(i, i-1)+ price;
                i--;
                }
                System.out.println(price);
                printstack();  
            }
            });            
            pepperonib.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("pepperoni");
                Price.setMark(i, "pepperoni");
                Price.setEdge(i-1,i, 8);
                i++;
                printstack();              
            }
            });
            tomatob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("tomato");
                Price.setMark(i, "tomato");
                Price.setEdge(i-1,i, 19);
                i++;
                printstack();              
            }
            });            
            bellb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("bell");
                Price.setMark(i, "bell");
                Price.setEdge(i-1,i, 7);
                i++;
                printstack();              
            }
            });
            mozarellab.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pizza.push("mozarella");
                Price.setMark(i, "mozarella");
                Price.setEdge(i-1,i, 35);
                i++;
                printstack();              
            }
            });            
            undob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Pizza.peek()=="tomato")
                    remove(tomato);
                else if(Pizza.peek()=="ham")
                    remove(ham);
                else if(Pizza.peek()=="bell")
                    remove(bell);
                else if(Pizza.peek()=="pepperoni")
                    remove(pepperoni);
                else if(Pizza.peek()=="pineapple")
                    remove(pineapple);
                else if(Pizza.peek()=="jalapeno")
                    remove(jalapeno);
                else if(Pizza.peek()=="bacon")
                    remove(bacon);
                else if(Pizza.peek()=="mozarella")
                    remove(mozarella);
                Pizza.pop();
            }
            });  
            finishb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             

           System.out.println(price);
                   
                    }
         });   
            
}
     public void init(){
           IngredientsList.add("dough");
           IngredientsList.add("bacon");
           IngredientsList.add("mozarella");
           IngredientsList.add("bell");
           IngredientsList.add("ham");
           IngredientsList.add("jalapeno");
           IngredientsList.add("tomato");
           IngredientsList.add("pepperoni");
           IngredientsList.add("pineapple");
           mouseEvents();
    }
    private void drawButton()
     {
         add(dough);
         add(baconb);
         add(tomatob);
         add(hamb);
         add(mozarellab);
         add(bellb);
         add(jalapenob);
         add(pepperonib);
         add(pineappleb);
         add(undob);
         add(finishb);
         
     }
     public void printstack() {
            if(Pizza.peek()==IngredientsList.get(1))
                add(bacon);
            else if(Pizza.peek()==IngredientsList.get(2))
                add(mozarella);
            else if(Pizza.peek()==IngredientsList.get(3))
                add(bell);
            else if(Pizza.peek()==IngredientsList.get(4))
                add(ham);
            else if(Pizza.peek()==IngredientsList.get(5))
                add(jalapeno);
            else if(Pizza.peek()==IngredientsList.get(6))
                add(tomato);
            else if(Pizza.peek()==IngredientsList.get(7))
                add(pepperoni);     
            else if(Pizza.peek()==IngredientsList.get(8))
                add(pineapple);    
    }
public static void main(String[] args) {
       new Pizza().start(args);
   }
}


