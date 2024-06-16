package Emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Emailapp {
    private String firtName;
    private String secondName;
    private String password;
    private int defPassLenght = 10;
    private String department = "nothing";
    private String email;
    private String companySufix = "tenzor.com";

    public Emailapp(String firtName, String secondName){
        this.firtName = firtName;
        this.secondName = secondName;
        System.out.println("Почта создана: " + firtName + " " + secondName);
        setDepartment();
        email = firtName.toLowerCase() + "." + secondName.toLowerCase() + "@" + department + companySufix;



        this.password = generatePass(defPassLenght);
        System.out.println("Ваша почта: " + email);
        System.out.println("Ваш пароль: " + password);
    }
    private String generatePass(int lenght){
        String alphabet = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!№%?!№%?";
        char[] password = new char[lenght];
        for(int i =0;i<lenght;i++){
            int rand = (int)(Math.random() * alphabet.length());
            password[i] = alphabet.charAt(rand);
        }
        return new String(password);

    }
    private void setDepartment(){
        System.out.println("Коды отдела\n1 Отдел продаж\n2 отдел кредитования\n3 отдел разработки\n4 Без отдела\nВведите код отдела: ");


        while (department == "nothing"){
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if(choice == 1){
                department = "sells.";
                System.out.println("Отдел продаж");
            } else if (choice == 2) {
                department = "credits.";
                System.out.println("Отдел Кредитования");
            } else if (choice == 3) {
                department = "programming.";
                System.out.println("Отдел разработки");
            } else if (choice == 4){
                department = "";

            }
            else {
                System.out.println("Введен некоректный код");
            }
        }

    }
}
