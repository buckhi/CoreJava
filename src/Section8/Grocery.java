package Section8;

import java.util.ArrayList;



public class Grocery {
    public ArrayList<String> getList() {
        return list;
    }

    private int[] myNumber;

    private ArrayList<String> list = new ArrayList<>();

    public void addItem(String item) {
        list.add(item);

    }

    public void printList() {
        System.out.println("you have " + list.size() + " items in your list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyItem(String currentItem,String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyItem(position, newItem);
        }
    }

    private void modifyItem(int position, String newItem) {
        list.set(position, newItem);
        System.out.println("grocery item " + (position + 1) + " has been modified");
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }

    private void removeItem(int position) {
        list.remove(position);

    }

    private int findItem(String searchItem) {
        return list.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position>=0 ){
            return true;
        }
        return false;
    }
}
