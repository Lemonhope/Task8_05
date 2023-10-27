package Task8_05;

import java.util.TreeMap;

public class FamilyInfo {
    private TreeMap<String, String>data=new TreeMap<>();

    public FamilyInfo() {
        this.data.put("Львів", "Іванови");
        this.data.put("Київ", "Петрови");
        this.data.put("Лондон", "Абрамовичі");
        this.data.put("Херсон", "Гопаки");
    }
    public void show(){
        System.out.println(data);
    }
    public void addData(String city, String family){
        this.data.put(city, family);
    }
    public String findFamily(String city){
        return this.data.get(city);
    }
}
