package Task8_05;


public class Main {
    public static void main(String[] args) {
        FamilyInfo familyInfo=new FamilyInfo();
        familyInfo.addData("Алушта", "Ілієнко");
        familyInfo.show();
        // відразу маємо відсортований за містом(ключем) список
        System.out.println("Київ -- "+familyInfo.findFamily("Київ"));
    }
}
