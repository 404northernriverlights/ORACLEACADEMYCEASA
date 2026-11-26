package Blackjack;

public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    private String getSuit(int n1) {
        switch (n1) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            case 4: return "Spades";
            default: return "";
        }
    }

    private String getName(int n2) {
        switch (n2) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "";
        }
    }

    
    private int getPoints(String name) {
        switch (name) {
            case "Ace":
                return 11; 
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(name); 
        }
    }

    public int getPointValue() {
        if (name.equals("Ace")) return 11;
        if (name.equals("Jack") || name.equals("Queen") || name.equals("King")) return 10;
        return Integer.parseInt(name);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}