package com.company;

//public class Main {
//




//    public static void main(String[] args) {
//	// write your code here
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first no");
//        int a1 = sc.nextInt()
//        System.out.println("enter second no");
//        int a2 = sc.nextInt();
//        System.out.println("enter third no");
//        int a3 = sc.nextInt();
//        System.out.println("enter fourth no");
//        int a4 = sc.nextInt();
//        System.out.println("enter five no");
//        int a5 = sc.nextInt();
//
//        int average = (a1+ a2+ a3+ a4+ a5)/5;
//        System.out.println("Average is "+average);
//    }
//}
//import java.util.*;
//class UserInputDemo
//{
//    public static void main(String[] args)
//    {
//        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
//        System.out.print("Enter first number- ");
//        int a= sc.nextInt();
//        System.out.print("Enter second number- ");
//        int b= sc.nextInt();
//        System.out.print("Enter third number- ");
//        int c= sc.nextInt();
//        int d=a+b+c;
//        System.out.println("Total= " +d);
//    }
//}


//class Employee{
//    int salary;
//    String name;
//    int get_salary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }

//}
//class square{
//    int side;
//    public  int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//class cyclinder{
//    private int side;
//
//    public void setSid(int s){
//        side = s;
//    }
//    public cyclinder(int sides){
//        side = sides;
//    }
//    public int area(){
//        return side*side;
//    }
//}
//class myemploye{
//    private int a;
//    private int b;
//
//    myemploye(int a){
//        this.b=a;
//    }
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//}

//class Base{
//    int a,b;
//    public Base(){
//        System.out.println("hi");
//    }
//    public Base(int a){
//        System.out.println("ho");
//    }
//    public void greet(){
//        System.out.println("hop");
//    }
//    public void grow(int a){
//        System.out.println("hp");
//    }
//}
//class add_base extends Base{
//    int c;
//    public add_base(int a) {
//        super(7);
//        System.out.println("where are you");
//    }
//    public void correct() {
//        System.out.println("hai nasiba isq hamara mila");
//    }
//    public void Base() {
//        System.out.println("hm jiski lia duniya bulla usko hi hm nhi  yadd rahe");
//    }
//
//    @Override
//    public void greet() {
//        super.greet();
//        System.out.println("Hi how are you");
//    }
//
//    @Override
//    public void grow(int a) {
//        super.grow(a);
//        System.out.println("Hi yeh dunniya");
//    }
//}



//abstract class Pen{
//    int a;
//    abstract void write();
//    abstract void refile();
//    public int Pen(int a){
//        this.a = a;
//        return this.a+3;
//    }
//    public void open(){
//        System.out.println("you open a pen");
//    }
//    public void open(int a){
//        System.out.println("you open a pen in a");
//    }
//    public void child(int a){
//        System.out.println("It is in pen class");
//    }
//}
//
//class child extends Pen{
//    public void write(){
//        System.out.println("its child class abstract by pen for write");
//    }
////    public void open(){
////        System.out.println("you open a pen in child");
////    }
//    public void open(int a){
//        System.out.println("you open a pen as a in child");
//    }
//    public void refile(){
//        System.out.println("it is child abstract by pen for refile");
//    }
//    public void child(){
//        System.out.println("Enter no to give pen");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        //super(a);
//        System.out.println("it is child class call pen by give super "+a);
//    }
//
//    void correct_write(){
//        System.out.println("you write correct");
//    }
//}




//abstract class PhoneModel{
//    abstract void switch_off();
//
//}
//abstract class Parent2{
//    public Parent2(){
//        System.out.println("mai hu constructor of parent2");
//    }
//    public void say_hello(){
//        System.out.println("helllow");
//    }
//    abstract public void greet();
//}
//
//class child2 extends Parent2{
//    public void greet(){
//        System.out.println("we wish you a very chritsmus in child 2 class");
//    }
//}
//
//abstract class child3 extends Parent2{
//    public void greet(){
//        System.out.println("we wish you a very chritsmus in child3 class");
//    }
//}







//interface bicycle{
//    void apply_break();
//    void speed_up(int a);
//
//    default void get_speed(int a){
//        System.out.println("your corrent speed is "+a);
//    }
//}
//abstract class child3 {
//    public void apply_break(){
//        System.out.println("hey it is child3 for apply_break till bicycle");
//    }
//    public void get_speed(int a){
//        System.out.println("you are in child3 of get_speed");
//    }
//    public void speed_up(int speed){
//        System.out.println("hey it is child3 for speed_up till bicycle with value of "+speed);
//    }
//    abstract void grow();
//    public void greet(){
//        System.out.println("we wish you a very chritsmus in child3 class");
//    }
//}
//
//class Avon_cycle extends child3 implements bicycle{
////    public void get_speed(int a){
////        System.out.println("you are in long class of get_speed");
////    }
//    public void grow(){
//        System.out.println("hey it is long class for grow till child3");
//    }
//    public void apply_break(){
//        System.out.println("hey it is long class for apply_break till bicycle");
//    }
//    public void speed_up(int speed){
//        System.out.println("hey it is long class for speed_up till bicycle with value of "+speed);
//    }
//    public void main(){
//        System.out.println("main function in long clss");
//    }
//}







//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//
//    public void welcome(){
//        System.out.println("welcome all of you present here----");
//    }
//}
//class student extends Pen{
//    public void write(){
//        System.out.println("it is writting process in student class");
//    }
//    public void refill(){
//        System.out.println("it is refilling process in student class");
//    }
//    public void man(){
//        System.out.println("men");
//    }
//    public void change_nib(){
//        System.out.println("Tension matt lo nib change ho jaiga");
//    }
//}

//class monkey{
//    public void jump(){
//        System.out.println("monkey is jumping so stay away");
//    }
//    public void bit(){
//        System.out.println("monkey bit");
//    }
//}
//interface basic_need{
//    void eat();
//    void sleep();
//}
//interface requirement{
//    int banna(int a);
//    void capacity(int b);
//}
//
//
//class human extends monkey implements basic_need,requirement{
//    public void eat(){
//        System.out.println(" monkey eat -----");
//    }
//    public void sleep(){
//        System.out.println(" monkey sleep----");
//    }
//    public int banna(int no){
//        System.out.println("you eat "+no +" banna today");
//        return 0;
//    }
//    public void capacity(int no){
//        System.out.println("as monkey have capacity of "+ no);
//    }
//}









//interface Tv_remote{
//    void on();
//    void off();
//    void change_channel();
//
//}
//interface Smart_tv_Remote{
//    void on();
//    void off();
//    void change_channel();
//    void check_youtube();
//}
//class Details implements Tv_remote,Smart_tv_Remote{
//    public void on(){
//        System.out.println("on ---");
//    }
//    public void off(){
//        System.out.println("off----");
//    }
//    public void change_channel(){
//        System.out.println("changing channel ----");
//    }
//    public void check_youtube(){
//        System.out.println("you can enjoy youtube--");
//    }
//}




//class my_Treat extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        int z=1;
//        while (i<3000){
//            System.out.println("Hi i hate you");
//
//            System.out.println(z++);
//            i++;
//        }
//    }
//
//}
//class my_Treat2 extends Thread{
//    @Override
//    public void run(){
//        System.out.println("Hi its my mistake ");
//        int z=9,a=0;
//        System.out.println(++a + z);
//    }
//}




//abstract class abs{
//    String name ;
//    public void abs(){
//        System.out.println("hi its is consructor");
//    }
//    abstract void  abss();
//
//    public int a=9;
//    protected  int b=4;
//
//    public void abs(String name){
//        this.name = name;
//        System.out.println(" hi your name is "+name);
//    }
//    public void aaa(){
//        System.out.println("correct a is  "+a+" \n as b is"+b);
//    }
//
//}
//
//abstract class base_01 extends abs{
//    String name ;
//
//    abstract void base_01();
//    abstract void susu();
//    @Override
//    public void abs(String name){
//        this.name = name;
//        System.out.println("hi i am in class base_01 and name is"+name);
//    }
//
//    public void aaa(){
//        System.out.println("correct  we are in class base_01 and a is  "+a+" \n as b is"+b);
//    }
//
//}
//
//class base1 extends base_01{
//    public void base_01(){
//        System.out.println("We are in base1 class and i am abstracdt of base_01");
//    }
//    public void susu(){
//        System.out.println("we are in base1 class and i am abstract of base_01");
//    }
//    public void  abss(){
//        System.out.println("we are in base1 class and i am abstract of abs");
//    }
//}









//class base implements Runnable{
//    public base(String name){
//        super(name);
//    }
//
//    @Override
//    public void run(){
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//        System.out.println("I am first command ");
//    }
//
//}
//class  base2 extends Thread{
//    public base2(String name){
//        super(name);
//        System.out.println("hi "+name);
//    }
//    @Override
//    public void run(){
//        System.out.println("I am second command ----------------------"+this.getName());
//    }
//}









//class myThr1 extends Thread{
//    public myThr1(String name){
//        super(name);
//    }
//    public void run(){
//        System.out.println("Thanks you "+this.getName());
//        int i=0;
//        while(true) {
//            System.out.println("Thank you --- ");
//
//            try {
//                Thread.sleep(2);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            i++;
//        }
//    }
//}
//
//class myThr2 extends Thread{
//    public void run(){
//        while (true){
//            System.out.println("my Thank you ");
//        }
//    }
//}








//class is_exception extends Exception{
//    @Override
//    public String getMessage() {
//        return "thsi is getmaessage";
//    }
//}
//class My_Exception extends Exception{
//    @Override
//    public String toString(){
//        return "I am tostring()";
//    }
//
//    @Override
//    public String getMessage() {
//        return "I am get message()";
//    }
//
//}
//
//class Max_ageException{
//    public String toString(){
//        return "Age greter than 125 is not possible";
//    }
//}









//class Negative_exception extends Exception{
//    @Override
//    public String toString() {
//        return "readius cant be negative";
//    }
//
//    @Override
//    public String getMessage() {
//        return "Readuis cant be negative";
//    }
//
//}
//
//class done{
//    public static double area(int r) throws Negative_exception{
//        if (r<0){
//            throw new Negative_exception();
//        }
//        double result = Math.PI*r*r;
//        return result;
//    }
//}









//class Neagative_radius extends Exception{
//    @Override
//    public String toString() {
//        return "it give message";
//    }
//
//    @Override
//    public String getMessage() {
//        return "hi message error";
//    }
//}
//class done{
//    public static double area(int r) throws Neagative_radius{
//        if (r<0){
//            throw new Neagative_radius();
//        }
//        double result = Math.PI*r*r;
//        return result;
//    }
//
//}









//
//interface Library_order1{
//    void add_book(String name);
//    void display_book();
//    void return_book(String name);
//    void issue_book(String name);
//}
//class Library_11 implements Library_order1{
//    String [] book_name;
//    int no_of_book;
//    String book_list;
//    Library_11(){
//        this.book_name = new String[3];
//        this.no_of_book = 0;
//    }
//
//    @Override
//    public void add_book(String book) {
//        if (book_name[no_of_book] == null){
//            book_name[no_of_book] = book;
//        }
//        no_of_book++;
//    }
//
//    @Override
//    public void display_book() {
//        System.out.println("\t\t\t\t\t\t\t\t--------Welcome--------");
//        System.out.println("Avilable book in liberary is --");
//        for (String book: book_name) {
//            if (book==null){
//                continue;
//            }
//            System.out.println("*-"+book);
//        }
//    }
//
//    @Override
//    public void return_book(String name) {
//        for (int i=0; i< book_name.length; i++){
//            if (this.book_name[i] == name){
//                System.out.println("Already present");
//            }
//            else if(this.book_name == null){
//                this.book_name[i]=name;
//            }
//        }
//    }
//
//    @Override
//    public void issue_book(String name) {
//        for (int i=0; i<book_name.length; i++){
//            if (this.book_name[i] != name){
//                System.out.println("book is not present");
//            }
//            else if (this.book_name[i] == name){
//                System.out.println("the "+name+" has been issued");
//                this.book_name[i] = null;
//                return;
//            }
//        }
//    }
//}






















//interface bicyle{
//    void apply_break(int decr);
//    void speed_up(int increase);
//}
//class Analon implements bicyle{
//    public void apply_break(int decrement){
//        System.out.println("your speed decrease with "+decrement);
//    }
//
//    @Override
//    public void speed_up(int increase) {
//        System.out.println("your speed increase with "+increase+" m/s so go on");
//    }
//    public void type_of_cycle(){
//        System.out.println("so your comapany is Ayone");
//    }
//}





//interface Mycamera{
//    void take_snap();
//    void record_video();
//    default void record(){
//        System.out.println("you are recorded");
//    }
//}
//interface my_wifi{
//    String [] get_Network();
//    void connect_to_network(String network);
//}
//class my_phone{
//    void cell_number(int phone_number){
//        System.out.println("calling --"+phone_number);
//    }
//    void phone_cal() {
//        System.out.println("connected---");
//    }
//}
//
//class my_smart_phone extends my_phone implements my_wifi,Mycamera{
//    @Override
//    public void take_snap() {
//        System.out.println("Take snap");
//    }
//
//    @Override
//    public void record_video() {
//        System.out.println("vedio record is on");
//    }
//
//    @Override
//    public String[] get_Network() {
//        System.out.println("Gettind data of list---");
//        String [] network = {"harry","raw","club"};
//        return network;
//    }
//
//    @Override
//    public void connect_to_network(String network) {
//        System.out.println("Connect to " + network);
//    }
//}


















//class m1{
//    public void m1(){
//        System.out.println("hi m1");
//    }
//    public void work_in_m1(){
//        System.out.println("work_for m1");
//    }
//}
//class m2 extends m1{
//    public void m1(){
//        System.out.println("you use m1 in class m2");
//    }
//    public void work_in_m1(){
//        System.out.println("work_for m1 in m2");
//    }
//    public void m2(){
//        System.out.println("hi m2");
//    }
//    public void workinm2(){
//        System.out.println("work for m2");
//    }
//}
//class m3 extends m2{
////    public void m1(){
////        System.out.println("you use m1 in class m3");
////    }
//    public void work_in_m1(){
//        System.out.println("work_for m1 in m3");
//    }
//    public void m2(){
//        System.out.println("hi m2 in m3");
//    }
//    public void workinm2(){
//        System.out.println("work for m2 in m3");
//    }
//    public void m3(){
//        System.out.println("you in constructor of m3");
//    }
//
//}














//class myTread extends Thread{
//    @Override
//    public void run() {
//        while (true){
//            System.out.println("ho hellow");
//        }
//    }
//}
//class My_thread2 extends Thread{
//    @Override
//    public void run() {
//        while (true){
//            System.out.println("thread 2 runing");
//        }
//    }
//}











//class my_thread extends Thread{
//    public my_thread(String name){
//        super(name);
//    }
//    public void run(){
//        while (true)
//        System.out.println("thank you "+getName());
//    }
//}




















//class my_thread extends Thread{
//    public my_thread(String name){
//        super(name);
//    }
//    public void run(){
//        System.out.println("thank you "+getName());
//    }
//}
















//class my_thread1 extends Thread{
//    public my_thread1(String name){
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Thank you "+getName());
//    int i=0;
//    while (true){
//        System.out.println("thank you");
//    try{
//        Thread.sleep(70);
//        }
//    catch (Exception e){
//        System.out.println(e);
//                      }
//        i++;       }
//    }
//}
//class my_thread2 extends Thread{
//    @Override
//    public void run() {
//        while (true){
//            System.out.println("my thread you");
//        }
//    }
//}


//class myexceptipon extends Exception{
//    @Override
//    public String toString() {
//        return "I am to string()";
//    }
//
//    @Override
//    public String getMessage() {
//        return "i am in getmessage";
//    }
//}
//class max_age_exception extends Exception{
//    @Override
//    public String toString() {
//        return "Age cannot be greater than 124";
//    }
//
//    @Override
//    public String getMessage() {
//        return "make sure that the value of age entered is correct";
//    }
//}
//
//class thows_exception{
//    public static double area(int r) throws myexceptipon {
//        double result;
//        if (r < 9) {
//            throw new myexceptipon();
//        } else {
//            result = Math.PI * r * r;
//        }
//        return result;
//    }
//}


















//Anominous class
//interface meth{
//    public void meth1();
//    public void meth2();
//}

//class detail implements meth{
//
//    @Override
//    public void meth1() {
//        System.out.println("hi");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("hoooo");
//    }
//}










//@FunctionalInterface
//interface meth {
//    public void meth1();
//}





//interface  mobile{
//    public void sim();
//    public void music();
//}
//class cvm{
//    public cvm() {
//        super();
//    }
//    public void sim(){
//        System.out.println("hi program in going on");
//    }
//    public void music(){
//        System.out.println("hi program is going on");
//    }
//}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.Buffer;
//
//abstract class mobile{
//    abstract void sim();
//    abstract void sim2();
//    abstract void setting_call();
//    public void  call_decline(String reasion){
//        System.out.println("Dimag matt khao "+reasion);
//    }
//}
//
//interface smartphone{
//    void movie();
//    void camera();
//    void sim();
//}
//
//class detailing extends mobile implements smartphone{
//    @Override
//    void sim2() {
//
//    }
//
//    @Override
//    void setting_call() {
//
//    }
//
//    @Override
//    public void movie() {
//
//    }
//
//    @Override
//    public void camera() {
//
//    }
//
//    @Override
//    public void sim() {
//
//    }
//}























class Main {
    public static void main(String[] args) {
        System.out.println("hi");

    }
}

























//    public static void main(String[] args) throws IOException {
//        int a,b;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter integer");
//        a = Integer.parseInt(br.readLine());



















//        cvm obj = new cvm();
//        obj.music();
//        obj.sim();







//        meth obj = ()->{System.out.println("hi hi");};
//        obj.meth1();



















// Anominous class
//        meth obj = new meth() {
//            @Override
//            public void meth1() {
//                System.out.println("hi");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("hooo");
//            }
//        };
//        obj.meth1();


















//        LocalDateTime l = LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m a E");
//        String myDate = l.format(df);
//        System.out.println(myDate);




















//        Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.get(Calendar.SECOND));



















//        HashSet<Integer> l1 =new ArrayList<>();
//        l1.add(45);
//        l1.add(4);
//        l1.add(5);
//        l1.add(453);
//        l1.add(452);



















//        ArrayList<Integer> l1 = new ArrayList<>();
//        l1.add(4);
//        l1.add(3);
//        l1.add(43);
//        l1.add(49);
//        l1.add(2);
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }





















//        int a;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        try {
//            double ar = thows_exception.area(5);
//            System.out.println(ar);
//        } catch (Exception e){
//            System.out.println(e);
//        }














//        int [] marks = new int[3];
//        marks[0] =43;
//        marks[1] =4;
//        marks[2] =3;
//        Scanner sc =new Scanner(System.in);
//        boolean flag =true;
//        while (flag){
//            System.out.println("Enter no");
//            int index = sc.nextInt();
//            try {
//                System.out.println(marks[index]);
//                flag = false;
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
























//        my_thread1 m1 = new my_thread1("harry");
//        my_thread2 m2 = new my_thread2();















//        my_thread t1 = new my_thread("harry");
//        my_thread t2 = new my_thread("larrrrr");
//        t2.setPriority(10);
//        t1.start();
//        t2.start();




















//        my_thread t = new my_thread("Harry");
//
//        t.start();
//        my_thread r = new my_thread("larrrrr");
//        r.start();













//        myTread m1 = new myTread();
//        My_thread2 m2 = new My_thread2();
//        m1.start();
//        m2.start();

















//        m1 m = new m3();
//        m.m1();
//        m.work_in_m1();
//        m2 n = new m3();
//        n.m1();
//        m3 b = new m3();
//        b.m3();















//        my_smart_phone ms = new my_smart_phone();
//        String [] ar = ms.get_Network();
//        for (String item : ar) {
//            System.out.println(item);
//        }
//
//        ms.record();
//        ms.record_video();











//        bicyle b = new Analon();
//        Analon a = new Analon();
//        b.apply_break(34);
//        a.apply_break(34);
//        a.type_of_cycle();


























//        Library_11 central_library = new Library_11();
//        central_library.add_book("harry-potter");
//        central_library.add_book("harry-potter and legend of mick tisone");
//        central_library.add_book("the deep of earth");
//        central_library.display_book();
//        central_library.issue_book("harry-potter");
//        central_library.display_book();
//        central_library.return_book("harry-potter");
//        central_library.return_book("c++ ");
//        central_library.return_book("the deep of earth");
//        central_library.display_book();











        //        try {
//            ar = done.area(4);
//            System.out.println(ar);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("hi ");
//        }











//        try{
//            double ar = done.area(5);
//            System.out.println(ar);
//        }
//        catch (Exception e){
//            System.out.println("Exception "+e);
//        }










//        int a;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        if (a < 9) {
//            try {
//                throw new ArithmeticException("this is an exception");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//                System.out.println("finished");
//            }
//        }







//        int [] marks = new int[3];
//        marks[0] = 4;
//        marks[1]= 6;
//        marks[2] = 8;
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while (true){
//            System.out.println("Enter value of index");
//            int ind = sc.nextInt();
//            try {
//                try {
//                    System.out.println(marks[ind]);
//                    flag = false;
//                }
//                catch (ArrayIndexOutOfBoundsException e){
//                    System.out.println(e);
//                }
//            }
//            catch (Exception e){
//                System.out.println(e +" is leve; 1");
//            }
//        }








//        myThr1 t1 = new myThr1("harry");
//        myThr2 t2 = new myThr2();
//        t1.start();
//        t2.start();




















//        base2 b1 = new base2("harry 1");
//        base2 b2 = new base2("larry 2");
//        base2 b3 = new base2("carry 3");
//        base2 b4 = new base2("narry 4");
//        base2 b5 = new base2("cerry 5");
//        base2 b6 = new base2("sarry 6");
//        b5.setPriority(Thread.MAX_PRIORITY);
//        b1.setPriority(Thread.MIN_PRIORITY);
//
//
//
////        b1.start();
////        b2.start();
////        b3.start();
////        b4.start();
////        b5.start();
////        b6.start();
//
//        System.out.println(b1.getPriority());
//        System.out.println(b2.getPriority());
//        System.out.println(b3.getPriority());
//        System.out.println(b4.getPriority());
//        System.out.println(b5.getPriority());
//        System.out.println(b6.getPriority());
//        b1.start();
//        try {
//            b1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        b2.start();
//        b3.start();
//        b4.start();
//        b5.start();
//        b6.start();





//        base b1 = new base("harry");
//        b1.start();

//        base2 b2 = new base2("harry");
//        b2.start();
//        System.out.println(b2.getId());
//        System.out.println(b2.getPriority());
//        System.out.println(b2.getName());










//        base_01 b = new base1();
//        abs  a = new base1();
//        base1 bb = new base1();
//
//        b.abss();
//        //a.susu();
//        b.aaa();
//        b.abs();





//        my_Treat t1 = new my_Treat();
//        my_Treat2 t2 = new my_Treat2();
//        t2.start();
//        t1.start();










//        Smart_tv_Remote s = new Details();
//        Tv_remote t = new Details();
//        s.check_youtube();





//        requirement r = new human();
//        basic_need b = new human();
//        human h = new human();
//
//        r.capacity(4);
//        r.banna(1);



//        student p= new student();
//        p.refill();
//        p.welcome();
//        p.man();





//        child3 a= new Avon_cycle();
//        a.grow();
//        a.apply_break();
//        //a.main();
//        a.speed_up(45);
//        a.get_speed(54);
//        //a.apply_break();








//        Parent2 p = new child2();
//        p.greet();








//        child c = new child();
//        //c.child();
//        c.correct_write();
////        c.open(4);
////        c.open();
//        c.write();
//        c.child(7);
////        c.Pen(7);
//        c.open(8);









////        Base b = new Base(3)
////        System.out.println(b);
////        b.greet();
////        b.grow(3);
//
//        Base ab = new add_base(4);
//
////      ab.Base();
//        ab.greet();
//        ab.grow(4);








        //int a,b;
//        myemploye obj = new myemploye(4);
//        obj.setA(3);
//        System.out.println(obj.getA());
//        System.out.println(obj.getB());




//        int s;
//        cyclinder cyc = new cyclinder(9);
//        cyc.setSid(5);
//        System.out.println(cyc.area());


//        int side;
//        square squ = new square();
//        squ.side = 5;
//        System.out.println(squ.perimeter());
//        System.out.println(squ.area());

//        int salary;
//        Employee harry = new Employee();
//        harry.salary = 78;
//        System.out.println(harry.get_salary());
//        harry.name = "harry";
//        System.out.println(harry.getName());
//        harry.name = "kivi";
//        harry.setName("abhishek");
//        System.out.println(harry.getName());



//    static int logic(int x, int y){
//        int z = 9;
//        if(x>z){
//            System.out.println("hi");
//        }
//        else {
//            System.out.println("no");
//        }
//        return z+y;
//    }
//    static int logic(){
//        System.out.println("ji hi hi");
//        return 0;
//    }
//    static int logic(int ...arr){
//        int z=0;
//        for (int a :
//                arr) {
//            if(a==1||a==0){
//                System.out.println("lll");
//            }
//        }
//        return z;
//    }
//    public static void main(String[] args) {
////        Scanner str = new Scanner(System.in);
////        System.out.println("Enter the string you want to check");
////        String a = str.nextLine();
//        logic(3,4);
//        System.out.println(logic(3,4));
//        System.out.println(logic());
//        System.out.println(logic(1,1,1,1,1,1));
//
//
////        System.out.println("Name is :"+a);
////        System.out.println(56>9);
////        System.out.println(a.length());
////        System.out.println(a.toLowerCase());
////        System.out.println(a.substring(2,4));
////        System.out.println(a.replace('y','a'));
////        System.out.println(a.startsWith("ha"));
////        System.out.println(a.charAt(3));
////        System.out.println(a.indexOf("y"));
////        System.out.println(a.equalsIgnoreCase("harry"));
//    }

