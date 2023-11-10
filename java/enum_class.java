enum Status{
    Running,
    Failing,
    Pending,
    Successful;
}
 
public class enum_class {
    public static void main(String[] args) {
        Status ss[] = Status.values();
        System.out.println(ss[1]);

        for (Status s : ss){
            System.out.println(s);
        }

    }
}
