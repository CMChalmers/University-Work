package week5.mediaLibrary;

import java.util.ArrayList;
import java.util.Comparator;

public class MediaLibrary {

    private ArrayList<Media> lib = null;

    public MediaLibrary(){
        lib = new ArrayList();
    }

    public void addMedia(Media item){
        lib.add(item);
        lib.sort(Comparator.comparing(Media::getmName));
    }

    public String toString(){
        return lib + "";
    }

    public String findMedia(String name){
        for(Media item : lib){
            if(item.getmName().contains(name)){
                System.out.println(item);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        ImageMedia cortes = new ImageMedia("Porte St Martin Paris", "A view of Paris", "img/Cortes1");

        cortes.addCategory("Picture");
        cortes.addCategory("Portrait");
        cortes.addCategory("Landscape");
        cortes.addCategory("Painting");

        System.out.println(cortes.categoryToString(cortes.getCategories()));
    }
}

