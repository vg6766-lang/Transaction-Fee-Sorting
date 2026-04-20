import java.util.Arrays;

class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + " (risk=" + riskScore + ", balance=" + balance + ")";
    }
}

public class RiskRanking {
    public static void sortByRiskAsc(Client[] clients) {
        int n = clients.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (clients[j].riskScore > clients[j + 1].riskScore) {
                    Client temp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = temp;
                }
            }
        }
    }

    public static void sortByRiskDesc(Client[] clients) {
        for (int i = 1; i < clients.length; i++) {
            Client key = clients[i];
            int j = i - 1;
            while (j >= 0 && (clients[j].riskScore < key.riskScore ||
                    (clients[j].riskScore == key.riskScore && clients[j].balance < key.balance))) {
                clients[j + 1] = clients[j];
                j--;
            }
            clients[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] clients = {
                new Client("Alice", 88, 4200.50),
                new Client("Bob", 72, 5000.00),
                new Client("Carol", 88, 3900.75),
                new Client("Dave", 65, 6100.25)
        };

        Client[] asc = Arrays.copyOf(clients, clients.length);
        sortByRiskAsc(asc);
        System.out.println("Ascending risk:");
        System.out.println(Arrays.toString(asc));

        Client[] desc = Arrays.copyOf(clients, clients.length);
        sortByRiskDesc(desc);
        System.out.println("Descending risk (balance tiebreak):");
        System.out.println(Arrays.toString(desc));
    }
}
