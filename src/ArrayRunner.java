public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);

        Student[] myClass = new Student[12];
        Student studentA = new Student("Isabelle", "April", "pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia", "October", "purple");
        myClass[0] = studentB;

        //System.out.println(myClass[2]);
        //System.out.println(myClass[0]);

        for (int i =0; i<4; i++){
            System.out.println(myClass[i]);
        }

        String[] names = {"Michael", "Brian", "Duncan", "Bennett", "Martin"
        , "Jessica", "Lexy", "Zoe", "Jimmy", "Sanjit", "Andrew", "Will"};

        String[] months = {"February", "October", "March", "September", "July",
        "February", "November", "December", "August", "May", "September", "December"};

        String[] colors = {"Green", "Fuchsia", "Purple", "Turquoise", "Cyan",
        "Purple", "Pink", "Indigo", "Green", "Blue", "Green", "Space Black"};

        System.out.println("There are " + names.length + " names on the list.");

        names[11] = "Mr.Howe";

        for (int i = 0; i<12; i++){
            myClass[i] = new Student(names[i], months[i], colors[i]);
        }
        System.out.println(myClass[7]);
        //System.out.println(myClass); incorrect

        System.out.println("Print out the students!");

        for (Student s: myClass){
            System.out.println(s);
        }

    }
}
