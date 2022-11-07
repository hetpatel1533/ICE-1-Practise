import java.util.Scanner;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        Vector<person> people = new Vector<person>();
        Scanner Scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            var person = new person();
            try
            {
                System.out.println("Enter name: ");
                person.setName(Scan.next());
                System.out.println("Enter Age: ");
                person.setAge(Scan.nextInt());
                System.out.println();
                people.add(person);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

        for(var per: people)
        {
            System.out.println(per);
        }

        }
    }

}