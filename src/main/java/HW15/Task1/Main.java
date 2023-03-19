package HW15.Task1;

class Main {
    public static void main(String[] args) {
        RandomGenerator Random = new RandomGenerator();// Создал объект для доступа к return методу;
        System.out.println(Random.integerList);        // Консоль элементов;
        System.out.println(Random.integerList.size()); // Тест на размер массива;
    }
}