package loremipsum.model;

import java.util.Random;

public class LoremipsumGenerator implements Loremipsum {

    @Override
    public String generateSentences(int number) {
        String[] sentences = {"Polska mistrzem świata ", "Programowanie jest super ", "Warszawa to piękne miasto ", "Jestem bogiem "};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(sentences.length);
            result.append(sentences[randomIndex]);
            // wylosowanie zdania z tablicy sentenences
        }

        return result.toString();
    }

    @Override
    public String generateWords(int number) {
        String[] sentences = {"Warszawa ", "Programowanie ", "Dupa ", "Jestem ","Para "};

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < number; i++) {
            Random random = new Random();

            word.append(sentences[random.nextInt(sentences.length)]);
            // wylosowanie zdania z tablicy sentenences
        }

        return word.toString();
    }

    @Override
    public String generateParagraphs(int number) {
        StringBuilder para = new StringBuilder();
        for (int i = 0; i < number; i++) {
            para.append(generateWords(3)+"\n");
        }
        return para.toString();
    }
}
