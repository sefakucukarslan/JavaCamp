public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Sefa";
        ogrenciler[1]="Bilge";
        ogrenciler[2]="Uras";
        ogrenciler[3]="Buglem";

        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------------");

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}