import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = (long) service.averageSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonht = service.maxSales(month);
        Assertions.assertEquals(expectedMonth, actualMonht);
    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.belowAverageSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.aboveAverageSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}