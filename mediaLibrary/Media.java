package week5.mediaLibrary;

import java.util.Iterator;
import java.util.Vector;

public abstract class Media {
    private String mName;
    private String mDescription;

    public Media(String name, String desc){
        setmName(name);
        setmDescription(desc);
    }

    public void setmName(String name){
        this.mName = name;
    }

    public String getmName(){
        return this.mName;
    }

    public void setmDescription(String desc){
        this.mDescription = desc;
    }

    public String getmDescription(){
        return this.mDescription;
    }

    public String toString(){
        return this.getmName() + " : " + this.getmDescription();
    }

    public abstract void addCategory(String category);
}
