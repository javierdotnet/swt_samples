package com.javier.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.*;
public class MenuShell {
    Display d;
    Shell s;
    MenuShell( )    
    {
        d = new Display( );
        s = new Shell(d);
        s.setSize(500,500);
        s.setImage(new Image(d, "/home/javier/Java/gxt-2.1.1/resources/images/gxt/icons/top2.gif"));
        s.setText("A Shell Menu Example");
        Menu m = new Menu(s,SWT.BAR );
        MenuItem file = new MenuItem(m, SWT.CASCADE);
        file.setText("File");
        Menu filemenu = new Menu(s, SWT.DROP_DOWN);
        file.setMenu(filemenu);
        MenuItem openItem = new MenuItem(filemenu, SWT.PUSH);
        openItem.setText("Open");
        MenuItem exitItem = new MenuItem(filemenu, SWT.PUSH);
        exitItem.setText("Exit");
        
        s.setMenuBar(m);
        s.open( );
        while(!s.isDisposed( )){
            if(!d.readAndDispatch( ))
                d.sleep( );
        }
        d.dispose( );
    }
}
