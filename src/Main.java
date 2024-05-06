/* Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();

        String dateString = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("The date is: " + dateString);
    }
}