import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static Calculator fileReader(){
        FileReader reader = null;
        BufferedReader in = null;
        String line;
        Calculator calculator = null;

        try {
            reader = new FileReader("Order.txt");
            in = new BufferedReader(reader);
            while((line = in.readLine()) != null){

                calculator = new Calculator();
                String num = line.split(" ")[0];
                String type = line.split(" ")[1];

                switch (type){
                    case "IMG":
                        calculator.setNumOfImg(Integer.parseInt(num));

                    case "FLAC":
                        calculator.setNumOfFlac(Integer.parseInt(num));

                    case "VID":
                        calculator.setNumOfVid(Integer.parseInt(num));
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(calculator!=null){
                return calculator;
            }else{
                return null;
            }
        }


    }

    public static void fileWriter(List<Bundle> quotation){
        try {
            FileWriter writer = new FileWriter("Quotation");
            BufferedWriter out = new BufferedWriter(writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<Bundle>quotation = new ArrayList<>();

        Calculator calculator = fileReader();

        if(calculator==null){
            System.out.println("No order provided!");
            return;
        }
        quotation.addAll(calculator.calculateImg());
        quotation.addAll(calculator.calculateFlac());




    }
}
