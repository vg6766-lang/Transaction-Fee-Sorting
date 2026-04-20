
public class LogSearch {
    public static int linearSearch(String[] logs, String target) {
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals(target)) return i;
        }
        return -1;
    }

    public static int binarySearch(String[] sortedLogs, String target) {
        int low = 0;
        int high = sortedLogs.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = target.compareTo(sortedLogs[mid]);
            if (res == 0) return mid;
            if (res > 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] logs = {"ACC100", "ACC200", "ACC300", "ACC400"};
        String target = "ACC300";

        int linearIndex = linearSearch(logs, target);
        System.out.println("Linear search index: " + linearIndex);

        String[] sortedLogs = {"ACC100", "ACC200", "ACC300", "ACC400"};
        int binaryIndex = binarySearch(sortedLogs, target);
        System.out.println("Binary search index: " + binaryIndex);
    }
}
