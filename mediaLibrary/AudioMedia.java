package week5.mediaLibrary;

import java.util.Vector;

public class AudioMedia extends Media {
    private String mFilePath;
    private Vector<String> mCategories;

    public AudioMedia(String name, String description, String filePath){
        super(name, description);
        this.mFilePath = filePath;
        this.mCategories = new Vector();
    }

    public String getFilePath(){
        return this.mFilePath;
    }

    public void addCategory(String category){
        String[] acceptableCategories = {"Music", "Book", "FX"};
        for(String item : acceptableCategories){
            if(category.equalsIgnoreCase(item)){
                this.mCategories.add(category);
            }
        }
    }
}
