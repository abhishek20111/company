package com.company;

public class subset {
    public static void main(String[] args) {
        String p="";
        new subset("apple","");
    }
    public subset(String s, String p){
      if(s.isEmpty()){
          System.out.println(p);
          return;
      }
      char ch=s.charAt(0);
      new subset(s.substring(1), p+ch);
      new subset(s.substring(1), p);
    }
}
