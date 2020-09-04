import java.util.Objects;
/* lisa disalvo
2020-13-07
 */
//driver code
public class Main
{
    public static void main(String[] args)
    {
        Cellphone iPhone;
        iPhone = new Cellphone(1827276, "IPhone", 700.00, 11122, 4.7, "IPhone Seven.");
        Cellphone Android;
        Android = new Cellphone(82621, "Google Pixel", 900.00, 22233, 5.3,"Google Pixel 4." );
        Cellphone Samsung;
        Samsung = new Cellphone(39821, "Samsung Galaxy S20", 950.00, 22738, 6.3,"Samsung Galaxy S20" );

        System.out.println(iPhone);
        System.out.println("\n");
        System.out.println(Samsung);
        System.out.println("\n");
        System.out.println(Android);

        System.out.println("\n Lets see if any of these phones are equal.");

        if (Objects.equals(iPhone, Samsung))
        {
            System.out.println("These two phones are the same!");
        }
        else
        {
            System.out.println("These phones are vastly different!");
        }

        System.out.println("\n Now, Lets compare these phones..! (Samsung and Android)");

        if(Samsung.compareTo(Android) >= 0)
        {
            System.out.println("\n The Samsung Galaxy S20's screen is bigger than the Google Pixel 4's screen.");

        } else if (Android.compareTo(Samsung) <= 0)
        {
            System.out.println("\n The Google Pixel 4's screen is bigger than the Samsung Galaxy S20's screen");
        }
        else
        {
            System.out.println("These phones have the same size screen!");
        }

        System.out.println("\nLooks like The IPhone is getting more expensive.. Uh Oh!");

        iPhone.setPrice(1500.00);
        System.out.println(iPhone);
    }
}
