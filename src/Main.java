import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static  void  main(String[] args){
        // Lesson 1
        System.out.println("Hello, world!!");
        System.out.println("Vishal Jasrotia");

        Car myCar = new Car(25.5, "1BCDE", Color.BLUE, true);
        Car sallyCar = new Car(30.5, "NYFARY", Color.RED, false);

        System.out.println("My Car's license plate " +  myCar.licensePlate);
        System.out.println("Sally car's license plate " + sallyCar.licensePlate);
        System.out.println("My car's color " +  myCar.paintColor.toString());
        myCar.changePaintColor(Color.CYAN);
        System.out.println("My car's color " +  myCar.paintColor.toString());

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);

        // Lesson 2 Strings and char
//
//        System.out.println("Enter a word :");
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        System.out.println("Number is :" + userNumber);

//        String userInput = sc.next();
//        String upperCase = userInput.toUpperCase();
//        System.out.println(userInput);
//        System.out.println(upperCase);
//
//        char firstCharacter = userInput.charAt(0);
//        System.out.println(firstCharacter);
//
//        System.out.println("Contains : " + upperCase.contains("Enter".toLowerCase()));

        // Lesson array

//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 45;
//        System.out.println(numbers[1]);
//
//        int[] numbers2 = {31, 45,22,98,45};
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));
//
//
//        String[] candyBars = {"Twix", "Hershey's", "Crunch"};
//        System.out.println("Index 1 " + candyBars[0]);
//        System.out.println(candyBars.length);
//
//        System.out.println(Array.get(candyBars , 2));
       }

}
