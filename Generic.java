package com.company;
class MyGenerics<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1,T2 t2 ){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public T1 getT1(){
        return this.t1;
    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class Generic {
    public static void main(String[] args) {
        MyGenerics<String, Integer> g1 = new MyGenerics<>(212, "my srt", 34);
        String str = g1.getT1();
        int inw = g1.getT2();
        System.out.println(str +" "+inw+":   "+g1.getVal());
    }
}
