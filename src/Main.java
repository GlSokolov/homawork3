public class Main {
    public static void main(String[] args) {
        // Задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalBoxerWeight = boxer1 + boxer2;
        System.out.println("Общая масса бойцов " + totalBoxerWeight + "кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница между бойцами " + weightDifference + "кг");

        // Задание 7 (багованное задание говорят)
        System.out.println(boxer2 % boxer1);

        // Задание 8
        var totalHours = 640;
        var workingDay = 8;
        var totalEmployees = totalHours / workingDay;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        var totalEmployees2 = totalEmployees + 94;
        var totalHours2 = totalEmployees2 * workingDay;
        System.out.println("Если в компании работает " + totalEmployees2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");
    }
}