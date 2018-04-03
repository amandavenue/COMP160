/**StyleOptionsPanel.java      adapted from Java Foundations
   Amanda Veldman (changes) September 2016
   Demonstrates the use of check boxes. */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
   private JLabel saying;
   private JCheckBox bold, italic;
   private JRadioButton courier, tnr, helvetica;
   private int style = Font.PLAIN;
   private String typeFace = "Helvetica";

   /** Sets up a panel with a label and some check boxes and radio buttons that
     control the style of the label's font. also sets grid layout for the buttons*/
   public StyleOptionsPanel()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font (typeFace, style, 20));

      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
      
      courier = new JRadioButton ("Courier");
      tnr = new JRadioButton ("Times New Roman");
      helvetica = new JRadioButton ("Helvetica", true);
      ButtonGroup fonts = new ButtonGroup();            //create a group for the radio buttons
      fonts.add(courier);
      fonts.add(tnr);
      fonts.add(helvetica);
      
      FontListener fListener = new FontListener();
      courier.addActionListener(fListener);
      tnr.addActionListener(fListener);
      helvetica.addActionListener(fListener);
      
      add (saying);
      add (bold);
      add (italic);
      add (courier);
      add (tnr);
      add (helvetica);    //add buttons to the panel

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(300, 300));
      setLayout( new GridLayout(6,1));
   }

   /**  Represents the listener for both check boxes. */
   private class StyleListener implements ItemListener
   {
      /**  Updates the style of the label font style. */
      public void itemStateChanged (ItemEvent event)
      {
         style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         saying.setFont (new Font (typeFace, style, 20));
      }
   }
   /** Represents the listener for all radio buttons */
   private class FontListener implements ActionListener{
     /** updates the font of the label saying */
     public void actionPerformed(ActionEvent event){
       Object source = event.getSource();
       
       if(source == courier){
         typeFace = "Courier";
       } else {
           if(source == tnr){
             typeFace = "Times New Roman";
           } else {
             typeFace = "Helvetica";
           }
       }
       saying.setFont(new Font (typeFace, style, 20));
     }
   }
}
