package Section8;

import java.util.ArrayList;

class IntClass {
    private int myV;

    public IntClass(int myV) {
        this.myV = myV;
    }

    public int getMyV() {
        return myV;
    }

    public void setMyV(int myV) {
        this.myV = myV;
    }
}

public class Autoboxing {
    public static void main(String[] args) {
        String[] sa = new String[10];
        int[] inta = new int[10];

        ArrayList<String> sat = new ArrayList<>();
        sat.add("hai");

//        ArrayList<int> intAL = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleV = new Double(12.25);
        ArrayList<Integer> intAL = new ArrayList<>();
        for (int i=0; i<=10 ;i++) {
            intAL.add(Integer.valueOf(i));
        }

        for (int i=0;i<=10;i++){
            System.out.println(i + "->" + intAL.get(i).intValue());
        }

        Integer myIL = 56;
        int myI = myIL.intValue();

        ArrayList<Double> myDV = new ArrayList<>();
        for (double dlb =0.0;dlb<=10.0;dlb+=0.5) {
            myDV.add(Double.valueOf(dlb));
        }

        for (int i=0;i<myDV.size();i++) {
            double value = myDV.get(i);
            System.out.println(i+"->"+value);
        }





    }
}
