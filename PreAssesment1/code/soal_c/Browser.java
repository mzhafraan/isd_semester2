
import java.util.Iterator;
import java.util.Stack;


public class Browser {
    private Stack<History> backStack = new Stack<>();
    private Stack<History> forwardStack = new Stack<>();

    public void tambahData(String url) {
        History website = new History(url);
        backStack.push(website);
        forwardStack.clear();
        System.out.println(website);
    }

    public void back(){
        if (backStack.size() > 1 ){
            History current = backStack.pop();
            forwardStack.push(current);
            History previous = backStack.peek();
            System.out.println("Mundur ke alamat " + previous.getUrl());
        } else {
            System.out.println("Tidak bisa back lebih jauh");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            History next = forwardStack.pop();
            backStack.push(next);
            System.out.println("Kembali lagi ke alamat " + next.getUrl());
        } else {
            System.out.println("Tidak ada halaman untuk next");
        }
    }

    public void history(){
        System.out.println();
        System.out.println("History penelusuran web: ");
        System.out.print("[");

        Iterator<History> iterator = backStack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getUrl());
            if (iterator.hasNext()){
                System.out.println(", ");
            }            
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Browser backForward = new Browser();

        backForward.tambahData("www.google.com/search");
        backForward.tambahData("www.w3schools/java-compareto");
        backForward.tambahData("www.w3schools/java-compareuns");

        backForward.back();
        backForward.forward();
        backForward.history();
    }


}
