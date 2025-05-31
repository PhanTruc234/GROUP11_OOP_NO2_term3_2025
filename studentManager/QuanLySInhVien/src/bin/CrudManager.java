package QuanLySInhVien.src.bin;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import QuanLySInhVien.src.models.IKey;

public class CrudManager<T extends IKey> {

    private Scanner scan = new Scanner(System.in);

    public void add(List<T> list, SupplierWithException<T> supplier) {
        for (;;) {
            try {
                T obj = supplier.get();
                if (checkExist(list, obj.getKeyValue())) {
                    System.err.println("Duplicate key! Enter again.");
                } else {
                    list.add(obj);
                    System.out.println("Added successfully!");
                }
            } catch (Exception e) {
                System.err.println("Error input: " + e.getMessage());
                continue;
            }
            if (!hasNext())
                break;
        }
    }

    public void edit(List<T> list, Consumer<T> editFunc) {
        System.out.println("Enter key to edit: ");
        String key = scan.nextLine();
        for (T obj : list) {
            if (obj.getKeyValue().equalsIgnoreCase(key)) {
                editFunc.accept(obj);
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Object not found.");
    }

    public void delete(List<T> list) {
        System.out.println("Enter key to delete:");
        String key = scan.nextLine();
        boolean removed = list.removeIf(obj -> obj.getKeyValue().equalsIgnoreCase(key));
        if (removed) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Object not found.");
        }
    }

    public void print(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (T obj : list) {
            System.out.println(obj);
        }
    }

    private boolean hasNext() {
        System.out.println("Continue (Y/N): ");
        String c = scan.nextLine();
        return !c.equalsIgnoreCase("N");
    }

    public boolean checkExist(List<T> list, String keyValue) {
        for (T obj : list) {
            if (obj.getKeyValue().equalsIgnoreCase(keyValue)) {
                return true;
            }
        }
        return false;
    }

    @FunctionalInterface
    public interface SupplierWithException<T> {
        T get() throws Exception;
    }
}
