// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    Smartphone (String number){
        super (number);

    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}