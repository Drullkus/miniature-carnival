package us.drullk.miniaturecarnival.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by Drullkus on 9/27/16.
 */
public class ItemBegone extends Item {

    public ItemBegone()
    {
        super();
        this.setUnlocalizedName("begone");
    }

    private void brutalizeEntity(Entity target)
    {
        if(target instanceof EntityLivingBase)
        {
            if(target instanceof EntityWither)
            {
                ((EntityWither) target).setInvulTime(0);
            }

            target.attackEntityFrom(DamageSource.generic, ((EntityLivingBase)target).getHealth() * 4f + 10f);
            ((EntityLivingBase) target).setHealth(0f);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        if(attacker.worldObj.isRemote)
        {
            return true;
        }

        brutalizeEntity(target);

        return true;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity target)
    {
        if(target instanceof EntityLiving && !player.worldObj.isRemote)
        {
            brutalizeEntity(target);

            return true;
        }

        return false;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("You won't be seeing them again.");
    }
}
