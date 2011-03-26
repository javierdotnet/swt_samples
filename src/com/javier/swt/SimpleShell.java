package com.javier.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;
public class SimpleShell {
    
     SimpleShell( )    {
        Display d = new Display( );
        Shell s = new Shell(d, SWT.CLOSE | SWT.RESIZE);
        //Shell s = new Shell(d);
        s.setSize(500,500);
        s.open( );
        s.setText("1111");
        while(!s.isDisposed( )){
            if(!d.readAndDispatch( ))
                d.sleep( );
        }
        d.dispose( );
    }
}