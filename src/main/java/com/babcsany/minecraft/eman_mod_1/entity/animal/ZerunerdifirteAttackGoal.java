package com.babcsany.minecraft.eman_mod_1.entity.animal;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;

public class ZerunerdifirteAttackGoal extends MeleeAttackGoal {
    private final Zerunerdifirte Zerunerdifirte;
    private int raiseArmTicks;

    public ZerunerdifirteAttackGoal(Zerunerdifirte Zerunerdifirte, double speedIn, boolean longMemoryIn) {
        super(Zerunerdifirte, speedIn, longMemoryIn);
        this.Zerunerdifirte = Zerunerdifirte;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask() {
        super.resetTask();
        this.Zerunerdifirte.setAggroed(false);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        super.tick();
        ++this.raiseArmTicks;
        if (this.raiseArmTicks >= 5 && this.attackTick < 10) {
            this.Zerunerdifirte.setAggroed(true);
        } else {
            this.Zerunerdifirte.setAggroed(false);
        }

    }
}

