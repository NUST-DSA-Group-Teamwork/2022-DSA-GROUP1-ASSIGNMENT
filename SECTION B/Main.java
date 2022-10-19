import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        doublyLinkedList playlistDLL = new doublyLinkedList();

        /******************Add 100 songs into doubly linked list****************************/
        playlistDLL.createDoublyLL("Carly Rae Jepsen - Call Me Maybe");
        String songArray[] = {"Drake featuring Rihanna - Take Care", "Fun featuring Janelle Monáe - We Are Young", "Ellie Goulding - Lights", "Flo Rida featuring Sia - Wild Ones", "Flo Rida - Whistle",
                "David Guetta featuring Sia - Titanium", "Kanye West, Big Sean, Pusha T and 2 Chainz - Mercy", "Calvin Harris - Feel So Close", "Adele - Someone like You", "Usher - Scream",
                "Psy - Gangnam Style", "Pitbull featuring Chris Brown - International Love", "Phillip Phillips - Home", "David Guetta featuring Usher - Without You", "Luke Bryan - Drunk on You",
                "Cher Lloyd - Want U Back", "J. Cole - Work Out", "Calvin Harris featuring Ne-Yo - Let's Go", "Carrie Underwood - Good Girl", "Little Big Town - Pontoon",
                "The Lumineers - Ho Hey", "Coldplay - Paradise", "Carrie Underwood - Blown Away", "Adele - Rolling in the Deep", "Ne-Yo - Let Me Love You",
                "B.o.B - So Good", "Train - 50 Ways to Say Goodbye", "Rihanna featuring Chris Brown - Birthday Cake", "Kirko Bangz - Drank in My Cup", "Kenny Chesney - Come Over",
                "Jason Aldean - Take a Little Ride", "Christina Perri - A Thousand Years", "Kesha - Die Young", "Chris Brown - Turn Up the Music", "Toby Keith - Red Solo Cup",
                "Lee Brice - Hard to Love", "Rihanna - Diamonds", "Luke Bryan - I Don't Want This Night to End", "Cash Out - Cashin' Out", "Rihanna - You da One",
                "Linkin Park - Burn It Down", "Eli Young Band - Even If It Breaks Your Heart", "Jason Aldean - Fly Over States", "Miguel - Adorn", "Kip Moore - Somethin' 'Bout a Truck",
                "Hunter Hayes - Wanted", "Thomas Rhett - It Goes Like This", "Miranda Lambert - Mama's Broken Heart", "The Script - Hall of Fame", "Lorde - Royals",
                "Mumford & Sonse - I Will Wait", "Paramore - Still Into You", "Randy Houser - Runnin' Outta Moonlight", "Passenger - Let Her Go", "Sara Bareilles - Brave",
                "Fun - Some Nights", "Kesha - Die Young", "Calvin Harris - I Need Your Love", "Darius Rucker - Wagon Wheel", "Pink - Try",
                "Demi Lovato - Heart Attack", "Avicii - Wake Me Up", "Zedd - Clarity", "Awolnation - Sail", "Capital Cities - Safe and Sound",
                "Pitbull - Feel This Moment", "Lana Del Rey and Cédric Gervais - Summertime Sadness", "Phillip Phillips - Home", "J. Cole - Power Trip", "Mumford & Sons - I Will Wait",
                "Randy Housere - Runnin' Outta Moonlight", "Sara Bareilles - Brave", "Lady Antebellum - Downtown", "Rocko - U.O.E.N.O.", "Ariana Grande - The Way",
                "Tim McGraw - Highway Don't Care", "Kelly Clarkson - Catch My Breath", "Luke Brya - That's My Kind of Night", "Thomas Rhett - It Goes Like This", "Emeli Sandé - Next to Me",
                "Carly Rae Jepsen - Call Me Maybe", "Rihanna - Pour It Up", "Taylor Swift - 22", "Hunter Hayes - I Want Crazy", "Ylvis - The Fox",
                "Wale - Bad", "Jason Derul - The Other Side", "Flo Rida - I Cry", "Blake Shelton - Boys 'Round Here", "OneRepublic - Counting Stars",
                "Florida - Cruise", "Katy Perry - Roar", "Ed Sheeran - The A Team", "Darius Rucker - Wagon Wheel", "Calvin Harris - I Need Your Love",
                "Miley Cyrus - Wrecking Ball", "Macklemore - Thrift Shop", "Pink - Just Give Me a Reason", "Macklemore - Can't Hold Us"};
        for (int i = 0; i < songArray.length; i++) {
            playlistDLL.insertSong(songArray[i],i);
        }
        /***********_______________________________________________________________________________________________________________________________________*********/

        /*calls upon playSong method*/
        playlistDLL.playSong();
        /****____________________****/

        /*Search for a song*/
        playlistDLL.searchSong("Macklemore - Thrift Shop");
        /****____________________****/

        /*Remove a song*/
        playlistDLL.removeSong(98);
        /****____________________****/

        /*calls upon playSong method*/
        playlistDLL.playSong();
        /****____________________****/
    }
}