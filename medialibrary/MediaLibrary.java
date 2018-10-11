package medialibrary;

import java.util.ArrayList;
import java.util.Comparator;

public class MediaLibrary {

    ArrayList<Media> lib = null;

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
        MediaLibrary lib = new MediaLibrary();

        Media dan = new Media("Paul Simon", "Graceland");
        Media chuck = new Media("Honne", "Location Unknown");
        Media abe = new Media("Sibelius", "Finlandia");

        lib.addMedia(dan);
        lib.addMedia(chuck);
        lib.addMedia(abe);

        System.out.println(lib);

        lib.findMedia("Sibelius");
    }
}
