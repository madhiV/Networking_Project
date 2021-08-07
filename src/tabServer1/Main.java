package tabServer1;
public class Main {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        new TabServer1();
    }
}
