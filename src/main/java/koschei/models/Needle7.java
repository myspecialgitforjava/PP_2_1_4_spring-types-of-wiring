package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final Deth8 death;

    public Needle7(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", " + death.toString() + " на игле :( ";
    }
}
