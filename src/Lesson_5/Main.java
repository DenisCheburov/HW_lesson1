package Lesson_5;

public class Main {
    public static void main(String[] args) {

        employees[] employees = new employees[5];
        employees[0] = new employees("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 80000, 42);
        employees[1] = new employees("Ivanov Denis", "Courier", "denis@mailbox.com", "892397862", 10000, 45);
        employees[2] = new employees("Tarasova Olga", "Secretary", "olga92@mailbox.com", "892377772", 20000, 23);
        employees[3] = new employees("Potapov Nikolay", "Builder", "potap@mailbox.com", "892355552", 60000, 25);
        employees[4] = new employees("Morozov Andrew", "Programmer", "moroz@mailbox.com", "892366662", 40000, 22);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].print();
            }
        }
    }


}


