package net.disjoint.paperlanterns;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import static net.minecraft.util.math.Direction.UP;

public class HangingLanternBlock extends LanternBlock {

    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 16, 13);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = UP;
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP && !this.canPlaceAt(state, world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }
    public HangingLanternBlock() {
        super(AbstractBlock.Settings.copy(Blocks.LANTERN));
    }
}