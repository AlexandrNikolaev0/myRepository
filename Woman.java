public class Woman extends Human implements Actions {

    int age;
    String name;
    Mood mood;
    String  haveTrost;
    int money = 3000;
    public Woman(String name, int age, Mood mood) {
        super(name, age, mood);
        this.age = super.age;
        this.name = super.name;
        this.mood = super.mood;
    }
//    public Woman(String name, int age){
//        super(name, age);
//        this.name = name;
//        this.age = age;
//    }
    StupidGirl st = new StupidGirl();

    @Override
    public void sayHello(){
        System.out.println("Приветики, меня зовут "+ name + ", мне " + age + " лет.");
    }

    @Override
    public void sayMyMood(Mood m){
        if(m == Mood.HAPPY)
            System.out.println("\n"+name+": У меня хорошее настроение");
        else if (m == Mood.SAD)
            System.out.println("\n"+name+": У меня плохое настроение");
        else
            System.out.println("\n"+name+": Я в порядке");
    }

    void haveTrost(Trost tr){
        if(tr.material.equals("Железная"))
            haveTrost = "Железная";
        else
            haveTrost = "Костная";
    }

    public void giveTrost() {
        switch (haveTrost) {
            case ("Железная"):
                System.out.println(name+": У меня есть " + haveTrost+ " трость");
                break;
            case ("Костная"):
                System.out.println(name+": У меня есть " + haveTrost+ " трость");
                break;
            default:
                System.out.println(name+": У меня есть простая трость");
        }
    }

    public void hit(){
        System.out.println(name+": Я не умею драться");
    }

    public void regret(){
        System.out.println(name+": Мне тоже жаль, зачем я купила эту трость, деньги на ветер");
    }
    @Override
    public int hashCode(){
        int hash = 70;
        hash = hash*this.money;
        return hash;
    }

    class StupidGirl{
        void takeMyMoney(){
            System.out.println("Держи мои деньги, только не бей, вот "+money+" рублей");
        }
    }
}
