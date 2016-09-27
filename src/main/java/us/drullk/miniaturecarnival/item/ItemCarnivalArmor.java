package us.drullk.miniaturecarnival.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import javax.annotation.Nonnull;

/**
 * Created by Drullkus on 9/27/16.
 */
public class ItemCarnivalArmor extends ItemArmor {
    public ItemCarnivalArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
    }

    @Nonnull
    @Override
    public ItemCarnivalArmor setUnlocalizedName(String unlocalizedName) {
        super.setUnlocalizedName(unlocalizedName);
        return this;
    }

    /*@SideOnly(Side.CLIENT) TODO Look into json for modelling armor
    @Nonnull
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel)
    {
        return super.getArmorModel(entityLiving, itemStack, armorSlot, defaultModel);
    }//*/

    /*@Override
    public boolean hasColor(ItemStack stack) {
        if(this.getArmorMaterial() == ModMaterials.armorBearSkin) {
            NBTTagCompound nbttagcompound = stack.getTagCompound();
            return (nbttagcompound != null && nbttagcompound.hasKey("display", 10)) && nbttagcompound.getCompoundTag("display").hasKey("color", 3);
        } else {
            return super.hasColor(stack);
        }
    }

    @Override
    public int getColor(ItemStack stack) {
        if(this.getArmorMaterial() != ModMaterials.armorBearSkin) {
            return super.getColor(stack);
        } else {
            NBTTagCompound nbttagcompound = stack.getTagCompound();
            if(nbttagcompound != null) {
                NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
                if(nbttagcompound1 != null && nbttagcompound1.hasKey("color", 3)) {
                    return nbttagcompound1.getInteger("color");
                }
            }

            return 10511680;
        }
    }

    @Override
    public void removeColor(ItemStack stack) {
        if(this.getArmorMaterial() == ModMaterials.armorBearSkin) {
            NBTTagCompound nbttagcompound = stack.getTagCompound();
            if(nbttagcompound != null) {
                NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
                if(nbttagcompound1.hasKey("color")) {
                    nbttagcompound1.removeTag("color");
                }
            }
        }
    }

    @Override
    public void setColor(ItemStack stack, int color) {
        if(this.getArmorMaterial() != ModMaterials.armorBearSkin) {
            super.setColor(stack, color);
        } else {
            NBTTagCompound nbttagcompound = stack.getTagCompound();
            if(nbttagcompound == null) {
                nbttagcompound = new NBTTagCompound();
                stack.setTagCompound(nbttagcompound);
            }

            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if(!nbttagcompound.hasKey("display", 10)) {
                nbttagcompound.setTag("display", nbttagcompound1);
            }

            nbttagcompound1.setInteger("color", color);
        }
    }//*/


}
