package net.minecraft.src;

public class BlockAelythPortalStarter extends Block 
{

	public BlockAelythPortalStarter(int i, int j, Material material) 
	{
		super(i, j, material);
	}

	/*public void onBlockAdded(World world, int i, int j, int k){
		if(world.getBlockId(i, j - 1, k) == Block.dirt.blockID && mod_Aelyth.AelythPortal.tryToCreatePortal(world, i, j, k))
		{
			return;
		}else {
			world.setBlockWithNotify(i, j, k, 0);
		}
	}*/

}