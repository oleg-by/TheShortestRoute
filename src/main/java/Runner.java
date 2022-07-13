import com.solvd.laba.services.IBusRunner;
import com.solvd.laba.services.impl.BusRunnerImpl;

public class Runner {

    public static void main(String[] args) {
        IBusRunner busRunner = new BusRunnerImpl();
        busRunner.programRunner();
    }
}
