package loremipsum.model;

import de.svenjacobs.loremipsum.LoremIpsum;

public class LoremipsumJacobsAdapter implements Loremipsum {

    private LoremIpsum  loremIpsum = new LoremIpsum();

    @Override
    public String generateSentences(int number) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < number; j++) {
            for (int i = 0; i < 5; i++) {
                result.append(generateWords(1)+" ");
            }
            result.append(".");
        }
        return result.toString();
    }

    @Override
    public String generateWords(int number) {
        return loremIpsum.getWords(number);
    }

    @Override
    public String generateParagraphs(int number) {
        return loremIpsum.getParagraphs(number);
    }
}
