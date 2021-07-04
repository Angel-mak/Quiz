package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void PrintCapitalsCategory() throws IOException {
        Scanner inpot = new Scanner(System.in);
        String path = "C:\\Users\\Angel-PC\\Desktop\\First Category.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        List<List> listOfQA = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            listOfQA.add(Arrays.asList((line.split(";"))));
        }
        for (int i = 0;i<4;i++){
            Collections.shuffle(listOfQA.get(i));
        }
        Collections.shuffle(listOfQA);
        byte points = 0;
        for (int i = 0; i < listOfQA.size(); i++){
            System.out.println();
            for (int j = 0; j < 5; j++) {

                System.out.println(listOfQA.get(i).get(j));
            }
            String userAnswer = inpot.nextLine().toLowerCase(Locale.ROOT);
            if (userAnswer.equals("sofia") || userAnswer.equals("brussels")
                    || userAnswer.equals("ottawa") || userAnswer.equals("libreville")) {
                System.out.println("Correct");
                points++;
            } else {
                System.out.println("Wrong");
                System.out.println("Your score is: " + points);
                break;
            }
            if(points==4){
                System.out.println("You win");
            }
        }
    }

    public static void PrintVolleyball() throws IOException {

        Scanner inpot = new Scanner(System.in);
        String path = "C:\\Users\\Angel-PC\\Desktop\\Second Category.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        List<List> listOfQA = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            listOfQA.add(Arrays.asList((line.split(";"))));
        }
        for (int i = 0;i<4;i++) {
            Collections.shuffle(listOfQA.get(i));
        }
        Collections.shuffle(listOfQA);
        byte points = 0;
        for (int i = 0; i < listOfQA.size(); i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.println(listOfQA.get(i).get(j));
            }
            String userAnswer = inpot.nextLine().toLowerCase(Locale.ROOT);
            if (userAnswer.equals("6") || userAnswer.equals("mintonette")
                    || userAnswer.equals("1895") || userAnswer.equals("libero")) {
                System.out.println("Correct");
                points++;
            } else {
                System.out.println("Wrong");
                System.out.println("Your score is: " + points);
                break;
            }
            if(points==4){
                System.out.println("You win");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner inpot = new Scanner(System.in);
        System.out.println("Please enter category for your quiz!");
        System.out.println("Your options are: 1-Capitals of countries and 2-Volleyball");
        int chosenCategory = inpot.nextInt();
        switch (chosenCategory) {
            case 1:
                PrintCapitalsCategory();
                break;
            case 2:
                PrintVolleyball();
                break;
            default:
                System.out.println("You chose incorrect option");
        }
    }
}
