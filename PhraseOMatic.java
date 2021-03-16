package HeadFirstJavaHW;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"set","working","reps","weight","light","heavy","superset","bench","squat"};
        String[] wordListTwo = {"goku","naruto","sasuke","luffy","asta","vegata","ichigo","gon","kirito"};
        String[] wordListThree = {"mekhi","chasity","carleton","monai","mijae","orion","jahlil","hanna"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLengh = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLengh);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a" + phrase);
    }
};



