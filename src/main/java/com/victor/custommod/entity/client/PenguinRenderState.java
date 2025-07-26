package com.victor.custommod.entity.client;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.AnimationState;

public class PenguinRenderState extends LivingEntityRenderState{
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState walkAnimationState = new AnimationState();
    public final AnimationState swimAnimationState = new AnimationState();
}
