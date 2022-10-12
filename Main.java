import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Movie> listOfMovie = new ArrayList<Movie>();

        System.out.println("|| E N J O Y    W A T C H I N G! ||");
        System.out.println(" Choose what to watch! ");
        System.out.println("Reminder: You can only input an integer ");

        try{
            System.out.print("Number of movie you want to watch : ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new MovieException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Movie Title: ");
                String movie_title = sc.nextLine();

                System.out.print("Genre: ");
                String movie_genre = sc.nextLine();
    

                listOfMovie.add(new Movie(movie_genre, movie_title));
            }

            System.out.println("");
            System.out.println("Here's Your Movielist!");
            System.out.println("=====================================");
            for(Movie list : listOfMovie){
                System.out.println("Title: " + list.getTitle() + " (" + "Genre: " + list.getGenre() + ")");    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(MovieException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}