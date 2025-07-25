package com.victor.custommod.entity.client;

import net.minecraft.client.render.entity.animation.*;

public class PenguinAnimations {

    public static final AnimationDefinition ANIM_PENGUIN_IDLE = AnimationDefinition.Builder.create(0f).looping()
            .addBoneAnimation("left_wing",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -10f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_wing",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final AnimationDefinition ANIM_PENGUIN_WALK = AnimationDefinition.Builder.create(0f).looping().build();
    public static final AnimationDefinition ANIM_PENGUIN_SWIM = AnimationDefinition.Builder.create(0f).looping()
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.MOVE_ORIGIN,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -3.5f, 2f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-90f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("tail",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-90f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
}
