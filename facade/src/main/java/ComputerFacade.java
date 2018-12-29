import children.CPU;
import children.Disk;
import children.Memory;

/**
 * ClassName PACKAGE_NAME.ComputerFacade
 * Description 门面类
 * Author liyong
 * Date 2018-12-29 14:33
 * Version 0.0.1
 **/
public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start() {
        cpu.start();
        memory.start();
        disk.start();
    }

    public void stop() {
        disk.stop();
        memory.stop();
        cpu.stop();
    }
}
