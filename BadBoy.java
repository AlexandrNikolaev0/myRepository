public class BadBoy extends Human implements Actions {

    String name;
    Mood mood;
    String haveTrost;
    public BadBoy(String name, Mood mood){
        super(name, mood);
        this.name = name;
        this.mood = mood;
    }

    @Override
    public void sayHello(){
        System.out.println(name+":  Здарова, епта");
    }

    @Override
    public void sayMyMood(Mood m){
        System.out.println(name+": А так как у меня плохое настроение,  я тебя ударю");
    }

    void haveTrost(Trost tr){
        if(tr.material.equals("Железная"))
            haveTrost = "Железная";
        else
            haveTrost = "Костная";
    }

    @Override
    public void giveTrost(){
        System.out.println(name+": У меня есть "+ haveTrost +" трость");
    }

    public static class Phone{
        public void giveMeYourPhone(){
            System.out.println("Телефон есть? А если найду?");
        }
    }
}
