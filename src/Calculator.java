import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private int numOfImg;
    private int numOfFlac;
    private int numOfVid;

    private final static Map<String,Map> listOfBundles=new HashMap<String,Map>(){
        {
            listOfBundles.put("IMG",new HashMap<Integer,Double>());
            listOfBundles.get("IMG").put(5,450.0);
            listOfBundles.get("IMG").put(10,800.0);

            listOfBundles.put("FLAC",new HashMap<Integer,Double>());
            listOfBundles.get("FLAC").put(3,427.5);
            listOfBundles.get("FLAC").put(6,810.0);
            listOfBundles.get("FLAC").put(9,1147.5);

            listOfBundles.put("VID",new HashMap<Integer,Double>());
            listOfBundles.get("VID").put(3,570);
            listOfBundles.get("VID").put(5,900);
            listOfBundles.get("VID").put(3,1530);

        }

    };

    public Calculator(int numOfImg, int numOfFlac, int numOfVid) {
        this.numOfImg = numOfImg;
        this.numOfFlac = numOfFlac;
        this.numOfVid = numOfVid;
    }

    public int getNumOfImg() {
        return numOfImg;
    }

    public void setNumOfImg(int numOfImg) {
        this.numOfImg = numOfImg;
    }

    public int getNumOfFlac() {
        return numOfFlac;
    }

    public void setNumOfFlac(int numOfFlac) {
        this.numOfFlac = numOfFlac;
    }

    public int getNumOfVid() {
        return numOfVid;
    }

    public void setNumOfVid(int numOfVid) {
        this.numOfVid = numOfVid;
    }

    public Map<Integer,Integer> calculateImg(){
        int num10=0;
        int num5=0;
        if(numOfImg>10){
         num10 = numOfImg/10;
         numOfImg = numOfImg%10;
        }
        if(numOfImg>5){
         num10 += 1;
        }
        if(numOfImg>0){
         num5 += 1;
        }
        Map<Integer,Integer>numOfBundles = new HashMap<>();

        if(num5!=0){
            numOfBundles.put(5,num5);
        }
        if(num10!=0){
            numOfBundles.put(10,num10);
        }
        return numOfBundles;
    }

    public Map<Integer,Integer> calculateFlac(){
        int num3=0;
        int num6=0;
        int num9=0;
        if(numOfFlac>9){
            num9 = numOfImg/10;
            numOfImg = numOfImg%9;
        }
        if(numOfFlac>6){
            num9 += 1;
        }
        if(numOfFlac>3){
            num6 += 1;
        }
        if(numOfFlac>0){
            num3 += 1;
        }
        Map<Integer,Integer>numOfBundles = new HashMap<>();

        if(num3!=0){
            numOfBundles.put(3,num3);
        }
        if(num6!=0){
            numOfBundles.put(6,num6);
        }
        if(num9!=0){
            numOfBundles.put(9,num9);
        }
        return numOfBundles;
    }

    public Map<Integer,Integer> calculateVid(){
        int num3=0;
        int num5=0;
        int num9=0;



    }
}
