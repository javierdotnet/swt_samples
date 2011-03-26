package com.javier.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.*;
public class MenuShell1 {
    Display d;
    Shell s;
     MenuShell1( )    {
         d = new Display( );
         s = new Shell(d);
        s.setSize(300,300);
        s.setImage(new Image(d, "/home/javier/Java/gxt-2.1.1/resources/images/gxt/icons/top2.gif"));
        s.setText("A Shell Menu Example");
        Menu m = new Menu(s,SWT.BAR );
                  
         // create a File menu and add an Exit item
         final MenuItem file = new MenuItem(m, SWT.CASCADE);
         file.setText("File");
         final Menu filemenu = new Menu(s, SWT.DROP_DOWN);
         file.setMenu(filemenu);
         final MenuItem openItem = new MenuItem(filemenu, SWT.PUSH);
         openItem.setText("Open");
         final MenuItem separator = new MenuItem(filemenu, SWT.SEPARATOR);
         final MenuItem exitItem = new MenuItem(filemenu, SWT.PUSH);
         exitItem.setText("Exit");
         
         // create an Edit menu and add Cut, Copy, and Paste items
         final MenuItem edit = new MenuItem(m, SWT.CASCADE);
         edit.setText("Edit");
         final Menu editmenu = new Menu(s, SWT.DROP_DOWN);
         edit.setMenu(editmenu);
         final MenuItem cutItem = new MenuItem(editmenu, SWT.PUSH);
         cutItem.setText("Cut");
         final MenuItem copyItem = new MenuItem(editmenu, SWT.PUSH);
         copyItem.setText("Copy");
         final MenuItem pasteItem = new MenuItem(editmenu, SWT.PUSH);
         pasteItem.setText("Paste");
         
         //create a Window menu and add Child items
         final MenuItem window = new MenuItem(m, SWT.CASCADE);
         window.setText("Window");
         final Menu windowmenu = new Menu(s, SWT.DROP_DOWN);
         window.setMenu(windowmenu);
         final MenuItem maxItem = new MenuItem(windowmenu, SWT.PUSH);
         maxItem.setText("Maximize");
         final MenuItem minItem = new MenuItem(windowmenu, SWT.PUSH);
         minItem.setText("Minimize");
         
         // create a Help menu and add an About item
         final MenuItem help = new MenuItem(m, SWT.CASCADE);
         help.setText("Help");
         final Menu helpmenu = new Menu(s, SWT.DROP_DOWN);
         help.setMenu(helpmenu);
         final MenuItem aboutItem = new MenuItem(helpmenu, SWT.PUSH);
         aboutItem.setText("About");
         
         openItem.addSelectionListener(new SelectionListener( ) {
        	 @Override
             public void widgetSelected(SelectionEvent e) {
                Shell parent = (Shell)maxItem.getParent( ).getParent( );
                DialogExample de = new DialogExample(parent);
                de.Show( );
            }
             
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        });
        s.setMenuBar(m);
        s.open( );
        while(!s.isDisposed( )){
            if(!d.readAndDispatch( ))
                d.sleep( );
        }
        d.dispose( );
    }
}