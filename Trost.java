public class Trost implements TrostPrice{

    String material;
    int price;

    Trost(String material){
        this.material = material;
    }

    @Override
    public void trostPrice(){
        if(material.equals("Железная"))
            price = 80;
        else if(material.equals("Костная"))
            price = 120;
        else
            price = 100;
    }


    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Trost w = (Trost) o;
        return (this.material == w.material);
    }
}