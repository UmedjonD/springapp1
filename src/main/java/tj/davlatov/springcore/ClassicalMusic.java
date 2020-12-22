package tj.davlatov.springcore;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    public void doMeDestroy() {
        System.out.println("doing my destroy ");
    }
    @Override
    public String getSong() {
        return "Rapsodiya";
    }
}
