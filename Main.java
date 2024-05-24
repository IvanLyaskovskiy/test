package com.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rightAnswer;
        String userAnswer;
        String[] questions = {"пити","жити","їсти","стрибати","вбивати","робити","писати","читати","плакати","посміхатися"};
        String[] rightAnswers = {"beben", "vivir","comer","saltar","matar","hacer","escribir","leer","llorar","sonrisa"};

        for(int i=0;i<10;i++){

            System.out.print(questions[i] + " - ");
            userAnswer = scan.nextLine();
            rightAnswer = rightAnswers[i];

            if(userAnswer.equals(rightAnswer)) {
                System.out.println("Правильно!");
            }
            else{
                System.out.println("Неправильно. Правильна відповідь: " + rightAnswer);
            }
        }
    }
}
