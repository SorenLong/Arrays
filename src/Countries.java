import java.util.Scanner;

public class Countries {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] countries = new String[4];

        countries[0] = "India";
        countries[1] = "Nepal";
        countries[2] = "Bhutan";
        countries[3] = "Japan";

        int a = scanner.nextInt();

        String[]prov = {
                "British Columbia", "Alberta", "Saskatchewan", "Manitoba", "Ontario"
                , "Quebec", "Newfoundland and Labrador", "PEI", "Nova Scotia", "New Brunswick"
        };


        for(String str: countries){
            System.out.println(str);
        }
        System.out.println("____________________________");
        for(String str: prov){
            System.out.println(str);
        }

    }




}
