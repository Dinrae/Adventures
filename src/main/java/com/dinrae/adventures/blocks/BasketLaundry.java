package com.dinrae.adventures.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BasketLaundry extends Block {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public BasketLaundry(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            default -> VoxelShapes.union(createCuboidShape(1.0D, 0.0D, 1.0D, 2.0D, 5.0D, 14.0D), createCuboidShape(1.0D, 5.0D, 2.0D, 2.0D, 10.0D, 14.0D), createCuboidShape(14.0D, 0.0D, 2.0D, 15.0D, 5.0D, 15.0D), createCuboidShape(14.0D, 5.0D, 2.0D, 15.0D, 10.0D, 15.0D), createCuboidShape(1.0D, 0.0D, 14.0D, 15.0D, 5.0D, 15.0D), createCuboidShape(1.0D, 5.0D, 14.0D, 14.0D, 10.0D, 15.0D), createCuboidShape(2.0D, 0.0D, 1.0D, 15.0D, 5.0D, 2.0D), createCuboidShape(2.0D, 5.0D, 1.0D, 15.0D, 10.0D, 2.0D), createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D));
        };
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }
}