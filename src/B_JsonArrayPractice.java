import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class B_JsonArrayPractice {

    public static void main(String[] args) throws ParseException {
        B_JsonArrayPractice practice = new B_JsonArrayPractice();
    }

    public B_JsonArrayPractice() throws ParseException {
        String s = "{\"name\":\"Darth Vader\",\"height\":\"202\",\"mass\":\"136\",\"hair_color\":\"none\",\"skin_color\":\"white\",\"eye_color\":\"yellow\",\"birth_year\":\"41.9BBY\",\"gender\":\"male\",\"homeworld\":\"https://swapi.dev/api/planets/1/\",\"films\":[\"https://swapi.dev/api/films/1/\",\"https://swapi.dev/api/films/2/\",\"https://swapi.dev/api/films/3/\",\"https://swapi.dev/api/films/6/\"],\"species\":[],\"vehicles\":[],\"starships\":[\"https://swapi.dev/api/starships/13/\"],\"created\":\"2014-12-10T15:18:20.704000Z\",\"edited\":\"2014-12-20T21:17:50.313000Z\",\"url\":\"https://swapi.dev/api/people/4/\"}\n";
        JSONParser parser = new JSONParser(); // parser can take the string nd turn it into a JSOn object
        JSONObject json = (JSONObject) (parser.parse(s));


        System.out.println("String format: " + s);
        System.out.println("JSON format: " + json);

        // get a single value out of the json
        String height = (String) json.get("height");
        int h = Integer.parseInt(height);
        System.out.println("HEIGHT: " + height);

        // use.get() to print the values of Darth Vader's birth year
        String birthYear = (String ) json.get("birth_year");
        System.out.println("YEAR:" + birthYear);

        System.out.println("FILMS:" +json.get("films"));

        // get a json array out of the json
        JSONArray filmsArray = (JSONArray) json.get("films");
        int n = filmsArray.size();
        System.out.println("Number of films: " + n);
        System.out.println("FILMS: ");
        for (int i = 0; i < n; i++) {
            String film = (String) filmsArray.get(i);
            System.out.println(film);
        }
        // print all Darth Vader's starships they are stored in a json array

        JSONArray starshipsArray = (JSONArray) json.get("starships");
        int z = starshipsArray.size();
        System.out.println("Number of Darth Vader Starships:" + z );
        System.out.println("STARSHIPS: " + json.get("starships"));
        for (int i=0; i<z; i++){
            String starships = (String) starshipsArray.get(i);
            System.out.println(starships);
        }


    } // end of constructor

}
