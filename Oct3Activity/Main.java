import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<String> Info = new ArrayList<String>();
        
        Information<String> info1 = new Information<String>();
        info1.setName("Richel Jane Bacayan");
        info1.setAge("21 years old");
        info1.setBirthdate("February 06,2001");
        info1.setQuote("There's someone who is better than you and that's okay!");
        Info.add(info1.getName()  + " \n "+ info1.getAge() + " \n " + info1.getBirthdate() + " \n " + info1.getQuote());

        Information<String> info2 = new Information<String>();
        info2.setName("Shakera Joy Tinapay");
        info2.setAge("21 years old");
        info2.setBirthdate("November 16, 2001");
        info2.setQuote("With God nothing is Impossible");
        Info.add(info2.getName()  + " \n "+ info2.getAge() + " \n " + info2.getBirthdate() + " \n "+ info2.getQuote());

        Information<String> info3 = new Information<String>();
        info3.setName("Jo-ann Bernadez");
        info3.setAge("21 years old");
        info3.setBirthdate("January 12, 2001");
        info3.setQuote("Never Give Up");
        Info.add(info3.getName()  + " \n "+ info3.getAge() + " \n " + info3.getBirthdate() + " \n "+ info3.getQuote());

        Information<String> info4 = new Information<String>();
        info4.setName("Jovanie Dasian");
        info4.setAge("22 years old");
        info4.setBirthdate("June 22, 2000");
        info4.setQuote("Don't quit, Do it.");
        Info.add(info4.getName()  + " \n "+ info4.getAge() + " \n " + info4.getBirthdate() + " \n "+ info4.getQuote());
        
        Information<String> info5 = new Information<String>();
        info5.setName("Christian Misa");
        info5.setAge("21");
        info5.setBirthdate("January 11, 2001");
        info5.setQuote("Everything is worth the wait");
        Info.add(info5.getName()  + " \n "+ info5.getAge() + " \n " + info5.getBirthdate() + " \n " + info5.getQuote());




        System.out.print("Enter Information index: ");
        Integer user = input.nextInt();

        try{
            if(user < 0){
                input.close();
                throw new InfoException("Your input is negative. Please input positive index.");
            }
            if(user > 5){
                input.close();
                throw new InfoException("Your input exceeds the size of array.");
            }

            System.out.println("Information Index: " + user);
            System.out.println(Info.get(user));

        }
        catch(InfoException e){
            System.out.println(e.getMessage());
        }

        input.close();

    }
}