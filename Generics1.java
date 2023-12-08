
class Car<T,U>
{
     T CarName;
     U CarPrice;

     public Car(T CarName,U CarPrice)
     {
        this.CarName = CarName;
        this.CarPrice = CarPrice;
     }

     public void Display()
     {
        System.out.print("\n");
        System.out.print("\nThe Object Type Is : "+getClass());
        System.out.print("\nCar Name : "+getCarName());
        System.out.print("\nCar Price : "+getCarPrice());
        System.out.print("\n\n");
     }

    public T getCarName() {
        return CarName;
    }

    public void setCarName(T carName) {
        CarName = carName;
    }

    public U getCarPrice() {
        return CarPrice;
    }

    public void setCarPrice(U carPrice) {
        CarPrice = carPrice;
    }

}


class Student<T>
{
    T id;

    public Student(T id)
    {
       this.id=id;
    }

    public void Display()
     {
        System.out.print("\n");
        System.out.print("\nThe Object Type Is : "+getClass());
        System.out.print("\nStudent Id : "+getId());
        System.out.print("\n\n");
     }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

}

public class Generics1
{
    public static void main(String[] args)
    {
        Car<String,Integer> c1 = new Car<>("Nexa",8899999);
        c1.Display();

        Student<Integer> s1 = new Student<>(3);
        s1.Display();

        Student<String> s2 = new Student<>("Kumar3");
        s2.Display();

         System.out.print("\n\n");
    }
}