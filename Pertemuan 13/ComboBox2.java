// Java Program to create two checkbox
// one editable and other read only
// ComboBox2.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class solve extends JFrame implements ItemListener {
// frame
static JFrame f;
// label
static JLabel l, l1, l3, l4;
// combobox
static JComboBox c1, c2;
// main class
public static void main(String[] args)
{
// create a new frame
f = new JFrame("frame");
// create a object
solve s = new solve();
// array of string containing cities
String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
String s2[] = { "male", "female", "others" };
// create checkbox
c1 = new JComboBox(s1);
c2 = new JComboBox(s2);
// set Kolkata and male as selected items
// using setSelectedIndex
c1.setSelectedIndex(3);
c2.setSelectedIndex(0);
// add ItemListener
c1.addItemListener(s);
c2.addItemListener(s);
// set the checkbox as editable
c1.setEditable(true);
// create labels
l = new JLabel("select your city ");
l1 = new JLabel("Jalpaiguri selected");
l3 = new JLabel("select your gender ");
l4 = new JLabel("Male selected");
// set color of text
l.setForeground(Color.red);
l1.setForeground(Color.blue);
l3.setForeground(Color.red);
l4.setForeground(Color.blue);
// create a new panel
JPanel p = new JPanel();
p.add(l);
// add combobox to panel
p.add(c1);
p.add(l1);
p.add(l3);
// add combobox to panel
p.add(c2);
p.add(l4);
// set a layout for panel
p.setLayout(new FlowLayout());
// add panel to frame
f.add(p);
// set the size of frame
f.setSize(400, 400);
f.show();
}
public void itemStateChanged(ItemEvent e)
{
// if the state combobox 1is changed
if (e.getSource() == c1) {
l1.setText(c1.getSelectedItem() + " selected");
}
// if state of combobox 2 is changed
else
l4.setText(c2.getSelectedItem() + " selected");
}
}