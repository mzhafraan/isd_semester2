import java.util.ListIterator;
import java.util.Stack;

public class UndoRedo<E> {
    private Stack<E> undoStack;
    private Stack<E> redoStack;

    public UndoRedo(){
        this.redoStack = new Stack<>();
        this.undoStack = new Stack<>();
    }
    
    public void tambahData(E data){
        this.undoStack.add(data);
        this.redoStack.clear(); // Saat data baru ditambahkan, history redo harus dihapus
    }
    
    public void undo(){
        if (undoStack.isEmpty()){
            System.out.println("List Undo Kosong");
        } else{
            E value = undoStack.pop(); // Hapus typecast yang tidak perlu
            redoStack.push(value);
        }
    }

    public void redo(){
        if (redoStack.isEmpty()) {
            System.out.println("List Redo Kosong");
        } else {
            E value = redoStack.pop(); // Hapus typecast yang tidak perlu
            undoStack.push(value);
        }
    }

    public void viewListUndo(){
        if (undoStack.isEmpty()) {
            System.out.println("List Undo Kosong");
            return;
        }
        
        System.out.println("Isi List Undo:");
        ListIterator<E> iterator = undoStack.listIterator(undoStack.size());
        while (iterator.hasPrevious()){
            E value = iterator.previous();
            System.out.println(value);
        }
    }

    public void viewListRedo(){
        if (redoStack.isEmpty()) {
            System.out.println("List Redo Kosong");
            return;
        }
        
        System.out.println("Isi List Redo:");
        ListIterator<E> iterator = redoStack.listIterator(redoStack.size());
        while (iterator.hasPrevious()){
            E value = iterator.previous();
            System.out.println(value);
        }
    }
    
    // Method tambahan untuk melihat elemen teratas dari stack undo tanpa menghapusnya
    // public E peekUndo() {
    //     if (undoStack.isEmpty()) {
    //         return null;
    //     }
    //     return undoStack.peek();
    // }
    
    // // Method tambahan untuk melihat elemen teratas dari stack redo tanpa menghapusnya
    // public E peekRedo() {
    //     if (redoStack.isEmpty()) {
    //         return null;
    //     }
    //     return redoStack.peek();
    // }
}