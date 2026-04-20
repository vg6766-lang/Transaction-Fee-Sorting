class Asset {
    String ticker;
    double returnRate;
    double volatility;

    Asset(String ticker, double returnRate, double volatility) {
        this.ticker = ticker;
        this.returnRate = returnRate;
        this.volatility = volatility;
    }

    @Override
    public String toString() {
        return ticker + " (return=" + returnRate + ", vol=" + volatility + ")";
    }
}

public class PortfolioSort {
    public static void quickSort(Asset[] assets, int low, int high) {
        if (low < high) {
            int p = partition(assets, low, high);
            quickSort(assets, low, p);
            quickSort(assets, p + 1, high);
        }
    }

    private static int partition(Asset[] arr, int low, int high) {
        Asset pivot = arr[(low + high) / 2];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i].returnRate > pivot.returnRate);
            do {
                j--;
            } while (arr[j].returnRate < pivot.returnRate);
            if (i >= j) return j;
            Asset temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Asset[] assets = {
                new Asset("AAPL", 0.18, 0.25),
                new Asset("TSLA", 0.25, 0.40),
                new Asset("MSFT", 0.15, 0.20),
                new Asset("GOOG", 0.22, 0.30)
        };

        quickSort(assets, 0, assets.length - 1);
        System.out.println("Sorted assets by return rate desc:");
        for (Asset asset : assets) {
            System.out.println(asset);
        }
    }
}
