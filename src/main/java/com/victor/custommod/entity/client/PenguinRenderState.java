package com.victor.custommod.entity.client;

import net.minecraft.client.render.entity.state.ItemHolderEntityRenderState;
import net.minecraft.entity.AnimationState;

public class PenguinRenderState extends ItemHolderEntityRenderState {
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState walkAnimationState = new AnimationState();
    public final AnimationState swimAnimationState = new AnimationState();
    public final AnimationState swimIdleAnimationState = new AnimationState();
    public final AnimationState slideAnimationState = new AnimationState();

}
