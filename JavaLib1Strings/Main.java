package JavaLib1Strings;

public class Main {

    public static boolean compareString(String stringOne, String stringTwo){
        if(stringOne.equalsIgnoreCase(stringTwo)){
            return true;
        }
        return false;
    }

    public static void splitArray(String[] list){
        for(int i = 0; i < list.length; i++){
            if(i == list.length-1){
                System.out.println(list[i] + ".");
            } else {
                System.out.print(list[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        // test of compare string
        String one = "dog";
        String two = "dog";

        if(compareString(one, two)){
            System.out.println("They match.");
        } else {
            System.out.println("They don't match.");
        }

        // test to compare arraySplit

        String[] list = new String[4];
        list[0] = "dog";
        list[1] = "cat";
        list[2] = "pig";
        list[3] = "ape";

        splitArray(list);

    }
}
