import java.util.*;

public class Calculator {

    private int numOfImg=0;
    private int numOfFlac=0;
    private int numOfVid=0;


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
        int numOfPost=numOfImg;
        List<Bundle> detailsOfBundles = new ArrayList<>();
        if(numOfPost>10){
         num10 = numOfPost/10;
         numOfPost = numOfPost%10;
        }
        if(numOfPost>5){
         num10 += 1;
        }else if(numOfPost>0){
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
        return detailsOfBundles;
    }

    public List<Bundle> calculateFlac(){
        int num3=0;
        int num6=0;
        int num9=0;
        int numOfPost=numOfFlac;
        List<Bundle> detailsOfBundles = new ArrayList<>();

        if(numOfPost>9){
            num9 = numOfPost/9;
            numOfPost = numOfPost%9;
        }
        if(numOfPost>6){
            num9 += 1;
        }else if(numOfPost>3){
            num6 += 1;
        }else if(numOfPost>0){
            num3 += 1;
        }


        if(num3!=0){
            Bundle bundle1 = new Bundle("Audio","FLAC",3,427.5,num3);
            detailsOfBundles.add(bundle1);
        }
        if(num6!=0){
            Bundle bundle2 = new Bundle("Audio","FLAC",6,810.0,num6);
            detailsOfBundles.add(bundle2);
        }
        if(num9!=0){
            Bundle bundle3 = new Bundle("Audio","FLAC",9,1147.5,num9);
            detailsOfBundles.add(bundle3);
        }
       return detailsOfBundles;
    }

    public List<Bundle>calculateVid(){
        int num3=0;
        int num5=0;
        int num9=0;
        int numOfPost=numOfVid;
        List<Bundle> detailsOfBundles = new ArrayList<>();

        if(numOfPost<=3){
            num3=1;
            Bundle bundle3 = new Bundle("Video", "VID", 3, 570.0, num3);
            detailsOfBundles.add(bundle3);
        }else if(numOfPost<=5){
            num5=1;
            Bundle bundle5 = new Bundle("Video","VID",5,900.0,num5);
            detailsOfBundles.add(bundle5);
        }else if(numOfPost==7){
            num5=1;
            num3=1;
            Bundle bundle5 = new Bundle("Video","VID",5,900.0,num5);
            Bundle bundle3 = new Bundle("Video","VID",3,570.0,num3);
            detailsOfBundles.add(bundle3);
            detailsOfBundles.add(bundle5);
        }else {

            for (int i = 0; i < numOfPost / 9 + 1; i++) {
                for (int j = 0; j < (numOfPost - 9 * i) / 5 + 1; j++) {
                    for (int k = 0; k < (numOfPost - 9 * i - 5 * j) / 3 + 1; k++) {
                        if (i * 9 + j * 5 + k * 3 == numOfPost) {
                            if (i > 0) {
                                num9 = i;
                                Bundle bundle9 = new Bundle("Video", "VID", 9, 1530.0, num9);
                                detailsOfBundles.add(bundle9);
                            }
                            if (j > 0) {
                                num5 = j;
                                Bundle bundle5 = new Bundle("Video", "VID", 5, 900.0, num5);
                                detailsOfBundles.add(bundle5);
                            }
                            if (k > 0) {
                                num3 = k;
                                Bundle bundle3 = new Bundle("Video", "VID", 3, 570.0, num3);
                                detailsOfBundles.add(bundle3);
                            }
                            return detailsOfBundles;

                        }
                    }
                }
            }

        /*for(int i=0;i<numOfPost/3+1;i++){
            for(int j=0;j<(numOfPost-3*i)/5+1;j++){
                for(int k=0;k<(numOfPost-3*i-6*j)/9+1;k++){
                    if(i*3+j*5+k*9==numOfPost){
                        if(i>0){
                            Bundle bundle1 = new Bundle("Video","VID",3,570.0,i);
                            detailsOfBundles.add(bundle1);
                        }
                        if(j>0){
                            Bundle bundle2 = new Bundle("Video","VID",5,900.0,j);
                            detailsOfBundles.add(bundle2);
                        }
                        if(k>0){
                            Bundle bundle3 = new Bundle("Video","VID",9,1530.0,k);
                            detailsOfBundles.add(bundle3);
                        }
                        return detailsOfBundles;
                    }
                }
            }
        }*/
        }
        return detailsOfBundles;
    }
}
