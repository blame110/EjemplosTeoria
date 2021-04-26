
public class StaticCodeExample {

    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }
        
        int i=10;
        while (i>0)
        	i++;

        System.out.println(ip);

    }

}