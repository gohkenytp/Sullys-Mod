package com.uraneptus.sullysmod.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.uraneptus.sullysmod.SullysMod;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class SMEntityTags {
    //Mod Tags
    public static final TagKey<EntityType<?>> SCARES_TORTOISES = TagUtil.entityTypeTag(SullysMod.MOD_ID, "scares_tortoises");
    public static final TagKey<EntityType<?>> CANNOT_BOUNCE = TagUtil.entityTypeTag(SullysMod.MOD_ID, "cannot_bounce");
    public static final TagKey<EntityType<?>> CANNOT_BE_FLUNG = TagUtil.entityTypeTag(SullysMod.MOD_ID, "cannot_be_flung");
    public static final TagKey<EntityType<?>> ATTACKS_BABY_TORTOISES = TagUtil.entityTypeTag(SullysMod.MOD_ID, "attacks_baby_tortoises");
    public static final TagKey<EntityType<?>> IS_FLYING_MOB = TagUtil.entityTypeTag(SullysMod.MOD_ID, "is_flying_mob");
}
