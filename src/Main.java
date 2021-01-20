import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static Calculator input(){
        Scanner sc = new Scanner(System.in);
        Calculator calculator = null;

        String input = sc.nextLine();

        String[] inputContent = input.split(" ");

    if(inputContent.length>0) {
        calculator = new Calculator();

        for (int i = 1; i < inputContent.length; i += 2) {

            switch (inputContent[i]) {

                case "IMG":
                    calculator.setNumOfImg(Integer.parseInt(inputContent[i - 1]));
                    break;

                case "FLAC":
                    calculator.setNumOfFlac(Integer.parseInt(inputContent[i - 1]));
                    break;

                case "VID":
                    calculator.setNumOfVid(Integer.parseInt(inputContent[i - 1]));
                    break;

                default:
                    continue;
            }
        }
    }
        if(calculator!=null){
            return calculator;
        }

        return null;

    }

    public static void output(Calculator calculator,List<Bundle>quotation){

        List<String> typeList = quotation.stream().map(bundle -> bundle.getCode()).distinct().collect(Collectors.toList());

        System.out.println("The details of quotation is shown below:");
        System.out.println(" ");

        for(String type : typeList) {
            int totalNum = 0;
            switch (type){
                case "IMG":
                    totalNum = calculator.getNumOfImg();
                    System.out.println(totalNum);
                    break;
                case "FLAC":
                    totalNum = calculator.getNumOfFlac();
                    System.out.println(totalNum);
                    break;
                case "VID":
                    totalNum = calculator.getNumOfVid();
                    break;
                default:
                    System.out.println("Stupid");
            }

            double sum = quotation.stream()
                    .filter(bundle -> bundle.getCode().equals(type))
                    .mapToDouble(bundle -> bundle.getNumOfBundles() * bundle.getPrice())
                    .summaryStatistics().getSum();

            System.out.println(totalNum+ " " + type + " $" + sum);

            quotation
                    .stream()
                    .filter(bundle -> bundle.getCode().equals(type))
                    .forEach(bundle -> System.out.println("  " + bundle.getNumOfBundles() + " x " + bundle.getNumOfPosts() + " $" + bundle.getPrice()));


        }

    }


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

        System.out.println("Please type your order!");
        Calculator calculator = input();

        //Calculator calculator = fileReader();

        if(calculator==null){
            System.out.println("No order provided!");
            return;
        }
        quotation.addAll(calculator.calculateImg());
        quotation.addAll(calculator.calculateFlac());
        quotation.addAll((calculator.calculateVid()));

        output(calculator,quotation);

      /*  List<String> typeList = quotation.stream().map(bundle -> bundle.getCode()).distinct().collect(Collectors.toList());


        for(String type : typeList) {
            int totalNum = 0;
            switch (type){
                case "IMG":
                    totalNum = calculator.getNumOfImg();
                    System.out.println(totalNum);
                    break;
                case "FLAC":
                    totalNum = calculator.getNumOfFlac();
                    System.out.println(totalNum);
                    break;
                case "VID":
                    totalNum = calculator.getNumOfVid();
                    break;
                default:
                    System.out.println("Stupid");
            }

            double sum = quotation.stream()
                    .filter(bundle -> bundle.getCode().equals(type))
                    .mapToDouble(bundle -> bundle.getNumOfBundles() * bundle.getPrice())
                    .summaryStatistics().getSum();

            System.out.println(totalNum+ " " + type + " $" + sum);

            quotation
                    .stream()
                    .filter(bundle -> bundle.getCode().equals(type))
                    .forEach(bundle -> System.out.println("  " + bundle.getNumOfBundles() + " x " + bundle.getNumOfPosts() + " $" + bundle.getPrice()));


        }*/

    }
}
