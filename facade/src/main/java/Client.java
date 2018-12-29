/**
 * ClassName PACKAGE_NAME.Cilent
 * Description 客户端
 * Author liyong
 * Date 2018-12-29 14:38
 * Version 0.0.1
 **/
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        System.out.println("-----------");
        computer.start();

        System.out.println("************");
        computer.stop();
    }
}
