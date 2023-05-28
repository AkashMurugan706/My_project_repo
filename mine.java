import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code ="mine" width=1000 height=1000>
</applet>
*/
class MenuFrame extends Frame
{
String msg= " ";
CheckboxMenuItem wordwrap, statusbar;
MenuFrame(String title)
{
super(title);
MenuBar m=new MenuBar();
setMenuBar(m);
Menu file=new Menu("File");
MenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
file.add(item1=new MenuItem("New              Cntrl+N"));
file.add(item2=new MenuItem("New Window          Cntrl+Shft+N"));
file.add(item3=new MenuItem("Open            Cntrl+O"));
file.add(item4=new MenuItem("Save             Cntrl+S"));
file.add(item5=new MenuItem("Save As        Cntrl+Shft+S"));
file.add(item6=new MenuItem("-"));
file.add(item7=new MenuItem("Page Setup..."));
file.add(item8=new MenuItem("Print...          Cntrl+P"));
file.add(item9=new MenuItem("-"));
file.add(item10=new MenuItem("Exit"));
m.add(file);
Menu edit=new Menu("Edit");
MenuItem item11,item12,item13,item14,item15,item16,item17,item18,item19,item20,item21,item22,item23,item24,item25,item26;
edit.add(item11=new MenuItem("Undo             Ctrl+Z"));
edit.add(item12=new MenuItem("-"));
edit.add(item13=new MenuItem("Cut                Ctrl+X "));
edit.add(item14=new MenuItem("Copy              Ctrl+C "));
edit.add(item15=new MenuItem("Paste              Ctrl+V"));
edit.add(item16=new MenuItem("Delete            Del "));
edit.add(item17=new MenuItem("-")); 
edit.add(item18=new MenuItem("Search with Bing             Ctrl+E"));
edit.add(item19=new MenuItem("Find                                 Ctrl+F "));
edit.add(item20=new MenuItem("Find Next                         F3 "));
edit.add(item21=new MenuItem("Find Previous                   Shift+F3 "));
edit.add(item22=new MenuItem("Replace                            Ctrl+H "));
edit.add(item23=new MenuItem("Go To                               Ctrl+G "));
edit.add(item24=new MenuItem("-"));
edit.add(item25=new MenuItem("Select All                         Ctrl+A "));
edit.add(item26=new MenuItem("Time/Date                         F5 "));
m.add(edit);
Menu format=new Menu("Format");
wordwrap=new CheckboxMenuItem("Wordwrap");
format.add(wordwrap);
MenuItem item27;
format.add(item27=new MenuItem("Font..."));
m.add(format);
Menu view=new Menu("View");
Menu sub=new Menu("Zoom");
MenuItem item28,item29,item30;
sub.add(item28=new MenuItem("Zoom in              Ctrl+plus"));
sub.add(item29=new MenuItem("Zoom out            Ctrl+Minus"));
sub.add(item30=new MenuItem("Restore Default Zoom             Ctrl+0"));
view.add(sub);
statusbar=new CheckboxMenuItem("Status Bar");
view.add(statusbar);
m.add(view);
Menu help=new Menu("Help");
MenuItem item31,item32,item33,item34;
help.add(item31=new MenuItem("View Help"));
help.add(item32=new MenuItem("Send feedback"));
help.add(item33=new MenuItem("-"));
help.add(item34=new MenuItem("About Notepad"));
m.add(help);
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
MyWindowAdapter a=new MyWindowAdapter(this);
addWindowListener(a);
}
}
public class mine extends Applet
{
Frame f;
public void init()
{
f=new MenuFrame("mine");
int width=Integer.parseInt(getParameter("width"));
int height=Integer.parseInt(getParameter("Height"));
setSize(new Dimension(width,height));
f.setSize(width,height);
f.setVisible(true);
}
public void start()
{
f.setVisible(true);
}
public void stop()
{
f.setVisible(false);
}
}



