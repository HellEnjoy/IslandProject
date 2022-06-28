package com.company;

import java.util.List;

public class Location {
    private boolean isGrassAvailable;
    public boolean RetrieveGrass() {
        if(isGrassAvailable) {
            isGrassAvailable = false;
            return true;
        }
        return false;
    }
    public void PutGrass() {
        isGrassAvailable = true;
    }
}
