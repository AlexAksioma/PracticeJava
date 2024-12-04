package tasks;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeClients {
    public static void main(String[] args) {
        int[] clientArray1 = {3, 2, 4, 5, 1}; //2
        int[] clientArray2 = {1, 2, 3, 4, 5};     //0
        int[] clientArray3 = {3, 2, 7, 5, 4, 1, 6}; //4
        //System.out.println("--> " + solution(clientArray3));
        System.out.println("--> " + solutionWrong(clientArray3));
    }

    public static int solutionWrong(int[] client){
        int maxClient = client.length;
        System.out.println("maxClient:"+maxClient);
        int numberClientInArray = 0;
        for (int i = 0; i < client.length; i++) {
            if(client[i] == maxClient){
                numberClientInArray = i+1;
                System.out.println("numberClientInArray:"+numberClientInArray);
                break;
            }
        }
        return client.length - numberClientInArray;
    }

    public static int solution(int[] client) {
        List<Integer> packageOnShelf = new ArrayList<>();
        List<Integer> deletePackages = new ArrayList<>();
        int clientsNumber;
        int maxShelfSize = 0;                       //1  2  3  4  5
        for (int i = 1; i < client.length + 1; i++) { //{3, 2, 4, 5, 1}
            clientsNumber = client[i - 1];
            System.out.println("clientsNumber: " + clientsNumber);
            if (clientsNumber == i) {
                System.out.println("clientsNumber=i");
                deletePackages.add(clientsNumber);
                if (packageOnShelf.contains(clientsNumber)) {
                    packageOnShelf.remove(Integer.valueOf(clientsNumber));
                    deletePackages.add(clientsNumber);
                    System.out.println("remove: " + packageOnShelf);
                }
            } else {
                if (packageOnShelf.contains(clientsNumber)) {
                    packageOnShelf.remove(Integer.valueOf(clientsNumber));
                    deletePackages.add(clientsNumber);
                    System.out.println("remove: " + packageOnShelf);
                } else {
                    for (int j = i; j < clientsNumber; j++) {
                        if (!deletePackages.contains(j)) {
                            deletePackages.add(clientsNumber);
                            packageOnShelf.add(j);
                            System.out.println("add: " + packageOnShelf);
                        }
                    }
                    if (maxShelfSize < packageOnShelf.size())
                        maxShelfSize = packageOnShelf.size();
                }
            }
        }
        return maxShelfSize;
    }

    public static int solutionChatGPT(int[] clients) {
        List<Integer> packageOnShelf = new ArrayList<>();
        int maxShelfSize = 0;
        int nextExpectedPackage = 1;

        for (int client : clients) {
            if (packageOnShelf.contains(client)) {
                packageOnShelf.remove(Integer.valueOf(client));
            } else {
                while (nextExpectedPackage < client) {
                    packageOnShelf.add(nextExpectedPackage);
                    nextExpectedPackage++;
                }
                nextExpectedPackage++;
            }
            maxShelfSize = Math.max(maxShelfSize, packageOnShelf.size());
        }
        return maxShelfSize;
    }
}
