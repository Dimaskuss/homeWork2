public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        System.out.println();
     var dog = 8;
     System.out.println("Собака = " + dog);
        var cat = 3.6;
        System.out.println("Кошка = " + cat);
        var paper = 763789;
        System.out.println("Бумага = " + paper);
        System.out.println();

    }

    public static void task2 () {
        System.out.println("Задача 2");
        System.out.println();
        var dog = 8;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println("Собака = " + dog);
        System.out.println("Кошка = " + cat);
        System.out.println("Бумага = " + paper);
        System.out.println();
    }
        public static void task3 () {
            System.out.println("Задача 3");
            System.out.println();
            var dog = 8;
            var cat = 3.6;
            cat = cat - 1.6;
            var paper = 763789;
            paper = paper - 7639;
            System.out.print("Собака = ");
            System.out.println(dog - 3.5);
            System.out.println("Кошка = " + cat);
            System.out.println("Бумага = " + paper);
            System.out.println();

    }
    public static void task4 () {
        System.out.println("Задача 4");
        System.out.println();
        var friend = 19;
        System.out.println("Дружок = " + friend);
        friend = friend + 2;
        System.out.println("Дружок = " + friend);
        friend = friend / 7;
        System.out.println("Дружок = " + friend);

        System.out.println();

    }
    public static void task5 () {
        System.out.println("Задача 5");
        System.out.println();
        var frog = 3.5;
        System.out.println("Лягуха = " + frog);
        frog = frog * 10;
        System.out.println("Лягуха = " + frog);
        frog = frog / 3.5;
        System.out.println("Лягуха = " + frog);

        System.out.println();

    }
    public static void task6 () {
        System.out.println("Задача 6");
        System.out.println();
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров = " + boxersWeight + "кг!");
        var boxersWeightDifference = boxer2 - boxer1;
        System.out.println("Разница веса  = " + boxersWeightDifference + "кг!");

        System.out.println();

    }
    public static void task7 () {
        System.out.println("Задача 7");
        System.out.println();
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer2 % boxer1;
        System.out.println("Разница веса = " + boxersWeight + "кг!");
        var boxersWeightDifference = boxer2 - boxer1;
        System.out.println("Разница веса  = " + boxersWeightDifference + "кг!");

        System.out.println();

    }
    public static void task8 () {
        System.out.println("Задача 8");
        System.out.println();
        var hours = 640;
        var workerHours = 8;
        var workers = hours / workerHours;
        System.out.println("Всего работников в компании — " + workers + " человек.");
        workers = workers + 94;
        var newHours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего по " + newHours + " часа работы может быть поделено между сотрудниками.");


        System.out.println();

    }
}