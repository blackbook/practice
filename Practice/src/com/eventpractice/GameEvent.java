package com.eventpractice;

import java.util.EventObject;

public class GameEvent extends EventObject {
    private String type;
    
    public GameEvent( Object source, String s ) {
        super( source );
        type = s;
    }
    public String getType() {
        return type;
    }
    
}