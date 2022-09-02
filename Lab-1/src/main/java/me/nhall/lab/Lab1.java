package me.nhall.lab;

public class Lab1 {

    public static void main(String[] args) {
        String[] answerKey = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] studentAnswers = {
                {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}};

        for (int i = 0; i < studentAnswers.length; i++) {
            int c = 0;
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j].equalsIgnoreCase(answerKey[j])) {
                    c++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + c);
        }
    }
}
