/* *****************************************************************************
 *  Name:    Sara Ansari
 *
 *  Description: A program that reads stock prices, computes the 3-day simple
 *  moving average of the close prices, plots the prices and moving average,
 * and prints the prices and moving average to standard out.
 *
 **************************************************************************** */

public class MovingAverageK {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int k = Integer.parseInt(args[0]);

        String[] date = new String[n];
        double[] open = new double[n];
        double[] high = new double[n];
        double[] low = new double[n];
        double[] close = new double[n];

        for (int i = 0; i < n; i++) {
            date[i] = StdIn.readString();
            open[i] = StdIn.readDouble();
            high[i] = StdIn.readDouble();
            low[i] = StdIn.readDouble();
            close[i] = StdIn.readDouble();
        }

        double[] avg = new double[n];
        for (int i = (k - 1); i < n; i++) {
            double sum = 0;
            for (int j = (k - 1); j >= 0; j--) {
                sum = sum + (close[i - j]);
            }
            avg[i] = sum / k;
        }

        int days = k;

        StockPlot.plot(open, high, low, close, avg, days);

        StdOut.printf("%d\n", n);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%s %.2f %.2f %.2f %.2f %i",
                          date[i], open[i], high[i], low[i], close[i], avg[i], days);
            StdOut.println();
        }
    }
}
