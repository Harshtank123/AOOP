public class Students{
    public int ernum;
    public String name;
    public Students(String name , int ernum){
        this.ernum = ernum;
        this.name = name;
    }
    public static void main(String[] args) {
        Students s1 = new Students("veer", 67);
        Students s2 = new Students("Harsh", 65);
        Students s3 = new Students("Dip", 72);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
