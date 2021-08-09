import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {

    private static Scanner userInput = new Scanner(System.in);

    public List<String> getQuestionsList() {
        return questionsList;
    }

    List<String> questionsList = new ArrayList<String>();
    List<String> answerList = new ArrayList<String>();

    String gr = "Gryffindor";
    String ra = "Ravenclaw";
    String sl = "Slytherin";
    String hu = "Hufflepuff";

    String userAnswer;

    public String questions() {

        String question1 = "Which of the following would you most hate people to call you?\n"
                + "(A) Ordinary\n(B) Ignorant\n(C) Cowardly\n(D) Selfish";

        questionsList.add(question1);
        System.out.println(questionsList.get(0));
        // each question/answer is printed
        userAnswer = userInput.nextLine();
        // userAnswer stores the input from user with a Scanner

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(hu);
        }
        // if/else to add ra/sl/gr/hu to answerList

        String question2 = "After you have died, what would you most like people to do when they hear your name?\n"
                + "(A) Think with admiration of you achievements\n(B) Ask for more stories about your adventures\n(C) I don't care what people think of me after I'm dead; it's what they think of me while I'm alive that counts\n(D) Miss you, but smile";

        questionsList.add(question2);
        System.out.println(questionsList.get(1));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(hu);
        }

        String question3 = "Given the choice, would you rather invent a potion that would guarantee you:\n" +
                "(A) Glory\n(B) Wisdom\n(C) Love\n(D) Power";

        questionsList.add(question3);
        System.out.println(questionsList.get(2));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(sl);
        }

        String question4 = "You enter an enchanted garden. What would you be most curious to examine first?\n" +
                "(A) The silver leafed tree bearing golden apples\n(B) The bubbling pool, in the depths of which something luminous is swirling\n(C) The fat red toadstools that appear to be talking to each other\n(D) The statue of an old wizard with a strangely twinkling eye";

        questionsList.add(question4);
        System.out.println(questionsList.get(3));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(ra);
        }

        String question5 = "Four boxes are placed before you. Which would you try and open?\n"
                + "(A) The gleaming jet black box with a silver lock and key, marked with a mysterious rune that you know to be the mark of Merlin.\n(B) The ornate golden casket, standing on clawed feet, whose inscription warns that both secret knowledge and unbearable temptation lie within.\n(C) The small tortoiseshell box, embellished with gold, inside which some small creature seems to be squeaking.\n(D) The small pewter box, unassuming and plain, with a scratched message upon it that reads \"I open only for the worthy.\"";

        questionsList.add(question5);
        System.out.println(questionsList.get(4));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(gr);
        }

        String question6 = "Four goblets are placed before you. Which would you choose to drink?\n"
                + "(A) The mysterious black liquid that gleams like ink, and gives off fumes that make you see strange visions.\n(B) The smooth, thick, richly purple drink that gives off a delicious smell of chocolate and plums.\n(C) The golden liquid so bright that it hurts the eye, and which makes sunspots dance all around the room.\n" +
                "(D) The foaming, frothing, silvery liquid that sparkles as though containing ground diamonds.";

        questionsList.add(question6);
        System.out.println(questionsList.get(5));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(sl);
        }

        String question7 = "Once every century, the Flutterby bush produces flowers that adapt their scent to attract the unwary. If it lured you, it would smell of:\n"
                + "(A) A crackling log fire\n(B) The sea\n(C) Fresh parchment\n(D) Home";

        questionsList.add(question7);
        System.out.println(questionsList.get(6));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(ra);
        }

        String question8 = "One of your house mates has cheated in a Hogwarts exam by using a Self-Spelling Quill.\nNow he has come top of the class in Charms, beating you into second place. Professor Flitwick is suspicious of what happened.\nHe draws you to one side after his lesson and asks you whether or not your classmate used a forbidden quill. What do you do?\n"
                + "(A) Tell Professor Flitwick the truth. If your classmate is prepared to win by cheating, he deserves to be found out.\nAlso, as you are both in the same house, any points he loses will be regained by you, for coming first in his place.\n(B) Tell Professor Flitwick that he ought to ask your classmate (and resolve to tell your classmate that if he doesn't tell the truth, you will).\n" +
                "(C) Lie and say you don't know (but hope that somebody else tells Professor Flitwick the truth).\n" +
                "(D) You would not wait to be asked to tell Professor Flitwick the truth.\n" +
                "If you knew that somebody was using a forbidden quill, you would tell the teacher before the exam started.";

        questionsList.add(question8);
        System.out.println(questionsList.get(7));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(gr);
        }

        String question9 = "You and two friends need to cross a bridge guarded by a river troll who insists on fighting one of you before he will let all of you pass. Do you:\n"
                + "(A) Volunteer to fight?\n(B) Attempt to confuse the troll into letting all three of you pass without fighting?\n(C) Suggest drawing lots to decide which of you will fight?\n" +
                "(D) Suggest that all three of you should fight (without telling the troll)?";

        questionsList.add(question9);
        System.out.println(questionsList.get(8));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(ra);
        }

        String question10 = "Which road tempts you most?\n"
                + "(A) The wide, sunny, grassy lane\n(B) The twisting, leaf-strewn path through woods\n(C) The cobbled street lined with ancient buildings\n(D) The narrow, dark, lantern-lit alley";

        questionsList.add(question10);
        System.out.println(questionsList.get(9));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(hu);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(sl);
        }

        String question11 = "Late at night, walking alone down the street, you hear a peculiar cry that you believe to have a magical source. Do you:\n"
                + "(A) Draw your wand and stand your ground?\n(B) Draw your wand and try to discover the source of the noise?\n(C) Proceed with caution, keeping one hand on your concealed wand and an eye out for any disturbance?\n(D) Withdraw into the shadows to await developments, while mentally reviewing the\nmost appropriate defensive and offensive spells, should trouble occur?";

        questionsList.add(question11);
        System.out.println(questionsList.get(10));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(hu);
        }

        String question12 = "A Muggle confronts you and says that they are sure you are a witch or wizard. Do you:\n"
                + "(A) Agree, and ask whether they'd like a free sample of a jinx\n(B) Agree, and walk away, leaving them to wonder whether you are bluffing\n(C) Ask what makes them think so\n(D) Tell them that you are worried about their mental health, and offer to call a doctor";

        questionsList.add(question12);
        System.out.println(questionsList.get(11));
        userAnswer = userInput.nextLine();

        if (userAnswer.equalsIgnoreCase("A")) {
            answerList.add(sl);
        } else if (userAnswer.equalsIgnoreCase("B")) {
            answerList.add(ra);
        } else if (userAnswer.equalsIgnoreCase("C")) {
            answerList.add(gr);
        } else if (userAnswer.equalsIgnoreCase("D")) {
            answerList.add(hu);
        }

        return "";

    } public String placement() {
        // placement method used to calculate which house person will be sorted into

        Integer grCount = 0;
        Integer raCount = 0;
        Integer slCount = 0;
        Integer huCount = 0;

        // a for loop to count how many times gr/ra/sl/hu is in the answerList
        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.get(i).equals(gr)) {
                grCount++;
            } else if (answerList.get(i).equals(hu)) {
                huCount++;
            } else if (answerList.get(i).equals(sl)) {
                slCount++;
            } else if (answerList.get(i).equals(ra)) {
                raCount++;
            }

        }
        // if/else statement to find out which count is the highest, which then prints what house person is sorted into
        if (grCount > raCount && grCount > slCount && grCount > huCount) {
            System.out.println("Better be.... GRYFFINDOR!!!!!");
        } else if (raCount > grCount && raCount > slCount && raCount > huCount) {
            System.out.println("RAVENCLAWWWWW!!!!!");
        } else if (slCount > grCount && slCount > raCount && slCount > huCount) {
            System.out.println("SLYTHERINNN!!!!!");
        } else if (huCount > grCount && huCount > slCount && huCount > raCount) {
            System.out.println("HUFFLEPUFF!!!!!");
        } return "";
    }

}
