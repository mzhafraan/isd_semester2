import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleApp {
    private Stack<String> browserHistory;
    private Queue<String> printQueue;

    public SimpleApp() {
        browserHistory = new Stack<>();
        printQueue = new LinkedList<>();
    }

    // Fitur History Browser
    public void visitPage(String url) {
        browserHistory.push(url);
        System.out.println("Visited: " + url);
    }

    public String goBack() {
        if (!browserHistory.isEmpty()) {
            String url = browserHistory.pop();
            System.out.println("Back to: " + url);
            return url;
        } else {
            System.out.println("No more pages to go back to.");
            return null;
        }
    }

    // Fitur Antrian Cetak
    public void addPrintJob(String document) {
        printQueue.add(document);
        System.out.println("Added to print queue: " + document);
    }

    public String printDocument() {
        if (!printQueue.isEmpty()) {
            String document = printQueue.remove();
            System.out.println("Printing: " + document);
            return document;
        } else {
            System.out.println("Print queue is empty.");
            return null;
        }
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();

        // Contoh penggunaan fitur History Browser
        app.visitPage("https://www.google.com");
        app.visitPage("https://www.bing.com");
        app.visitPage("https://www.duckduckgo.com");
        app.goBack();
        app.goBack();

        // Contoh penggunaan fitur Antrian Cetak
        app.addPrintJob("Document1.pdf");
        app.addPrintJob("Document2.pdf");
        app.printDocument();
        app.printDocument();
        app.printDocument();
    }
}