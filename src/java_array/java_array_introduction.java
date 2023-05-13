package java_array;

public class java_array_introduction {

    public static void main(String[] args) {

        String[] names = new String[4];

        names[0] = "Anwar";
        names[1] = "Monowar";
        names[2] = "Jobaer";
        names[3] = "Ojaer";

        System.out.println("Names[2] : " + names[2]);

        int len = names.length;
        System.out.println("Length of array : " + len);

    }

}
