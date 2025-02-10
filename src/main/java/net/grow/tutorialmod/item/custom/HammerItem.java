package net.grow.tutorialmod.item.custom;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends MiningToolItem {
    public HammerItem(ToolMaterial material, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
    }
    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);

        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;
            Direction side = blockHit.getSide();

            // Modificado para considerar profundidad
            if (side == Direction.DOWN || side == Direction.UP) {
                // Romper un cubo 5x5x5 en profundidad
                for (int x = -range; x <= range; x++) {
                    for (int z = -range; z <= range; z++) {
                        for (int y = -range; y <= range; y++) {  // Agregado para profundidad
                            positions.add(initialBlockPos.add(x, y, z));
                        }
                    }
                }
            } else if (side == Direction.NORTH || side == Direction.SOUTH) {
                // Romper un cubo 5x5x5 en dirección norte-sur
                for (int x = -range; x <= range; x++) {
                    for (int y = -range; y <= range; y++) {
                        for (int z = -range; z <= range; z++) {  // Agregado para profundidad
                            positions.add(initialBlockPos.add(x, y, z));
                        }
                    }
                }
            } else if (side == Direction.EAST || side == Direction.WEST) {
                // Romper un cubo 5x5x5 en dirección este-oeste
                for (int x = -range; x <= range; x++) {
                    for (int y = -range; y <= range; y++) {
                        for (int z = -range; z <= range; z++) {  // Agregado para profundidad
                            positions.add(initialBlockPos.add(x, y, z));
                        }
                    }
                }
            }
        }
        return positions;
    }
}