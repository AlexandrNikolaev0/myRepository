abstract class Human {

    int age;
    String name;
    Mood mood;
    Human(String name, int age, Mood mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }

//    public Human(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public Human(String name, Mood mood){
        this.name = name;
        this.mood = mood;
    }

    abstract void sayHello();

}
