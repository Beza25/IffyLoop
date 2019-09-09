import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args){
        boolean redEyes = false;
        String response, secondResponse;

        Scanner input = new Scanner (System.in);


        do{
            System.out.println("Respond with ('Y'/'N'). Are your eyes red? ");
            response = input.nextLine();

            if(response.equalsIgnoreCase("y")){
            redEyes = true;
            }else {
                redEyes = false; }

            if (redEyes == true){
                System.out.println("Get some sleep!");
            }else{ System.out.println("You look Great!"); }

            System.out.println("Respond with ('Y' or 'N'). Do you want to try again ");
            secondResponse = input.nextLine();

        }while (!secondResponse.equalsIgnoreCase("n"));
        System.out.println("Bye!");
    }

}
