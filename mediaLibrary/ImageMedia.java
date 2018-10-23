package week5.mediaLibrary;

import java.util.Iterator;
import java.util.Vector;

public class ImageMedia extends Media {
    private String mFilePath;
    private Vector<String> mCategories;

    public ImageMedia(String name, String description, String filePath){
        super(name, description);
        this.mFilePath = filePath;
        this.mCategories = new Vector();
    }

    public String getFilePath(){
        return this.mFilePath;
    }

    public void addCategory(String category){
        String[] acceptableCategories = {"Portrait", "Landscape", "Abstract"};
        for(String item : acceptableCategories){
            if(category.equalsIgnoreCase(item)){
                this.mCategories.add(category);
            }
        }
    }

    public Vector<String> getCategories(){
        return this.mCategories;
    }

    public String categoryToString(Vector<String> categories){
        Iterator it = categories.iterator();
        String builder = "";
        while(it.hasNext()){
            builder += it.next() + " ";
        }
        return builder;
    }
}
