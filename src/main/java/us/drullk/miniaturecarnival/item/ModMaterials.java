package us.drullk.miniaturecarnival.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import us.drullk.miniaturecarnival.MiniatureCarnival;

/**
 * Created by Drullkus on 9/27/16.
 */
public class ModMaterials {
    public static ItemArmor.ArmorMaterial armorBearSkin;

    public static void registerMaterials()
    {
        armorBearSkin = EnumHelper.addArmorMaterial("BEARSKIN", MiniatureCarnival.MOD_ID + ":" + "bearskin",
                10, new int[]{1, 2, 3, 1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F);
    }
}
