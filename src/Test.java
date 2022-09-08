public class Test {
    public static void main(String[] args) {

        //Задача 1
        int age=20;
        if (age>=18){
            System.out.println("Примите наше поздравление с совершеннолетием");
        }
        if (age<18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задача 2
        int age2=20;
        if (age2>=7 && age2<18){
            System.out.println("ребенок ходит в школу, если его возраст равен или больше 7 годам");
        } if (age2>=18 && age2<24) {
            System.out.println("человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
        } if (age2>=24){
            System.out.println("человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");
        }


        //Задача 3
        int ollPlace = 102;
        int seatPlace=60;
        int standPlace = ollPlace-seatPlace;
        int seatUsed = 60;
        int standUsed=43;
        if (seatUsed<seatPlace) {
            System.out.println("Осталось " + (seatPlace - seatUsed) + " сидящих мест");
        }
        if (standUsed<standPlace){
            System.out.println("Осталось "+ (standPlace-standUsed)+ " стоячих мест");
        }
        if (seatUsed>=seatPlace) {
            System.out.println("сидящих мест нет");
        }
        if (standUsed>=standPlace){
            System.out.println("стоячих мест нет");
        }
        if (ollPlace<(seatUsed+standUsed)){
            System.out.println("Вагон полностью заполнен");
        }

        // Задача 4
        age =20;
        if (age>=18){
            System.out.println("Примите наше поздравление с совершеннолетием");
        }
        else
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");

        //Задача 5
        age2=20;
        if (age2>=7 && age2<18){
            System.out.println("ребенок ходит в школу, если его возраст равен или больше 7 годам");
        } else if (age2>=18 && age2<24) {
            System.out.println("человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
        } else{
            System.out.println("человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");
        }

        //Задача 6
        if (seatUsed<seatPlace) {
            System.out.println("Осталось " + (seatPlace - seatUsed) + " сидящих мест");
        }
        else {
            System.out.println("сидящих мест нет");}

        if (standUsed<standPlace){
            System.out.println("Осталось "+ (standPlace-standUsed)+ " стоячих мест");
        }
        else {
            System.out.println("стоячих мест нет");
        }
        
        if (ollPlace<(seatUsed+standUsed)){
            System.out.println("Вагон полностью заполнен");
        }

        //Задача 7
        int age7=20;
        if (age7>=2 && age7<=6){
            System.out.println("Если возраст человека равен " +age7+ ", то ему нужно ходить в детский сад");
        } else if (age7>=7 && age7<=18) {
            System.out.println("Если возраст человека равен " +age7+ ", то ему нужно ходить в школу");
        }else if (age7>18 && age7<24){
            System.out.println("Если возраст человека равен " +age7+ ", то ему нужно ходить в университет");
        }else
            System.out.println("Если возраст человека равен " +age7+ ", то ему нужно ходить на работу");


        //Задача 8
        int age8 = 8;
        if (age8<5){
            System.out.println("Ребенок не может кататься на атракционе");
        } else if (age8>5 && age8<14){
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься запрещено!");
        }else
            System.out.println("Ребенок может кататься без сопровождения взрослого");


        //Задача 9
        int one= 105;
        int two=105;
        int free=105;
        if (one>two){
            if (one>free){
                System.out.println("Первое число самое большое и оно равно" +one);

            } else if (one==free) {
                System.out.println("Первое и третье числа равны"+ one);

            }
            else
                System.out.println("Третье число самое большое и оно равно" +free);

        }else if (one<two){
            if (two>free){
                System.out.println("Второе число самое большое и оно равно" +two);
            }else if (two==free) {
                System.out.println("второе и третье числа равны"+ two);
            }
            else
                System.out.println("Третье число самое большое и оно равно" +free);
        } else if (one==two) {
            if (one>free){
                System.out.println("Первое и второе число наибольшие и они равны " +one);}
            else if (one==free){
                System.out.println("все числа равны");
            }
            else
                System.out.println("третье число наибольшие и оно равно " +free);

        } else
            System.out.println("все числа равны");
    }
}
