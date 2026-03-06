package Day_11;

import java.util.HashMap;

class MyCollege{
    int regNo;
    MyCollege(int regNo){
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "College RegNo : " + regNo;
    }
}

class MyRanking{
    int rank;
    MyRanking(int rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "College Rank : " + rank;
    }
}

public class HashMapPractice {
    public static void main(String[] args) {
//        hashmapSyntax();

        //custom hashmap
        MyRanking r = new MyRanking(44);
        MyCollege c = new MyCollege(177);
        HashMap<MyCollege,MyRanking> clgRank = new HashMap<>();
        clgRank.put(c,r);//It gives object memory so need to override toString in classes
        System.out.println(clgRank);
    }

    static void hashmapSyntax(){
        HashMap<Integer,String> myMap = new HashMap<>();

        //Insert
        myMap.put(1, "soumojit");
        myMap.put(2, "Banerjee");
        myMap.put(3, "2nd year");

        //print
        System.out.println(myMap);

        //update
        myMap.replace(3, "3rd year");//update if exists
        System.out.println(myMap);
        myMap.put(2,"banerjee");//update if exists or insert if not
        System.out.println(myMap);

        //get values
        System.out.println(myMap.get(1));

        //check existance
        System.out.println(myMap.containsKey(2));
        System.out.println(myMap.containsValue("soumojit"));
        System.out.println(myMap.containsValue("topper"));

        //default
        System.out.println(myMap.getOrDefault(4,"Not present "));

        //Iterate for each loop
        for (Integer key: myMap.keySet()){
            System.out.println("key : " + key);
            System.out.println("Value : " + myMap.get(key));
        }
    }

}
