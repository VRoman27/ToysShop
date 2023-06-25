
public class Program {

    public static void main(String[] args) {
        Store s = new Store();
        s.AddToy(new Toy("t1", 0.2f));
        s.AddToy(new Toy("t2", 0.2f));
        s.AddToy(new Toy("t3", 0.6f));

        for (int i = 0; i < 10; i++) {
            System.out.println(s.GetToy());
        }     

    }
}