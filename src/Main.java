public class Main {
    public static void main(String[] args) {
        //Task 1
        int age = 16;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        int temp = 8;
        if (temp <= 5)
        {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        //Task 3
        int speed = 70;
        if (speed >= 60)
        {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Task 4
        int age2 = 8;
        if (age2 >= 2 && age2 <= 6)
        {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17)
        {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24)
        {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 > 24)
        {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        if (age2 < 2)
        {
            System.out.println("Если возраст человека равен " + age2 + ", то он слишком мал");
        }

        //Task 5
        int age3 = 4;
        if (age3 < 5)
        {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 >= 5 && age3 < 14)
        {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age3 >= 14)
        {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Task 6
        int wagonCapacity = 102;
        int sitCapacity = 60;
        int takenSeats = 50;
        boolean isPlace = wagonCapacity > takenSeats;
        if (isPlace)
        {
            boolean isSeat = sitCapacity > takenSeats;
            if (isSeat)
            {
                System.out.println("В вагоне есть сидячие места");
            }
            else {
                System.out.println("В вагоне остались стоячие места");
            }
        }
        else {
            System.out.println("В вагоне нет мест");
        }

        //Task 7
        int one = 100;
        int two = 20;
        int three = 3;
        if (one > two)
        {
            if (one > three)
            {
                System.out.println("Первое число большее");
            } else {
                System.out.println("Третье число большее");
            }
        } else {
            if (two > three)
            {
                System.out.println("Второе число большее");
            } else {
                System.out.println("Третье число большее");
            }
        }
    }
}