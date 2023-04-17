import java.util.Scanner;

public class MobilePhone implements Telephone{

String myNumber;
boolean isPowerOn = false;
boolean numberPresent;

public MobilePhone(){

}
    @Override
    public boolean dialing() {
    numberPresent=false;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number to call: ");
        myNumber= sc.nextLine();
        if(myNumber.isEmpty()){
            return numberPresent;
        }else{
            return numberPresent=true;
        }

    }

    @Override
    public void calling() {
    dialing();

        System.out.println("now call the number");
        System.out.println("calling the number "+ myNumber);

      //  Scanner text=new Scanner(System.in);
       // System.out.println("What do you wish to do with the phone");
       // text.nextLine();


    }



    @Override
    public boolean answering() {
        return false;
    }

    @Override
    public boolean declining() {
        return false;
    }

    @Override
    public boolean power() {
        Scanner button = new Scanner(System.in);
        System.out.println("welcome to samsung.." + "" +
                "\n press 1 to turn on phone: " +
                "\n press 2 to turn off phone: ");



        int selection = button.nextInt();
        switch (selection) {
            case 1:
                isPowerOn = true;
                System.out.println("Turning on");
                break;
            case 2:

                if (!isPowerOn) {
                    System.out.println("it is already off");

                }else{
                    System.out.println("Turning off");
                }



                break;
            default:
                System.out.println("not applicable");
        }
    return isPowerOn;
    }
    void inbox(){
        System.out.println(" Hi there " +
                " how are you " +
                " where are you from " +
                " What is your name ");

    }
    void outbox(){
        System.out.println("Hi " +
                " Am fine thank you " +
                " Am from kenya " +
                " My name is Fardowsa ");

    }
    void massage() {
        MobilePhone mp = new MobilePhone();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n 1. Create Massage" +
                        "\n 2. Inbox" +
                        "\n 3. Outbox");
        int txt = sc.nextInt();
        switch (txt) {
            case 1:
                System.out.println("Type your massage here: ");
                String Message = sc.next();

                System.out.println(" Enter the recipient: ");
                String Recipient = sc.next();
                sc.close();
                System.out.println("Do you wish to send this Message" +
                        " \n" + Message +
                        "\n to: " + Recipient);
                System.out.println(
                        "1. yes" +
                                "\n 2. No");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.println("sending");
                } else if (option == 2) {
                    System.out.println("not sent");
                } else {
                    System.out.println("");
                }
                break;
            case 2:
                mp.inbox();
                break;
            case 3:
                mp.outbox();


        }
    }
}
