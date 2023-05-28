import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="doop"width=700 height=700>
</applet>
*/
class MenuFrame extends Frame
{
String msg="";
CheckboxMenuItem wordwrap,statusbar;
MenuFrame(String title)
{
super(title);
MenuBar mb=new MenuBar();
setMenuBar(mb);
Menu file=new Menu("File");
MenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
file.add(item1=new MenuItem("New                                        Ctrl+N"));
file.add(item2=new MenuItem("New Window                          Ctrl+Shift+N"));
file.add(item3=new MenuItem("Open                                       Ctrl+O"));
file.add(item4=new MenuItem("Save                                        Ctrl+S"));
file.add(item5=new MenuItem("Save As                                   Ctrl+Shift+S"));
file.add(item6=new MenuItem("-"));
file.add(item7=new MenuItem("Page Setup"));
file.add(item8=new MenuItem("Print                                        Ctrl+P"));
file.add(item9=new MenuItem("-"));
file.add(item10=new MenuItem("Exit"));
mb.add(file);
Menu edit=new Menu("Edit");
MenuItem item11,item12,item13,item14,item15,item16,item17,item18,item19,item20,item21,item22,item23,item24,item25,item26;
edit.add(item11=new MenuItem("Undo                                    Ctrl+Z"));
edit.add(item12=new MenuItem("-"));
edit.add(item13=new MenuItem("Cut                                       Ctrl+X "));
edit.add(item14=new MenuItem("Copy                                    Ctrl+C "));
edit.add(item15=new MenuItem("Paste                                   Ctrl+V"));
edit.add(item16=new MenuItem("Delete                                  Del "));
edit.add(item17=new MenuItem("-")); 
edit.add(item18=new MenuItem("Search with Bing                  Ctrl+E"));
edit.add(item19=new MenuItem("Find                                        Ctrl+F "));
edit.add(item20=new MenuItem("Find Next                                F3 "));
edit.add(item21=new MenuItem("Find Previous                       Shift+F3 "));
edit.add(item22=new MenuItem("Replace                                Ctrl+H "));
edit.add(item23=new MenuItem("Go To                                   Ctrl+G "));
edit.add(item24=new MenuItem("-"));
edit.add(item25=new MenuItem("Select All                             Ctrl+A "));
edit.add(item26=new MenuItem("Time/Date                            F5 "));
mb.add(edit);
Menu format=new Menu("Format");
wordwrap=new CheckboxMenuItem("Word Wrap");
format.add(wordwrap);
MenuItem item27;
format.add(item27=new MenuItem("Font"));
mb.add(format);
Menu view=new Menu("View");
Menu sub=new Menu("Zoom");
MenuItem item28,item29,item30;
sub.add(item28=new MenuItem("Zoom in                                Ctrl+Plus"));
sub.add(item29=new MenuItem("Zoom out                              Ctrl+Minus "));
sub.add(item30=new MenuItem("Restore Default Zoom            Ctrl+0"));
view.add(sub);
statusbar=new CheckboxMenuItem("Status Bar");
view.add(statusbar);
mb.add(view);
Menu help=new Menu("Help");
MenuItem item31,item32,item33,item34;
help.add(item31=new MenuItem("View Help"));
help.add(item32=new MenuItem("Send Feedback"));
help.add(item33=new MenuItem("-"));
help.add(item34=new MenuItem("About Notepad"));
mb.add(help);
MyMenuHandler handler=new MyMenuHandler(this);
item1.addActionListener(handler);
item2.addActionListener(handler);
item3.addActionListener(handler);
item4.addActionListener(handler);
item5.addActionListener(handler);
item6.addActionListener(handler);
item7.addActionListener(handler);
item8.addActionListener(handler);
item9.addActionListener(handler);
item10.addActionListener(handler);
item11.addActionListener(handler);
item12.addActionListener(handler);
item13.addActionListener(handler);
item14.addActionListener(handler);
item15.addActionListener(handler);
item16.addActionListener(handler);
item17.addActionListener(handler);
item18.addActionListener(handler);
item19.addActionListener(handler);
item20.addActionListener(handler);
item21.addActionListener(handler);
item22.addActionListener(handler);
item23.addActionListener(handler);
item24.addActionListener(handler);
item25.addActionListener(handler);
item26.addActionListener(handler);
wordwrap.addItemListener(handler);
item27.addActionListener(handler);
item28.addActionListener(handler);
item29.addActionListener(handler);
item30.addActionListener(handler);
item31.addActionListener(handler);
statusbar.addItemListener(handler);
item32.addActionListener(handler);
item33.addActionListener(handler);
item34.addActionListener(handler);
MyWindowAdapter adapter=new MyWindowAdapter(this);
addWindowListener(adapter);
}
public void paint(Graphics g)
{
g.drawString(msg,10,200);
if(wordwrap.getState())
  g.drawString("Word Wrap is on.",10,220);
else
  g.drawString("Word Wrap is off.",10,220);
 if(statusbar.getState())
g.drawString("Status Bar is on.",10,240);
else
g.drawString("Status Bar is off.",10,240);
}
class MywindowAdapter extends WindowAdapter
{
MenuFrame mf;
public MywindowAdapter(MenuFrame mf)
{
this.mf=mf;
}
public void windowClosing(WindowEvent we)
{
mf.setVisible(true);
}
}
class MyMenuHandler implements ActionListener,ItemListener
{
MenuFrame mf;
public MyMenuHandler(MenuFrame mf)
{
this.mf=mf;
}
public void actionPerformed(ActionEvent ae)
{
String arg=ae.getActionCommand();
if(arg.equals("New                                        Ctrl+N"))
msg="You Selected New ";
else if(arg.equals("New Window                          Ctrl+Shift+N"))
msg="You Selected New Window";
else if(arg.equals("Open                                       Ctrl+O"))
msg="You Selected Open";
else if(arg.equals("Save                                        Ctrl+S"))
msg="You Selected Save";
else if(arg.equals("Save As                                   Ctrl+Shift+S"))
msg="You Selected Save As";
else if(arg.equals("Page Setup"))
msg="You Selected Page Setup";
else if(arg.equals("Print                                        Ctrl+P"))
msg="You Selected Print";
else if(arg.equals("Exit"))
msg="You Selected Exit";
else if(arg.equals("Undo                                    Ctrl+Z"))
msg="You Selected Undo";
else if(arg.equals("Cut                                       Ctrl+X"))
msg="You Selected Cut";
else if(arg.equals("Copy                                    Ctrl+C "))
msg="You Selected Copy";
else if(arg.equals("Paste                                   Ctrl+V"))
msg="You Selected Paste";
else if(arg.equals("Delete                                  Del"))
msg="You Selected Delete";
else if(arg.equals("Search with Bing                  Ctrl+E"))
msg="You Selected Search with Bing";
else if(arg.equals("Find                                        Ctrl+F"))
msg="You Selected Find";
else if(arg.equals("Find Next                                F3 "))
msg="You Selected Find Next";
else if(arg.equals("Find Previous                       Shift+F3"))
msg="You Selected Find Previous";
else if(arg.equals("Replace                                Ctrl+H"))
msg="You Selected Replace";
else if(arg.equals("Go To                                   Ctrl+G"))
msg="You Selected Go To";
else if(arg.equals("Select All                             Ctrl+A"))
msg="You Selected Select All";
else if(arg.equals("Time/Date                            F5"))
msg="You Selected Time/Date";
else if(arg.equals("Word Wrap"))
msg="You Selected Word Wrap";
else if(arg.equals("Font"))
msg="You Selected Font";
else if(arg.equals("Zoom"))
msg="You Selected Zoom";
else if(arg.equals("Zoom in                                Ctrl+Plus"))
msg="You Selected Zoom in";
else if(arg.equals("Zoom out                              Ctrl+Minus"))
msg="You Selected Zoom out";
else if(arg.equals("Restore Default Zoom            Ctrl+0"))
msg="You Selected Restore Default Zoom";
else if(arg.equals("Status Bar"))
msg="You Selected Status Bar";
else if(arg.equals("View Help"))
msg="You Selected View Help";
else if(arg.equals("Send Feedback"))
msg="You Selected Send Feedback";
else if(arg.equals("About Notepad"))
msg="You Selected About Notepad";
mf.repaint();
}
public void itemStateChanged(ItemEvent ie)
{
mf.repaint();
}
}
public class doop extends Applet
{
Frame f;
public void init()
{
f.setSize(700,600);
f.setVisible(true);
}
}
}
