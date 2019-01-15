public class Main {
    public static void main(String[] args) {

        class LocaleComments{
            String words[] = {"\nМаргарита и Мастер идут гулять", "\nВдруг на встречу им идет подозрительный тип", "\nОни начинают драться", "\nКонец"};
        }

        Man man = new Man("Мастер", 38, Mood.SAD);
        Woman woman = new Woman("Маргарита", 27, Mood.HAPPY);
        BadBoy badboy = new BadBoy("Воланд", Mood.SAD);
        LocaleComments l = new LocaleComments();
        BadBoy.Phone ph = new BadBoy.Phone();
        Trost tr1 = new Trost("Железная");
        Trost tr2 = new Trost("Костная");
        try{
            throw new MyExc2(man.age);
        }catch(MyExc2 exc){}
        try{
            throw new MyExc2(woman.age);
        }catch(MyExc2 exc){}
        man.haveTrost(tr2);
        woman.haveTrost(tr2);
        badboy.haveTrost(tr1);
        tr1.trostPrice();
        tr2.trostPrice();

        try{
            if(badboy.mood == Mood.HAPPY){
                throw new MyExc(badboy);
            }
        }catch (MyExc exc){
            System.exit(0);
        }

        man.sayHello();
        woman.sayHello();
        System.out.println(l.words[0]);
        System.out.println(l.words[1]);
        badboy.sayHello();
        ph.giveMeYourPhone();
        badboy.giveTrost();
        badboy.sayMyMood(badboy.mood);
        woman.st.takeMyMoney();
        man.giveTrost();
        man.hit();
        woman.giveTrost();
        woman.hit();
        System.out.println(l.words[2]);
        System.out.println(man.toString());
        man.regret(tr2);
        woman.regret();
        System.out.println(l.words[3]);
    }
}
