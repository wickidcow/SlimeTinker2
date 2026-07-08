package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Ids} 
 */
public class IdMap {

 private IdMap() {
 throw new IllegalStateException("Utility class");
 }

 private static final Map<String, String> idMap = new HashMap<>();

 static {
 // Vanilla + Core Sf
 idMap.put(Ids.IRON, "Iron");
 idMap.put(Ids.GOLD, "Gold");
 idMap.put(Ids.COPPER, "Copper");
 idMap.put(Ids.SILVER, "Silver");
 idMap.put(Ids.TIN, "Tin");
 idMap.put(Ids.MAGNESIUM, "Magnesium");
 idMap.put(Ids.ALUMINUM, "Aluminum");
 idMap.put(Ids.LEAD, "Lead");
 idMap.put(Ids.ZINC, "Zinc");
 idMap.put(Ids.COAL, "Coal");
 idMap.put(Ids.STEEL, "Steel");
 idMap.put(Ids.DAMASCUS_STEEL, "Damascus Steel");
 idMap.put(Ids.DURALUMIN, "Duralumin");
 idMap.put(Ids.BRONZE, "Bronze");
 idMap.put(Ids.ALUMINUM_BRONZE, "Aluminum Bronze");
 idMap.put(Ids.HARDENED_METAL, "Hardened Metal");
 idMap.put(Ids.CORINTHIAN_BRONZE, "Corinthian Bronze");
 idMap.put(Ids.SOLDER, "Solder");
 idMap.put(Ids.BILLON, "Billon");
 idMap.put(Ids.BRASS, "Brass");
 idMap.put(Ids.ALUMINUM_BRASS, "Aluminum Brass");
 idMap.put(Ids.NICKEL, "Nickel");
 idMap.put(Ids.COBALT, "Cobalt");
 idMap.put(Ids.REINFORCED_ALLOY, "Reinforced Alloy");
 idMap.put(Ids.STRING, "String");
 idMap.put(Ids.VINE, "Vine");
 idMap.put(Ids.CRIMSON_ROOTS, "Crimson Roots");
 idMap.put(Ids.WARPED_ROOTS, "Warped Roots");
 idMap.put(Ids.WEEPING_VINES, "Weeping Vines");
 idMap.put(Ids.TWISTING_VINES, "Twisting Vines");
 idMap.put(Ids.SLIME, "Slime");
 idMap.put(Ids.LEATHER, "Leather");
 idMap.put(Ids.DIAMOND, "Diamond");
 idMap.put(Ids.REDSTONE, "Redstone");
 idMap.put(Ids.REDSTONE_ALLOY, "Redstone Alloy");
 idMap.put(Ids.SILICON, "Silicon");
 idMap.put(Ids.FERROSILICON, "Ferrosilicon");
 idMap.put(Ids.BOOMERITE, "Boomerite");
 idMap.put(Ids.SEFIRITE, "Sefirite");
 idMap.put(Ids.LIQUID_CHRISTMAS, "Christmas Present");
 idMap.put(Ids.CRINGLEIUM, "Cringleium");
 idMap.put(Ids.FLOWING_FONDNESS, "FondnessLove");
 idMap.put(Ids.DETAILED_DEVOTION, "DevotionLove");
 idMap.put(Ids.PURIFIED_PASSION, "Passion");
 idMap.put(Ids.LIQUID_LOVE, "Love");
 idMap.put(Ids.NICEINIUM, "Nice");
 idMap.put(Ids.DRACONIC, "");
 idMap.put(Ids.REINFORCED_DRACONIUM, "Reinforced Draconium");

 // Mods
 idMap.put("QUARTZ", "Quartz");
 idMap.put("LAPIS_LAZULI", "Lapis Lazuli");
 idMap.put("MOD_PLATE", "Reinforced AlloyPlate");
 idMap.put("EMERALD", "Emerald");

 // Infinity Expansion (SlimefunGuguProject)
 idMap.put(Ids.VOID, "Void");
 idMap.put(Ids.INFINITY, "Infinity");
 idMap.put(Ids.FORTUNE_SINGULARITY, "Fortune Singularity");
 idMap.put(Ids.MAGIC_SINGULARITY, "Magic Singularity");
 idMap.put(Ids.EARTH_SINGULARITY, "Earth Singularity");
 idMap.put(Ids.METAL_SINGULARITY, "Metal Singularity");
 idMap.put(Ids.MAGSTEEL, "Magsteel");
 idMap.put(Ids.TITANIUM, "Titanium");
 idMap.put(Ids.MYTHRIL, "Mythril");
 idMap.put(Ids.ADAMANTITE, "Adamantite");
 idMap.put(Ids.MAGNONIUM, "Magnonium");
 idMap.put(Ids.COPPER_SINGULARITY, "Copper Singularity");
 idMap.put(Ids.ZINC_SINGULARITY, "Zinc Singularity");
 idMap.put(Ids.TIN_SINGULARITY, "Tin Singularity");
 idMap.put(Ids.ALUMINUM_SINGULARITY, "Aluminum Singularity");
 idMap.put(Ids.SILVER_SINGULARITY, "Silver Singularity");
 idMap.put(Ids.MAGNESIUM_SINGULARITY, "Magnesium Singularity");
 idMap.put(Ids.LEAD_SINGULARITY, "Lead Singularity");
 idMap.put(Ids.GOLD_SINGULARITY, "Gold Singularity");
 idMap.put(Ids.IRON_SINGULARITY, "Iron Singularity");
 idMap.put(Ids.DIAMOND_SINGULARITY, "Diamond Singularity");
 idMap.put(Ids.INFINITY_SINGULARITY, "Infinity Singularity");

 // Slimefun Warfare
 idMap.put(Ids.SLIMESTEEL, "Slimesteel");
 idMap.put(Ids.REINFORCED_SLIMESTEEL, "Reinforced Slimesteel");
 idMap.put(Ids.OSMIUM_SUPERALLOY, "Osmium Superalloy");
 idMap.put(Ids.OSMIUM, "Osmium");
 idMap.put(Ids.SEGGANESSON, "");
 idMap.put(Ids.UNPATENTABLIUM, "Unpatentablium");

 // DynaTech
 idMap.put(Ids.STAINLESS_STEEL, "Stainless Steel");
 idMap.put(Ids.VEX_GEM, "Vex Gem");
 idMap.put(Ids.STARDUST, "Stardust");
 idMap.put(Ids.GHOSTLY_ESSENCE, "Ghostly Essence");
 idMap.put(Ids.TESSERACT, "Tesseracting Material");

 // LiteXpansion
 idMap.put(Ids.RUBBER, "Rubber");
 idMap.put(Ids.REFINED_IRON, "Refined Iron");
 idMap.put(Ids.MIXED_METAL, "Alloy");
 idMap.put(Ids.ADVANCED_ALLOY, "Advanced Alloy");
 idMap.put(Ids.THORIUM, "Thorium");
 idMap.put(Ids.MAG_THOR, "Mag-Thor");
 idMap.put(Ids.CARBON_MESH, "Carbon Mesh");
 idMap.put(Ids.SCRAP, "Scrap");
 idMap.put(Ids.IRIDIUM, "Iridium");

 // TranscEndence
 idMap.put(Ids.DAXI_STRENGTH, "Daxi Core(S)");
 idMap.put(Ids.DAXI_ABSORPTION, "Daxi Core(A)");
 idMap.put(Ids.DAXI_FORTITUDE, "Daxi Core(F)");
 idMap.put(Ids.DAXI_SATURATION, "Daxi Core(H)");
 idMap.put(Ids.DAXI_REGENERATION, "Daxi Core(R)");

 // Networks
 idMap.put(Ids.MOLTEN_PRESENCE, "Molten Presence");
 idMap.put(Ids.REMOTININIUM, "Ancient Remote Access");
 idMap.put(Ids.ULTIMANINIUM, "Ultimate Remote Access");
 }

 public static Map<String, String> getMap() {
 return idMap;
 }
}
