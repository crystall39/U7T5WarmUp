public class Emoji // Classroom
{
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    private final String teacher = "\uD83D\uDC81";
    private final String raisingHand = "\uD83D\uDE4B";
    private final String headDown = "\uD83D\uDE47";
    private final String sadStudent = "\uD83D\uDE4D";
    private final String upsetStudent = "\uD83D\uDE4E";

    private String teacherName;

    public Emoji(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public void scene() throws InterruptedException
    {
        System.out.println(BLUE + teacher + " < Hello, Class! My name is " + teacherName + "! )");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher + " < Does anyone know the answer to 2 + 2? )");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher + " < . . . )");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher + " < If no one raises their hand, I'll have to call someone... )");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + raisingHand + " < It's 6! ) " + RED + sadStudent + " " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + headDown + " " + RED + raisingHand + " < No! It's clearly 3! ) " + BROWN + upsetStudent + " " + CYAN + headDown);
        Thread.sleep(1000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + raisingHand + " < I think it's 5. ) " + CYAN + headDown);
        Thread.sleep(2000);
        System.out.println();

        System.out.println(BLUE + teacher + " < Cyan, what do you think it is? ");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + raisingHand + " " + CYAN + headDown);
        Thread.sleep(2000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + raisingHand + " " + CYAN + headDown + " < Um... )");
        Thread.sleep(2000);
        System.out.println();

        System.out.println(BLUE + teacher);
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + raisingHand + " " + CYAN + headDown + " < Is it 4...? )");
        Thread.sleep(2000);
        System.out.println();

        System.out.println(BLUE + teacher + " < Yes! 2 + 2 = 4! )");
        System.out.println(PURPLE + headDown + " " + RED + sadStudent + " " + BROWN + raisingHand + " " + CYAN + headDown);
        Thread.sleep(2000);

    }


}
