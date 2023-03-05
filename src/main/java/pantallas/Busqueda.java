/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallas;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */


/**
 * This is the dynamic component of the project. It is a search engine and is 
 * made up of two buttons with an image and a textField to search.
 * It inherits from a Jpanel since everything will be contained in a Jpanel 
 * that uses a layout.
 * @author Admin
 */
public class Busqueda extends JPanel{
    JTextField busqueda; //Is a textField for search
    JButton buscar; //Is a find button
    JButton buscarVoz; // Is a find whit voice button
    JPanel panelBusqueda; //Is a panel for textField
    JPanel panelBotones; // Is a panel for buttons.
    //JPanel panelTodo;
    
    /**
     * Default constructor of the class that defines the structure of 
     * the elements and their functions.
     */
    public Busqueda(){
        
        /**
         * Modify background for panel
         */
        setLayout(new GridLayout(0,2,5,5)); //layout for class
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());
        panelBusqueda= new JPanel();
        panelBotones= new JPanel();
        
        panelBotones.setLayout(new GridLayout(0,6,3,3)); //layout for buttons panel
        
        
        panelBusqueda.setLayout(new GridLayout(0,1,10,10)); //layout for textField panel
        
        /**
         * Modify background for panel TextField
         */
        panelBusqueda.setBorder(BorderFactory.createEmptyBorder());
        panelBusqueda.setBackground(new Color(0,0,0,0));
        busqueda = new JTextField();
        
        buscar = new JButton();
        buscarVoz = new JButton();
        
        
        ImageIcon iconoBuscar = new ImageIcon("src/lupa.png");
        
        /**
         * Set backgroun for buttons and set icons.
         */
        buscar.setIcon(iconoBuscar);
        buscar.setBorder(BorderFactory.createEmptyBorder());
        buscar.setBackground(new Color(0,0,0,0));
        
        ImageIcon iconoBuscarVoz = new ImageIcon("src/micro.png");
        buscarVoz.setIcon(iconoBuscarVoz);
        buscarVoz.setBorder(BorderFactory.createEmptyBorder());
        buscarVoz.setBackground(new Color(0,0,0,0));
        
        
        panelBotones.setOpaque(false);
        panelBotones.setBorder(BorderFactory.createEmptyBorder());
        
        panelBusqueda.add(busqueda);
        panelBotones.add(buscar);
        panelBotones.add(buscarVoz);
        panelBotones.add(new JLabel());
        panelBotones.add(new JLabel());
        panelBotones.add(new JLabel());
        panelBotones.add(new JLabel());
        add(panelBusqueda);
        add(panelBotones);
    }
    
    
}
