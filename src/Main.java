import java.util.Scanner;

public class Main {
    void mainMenu(){
        MobilePhone mp = new MobilePhone();
        Scanner txt = new Scanner(System.in);
        System.out.println("What do you wish to do with the phone: " +
                "\n 1. Call" +
                "\n 2. Text" +
                "\n 3. Play games" +
                "\n Enter:");
        int enter= txt.nextInt();
        switch(enter){
            case 1:
                mp.calling();
                break;
            case 2:
                System.out.println("The Messaging App");
              mp.massage();
                break;
            case 3:
                System.out.println("Not yet  installed");
                break;
            default:
                System.out.println("Option not Applicable");



        }

    }




    public static void main(String[] args) {


        MobilePhone mp = new MobilePhone();
        if (mp.power()) {
            Main menu = new Main();
            menu.mainMenu();


    }else{


        System.out.println("Nambari uliopiga haipatikanai kwa sasa");
    }


}
   }





