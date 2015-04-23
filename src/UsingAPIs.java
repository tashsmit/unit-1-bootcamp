/**
 * Created by alexandraqin on 4/14/15.
 */
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;

public class UsingAPIs {

  public static void main (String args[]) {
      File mobyDick = new File("/Users/c4q-tashasmith/Desktop/unit-1-bootcamp/moby_dick.rtf");

          System.out.println(numberOfUniqueWords(mobyDick));


      //imported stripe code from gitHub
      RequestOptions requestOptions = (new RequestOptions.RequestOptionsBuilder()).setApiKey("YOUR-SECRET-KEY").build();
      Map<String, Object> chargeMap = new HashMap<String, Object>();
      chargeMap.put("amount", 100);
      chargeMap.put("currency", "usd");
      Map<String, Object> cardMap = new HashMap<String, Object>();
      cardMap.put("number", "4242424242424242");
      cardMap.put("exp_month", 12);
      cardMap.put("exp_year", 2020);
      chargeMap.put("card", cardMap);
      try {
          Charge charge = Charge.create(chargeMap, requestOptions));
          System.out.println(charge);
      } catch (StripeException e) {
          e.printStackTrace();
      }
  }
      }

    public static int numberOfUniqueWords (File yourFile) {

        HashSet<String> uniqueWords = new HashSet<String>();
        int wordCount = 0;

        try {

            Scanner input = new Scanner(yourFile);

            while (input.hasNext()) {
                String text = input.next();
                text = text.toLowerCase();
                text = text.replaceAll("^[^a-zA-Z0-9\\s]+|[^a-zA-Z0-9\\s]+$", "");

                if (uniqueWords.contains(text)) {
                    continue;
                }
                else  {
                    uniqueWords.add(text);
                    wordCount ++;

                }
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
