package loremipsum.model;

public interface Loremipsum {

    // Po co interface? Bo zakładam, że robię implementację tak, żeby była dostępna dla klieta na pokaz.
    // Najprawdopodobnije zrobię tą implementację profesjonalniej.

    String generateSentences(int number);
    String generateWords(int number);
    String generateParagraphs(int number);
}
