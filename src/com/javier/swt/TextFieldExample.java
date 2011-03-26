package com.javier.swt;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.*;
public class TextFieldExample {
    
    Display d;
    Shell s;
    TextFieldExample( )    {
        d = new Display( );
        s = new Shell(d);
        s.setSize(250,250);
        s.setImage(new Image(d, "/home/javier/Java/gxt-2.1.1/resources/images/gxt/icons/top2.gif"));
        final Text text1 = new Text(s, SWT.SINGLE);
        text1.setBounds(10,10,100,20);
        s.open( );
        while(!s.isDisposed( )){
            if(!d.readAndDispatch( ))
                d.sleep( );
        }
        d.dispose( );
    }
}