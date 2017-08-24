package ru.dens.feon.shedulers;

import java.util.Collections;
import java.util.List;
import java.util.Map;


public class ShedulerDFS {
    
    private static ShedulerDFS ourInstance = new ShedulerDFS();
    
    private List<Map<String, String>> shedulerList;

    public static ShedulerDFS getInstance() {
        return ourInstance;
    }

    private ShedulerDFS() {
        shedulerList = loadShedulerListFromProperties();
    }

    private List<Map<String,String>> loadShedulerListFromProperties() {

        return Collections.emptyList();

    }
}
