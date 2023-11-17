public class StatsService {
//Расчет суммы всех продаж

    public long sumSales(long[] sales) {
        long sum = 0; // переменная для хранения суммы продаж
        for (long sale : sales) { // цикл по массиву продаж
            sum += sale; // прибавляем каждую продажу к сумме
        }
        return sum; // возвращаем сумму продаж
    }

//Hасчет средней суммы продаж в месяц

    public double averageSales(long[] sales) {
        long sum = sumSales(sales); // вызываем метод для расчета суммы продаж
        int count = sales.length; // получаем количество месяцев из длины массива
        return (double) sum / count; // возвращаем среднюю сумму продаж в месяц, приводя сумму к типу double
    }

//Расчет номера месяца с пиком продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) { // цикл по массиву продаж
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запоминаем его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
//Расчет номера месяца с минимумом продаж

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) { // цикл по массиву продаж
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запоминаем его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
//Расчет количества месяцев, в которых продажи были ниже среднего

    public int belowAverageSales(long[] sales) {
        double average = averageSales(sales); // вызываем метод для расчета средней суммы продаж в месяц
        int count = 0; // переменная для хранения количества месяцев
        for (long sale : sales) { // цикл по массиву продаж
            if (sale < average) { // если продажа меньше средней
                count++; // увеличиваем счетчик
            }
        }
        return count; // возвращаем количество месяцев
    }

//Расчет количества месяцев, в которых продажи были выше среднего

    public int aboveAverageSales(long[] sales) {
        double average = averageSales(sales); // вызываем метод для расчета средней суммы продаж в месяц
        int count = 0; // переменная для хранения количества месяцев
        for (long sale : sales) { // цикл по массиву продаж
            if (sale > average) { // если продажа больше средней
                count++; // увеличиваем счетчик
            }
        }
        return count; // возвращаем количество месяцев
    }

}
