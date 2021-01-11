import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    /*{
        Map<Integer,Double> bundlesOfImg=new HashMap<>();
        bundlesOfImg.put(5,450.0);
        bundlesOfImg.put(10,800.0);

        Map<Integer,Double> bundlesOfFlac=new HashMap<>();
        bundlesOfFlac.put(3,427.5);
        bundlesOfFlac.put(6,810.0);
        bundlesOfFlac.put(9,1147.5);


        Map<Integer,Double> bundlesOfVid=new HashMap<>();
        bundlesOfVid.put(3,570.0);
        bundlesOfVid.put(5,900.0);
        bundlesOfVid.put(9,1530.0);

    }*/
    private int numOfImg=0;
    private int numOfFlac=0;
    private int numOfVid=0;

    /*private final static Map<String,Map> listOfBundles=new HashMap<String,Map>(){
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
            listOfBundles.get("VID").put(9,1530);


        }

    };*/

    public Calculator() {
    }

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

    public List<Bundle> calculateImg(){
        int num10=0;
        int num5=0;
        List<Bundle> detailsOfBundles = new ArrayList<>();
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

        if(num5!=0){
            Bundle bundle1 = new Bundle("Image","IMG",5,450,num5);
            detailsOfBundles.add(bundle1);
        }
        if(num10!=0){
            Bundle bundle2 = new Bundle("Image","IMG",10,800,num10);
            detailsOfBundles.add(bundle2);
        }
        if(detailsOfBundles.size()>0){
            return detailsOfBundles;
        }
        return null;
    }

    public List<Bundle> calculateFlac(){
        int num3=0;
        int num6=0;
        int num9=0;
        List<Bundle> detailsOfBundles = new ArrayList<>();

        if(numOfFlac>9){
            num9 = numOfFlac/9;
            numOfFlac = numOfFlac%9;
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


        if(num3!=0){
            Bundle bundle1 = new Bundle("Audio","Flac",3,427.5,num3);
            detailsOfBundles.add(bundle1);
        }
        if(num6!=0){
            Bundle bundle2 = new Bundle("Audio","Flac",6,810.0,num6);
            detailsOfBundles.add(bundle2);
        }
        if(num9!=0){
            Bundle bundle3 = new Bundle("Audio","Flac",9,1147.5,num9);
            detailsOfBundles.add(bundle3);
        }
        if(detailsOfBundles.size()>0){
            return detailsOfBundles;
        }
        return null;
    }

  /*  public Map<Integer,Integer> calculateVid(){
        int num3=0;
        int num5=0;
        int num9=0;

        if(numOfVid%3==0){
            if(numOfVid>9){
                num9 = numOfVid/9;
                num3 = numOfVid%9/3;
            }
            num3 = numOfVid/3;
        }else if(numOfVid%5==0){
            num5 = numOfVid/5;
        }else if(numOfVid%5==3){
            num5 = numOfVid/5;
            num3 = 1;
        }else if(numOfVid%3==5){
            if((numOfVid-5)>9){
                num9 = numOfVid/9;
                num3 = numOfVid%9/3;
                num5 = 1;
            }
            num3 = numOfVid/3;
            num5 = 1;
        }else if(numOfVid%5)



    }*/
}
