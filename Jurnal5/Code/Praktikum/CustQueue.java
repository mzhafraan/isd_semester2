import java.util.LinkedList;
import java.util.Queue;

public class CustQueue {
    private Queue<String> queueList;
    private int pergi;
    private int jumlahCust;

    public CustQueue(){
        queueList = new LinkedList<>();
        pergi = 0;
    }

    //enqueue
    public void enqueue(String name){
        queueList.offer(name);
        jumlahCust++;
    }
    
    public String dequeue(){
        jumlahCust--;
        pergi++;
        return queueList.poll();
    }

    public void printAll(){
        for (String orang : queueList){
            System.out.printf("%s ", orang);
        }
        System.out.println();
    }

    public int getJumlahCust(){
        return jumlahCust;
    }
    
    public int getPergi(){
        return pergi;
    }

}
