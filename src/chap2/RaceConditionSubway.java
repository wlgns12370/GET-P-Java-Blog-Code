package chap2;

public class RaceConditionSubway extends Thread{
    private JavaBeansSubway subway;

    public RaceConditionSubway(JavaBeansSubway subway) {
        this.subway = subway;
    }

    @Override
    public void run() {
        subway.setMenuName("Italian B.M.T.");
        System.out.println(subway);
    }

    public static void main(String[] args) {
        JavaBeansSubway subway = new JavaBeansSubway();
        subway.setMenuName("B.L.T.");

        RaceConditionSubway thread1 = new RaceConditionSubway(subway);
        RaceConditionSubway thread2 = new RaceConditionSubway(subway);

        thread1.start();
        thread2.start();

        System.out.println(subway);
    }
}