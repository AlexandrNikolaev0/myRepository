public class Man extends Human implements Actions{

    int age;
    String name;
    Mood mood;
    String  haveTrost;
    public Man(String name, int age, Mood mood) {
        super(name, age, mood);
        this.age = super.age;
        this.name = super.name;
        this.mood = super.mood;
    }
//    public Man(String name, int age){
//        super(name, age);
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public void sayHello(){
        System.out.println("Привет, меня зовут "+ name + ", мне " + age + " лет.");
    }

    @Override
    public void sayMyMood(Mood m) {
        if(m == Mood.HAPPY)
            System.out.println("\n"+name+"У меня хорошее настроение");
        else if (m == Mood.SAD)
            System.out.println("\n"+name+"У меня плохое настроение");
        else
            System.out.println("\n"+name+"У меня нейтральное настроение");
    }

    void haveTrost(Trost tr){
        if(tr.material.equals("Железная"))
            haveTrost = "Железная";
        else
            haveTrost = "Костная";
    }

    @Override
    public void giveTrost() {
        switch (haveTrost) {
            case ("Железная"):
                System.out.println(name+": У меня есть " + haveTrost + " трость");
                break;
            case ("Костная"):
                System.out.println(name+": У меня есть " + haveTrost + " трость");
                break;
            default:
                System.out.println(name+": У меня есть обычная трость");
        }
    }

    public void hit(){
        if(mood == Mood.HAPPY)
            System.out.println(name+": Я тебя бить не буду, у меня сегодня хорошее настроение");
        else if (mood == Mood.SAD)
            System.out.println(name+": Я тебя тоже ударю, ибо у меня плохое настроение");
        else
            System.out.println(name+": За словами следи, я за себя не отвечаю");
    }

    public void regret(Trost tr){
        if(haveTrost.equals("Железная"))
            System.out.println(name+": Я не сожалею, что купил дешевую кость, она стоила всего "+ tr.price);
        else if(haveTrost.equals("Костная"))
            System.out.println(name+": Я сожалею, что купил дорогую кость за "+tr.price+" рублей");
        else
            System.out.println(name+": Мне пофиг, моя трость не такая дорогая, всего-ничего "+ tr.price);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;
        return haveTrost != null ? haveTrost.equals(man.haveTrost) : man.haveTrost == null;
    }

    @Override
    public String toString(){
        return name+": Все, хорош!";
    }
}

