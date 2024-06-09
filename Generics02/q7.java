package CSW_Sem_4.src.Generics02;

import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String getPlotNo(){
        return this.plotNo;
    }
}

public class q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        addressMap.put("Amit", new Address("123", "Main Street", "City1"));
        addressMap.put("Barik", new Address("456", "Park Avenue", "City2"));
        addressMap.put("Chaman", new Address("789", "High Street", "City3"));

        Iterator<String> iterator = addressMap.keySet().iterator();
        System.out.println("Addresses:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name + ", Address: " + addressMap.get(name).getPlotNo()); //.........Q5 - LINE 57
        }
    }
}
