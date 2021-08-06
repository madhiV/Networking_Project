import tabServer2.TabServer2;

public class Main {

    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        new tabServer1.TabServer1();
    }
}
