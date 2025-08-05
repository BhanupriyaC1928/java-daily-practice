package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Phone phone = new Phone();
//      phone.feature();
//      Nokia3310 nokia = new Nokia3310();
//      nokia.feature();
//      Iphone iphone = new Iphone();
//      iphone.feature();

       //POLYMORPHISM

        Phone phone;
        phone = new Iphone();
        phone.feature();
        phone = new Nokia3310();
        phone.feature();

        // here we can observe phone can take more than one form.
    }
}