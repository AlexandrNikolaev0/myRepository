public class MyExc extends Exception {
    MyExc(BadBoy b){
        if(b.mood == Mood.HAPPY){
            System.out.println("Драки не будет, так как у Воланда хорошее настроение!");
        }
    }
}
