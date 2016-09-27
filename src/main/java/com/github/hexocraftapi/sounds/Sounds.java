package com.github.hexocraftapi.sounds;

/*
 * Copyright 2016 hexosse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.github.hexocraftapi.reflection.minecraft.Minecraft.Version;
import org.bukkit.Sound;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author <b>Hexosse</b> (<a href="https://github.com/hexosse">on GitHub</a>))
 */
@SuppressWarnings("unused")
public enum Sounds
{
	// List of Sounds introduced in 1.7.10
	// and still present until 1.8.8
	AMBIENCE_CAVE(null, Version.v1_8_R3),
	AMBIENCE_RAIN(null, Version.v1_8_R3),
	AMBIENCE_THUNDER(null, Version.v1_8_R3),
	ANVIL_BREAK(null, Version.v1_8_R3),
	ANVIL_LAND(null, Version.v1_8_R3),
	ANVIL_USE(null, Version.v1_8_R3),
	ARROW_HIT(null, Version.v1_8_R3),
	BURP(null, Version.v1_8_R3),
	CHEST_CLOSE(null, Version.v1_8_R3),
	CHEST_OPEN(null, Version.v1_8_R3),
	CLICK(null, Version.v1_8_R3),
	DOOR_CLOSE(null, Version.v1_8_R3),
	DOOR_OPEN(null, Version.v1_8_R3),
	DRINK(null, Version.v1_8_R3),
	EAT(null, Version.v1_8_R3),
	EXPLODE(null, Version.v1_8_R3),
	FALL_BIG(null, Version.v1_8_R3),
	FALL_SMALL(null, Version.v1_8_R3),
	FIRE(null, Version.v1_8_R3),
	FIRE_IGNITE(null, Version.v1_8_R3),
	FIZZ(null, Version.v1_8_R3),
	FUSE(null, Version.v1_8_R3),
	GLASS(null, Version.v1_8_R3),
	HURT_FLESH(null, Version.v1_8_R3),
	ITEM_BREAK(null, Version.v1_8_R3),
	ITEM_PICKUP(null, Version.v1_8_R3),
	LAVA(null, Version.v1_8_R3),
	LAVA_POP(null, Version.v1_8_R3),
	LEVEL_UP(null, Version.v1_8_R3),
	MINECART_BASE(null, Version.v1_8_R3),
	MINECART_INSIDE(null, Version.v1_8_R3),
	NOTE_BASS(null, Version.v1_8_R3),
	NOTE_PIANO(null, Version.v1_8_R3),
	NOTE_BASS_DRUM(null, Version.v1_8_R3),
	NOTE_STICKS(null, Version.v1_8_R3),
	NOTE_BASS_GUITAR(null, Version.v1_8_R3),
	NOTE_SNARE_DRUM(null, Version.v1_8_R3),
	NOTE_PLING(null, Version.v1_8_R3),
	ORB_PICKUP(null, Version.v1_8_R3),
	PISTON_EXTEND(null, Version.v1_8_R3),
	PISTON_RETRACT(null, Version.v1_8_R3),
	PORTAL(null, Version.v1_8_R3),
	PORTAL_TRAVEL(null, Version.v1_8_R3),
	PORTAL_TRIGGER(null, Version.v1_8_R3),
	SHOOT_ARROW(null, Version.v1_8_R3),
	SPLASH(null, Version.v1_8_R3),
	SPLASH2(null, Version.v1_8_R3),
	STEP_GRASS(null, Version.v1_8_R3),
	STEP_GRAVEL(null, Version.v1_8_R3),
	STEP_LADDER(null, Version.v1_8_R3),
	STEP_SAND(null, Version.v1_8_R3),
	STEP_SNOW(null, Version.v1_8_R3),
	STEP_STONE(null, Version.v1_8_R3),
	STEP_WOOD(null, Version.v1_8_R3),
	STEP_WOOL(null, Version.v1_8_R3),
	SWIM(null, Version.v1_8_R3),
	WATER(null, Version.v1_8_R3),
	WOOD_CLICK(null, Version.v1_8_R3),
	BAT_DEATH(null, Version.v1_8_R3),
	BAT_HURT(null, Version.v1_8_R3),
	BAT_IDLE(null, Version.v1_8_R3),
	BAT_LOOP(null, Version.v1_8_R3),
	BAT_TAKEOFF(null, Version.v1_8_R3),
	BLAZE_BREATH(null, Version.v1_8_R3),
	BLAZE_DEATH(null, Version.v1_8_R3),
	BLAZE_HIT(null, Version.v1_8_R3),
	CAT_HISS(null, Version.v1_8_R3),
	CAT_HIT(null, Version.v1_8_R3),
	CAT_MEOW(null, Version.v1_8_R3),
	CAT_PURR(null, Version.v1_8_R3),
	CAT_PURREOW(null, Version.v1_8_R3),
	CHICKEN_IDLE(null, Version.v1_8_R3),
	CHICKEN_HURT(null, Version.v1_8_R3),
	CHICKEN_EGG_POP(null, Version.v1_8_R3),
	CHICKEN_WALK(null, Version.v1_8_R3),
	COW_IDLE(null, Version.v1_8_R3),
	COW_HURT(null, Version.v1_8_R3),
	COW_WALK(null, Version.v1_8_R3),
	CREEPER_HISS(null, Version.v1_8_R3),
	CREEPER_DEATH(null, Version.v1_8_R3),
	ENDERDRAGON_DEATH(null, Version.v1_8_R3),
	ENDERDRAGON_GROWL(null, Version.v1_8_R3),
	ENDERDRAGON_HIT(null, Version.v1_8_R3),
	ENDERDRAGON_WINGS(null, Version.v1_8_R3),
	ENDERMAN_DEATH(null, Version.v1_8_R3),
	ENDERMAN_HIT(null, Version.v1_8_R3),
	ENDERMAN_IDLE(null, Version.v1_8_R3),
	ENDERMAN_TELEPORT(null, Version.v1_8_R3),
	ENDERMAN_SCREAM(null, Version.v1_8_R3),
	ENDERMAN_STARE(null, Version.v1_8_R3),
	GHAST_SCREAM(null, Version.v1_8_R3),
	GHAST_SCREAM2(null, Version.v1_8_R3),
	GHAST_CHARGE(null, Version.v1_8_R3),
	GHAST_DEATH(null, Version.v1_8_R3),
	GHAST_FIREBALL(null, Version.v1_8_R3),
	GHAST_MOAN(null, Version.v1_8_R3),
	IRONGOLEM_DEATH(null, Version.v1_8_R3),
	IRONGOLEM_HIT(null, Version.v1_8_R3),
	IRONGOLEM_THROW(null, Version.v1_8_R3),
	IRONGOLEM_WALK(null, Version.v1_8_R3),
	MAGMACUBE_WALK(null, Version.v1_8_R3),
	MAGMACUBE_WALK2(null, Version.v1_8_R3),
	MAGMACUBE_JUMP(null, Version.v1_8_R3),
	PIG_IDLE(null, Version.v1_8_R3),
	PIG_DEATH(null, Version.v1_8_R3),
	PIG_WALK(null, Version.v1_8_R3),
	SHEEP_IDLE(null, Version.v1_8_R3),
	SHEEP_SHEAR(null, Version.v1_8_R3),
	SHEEP_WALK(null, Version.v1_8_R3),
	SILVERFISH_HIT(null, Version.v1_8_R3),
	SILVERFISH_KILL(null, Version.v1_8_R3),
	SILVERFISH_IDLE(null, Version.v1_8_R3),
	SILVERFISH_WALK(null, Version.v1_8_R3),
	SKELETON_IDLE(null, Version.v1_8_R3),
	SKELETON_DEATH(null, Version.v1_8_R3),
	SKELETON_HURT(null, Version.v1_8_R3),
	SKELETON_WALK(null, Version.v1_8_R3),
	SLIME_ATTACK(null, Version.v1_8_R3),
	SLIME_WALK(null, Version.v1_8_R3),
	SLIME_WALK2(null, Version.v1_8_R3),
	SPIDER_IDLE(null, Version.v1_8_R3),
	SPIDER_DEATH(null, Version.v1_8_R3),
	SPIDER_WALK(null, Version.v1_8_R3),
	WITHER_DEATH(null, Version.v1_8_R3),
	WITHER_HURT(null, Version.v1_8_R3),
	WITHER_IDLE(null, Version.v1_8_R3),
	WITHER_SHOOT(null, Version.v1_8_R3),
	WITHER_SPAWN(null, Version.v1_8_R3),
	WOLF_BARK(null, Version.v1_8_R3),
	WOLF_DEATH(null, Version.v1_8_R3),
	WOLF_GROWL(null, Version.v1_8_R3),
	WOLF_HOWL(null, Version.v1_8_R3),
	WOLF_HURT(null, Version.v1_8_R3),
	WOLF_PANT(null, Version.v1_8_R3),
	WOLF_SHAKE(null, Version.v1_8_R3),
	WOLF_WALK(null, Version.v1_8_R3),
	WOLF_WHINE(null, Version.v1_8_R3),
	ZOMBIE_METAL(null, Version.v1_8_R3),
	ZOMBIE_WOOD(null, Version.v1_8_R3),
	ZOMBIE_WOODBREAK(null, Version.v1_8_R3),
	ZOMBIE_IDLE(null, Version.v1_8_R3),
	ZOMBIE_DEATH(null, Version.v1_8_R3),
	ZOMBIE_HURT(null, Version.v1_8_R3),
	ZOMBIE_INFECT(null, Version.v1_8_R3),
	ZOMBIE_UNFECT(null, Version.v1_8_R3),
	ZOMBIE_REMEDY(null, Version.v1_8_R3),
	ZOMBIE_WALK(null, Version.v1_8_R3),
	ZOMBIE_PIG_IDLE(null, Version.v1_8_R3),
	ZOMBIE_PIG_ANGRY(null, Version.v1_8_R3),
	ZOMBIE_PIG_DEATH(null, Version.v1_8_R3),
	ZOMBIE_PIG_HURT(null, Version.v1_8_R3),
	DIG_WOOL(null, Version.v1_8_R3),
	DIG_GRASS(null, Version.v1_8_R3),
	DIG_GRAVEL(null, Version.v1_8_R3),
	DIG_SAND(null, Version.v1_8_R3),
	DIG_SNOW(null, Version.v1_8_R3),
	DIG_STONE(null, Version.v1_8_R3),
	DIG_WOOD(null, Version.v1_8_R3),
	FIREWORK_BLAST(null, Version.v1_8_R3),
	FIREWORK_BLAST2(null, Version.v1_8_R3),
	FIREWORK_LARGE_BLAST(null, Version.v1_8_R3),
	FIREWORK_LARGE_BLAST2(null, Version.v1_8_R3),
	FIREWORK_TWINKLE(null, Version.v1_8_R3),
	FIREWORK_TWINKLE2(null, Version.v1_8_R3),
	FIREWORK_LAUNCH(null, Version.v1_8_R3),
	SUCCESSFUL_HIT(null, Version.v1_8_R3),
	HORSE_ANGRY(null, Version.v1_8_R3),
	HORSE_ARMOR(null, Version.v1_8_R3),
	HORSE_BREATHE(null, Version.v1_8_R3),
	HORSE_DEATH(null, Version.v1_8_R3),
	HORSE_GALLOP(null, Version.v1_8_R3),
	HORSE_HIT(null, Version.v1_8_R3),
	HORSE_IDLE(null, Version.v1_8_R3),
	HORSE_JUMP(null, Version.v1_8_R3),
	HORSE_LAND(null, Version.v1_8_R3),
	HORSE_SADDLE(null, Version.v1_8_R3),
	HORSE_SOFT(null, Version.v1_8_R3),
	HORSE_WOOD(null, Version.v1_8_R3),
	DONKEY_ANGRY(null, Version.v1_8_R3),
	DONKEY_DEATH(null, Version.v1_8_R3),
	DONKEY_HIT(null, Version.v1_8_R3),
	DONKEY_IDLE(null, Version.v1_8_R3),
	HORSE_SKELETON_DEATH(null, Version.v1_8_R3),
	HORSE_SKELETON_HIT(null, Version.v1_8_R3),
	HORSE_SKELETON_IDLE(null, Version.v1_8_R3),
	HORSE_ZOMBIE_DEATH(null, Version.v1_8_R3),
	HORSE_ZOMBIE_HIT(null, Version.v1_8_R3),
	HORSE_ZOMBIE_IDLE(null, Version.v1_8_R3),
	VILLAGER_DEATH(null, Version.v1_8_R3),
	VILLAGER_HAGGLE(null, Version.v1_8_R3),
	VILLAGER_HIT(null, Version.v1_8_R3),
	VILLAGER_IDLE(null, Version.v1_8_R3),
	VILLAGER_NO(null, Version.v1_8_R3),
	VILLAGER_YES(null, Version.v1_8_R3),

	// List of Sounds introduced in 1.9
	AMBIENT_CAVE(Version.v1_9_R1, null, AMBIENCE_CAVE),
	BLOCK_ANVIL_BREAK(Version.v1_9_R1, null, ANVIL_BREAK),
	BLOCK_ANVIL_DESTROY(Version.v1_9_R1, null),
	BLOCK_ANVIL_FALL(Version.v1_9_R1, null),
	BLOCK_ANVIL_HIT(Version.v1_9_R1, null),
	BLOCK_ANVIL_LAND(Version.v1_9_R1, null, ANVIL_LAND),
	BLOCK_ANVIL_PLACE(Version.v1_9_R1, null),
	BLOCK_ANVIL_STEP(Version.v1_9_R1, null),
	BLOCK_ANVIL_USE(Version.v1_9_R1, null, ANVIL_USE),
	BLOCK_BREWING_STAND_BREW(Version.v1_9_R1, null),
	BLOCK_CHEST_CLOSE(Version.v1_9_R1, null, CHEST_CLOSE),
	BLOCK_CHEST_LOCKED(Version.v1_9_R1, null, CHEST_OPEN),
	BLOCK_CHEST_OPEN(Version.v1_9_R1, null),
	BLOCK_CHORUS_FLOWER_DEATH(Version.v1_9_R1, null),
	BLOCK_CHORUS_FLOWER_GROW(Version.v1_9_R1, null),
	BLOCK_CLOTH_BREAK(Version.v1_9_R1, null, DIG_WOOL),
	BLOCK_CLOTH_FALL(Version.v1_9_R1, null),
	BLOCK_CLOTH_HIT(Version.v1_9_R1, null),
	BLOCK_CLOTH_PLACE(Version.v1_9_R1, null),
	BLOCK_CLOTH_STEP(Version.v1_9_R1, null, STEP_WOOL),
	BLOCK_COMPARATOR_CLICK(Version.v1_9_R1, null),
	BLOCK_DISPENSER_DISPENSE(Version.v1_9_R1, null),
	BLOCK_DISPENSER_FAIL(Version.v1_9_R1, null),
	BLOCK_DISPENSER_LAUNCH(Version.v1_9_R1, null),
	BLOCK_ENDERCHEST_CLOSE(Version.v1_9_R1, null),
	BLOCK_ENDERCHEST_OPEN(Version.v1_9_R1, null),
	BLOCK_END_GATEWAY_SPAWN(Version.v1_9_R1, null),
	BLOCK_FENCE_GATE_CLOSE(Version.v1_9_R1, null),
	BLOCK_FENCE_GATE_OPEN(Version.v1_9_R1, null),
	BLOCK_FIRE_AMBIENT(Version.v1_9_R1, null, FIRE),
	BLOCK_FIRE_EXTINGUISH(Version.v1_9_R1, null, FIZZ),
	BLOCK_FURNACE_FIRE_CRACKLE(Version.v1_9_R1, null),
	BLOCK_GLASS_BREAK(Version.v1_9_R1, null, GLASS),
	BLOCK_GLASS_FALL(Version.v1_9_R1, null),
	BLOCK_GLASS_HIT(Version.v1_9_R1, null),
	BLOCK_GLASS_PLACE(Version.v1_9_R1, null),
	BLOCK_GLASS_STEP(Version.v1_9_R1, null),
	BLOCK_GRASS_BREAK(Version.v1_9_R1, null, DIG_GRASS),
	BLOCK_GRASS_FALL(Version.v1_9_R1, null),
	BLOCK_GRASS_HIT(Version.v1_9_R1, null),
	BLOCK_GRASS_PLACE(Version.v1_9_R1, null),
	BLOCK_GRASS_STEP(Version.v1_9_R1, null, STEP_GRASS),
	BLOCK_GRAVEL_BREAK(Version.v1_9_R1, null, DIG_GRAVEL),
	BLOCK_GRAVEL_FALL(Version.v1_9_R1, null),
	BLOCK_GRAVEL_HIT(Version.v1_9_R1, null),
	BLOCK_GRAVEL_PLACE(Version.v1_9_R1, null),
	BLOCK_GRAVEL_STEP(Version.v1_9_R1, null, STEP_GRAVEL),
	BLOCK_IRON_DOOR_CLOSE(Version.v1_9_R1, null, DOOR_CLOSE),
	BLOCK_IRON_DOOR_OPEN(Version.v1_9_R1, null, DOOR_OPEN),
	BLOCK_IRON_TRAPDOOR_CLOSE(Version.v1_9_R1, null),
	BLOCK_IRON_TRAPDOOR_OPEN(Version.v1_9_R1, null),
	BLOCK_LADDER_BREAK(Version.v1_9_R1, null),
	BLOCK_LADDER_FALL(Version.v1_9_R1, null),
	BLOCK_LADDER_HIT(Version.v1_9_R1, null),
	BLOCK_LADDER_PLACE(Version.v1_9_R1, null),
	BLOCK_LADDER_STEP(Version.v1_9_R1, null, STEP_LADDER),
	BLOCK_LAVA_AMBIENT(Version.v1_9_R1, null, LAVA),
	BLOCK_LAVA_EXTINGUISH(Version.v1_9_R1, null),
	BLOCK_LAVA_POP(Version.v1_9_R1, null, LAVA_POP),
	BLOCK_LEVER_CLICK(Version.v1_9_R1, null),
	BLOCK_METAL_BREAK(Version.v1_9_R1, null),
	BLOCK_METAL_FALL(Version.v1_9_R1, null),
	BLOCK_METAL_HIT(Version.v1_9_R1, null),
	BLOCK_METAL_PLACE(Version.v1_9_R1, null),
	BLOCK_METAL_PRESSUREPLATE_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_METAL_PRESSUREPLATE_CLICK_ON(Version.v1_9_R1, null),
	BLOCK_METAL_STEP(Version.v1_9_R1, null),
	BLOCK_NOTE_BASEDRUM(Version.v1_9_R1, null, NOTE_BASS_DRUM),
	BLOCK_NOTE_BASS(Version.v1_9_R1, null, NOTE_BASS, NOTE_BASS_GUITAR),
	BLOCK_NOTE_HARP(Version.v1_9_R1, null, NOTE_PIANO),
	BLOCK_NOTE_HAT(Version.v1_9_R1, null, NOTE_STICKS),
	BLOCK_NOTE_PLING(Version.v1_9_R1, null, NOTE_PLING),
	BLOCK_NOTE_SNARE(Version.v1_9_R1, null, NOTE_SNARE_DRUM),
	BLOCK_PISTON_CONTRACT(Version.v1_9_R1, null, PISTON_RETRACT),
	BLOCK_PISTON_EXTEND(Version.v1_9_R1, null, PISTON_EXTEND),
	BLOCK_PORTAL_AMBIENT(Version.v1_9_R1, null, PORTAL),
	BLOCK_PORTAL_TRAVEL(Version.v1_9_R1, null, PORTAL_TRAVEL),
	BLOCK_PORTAL_TRIGGER(Version.v1_9_R1, null, PORTAL_TRIGGER),
	BLOCK_REDSTONE_TORCH_BURNOUT(Version.v1_9_R1, null),
	BLOCK_SAND_BREAK(Version.v1_9_R1, null, DIG_SAND),
	BLOCK_SAND_FALL(Version.v1_9_R1, null),
	BLOCK_SAND_HIT(Version.v1_9_R1, null),
	BLOCK_SAND_PLACE(Version.v1_9_R1, null),
	BLOCK_SAND_STEP(Version.v1_9_R1, null, STEP_SAND),
	BLOCK_SLIME_BREAK(Version.v1_9_R1, null),
	BLOCK_SLIME_FALL(Version.v1_9_R1, null),
	BLOCK_SLIME_HIT(Version.v1_9_R1, null),
	BLOCK_SLIME_PLACE(Version.v1_9_R1, null),
	BLOCK_SLIME_STEP(Version.v1_9_R1, null),
	BLOCK_SNOW_BREAK(Version.v1_9_R1, null, DIG_SNOW),
	BLOCK_SNOW_FALL(Version.v1_9_R1, null),
	BLOCK_SNOW_HIT(Version.v1_9_R1, null),
	BLOCK_SNOW_PLACE(Version.v1_9_R1, null),
	BLOCK_SNOW_STEP(Version.v1_9_R1, null, STEP_SNOW),
	BLOCK_STONE_BREAK(Version.v1_9_R1, null, DIG_STONE),
	BLOCK_STONE_BUTTON_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_STONE_BUTTON_CLICK_ON(Version.v1_9_R1, null),
	BLOCK_STONE_FALL(Version.v1_9_R1, null),
	BLOCK_STONE_HIT(Version.v1_9_R1, null),
	BLOCK_STONE_PLACE(Version.v1_9_R1, null),
	BLOCK_STONE_PRESSUREPLATE_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_STONE_PRESSUREPLATE_CLICK_ON(Version.v1_9_R1, null),
	BLOCK_STONE_STEP(Version.v1_9_R1, null, STEP_STONE),
	BLOCK_TRIPWIRE_ATTACH(Version.v1_9_R1, null),
	BLOCK_TRIPWIRE_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_TRIPWIRE_CLICK_ON(Version.v1_9_R1, null),
	BLOCK_TRIPWIRE_DETACH(Version.v1_9_R1, null),
	BLOCK_WATERLILY_PLACE(Version.v1_9_R1, null),
	BLOCK_WATER_AMBIENT(Version.v1_9_R1, null, WATER),
	BLOCK_WOODEN_DOOR_CLOSE(Version.v1_9_R1, null, DOOR_CLOSE),
	BLOCK_WOODEN_DOOR_OPEN(Version.v1_9_R1, null, DOOR_OPEN),
	BLOCK_WOODEN_TRAPDOOR_CLOSE(Version.v1_9_R1, null),
	BLOCK_WOODEN_TRAPDOOR_OPEN(Version.v1_9_R1, null),
	BLOCK_WOOD_BREAK(Version.v1_9_R1, null, DIG_WOOD),
	BLOCK_WOOD_BUTTON_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_WOOD_BUTTON_CLICK_ON(Version.v1_9_R1, null, WOOD_CLICK),
	BLOCK_WOOD_FALL(Version.v1_9_R1, null),
	BLOCK_WOOD_HIT(Version.v1_9_R1, null),
	BLOCK_WOOD_PLACE(Version.v1_9_R1, null),
	BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF(Version.v1_9_R1, null),
	BLOCK_WOOD_PRESSUREPLATE_CLICK_ON(Version.v1_9_R1, null),
	BLOCK_WOOD_STEP(Version.v1_9_R1, null, STEP_WOOD),
	ENCHANT_THORNS_HIT(Version.v1_9_R1, null),
	ENTITY_ARMORSTAND_BREAK(Version.v1_9_R1, null),
	ENTITY_ARMORSTAND_FALL(Version.v1_9_R1, null),
	ENTITY_ARMORSTAND_HIT(Version.v1_9_R1, null),
	ENTITY_ARMORSTAND_PLACE(Version.v1_9_R1, null),
	ENTITY_ARROW_HIT(Version.v1_9_R1, null, ARROW_HIT),
	ENTITY_ARROW_HIT_PLAYER(Version.v1_9_R1, null),
	ENTITY_ARROW_SHOOT(Version.v1_9_R1, null, SHOOT_ARROW),
	ENTITY_BAT_AMBIENT(Version.v1_9_R1, null, BAT_IDLE),
	ENTITY_BAT_DEATH(Version.v1_9_R1, null, BAT_DEATH),
	ENTITY_BAT_HURT(Version.v1_9_R1, null, BAT_HURT),
	ENTITY_BAT_LOOP(Version.v1_9_R1, null, BAT_LOOP),
	ENTITY_BAT_TAKEOFF(Version.v1_9_R1, null, BAT_TAKEOFF),
	ENTITY_BLAZE_AMBIENT(Version.v1_9_R1, null, BLAZE_BREATH),
	ENTITY_BLAZE_BURN(Version.v1_9_R1, null),
	ENTITY_BLAZE_DEATH(Version.v1_9_R1, null, BLAZE_DEATH),
	ENTITY_BLAZE_HURT(Version.v1_9_R1, null, BLAZE_HIT),
	ENTITY_BLAZE_SHOOT(Version.v1_9_R1, null),
	ENTITY_BOBBER_SPLASH(Version.v1_9_R1, null, SPLASH2),
	ENTITY_BOBBER_THROW(Version.v1_9_R1, null),
	ENTITY_CAT_AMBIENT(Version.v1_9_R1, null, CAT_MEOW),
	ENTITY_CAT_DEATH(Version.v1_9_R1, null),
	ENTITY_CAT_HISS(Version.v1_9_R1, null, CAT_HISS),
	ENTITY_CAT_HURT(Version.v1_9_R1, null, CAT_HIT),
	ENTITY_CAT_PURR(Version.v1_9_R1, null, CAT_PURR),
	ENTITY_CAT_PURREOW(Version.v1_9_R1, null, CAT_PURREOW),
	ENTITY_CHICKEN_AMBIENT(Version.v1_9_R1, null, CHICKEN_IDLE),
	ENTITY_CHICKEN_DEATH(Version.v1_9_R1, null),
	ENTITY_CHICKEN_EGG(Version.v1_9_R1, null, CHICKEN_EGG_POP),
	ENTITY_CHICKEN_HURT(Version.v1_9_R1, null, CHICKEN_HURT),
	ENTITY_CHICKEN_STEP(Version.v1_9_R1, null, CHICKEN_WALK),
	ENTITY_COW_AMBIENT(Version.v1_9_R1, null, COW_IDLE),
	ENTITY_COW_DEATH(Version.v1_9_R1, null),
	ENTITY_COW_HURT(Version.v1_9_R1, null, COW_HURT),
	ENTITY_COW_MILK(Version.v1_9_R1, null),
	ENTITY_COW_STEP(Version.v1_9_R1, null, COW_WALK),
	ENTITY_CREEPER_DEATH(Version.v1_9_R1, null, CREEPER_DEATH),
	ENTITY_CREEPER_HURT(Version.v1_9_R1, null),
	ENTITY_CREEPER_PRIMED(Version.v1_9_R1, null, CREEPER_HISS),
	ENTITY_DONKEY_AMBIENT(Version.v1_9_R1, null, DONKEY_IDLE),
	ENTITY_DONKEY_ANGRY(Version.v1_9_R1, null, DONKEY_ANGRY),
	ENTITY_DONKEY_CHEST(Version.v1_9_R1, null),
	ENTITY_DONKEY_DEATH(Version.v1_9_R1, null, DONKEY_DEATH),
	ENTITY_DONKEY_HURT(Version.v1_9_R1, null, DONKEY_HIT),
	ENTITY_EGG_THROW(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_AMBIENT(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_AMBIENT_LAND(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_CURSE(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_DEATH(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_DEATH_LAND(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_HURT(Version.v1_9_R1, null),
	ENTITY_ELDER_GUARDIAN_HURT_LAND(Version.v1_9_R1, null),
	ENTITY_ENDERDRAGON_AMBIENT(Version.v1_9_R1, null, ENDERDRAGON_WINGS),
	ENTITY_ENDERDRAGON_DEATH(Version.v1_9_R1, null, ENDERDRAGON_DEATH),
	ENTITY_ENDERDRAGON_FIREBALL_EXPLODE(Version.v1_9_R1, null),
	ENTITY_ENDERDRAGON_FLAP(Version.v1_9_R1, null),
	ENTITY_ENDERDRAGON_GROWL(Version.v1_9_R1, null, ENDERDRAGON_GROWL),
	ENTITY_ENDERDRAGON_HURT(Version.v1_9_R1, null, ENDERDRAGON_HIT),
	ENTITY_ENDERDRAGON_SHOOT(Version.v1_9_R1, null),
	ENTITY_ENDEREYE_LAUNCH(Version.v1_9_R1, null),
	ENTITY_ENDERMEN_AMBIENT(Version.v1_9_R1, null, ENDERMAN_IDLE),
	ENTITY_ENDERMEN_DEATH(Version.v1_9_R1, null, ENDERMAN_DEATH),
	ENTITY_ENDERMEN_HURT(Version.v1_9_R1, null, ENDERMAN_HIT),
	ENTITY_ENDERMEN_SCREAM(Version.v1_9_R1, null, ENDERMAN_SCREAM),
	ENTITY_ENDERMEN_STARE(Version.v1_9_R1, null, ENDERMAN_STARE),
	ENTITY_ENDERMEN_TELEPORT(Version.v1_9_R1, null, ENDERMAN_TELEPORT),
	ENTITY_ENDERMITE_AMBIENT(Version.v1_9_R1, null),
	ENTITY_ENDERMITE_DEATH(Version.v1_9_R1, null),
	ENTITY_ENDERMITE_HURT(Version.v1_9_R1, null),
	ENTITY_ENDERMITE_STEP(Version.v1_9_R1, null),
	ENTITY_ENDERPEARL_THROW(Version.v1_9_R1, null),
	ENTITY_EXPERIENCE_BOTTLE_THROW(Version.v1_9_R1, null),
	ENTITY_EXPERIENCE_ORB_PICKUP(Version.v1_9_R1, null, ORB_PICKUP),
	ENTITY_EXPERIENCE_ORB_TOUCH(Version.v1_9_R1, null),
	ENTITY_FIREWORK_BLAST(Version.v1_9_R1, null, FIREWORK_BLAST),
	ENTITY_FIREWORK_BLAST_FAR(Version.v1_9_R1, null, FIREWORK_BLAST2),
	ENTITY_FIREWORK_LARGE_BLAST(Version.v1_9_R1, null, FIREWORK_LARGE_BLAST),
	ENTITY_FIREWORK_LARGE_BLAST_FAR(Version.v1_9_R1, null, FIREWORK_LARGE_BLAST2),
	ENTITY_FIREWORK_LAUNCH(Version.v1_9_R1, null, FIREWORK_LAUNCH),
	ENTITY_FIREWORK_SHOOT(Version.v1_9_R1, null),
	ENTITY_FIREWORK_TWINKLE(Version.v1_9_R1, null, FIREWORK_TWINKLE),
	ENTITY_FIREWORK_TWINKLE_FAR(Version.v1_9_R1, null, FIREWORK_TWINKLE2),
	ENTITY_GENERIC_BIG_FALL(Version.v1_9_R1, null, FALL_BIG),
	ENTITY_GENERIC_BURN(Version.v1_9_R1, null),
	ENTITY_GENERIC_DEATH(Version.v1_9_R1, null),
	ENTITY_GENERIC_DRINK(Version.v1_9_R1, null, DRINK),
	ENTITY_GENERIC_EAT(Version.v1_9_R1, null, EAT),
	ENTITY_GENERIC_EXPLODE(Version.v1_9_R1, null, EXPLODE),
	ENTITY_GENERIC_EXTINGUISH_FIRE(Version.v1_9_R1, null),
	ENTITY_GENERIC_HURT(Version.v1_9_R1, null, HURT_FLESH),
	ENTITY_GENERIC_SMALL_FALL(Version.v1_9_R1, null, FALL_SMALL),
	ENTITY_GENERIC_SPLASH(Version.v1_9_R1, null, SPLASH),
	ENTITY_GENERIC_SWIM(Version.v1_9_R1, null, SWIM),
	ENTITY_GHAST_AMBIENT(Version.v1_9_R1, null, GHAST_MOAN),
	ENTITY_GHAST_DEATH(Version.v1_9_R1, null, GHAST_DEATH),
	ENTITY_GHAST_HURT(Version.v1_9_R1, null, GHAST_SCREAM2),
	ENTITY_GHAST_SCREAM(Version.v1_9_R1, null, GHAST_SCREAM),
	ENTITY_GHAST_SHOOT(Version.v1_9_R1, null, GHAST_FIREBALL),
	ENTITY_GHAST_WARN(Version.v1_9_R1, null, GHAST_CHARGE),
	ENTITY_GUARDIAN_AMBIENT(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_AMBIENT_LAND(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_ATTACK(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_DEATH(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_DEATH_LAND(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_FLOP(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_HURT(Version.v1_9_R1, null),
	ENTITY_GUARDIAN_HURT_LAND(Version.v1_9_R1, null),
	ENTITY_HORSE_AMBIENT(Version.v1_9_R1, null, HORSE_IDLE),
	ENTITY_HORSE_ANGRY(Version.v1_9_R1, null, HORSE_ANGRY),
	ENTITY_HORSE_ARMOR(Version.v1_9_R1, null, HORSE_ARMOR),
	ENTITY_HORSE_BREATHE(Version.v1_9_R1, null, HORSE_BREATHE),
	ENTITY_HORSE_DEATH(Version.v1_9_R1, null, HORSE_DEATH),
	ENTITY_HORSE_EAT(Version.v1_9_R1, null),
	ENTITY_HORSE_GALLOP(Version.v1_9_R1, null, HORSE_GALLOP),
	ENTITY_HORSE_HURT(Version.v1_9_R1, null, HORSE_HIT),
	ENTITY_HORSE_JUMP(Version.v1_9_R1, null, HORSE_JUMP),
	ENTITY_HORSE_LAND(Version.v1_9_R1, null, HORSE_LAND),
	ENTITY_HORSE_SADDLE(Version.v1_9_R1, null, HORSE_SADDLE),
	ENTITY_HORSE_STEP(Version.v1_9_R1, null, HORSE_SOFT),
	ENTITY_HORSE_STEP_WOOD(Version.v1_9_R1, null, HORSE_WOOD),
	ENTITY_HOSTILE_BIG_FALL(Version.v1_9_R1, null),
	ENTITY_HOSTILE_DEATH(Version.v1_9_R1, null),
	ENTITY_HOSTILE_HURT(Version.v1_9_R1, null),
	ENTITY_HOSTILE_SMALL_FALL(Version.v1_9_R1, null),
	ENTITY_HOSTILE_SPLASH(Version.v1_9_R1, null),
	ENTITY_HOSTILE_SWIM(Version.v1_9_R1, null),
	ENTITY_IRONGOLEM_ATTACK(Version.v1_9_R1, null, IRONGOLEM_THROW),
	ENTITY_IRONGOLEM_DEATH(Version.v1_9_R1, null, IRONGOLEM_DEATH),
	ENTITY_IRONGOLEM_HURT(Version.v1_9_R1, null, IRONGOLEM_HIT),
	ENTITY_IRONGOLEM_STEP(Version.v1_9_R1, null, IRONGOLEM_WALK),
	ENTITY_ITEMFRAME_ADD_ITEM(Version.v1_9_R1, null),
	ENTITY_ITEMFRAME_BREAK(Version.v1_9_R1, null),
	ENTITY_ITEMFRAME_PLACE(Version.v1_9_R1, null),
	ENTITY_ITEMFRAME_REMOVE_ITEM(Version.v1_9_R1, null),
	ENTITY_ITEMFRAME_ROTATE_ITEM(Version.v1_9_R1, null),
	ENTITY_ITEM_BREAK(Version.v1_9_R1, null, ITEM_BREAK),
	ENTITY_ITEM_PICKUP(Version.v1_9_R1, null, ITEM_PICKUP),
	ENTITY_LEASHKNOT_BREAK(Version.v1_9_R1, null),
	ENTITY_LEASHKNOT_PLACE(Version.v1_9_R1, null),
	ENTITY_LIGHTNING_IMPACT(Version.v1_9_R1, null),
	ENTITY_LIGHTNING_THUNDER(Version.v1_9_R1, null, AMBIENCE_THUNDER),
	ENTITY_LINGERINGPOTION_THROW(Version.v1_9_R1, null),
	ENTITY_MAGMACUBE_DEATH(Version.v1_9_R1, null),
	ENTITY_MAGMACUBE_HURT(Version.v1_9_R1, null),
	ENTITY_MAGMACUBE_JUMP(Version.v1_9_R1, null, MAGMACUBE_JUMP),
	ENTITY_MAGMACUBE_SQUISH(Version.v1_9_R1, null, MAGMACUBE_WALK, MAGMACUBE_WALK2),
	ENTITY_MINECART_INSIDE(Version.v1_9_R1, null, MINECART_INSIDE),
	ENTITY_MINECART_RIDING(Version.v1_9_R1, null, MINECART_BASE),
	ENTITY_MOOSHROOM_SHEAR(Version.v1_9_R1, null),
	ENTITY_MULE_AMBIENT(Version.v1_9_R1, null),
	ENTITY_MULE_DEATH(Version.v1_9_R1, null),
	ENTITY_MULE_HURT(Version.v1_9_R1, null),
	ENTITY_PAINTING_BREAK(Version.v1_9_R1, null),
	ENTITY_PAINTING_PLACE(Version.v1_9_R1, null),
	ENTITY_PIG_AMBIENT(Version.v1_9_R1, null, PIG_IDLE),
	ENTITY_PIG_DEATH(Version.v1_9_R1, null, PIG_DEATH),
	ENTITY_PIG_HURT(Version.v1_9_R1, null),
	ENTITY_PIG_SADDLE(Version.v1_9_R1, null),
	ENTITY_PIG_STEP(Version.v1_9_R1, null, PIG_WALK),
	ENTITY_PLAYER_ATTACK_CRIT(Version.v1_9_R1, null),
	ENTITY_PLAYER_ATTACK_KNOCKBACK(Version.v1_9_R1, null),
	ENTITY_PLAYER_ATTACK_NODAMAGE(Version.v1_9_R1, null),
	ENTITY_PLAYER_ATTACK_STRONG(Version.v1_9_R1, null, SUCCESSFUL_HIT),
	ENTITY_PLAYER_ATTACK_SWEEP(Version.v1_9_R1, null),
	ENTITY_PLAYER_ATTACK_WEAK(Version.v1_9_R1, null),
	ENTITY_PLAYER_BIG_FALL(Version.v1_9_R1, null),
	ENTITY_PLAYER_BREATH(Version.v1_9_R1, null),
	ENTITY_PLAYER_BURP(Version.v1_9_R1, null, BURP),
	ENTITY_PLAYER_DEATH(Version.v1_9_R1, null),
	ENTITY_PLAYER_HURT(Version.v1_9_R1, null),
	ENTITY_PLAYER_LEVELUP(Version.v1_9_R1, null, LEVEL_UP),
	ENTITY_PLAYER_SMALL_FALL(Version.v1_9_R1, null),
	ENTITY_PLAYER_SPLASH(Version.v1_9_R1, null),
	ENTITY_PLAYER_SWIM(Version.v1_9_R1, null),
	ENTITY_RABBIT_AMBIENT(Version.v1_9_R1, null),
	ENTITY_RABBIT_ATTACK(Version.v1_9_R1, null),
	ENTITY_RABBIT_DEATH(Version.v1_9_R1, null),
	ENTITY_RABBIT_HURT(Version.v1_9_R1, null),
	ENTITY_RABBIT_JUMP(Version.v1_9_R1, null),
	ENTITY_SHEEP_AMBIENT(Version.v1_9_R1, null, SHEEP_IDLE),
	ENTITY_SHEEP_DEATH(Version.v1_9_R1, null),
	ENTITY_SHEEP_HURT(Version.v1_9_R1, null),
	ENTITY_SHEEP_SHEAR(Version.v1_9_R1, null, SHEEP_SHEAR),
	ENTITY_SHEEP_STEP(Version.v1_9_R1, null, SHEEP_WALK),
	ENTITY_SHULKER_AMBIENT(Version.v1_9_R1, null),
	ENTITY_SHULKER_BULLET_HIT(Version.v1_9_R1, null),
	ENTITY_SHULKER_BULLET_HURT(Version.v1_9_R1, null),
	ENTITY_SHULKER_CLOSE(Version.v1_9_R1, null),
	ENTITY_SHULKER_DEATH(Version.v1_9_R1, null),
	ENTITY_SHULKER_HURT(Version.v1_9_R1, null),
	ENTITY_SHULKER_HURT_CLOSED(Version.v1_9_R1, null),
	ENTITY_SHULKER_OPEN(Version.v1_9_R1, null),
	ENTITY_SHULKER_SHOOT(Version.v1_9_R1, null),
	ENTITY_SHULKER_TELEPORT(Version.v1_9_R1, null),
	ENTITY_SILVERFISH_AMBIENT(Version.v1_9_R1, null, SILVERFISH_IDLE),
	ENTITY_SILVERFISH_DEATH(Version.v1_9_R1, null, SILVERFISH_KILL),
	ENTITY_SILVERFISH_HURT(Version.v1_9_R1, null, SILVERFISH_HIT),
	ENTITY_SILVERFISH_STEP(Version.v1_9_R1, null, SILVERFISH_WALK),
	ENTITY_SKELETON_AMBIENT(Version.v1_9_R1, null, SKELETON_IDLE),
	ENTITY_SKELETON_DEATH(Version.v1_9_R1, null, SKELETON_DEATH),
	ENTITY_SKELETON_HORSE_AMBIENT(Version.v1_9_R1, null, HORSE_SKELETON_IDLE),
	ENTITY_SKELETON_HORSE_DEATH(Version.v1_9_R1, null, HORSE_SKELETON_DEATH),
	ENTITY_SKELETON_HORSE_HURT(Version.v1_9_R1, null, HORSE_SKELETON_HIT),
	ENTITY_SKELETON_HURT(Version.v1_9_R1, null, SKELETON_HURT),
	ENTITY_SKELETON_SHOOT(Version.v1_9_R1, null),
	ENTITY_SKELETON_STEP(Version.v1_9_R1, null, SKELETON_WALK),
	ENTITY_SLIME_ATTACK(Version.v1_9_R1, null, SLIME_ATTACK),
	ENTITY_SLIME_DEATH(Version.v1_9_R1, null),
	ENTITY_SLIME_HURT(Version.v1_9_R1, null),
	ENTITY_SLIME_JUMP(Version.v1_9_R1, null, SLIME_WALK),
	ENTITY_SLIME_SQUISH(Version.v1_9_R1, null, SLIME_WALK2),
	ENTITY_SMALL_MAGMACUBE_DEATH(Version.v1_9_R1, null),
	ENTITY_SMALL_MAGMACUBE_HURT(Version.v1_9_R1, null),
	ENTITY_SMALL_MAGMACUBE_SQUISH(Version.v1_9_R1, null),
	ENTITY_SMALL_SLIME_DEATH(Version.v1_9_R1, null),
	ENTITY_SMALL_SLIME_HURT(Version.v1_9_R1, null),
	ENTITY_SMALL_SLIME_JUMP(Version.v1_9_R1, null),
	ENTITY_SMALL_SLIME_SQUISH(Version.v1_9_R1, null),
	ENTITY_SNOWBALL_THROW(Version.v1_9_R1, null),
	ENTITY_SNOWMAN_AMBIENT(Version.v1_9_R1, null),
	ENTITY_SNOWMAN_DEATH(Version.v1_9_R1, null),
	ENTITY_SNOWMAN_HURT(Version.v1_9_R1, null),
	ENTITY_SNOWMAN_SHOOT(Version.v1_9_R1, null),
	ENTITY_SPIDER_AMBIENT(Version.v1_9_R1, null, SPIDER_IDLE),
	ENTITY_SPIDER_DEATH(Version.v1_9_R1, null, SPIDER_DEATH),
	ENTITY_SPIDER_HURT(Version.v1_9_R1, null),
	ENTITY_SPIDER_STEP(Version.v1_9_R1, null, SPIDER_WALK),
	ENTITY_SPLASH_POTION_BREAK(Version.v1_9_R1, null),
	ENTITY_SPLASH_POTION_THROW(Version.v1_9_R1, null),
	ENTITY_SQUID_AMBIENT(Version.v1_9_R1, null),
	ENTITY_SQUID_DEATH(Version.v1_9_R1, null),
	ENTITY_SQUID_HURT(Version.v1_9_R1, null),
	ENTITY_TNT_PRIMED(Version.v1_9_R1, null, FUSE),
	ENTITY_VILLAGER_AMBIENT(Version.v1_9_R1, null, VILLAGER_IDLE),
	ENTITY_VILLAGER_DEATH(Version.v1_9_R1, null, VILLAGER_DEATH),
	ENTITY_VILLAGER_HURT(Version.v1_9_R1, null, VILLAGER_HIT),
	ENTITY_VILLAGER_NO(Version.v1_9_R1, null, VILLAGER_NO),
	ENTITY_VILLAGER_TRADING(Version.v1_9_R1, null, VILLAGER_HAGGLE),
	ENTITY_VILLAGER_YES(Version.v1_9_R1, null, VILLAGER_YES),
	ENTITY_WITCH_AMBIENT(Version.v1_9_R1, null),
	ENTITY_WITCH_DEATH(Version.v1_9_R1, null),
	ENTITY_WITCH_DRINK(Version.v1_9_R1, null),
	ENTITY_WITCH_HURT(Version.v1_9_R1, null),
	ENTITY_WITCH_THROW(Version.v1_9_R1, null),
	ENTITY_WITHER_AMBIENT(Version.v1_9_R1, null, WITHER_IDLE),
	ENTITY_WITHER_BREAK_BLOCK(Version.v1_9_R1, null),
	ENTITY_WITHER_DEATH(Version.v1_9_R1, null, WITHER_DEATH),
	ENTITY_WITHER_HURT(Version.v1_9_R1, null, WITHER_HURT),
	ENTITY_WITHER_SHOOT(Version.v1_9_R1, null, WITHER_SHOOT),
	ENTITY_WITHER_SPAWN(Version.v1_9_R1, null, WITHER_SPAWN),
	ENTITY_WOLF_AMBIENT(Version.v1_9_R1, null, WOLF_BARK),
	ENTITY_WOLF_DEATH(Version.v1_9_R1, null, WOLF_DEATH),
	ENTITY_WOLF_GROWL(Version.v1_9_R1, null, WOLF_GROWL),
	ENTITY_WOLF_HOWL(Version.v1_9_R1, null, WOLF_HOWL),
	ENTITY_WOLF_HURT(Version.v1_9_R1, null, WOLF_HURT),
	ENTITY_WOLF_PANT(Version.v1_9_R1, null, WOLF_PANT),
	ENTITY_WOLF_SHAKE(Version.v1_9_R1, null, WOLF_SHAKE),
	ENTITY_WOLF_STEP(Version.v1_9_R1, null, WOLF_WALK),
	ENTITY_WOLF_WHINE(Version.v1_9_R1, null, WOLF_WHINE),
	ENTITY_ZOMBIE_AMBIENT(Version.v1_9_R1, null, ZOMBIE_IDLE),
	ENTITY_ZOMBIE_ATTACK_DOOR_WOOD(Version.v1_9_R1, null, ZOMBIE_WOOD),
	ENTITY_ZOMBIE_ATTACK_IRON_DOOR(Version.v1_9_R1, null, ZOMBIE_METAL),
	ENTITY_ZOMBIE_BREAK_DOOR_WOOD(Version.v1_9_R1, null, ZOMBIE_WOODBREAK),
	ENTITY_ZOMBIE_DEATH(Version.v1_9_R1, null, ZOMBIE_DEATH),
	ENTITY_ZOMBIE_HORSE_AMBIENT(Version.v1_9_R1, null, HORSE_ZOMBIE_IDLE),
	ENTITY_ZOMBIE_HORSE_DEATH(Version.v1_9_R1, null, HORSE_ZOMBIE_DEATH),
	ENTITY_ZOMBIE_HORSE_HURT(Version.v1_9_R1, null, HORSE_ZOMBIE_HIT),
	ENTITY_ZOMBIE_HURT(Version.v1_9_R1, null, ZOMBIE_HURT),
	ENTITY_ZOMBIE_INFECT(Version.v1_9_R1, null, ZOMBIE_INFECT),
	ENTITY_ZOMBIE_PIG_AMBIENT(Version.v1_9_R1, null, ZOMBIE_PIG_IDLE),
	ENTITY_ZOMBIE_PIG_ANGRY(Version.v1_9_R1, null, ZOMBIE_PIG_ANGRY),
	ENTITY_ZOMBIE_PIG_DEATH(Version.v1_9_R1, null, ZOMBIE_PIG_DEATH),
	ENTITY_ZOMBIE_PIG_HURT(Version.v1_9_R1, null, ZOMBIE_PIG_HURT),
	ENTITY_ZOMBIE_STEP(Version.v1_9_R1, null, ZOMBIE_WALK),
	ENTITY_ZOMBIE_VILLAGER_AMBIENT(Version.v1_9_R1, null),
	ENTITY_ZOMBIE_VILLAGER_CONVERTED(Version.v1_9_R1, null, ZOMBIE_UNFECT),
	ENTITY_ZOMBIE_VILLAGER_CURE(Version.v1_9_R1, null, ZOMBIE_REMEDY),
	ENTITY_ZOMBIE_VILLAGER_DEATH(Version.v1_9_R1, null),
	ENTITY_ZOMBIE_VILLAGER_HURT(Version.v1_9_R1, null),
	ENTITY_ZOMBIE_VILLAGER_STEP(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_CHAIN(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_DIAMOND(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_GENERIC(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_GOLD(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_IRON(Version.v1_9_R1, null),
	ITEM_ARMOR_EQUIP_LEATHER(Version.v1_9_R1, null),
	ITEM_BOTTLE_FILL(Version.v1_9_R1, null),
	ITEM_BOTTLE_FILL_DRAGONBREATH(Version.v1_9_R1, null),
	ITEM_BUCKET_EMPTY(Version.v1_9_R1, null),
	ITEM_BUCKET_EMPTY_LAVA(Version.v1_9_R1, null),
	ITEM_BUCKET_FILL(Version.v1_9_R1, null),
	ITEM_BUCKET_FILL_LAVA(Version.v1_9_R1, null),
	ITEM_CHORUS_FRUIT_TELEPORT(Version.v1_9_R1, null),
	ITEM_ELYTRA_FLYING(Version.v1_9_R1, null),
	ITEM_FIRECHARGE_USE(Version.v1_9_R1, null),
	ITEM_FLINTANDSTEEL_USE(Version.v1_9_R1, null, FIRE_IGNITE),
	ITEM_HOE_TILL(Version.v1_9_R1, null),
	ITEM_SHIELD_BLOCK(Version.v1_9_R1, null),
	ITEM_SHIELD_BREAK(Version.v1_9_R1, null),
	ITEM_SHOVEL_FLATTEN(Version.v1_9_R1, null),
	MUSIC_CREATIVE(Version.v1_9_R1, null),
	MUSIC_CREDITS(Version.v1_9_R1, null),
	MUSIC_DRAGON(Version.v1_9_R1, null),
	MUSIC_END(Version.v1_9_R1, null),
	MUSIC_GAME(Version.v1_9_R1, null),
	MUSIC_MENU(Version.v1_9_R1, null),
	MUSIC_NETHER(Version.v1_9_R1, null),
	RECORD_11(Version.v1_9_R1, null),
	RECORD_13(Version.v1_9_R1, null),
	RECORD_BLOCKS(Version.v1_9_R1, null),
	RECORD_CAT(Version.v1_9_R1, null),
	RECORD_CHIRP(Version.v1_9_R1, null),
	RECORD_FAR(Version.v1_9_R1, null),
	RECORD_MALL(Version.v1_9_R1, null),
	RECORD_MELLOHI(Version.v1_9_R1, null),
	RECORD_STAL(Version.v1_9_R1, null),
	RECORD_STRAD(Version.v1_9_R1, null),
	RECORD_WAIT(Version.v1_9_R1, null),
	RECORD_WARD(Version.v1_9_R1, null),
	UI_BUTTON_CLICK(Version.v1_9_R1, null, CLICK),
	WEATHER_RAIN(Version.v1_9_R1, null, AMBIENCE_RAIN),
	WEATHER_RAIN_ABOVE(Version.v1_9_R1, null),

	// List of Sounds introduced in 1.10
	BLOCK_ENCHANTMENT_TABLE_USE(Version.v1_10_R1, null),
	ENTITY_HUSK_AMBIENT(Version.v1_10_R1, null),
	ENTITY_HUSK_DEATH(Version.v1_10_R1, null),
	ENTITY_HUSK_HURT(Version.v1_10_R1, null),
	ENTITY_HUSK_STEP(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_AMBIENT(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_BABY_AMBIENT(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_DEATH(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_HURT(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_STEP(Version.v1_10_R1, null),
	ENTITY_POLAR_BEAR_WARNING(Version.v1_10_R1, null),
	ENTITY_STRAY_AMBIENT(Version.v1_10_R1, null),
	ENTITY_STRAY_DEATH(Version.v1_10_R1, null),
	ENTITY_STRAY_HURT(Version.v1_10_R1, null),
	ENTITY_STRAY_STEP(Version.v1_10_R1, null),
	ENTITY_WITHER_SKELETON_AMBIENT(Version.v1_10_R1, null),
	ENTITY_WITHER_SKELETON_DEATH(Version.v1_10_R1, null),
	ENTITY_WITHER_SKELETON_HURT(Version.v1_10_R1, null),
	ENTITY_WITHER_SKELETON_STEP(Version.v1_10_R1, null);



	private Version minVersion;		// The minimum version required
	private Version maxVersion;		// The maximum version required
	private Sounds[] replace;		// The Sound replaced by this one
	private Sounds replacedBy;		// The Sound tha replace this one

	private static final Version current = Version.getVersion();		// The current minecraft version
	private static final Map<String, Sound> BY_NAME = new HashMap<>();	// Cache of sounds by name



	Sounds()
	{
		this(null, null, (Sounds[]) null);
	}

	Sounds(Version minVersion, Version maxVersion)
	{
		this(minVersion, maxVersion, (Sounds[]) null);
	}

	Sounds(Version minVersion, Version maxVersion, Sounds... replace)
	{
		this.minVersion = minVersion;
		this.maxVersion = maxVersion;
		this.replace = replace;

		// Update the replacedBy value of the replaced Sounds
		if(this.replace != null)
		{
			for(Sounds sound : this.replace)
				sound.replacedBy = this;
		}

		// Min and Max version must be define
		if(this.minVersion == null) this.minVersion = Version.v1_7_R1;
		if(this.maxVersion == null) this.maxVersion = Version.v1_10_R1;
	}

	public static Sound get(String soundName)
	{
		// First, hava a look in the cache
		if(BY_NAME.containsKey(soundName))
			return BY_NAME.get(soundName);

		// Else, try to find the appropriate sound
		try
		{
			// This sound does'nt even exist.
			Sounds found = Sounds.valueOf(soundName);

			// Found the correct sound for the current version
			if(current.inRange(found.minVersion, found.maxVersion) || current.equals(found.maxVersion) )
				return sound(soundName, Sound.valueOf(found.name()));

			//
			else if(current.newerThan(found.maxVersion))
				found = found.replacedBy;

			//
			else if(current.olderThan(found.minVersion))
				found = (found.replace != null && found.replace.length > 0 ? found.replace[0] : null);

			if(found == null) return sound(soundName, null);
			return sound(soundName, get(found.name()));
		}
		catch(IllegalArgumentException e)
		{
			return sound(soundName, null);
		}
	}

	private static Sound sound(String soundName, Sound sound)
	{
		BY_NAME.put(soundName, sound);
		return sound;
	}
}
