package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;

public final class LangUtils {

 private LangUtils() {
 throw new IllegalStateException("Utility class");
 }

 public static String getMaterialName(String type) {
 String result = IdMap.getMap().get(type.toUpperCase());
 return result != null ? result : ThemeUtils.toTitleCase(type);
 }

 public static String getToolName(String type){
 switch (type.toUpperCase()) {
 case Ids.PICKAXE:
 return "Pickaxe";
 case Ids.SHOVEL:
 return "Shovel";
 case Ids.AXE:
 return "Axe";
 case Ids.SWORD:
 return "Sword";
 case Ids.HOE:
 return "Hoe";
 default:
 return ThemeUtils.toTitleCase(type);
 }
 }

 public static String getToolHead(String type){
 switch (type.toUpperCase()) {
 case Ids.PICKAXE:
 return "PickaxeHead";
 case Ids.SHOVEL:
 return "ShovelHead";
 case Ids.AXE:
 return "AxeBlade";
 case Ids.SWORD:
 return "SwordBlade";
 case Ids.HOE:
 return "HoeHead";
 default:
 return ThemeUtils.toTitleCase(type);
 }
 }

 public static String getArmorPart(String part) {
 switch (part.toUpperCase()) {
 case Ids.HELMET:
 return "Helmet";
 case Ids.CHESTPLATE:
 return "Chestplate";
 case Ids.LEGGINGS:
 return "Leggings";
 case Ids.BOOTS:
 return "Boots";
 default:
 return ThemeUtils.toTitleCase(part);
 }
 }

 public static String getToolOrArmorName(String type){
 String toolName = getToolName(type);
 return toolName.equals(ThemeUtils.toTitleCase(type)) ? getArmorPart(type) : toolName;
 }
}
