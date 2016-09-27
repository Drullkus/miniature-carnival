package us.drullk.miniaturecarnival.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.drullk.miniaturecarnival.MiniatureCarnival;

/**
 * Created by Drullkus on 9/26/16.
 */
public class ModItems {
    public static ItemBegone begone;
    public static Item bearHide;
    public static ItemCarnivalArmor bearHelmet, bearChestplate, bearLeggings, bearBoots;

    public static void preInit() {
        ModMaterials.registerMaterials();

        begone = new ItemBegone();
        bearHide = new Item().setUnlocalizedName("bear_hide");

        bearHelmet = new ItemCarnivalArmor(ModMaterials.armorBearSkin, 3, EntityEquipmentSlot.HEAD).setUnlocalizedName("bear_helmet");
        bearChestplate = new ItemCarnivalArmor(ModMaterials.armorBearSkin, 3, EntityEquipmentSlot.CHEST).setUnlocalizedName("bear_chestplate");
        bearLeggings = new ItemCarnivalArmor(ModMaterials.armorBearSkin, 3, EntityEquipmentSlot.LEGS).setUnlocalizedName("bear_leggings");
        bearBoots = new ItemCarnivalArmor(ModMaterials.armorBearSkin, 3, EntityEquipmentSlot.FEET).setUnlocalizedName("bear_boots");

        begone.setRegistryName(MiniatureCarnival.MOD_ID + ":" + begone.getUnlocalizedName());
        bearHide.setRegistryName(MiniatureCarnival.MOD_ID + ":" + bearHide.getUnlocalizedName());

        bearHelmet.setRegistryName(MiniatureCarnival.MOD_ID + ":" + bearHelmet.getUnlocalizedName());
        bearChestplate.setRegistryName(MiniatureCarnival.MOD_ID + ":" + bearChestplate.getUnlocalizedName());
        bearLeggings.setRegistryName(MiniatureCarnival.MOD_ID + ":" + bearLeggings.getUnlocalizedName());
        bearBoots.setRegistryName(MiniatureCarnival.MOD_ID + ":" + bearBoots.getUnlocalizedName());

        GameRegistry.register(begone);
        GameRegistry.register(bearHide);

        GameRegistry.register(bearHelmet);
        GameRegistry.register(bearChestplate);
        GameRegistry.register(bearLeggings);
        GameRegistry.register(bearBoots);
    }

    public static void init() {

    }

    public static void postInit() {

    }
}
