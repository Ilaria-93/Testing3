import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testDateFormatting() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String expected = "01 marzo 2023";
        String actual = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals(expected, actual);
    }

    @Test
    public void testTimeZoneConversion() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        ZonedDateTime dateWithDifferentZone = date.withZoneSameInstant(ZoneId.of("America/New_York"));
        String expected = "01 marzo 2023";
        String actual = dateWithDifferentZone.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals(expected, actual);
    }
}