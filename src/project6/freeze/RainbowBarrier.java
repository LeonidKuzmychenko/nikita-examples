package project6.freeze;

import project6.fire.FireBarrier;
import project6.fire.HardFireBarrier;
import project6.fire.SoftFireBarrier;

public class RainbowBarrier implements FireBarrier, FreezeBarrier {

    @Override
    public int freezeResistant() {
        return 65;
    }

    @Override
    public int fireResistant() {
        return 50;
    }
}
