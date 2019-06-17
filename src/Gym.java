import java.util.List;

public class Gym extends Inventory{
    private final String name;
    private final String city;
    private  int workersNum;
    // AGGREGATION START
    private List<Client> clients;
   // private Sub subscription;


    public Gym(String name, String city, int inventoryNum, int workersNum, String inventoryBrand, List<Client> clients /*Sub subscription*/) {
        super(inventoryNum, inventoryBrand);
        this.name = name;
        this.city = city;
        this.workersNum = workersNum;
        this.clients = clients;
    //    this.subscription = subscription;
    }
    public void printInv() {
        System.out.println(inventoryNum);
        System.out.println(inventoryBrand);
    }


    public String toString() {
        return String.format("ALL CLIENTS INFO: %s " , clients );
    }
    //PRINT NUMBER OF CLIENTS
    public int clientsNum() {
        int numberClient=0;
        for ( Client s : clients) {
            numberClient++;
        }
        return numberClient;
    }

//    //ADD CLIENT
//    public int addClient() {
//
//    }
//
    public void getWorkers(){
        System.out.println(workersNum);
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

    public int getWorkersNum() {
        return workersNum;
    }

    public void setWorkersNum(int workersNum) {
        this.workersNum = workersNum;
    }


    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

 /*   public Sub getSubscription() {
        return subscription;
    }

    public void setSubscription(Sub subscription) {
        this.subscription = subscription;
    }*/
}


