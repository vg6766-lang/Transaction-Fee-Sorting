
public class RiskLookup {
    public static int findFloor(int[] sortedRisks, int target) {
        int low = 0;
        int high = sortedRisks.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedRisks[mid] <= target) {
                ans = sortedRisks[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeiling(int[] sortedRisks, int target) {
        int low = 0;
        int high = sortedRisks.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedRisks[mid] >= target) {
                ans = sortedRisks[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] sortedRisks = {10, 20, 35, 50, 75, 90};
        int target = 60;

        System.out.println("Floor for " + target + ": " + findFloor(sortedRisks, target));
        System.out.println("Ceiling for " + target + ": " + findCeiling(sortedRisks, target));
    }
}
