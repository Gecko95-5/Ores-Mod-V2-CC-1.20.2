package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_FROSITE_ORE);
        BlockStateModelGenerator.BlockTexturePool frostPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROSITE_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FROSITE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_WHITE_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothwhitesandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_WHITE_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool whitesandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_SANDSTONE_TEXTURE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_BLACK_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothblacksandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BLACK_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool blacksandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_SANDSTONE_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool frostbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROSITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool frosttilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_FROSITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALUMINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NICKEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVA_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCULK_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_LAPIS_ORE);
        BlockStateModelGenerator.BlockTexturePool watertankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WATER_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MILK_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_RESISTANCE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEALING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REGENERATION_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRENGTH_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SWIFTNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGHT_VISION_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INVISIBILITY_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WATER_BREATHING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAPING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLOW_FALLING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POISON_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEAKNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARMING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLOWNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTBITE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEAT_STROKE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FATAL_POISON_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_SICKNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TURTLE_MASTER_POTION_TANK);
        BlockStateModelGenerator.BlockTexturePool smoothsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_STEEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ALLOY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUSPICIOUS_WHITE_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERRACOTTA_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAVEL_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FAKE_BEDROCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BEDROCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLINT_BLOCK);
        BlockStateModelGenerator.BlockTexturePool polibedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BEDROCK);
        BlockStateModelGenerator.BlockTexturePool brickbedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BEDROCK_BRICKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_POLISHED_BEDROCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sanditebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool sanditetilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_SANDITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_SANDITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_SANDITE_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_SANDITE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_FROSITE_ORE);
        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        BlockStateModelGenerator.BlockTexturePool marblebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_SCALES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FOSSILIZED_SILVER_SCALES);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_MARBLE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SILVER_SCALE_CORE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SILVER_SCALE_FACE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.FOSSILIZED_SILVER_SCALE_CORE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.FOSSILIZED_SILVER_SCALE_FACE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool andesitebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dioritebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lrustedsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lrustedcutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHTY_RUSTED_CUT_STEEL);
        BlockStateModelGenerator.BlockTexturePool rustedsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUSTED_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool rustedcutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUSTED_CUT_STEEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUSTED_STEEL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAFITE_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_LEAFITE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.REINFORCED_FROSITE_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.DARK_REINFORCED_FROSITE_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool leafitebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LEAFITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool leafitetilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_LEAFITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_CLUSTER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_STONE);
        BlockStateModelGenerator.BlockTexturePool voidbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_ITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_ITE_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_END_ITE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool enditebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_ITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool enditetilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_END_ITE);
        BlockStateModelGenerator.BlockTexturePool lightfrostPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_FROSITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool darkfrostPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_FROSITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_SANDITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_SANDITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_LEAFITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_LEAFITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_END_ITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_END_ITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lightfrostbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_FROSITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightfrosttilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_CUT_FROSITE);
        BlockStateModelGenerator.BlockTexturePool darkenfrostbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_FROSITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkenfrosttilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_CUT_FROSITE);
        BlockStateModelGenerator.BlockTexturePool lightsandbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_SANDITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightsandtilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_CUT_SANDITE);
        BlockStateModelGenerator.BlockTexturePool darkensandbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_SANDITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkensandtilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_CUT_SANDITE);
        BlockStateModelGenerator.BlockTexturePool lightleafbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_LEAFITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightleaftilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_CUT_LEAFITE);
        BlockStateModelGenerator.BlockTexturePool darkenleafbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_LEAFITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkenleaftilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_CUT_LEAFITE);
        BlockStateModelGenerator.BlockTexturePool lightendbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_END_ITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightendtilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_CUT_END_ITE);
        BlockStateModelGenerator.BlockTexturePool darkenendbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_END_ITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkenendtilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_CUT_END_ITE);
        BlockStateModelGenerator.BlockTexturePool icebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICE_BRICKS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.ICE_PILLAR, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool stonemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool deepmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool prismasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackstonemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool nethermasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool rnethermasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_NETHER_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mudmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MUD_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool marblemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool andesitemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dioritemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DIORITE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitemasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRANITE_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool bedrockmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool voidmasonryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_STONE_MASONRY_BRICKS);

        BlockStateModelGenerator.BlockTexturePool uniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool muduniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MUD_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool netheruniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool rnetheruniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_NETHER_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool prisuniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool enduniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzuniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_UNIFORM_BRICKS);
        BlockStateModelGenerator.BlockTexturePool voiduniformPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_STONE_UNIFORM_BRICKS);

        blockStateModelGenerator.registerLog(ModBlocks.STONEBARK_LOG).log(ModBlocks.STONEBARK_LOG).wood(ModBlocks.STONEBARK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_STONEBARK_LOG).log(ModBlocks.STRIPPED_STONEBARK_LOG).wood(ModBlocks.STRIPPED_STONEBARK_WOOD);
        BlockStateModelGenerator.BlockTexturePool stonebarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONEBARK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONEBARK_LEAVES);

        blockStateModelGenerator.registerLog(ModBlocks.DEEPSLATE_LOG).log(ModBlocks.DEEPSLATE_LOG).wood(ModBlocks.DEEPSLATE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DEEPSLATE_LOG).log(ModBlocks.STRIPPED_DEEPSLATE_LOG).wood(ModBlocks.STRIPPED_DEEPSLATE_WOOD);
        BlockStateModelGenerator.BlockTexturePool deepbarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAVES);

        blockStateModelGenerator.registerLog(ModBlocks.LEAFITE_LOG).log(ModBlocks.LEAFITE_LOG).wood(ModBlocks.LEAFITE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_LEAFITE_LOG).log(ModBlocks.STRIPPED_LEAFITE_LOG).wood(ModBlocks.STRIPPED_LEAFITE_WOOD);
        BlockStateModelGenerator.BlockTexturePool leafiteplankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LEAFITE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAFITE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAFITE_LEAVES_ORE);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STONEBARK_SAPLING, ModBlocks.POTTED_STONEBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DEEPBARK_SAPLING, ModBlocks.POTTED_DEEPBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LEAFITE_SAPLING, ModBlocks.POTTED_LEAFITE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ICY_CROCUS, ModBlocks.POTTED_ICY_CROCUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SILVER_ROSE, ModBlocks.POTTED_SILVER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ALPINE_SPEEDWELL, ModBlocks.POTTED_ALPINE_SPEEDWELL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SUBALPINE_DAISY, ModBlocks.POTTED_SUBALPINE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCross(ModBlocks.SILVER_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        frostbrickPool.stairs(ModBlocks.FROSITE_BRICK_STAIRS);
        frostbrickPool.slab(ModBlocks.FROSITE_BRICK_SLAB);
        frostbrickPool.wall(ModBlocks.FROSITE_BRICK_WALL);

        frosttilePool.stairs(ModBlocks.CUT_FROSITE_STAIRS);
        frosttilePool.slab(ModBlocks.CUT_FROSITE_SLAB);
        frosttilePool.wall(ModBlocks.CUT_FROSITE_WALL);

        frostPool.button(ModBlocks.FROSITE_BUTTON);
        frostPool.pressurePlate(ModBlocks.FROSITE_PRESSURE_PLATE);

        polibedrockPool.stairs(ModBlocks.POLISHED_BEDROCK_STAIRS);
        polibedrockPool.slab(ModBlocks.POLISHED_BEDROCK_SLAB);
        polibedrockPool.wall(ModBlocks.POLISHED_BEDROCK_WALL);

        brickbedrockPool.stairs(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS);
        brickbedrockPool.slab(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB);
        brickbedrockPool.wall(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL);

        voidbrickPool.stairs(ModBlocks.VOID_STONE_BRICK_STAIRS);
        voidbrickPool.slab(ModBlocks.VOID_STONE_BRICK_SLAB);
        voidbrickPool.wall(ModBlocks.VOID_STONE_BRICK_WALL);

        smoothsteelPool.slab(ModBlocks.SMOOTH_STEEL_SLAB);

        cutsteelPool.stairs(ModBlocks.CUT_STEEL_STAIRS);
        cutsteelPool.slab(ModBlocks.CUT_STEEL_SLAB);

        lrustedsteelPool.slab(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB);

        lrustedcutsteelPool.stairs(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS);
        lrustedcutsteelPool.slab(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB);

        rustedsteelPool.slab(ModBlocks.RUSTED_STEEL_SLAB);

        rustedcutsteelPool.stairs(ModBlocks.RUSTED_CUT_STEEL_STAIRS);
        rustedcutsteelPool.slab(ModBlocks.RUSTED_CUT_STEEL_SLAB);

        sanditebrickPool.stairs(ModBlocks.SANDITE_BRICK_STAIRS);
        sanditebrickPool.slab(ModBlocks.SANDITE_BRICK_SLAB);
        sanditebrickPool.wall(ModBlocks.SANDITE_BRICK_WALL);

        sanditetilePool.stairs(ModBlocks.CUT_SANDITE_STAIRS);
        sanditetilePool.slab(ModBlocks.CUT_SANDITE_SLAB);
        sanditetilePool.wall(ModBlocks.CUT_SANDITE_WALL);

        watertankPool.same(ModBlocks.AWKWARD_WATER_TANK);

        stonebarkPool.stairs(ModBlocks.STONEBARK_STAIRS);
        stonebarkPool.slab(ModBlocks.STONEBARK_SLAB);
        stonebarkPool.fence(ModBlocks.STONEBARK_FENCE);
        stonebarkPool.fenceGate(ModBlocks.STONEBARK_FENCE_GATE);
        stonebarkPool.button(ModBlocks.STONEBARK_BUTTON);
        stonebarkPool.pressurePlate(ModBlocks.STONEBARK_PRESSURE_PLATE);
        stonebarkPool.family(ModBlocks.STONEBARK_FAMILY);

        deepbarkPool.stairs(ModBlocks.DEEPBARK_STAIRS);
        deepbarkPool.slab(ModBlocks.DEEPBARK_SLAB);
        deepbarkPool.fence(ModBlocks.DEEPBARK_FENCE);
        deepbarkPool.fenceGate(ModBlocks.DEEPBARK_FENCE_GATE);
        deepbarkPool.button(ModBlocks.DEEPBARK_BUTTON);
        deepbarkPool.pressurePlate(ModBlocks.DEEPBARK_PRESSURE_PLATE);
        deepbarkPool.family(ModBlocks.DEEPBARK_FAMILY);

        leafiteplankPool.stairs(ModBlocks.LEAFITE_PLANKS_STAIRS);
        leafiteplankPool.slab(ModBlocks.LEAFITE_PLANKS_SLAB);
        leafiteplankPool.fence(ModBlocks.LEAFITE_PLANKS_FENCE);
        leafiteplankPool.fenceGate(ModBlocks.LEAFITE_PLANKS_FENCE_GATE);
        leafiteplankPool.button(ModBlocks.LEAFITE_PLANKS_BUTTON);
        leafiteplankPool.pressurePlate(ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE);
        leafiteplankPool.family(ModBlocks.LEAFITE_FAMILY);

        leafitebrickPool.stairs(ModBlocks.LEAFITE_BRICK_STAIRS);
        leafitebrickPool.slab(ModBlocks.LEAFITE_BRICK_SLAB);
        leafitebrickPool.wall(ModBlocks.LEAFITE_BRICK_WALL);

        leafitetilePool.stairs(ModBlocks.CUT_LEAFITE_STAIRS);
        leafitetilePool.slab(ModBlocks.CUT_LEAFITE_SLAB);
        leafitetilePool.wall(ModBlocks.CUT_LEAFITE_WALL);

        enditebrickPool.stairs(ModBlocks.END_ITE_BRICK_STAIRS);
        enditebrickPool.slab(ModBlocks.END_ITE_BRICK_SLAB);
        enditebrickPool.wall(ModBlocks.END_ITE_BRICK_WALL);

        enditetilePool.stairs(ModBlocks.CUT_END_ITE_STAIRS);
        enditetilePool.slab(ModBlocks.CUT_END_ITE_SLAB);
        enditetilePool.wall(ModBlocks.CUT_END_ITE_WALL);

        smoothwhitesandstonePool.stairs(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
        smoothwhitesandstonePool.slab(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB);
        whitesandstonePool.wall(ModBlocks.WHITE_SANDSTONE_WALL);

        blacksandstonePool.wall(ModBlocks.BLACK_SANDSTONE_WALL);
        smoothblacksandstonePool.stairs(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
        smoothblacksandstonePool.slab(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB);

        marblePool.stairs(ModBlocks.MARBLE_STAIRS);
        marblePool.slab(ModBlocks.MARBLE_SLAB);
        marblePool.wall(ModBlocks.MARBLE_WALL);

        marblebrickPool.stairs(ModBlocks.MARBLE_BRICK_STAIRS);
        marblebrickPool.slab(ModBlocks.MARBLE_BRICK_SLAB);
        marblebrickPool.wall(ModBlocks.MARBLE_BRICK_WALL);

        andesitebrickPool.stairs(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        andesitebrickPool.slab(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        andesitebrickPool.wall(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);

        dioritebrickPool.stairs(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        dioritebrickPool.slab(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
        dioritebrickPool.wall(ModBlocks.POLISHED_DIORITE_BRICK_WALL);

        granitebrickPool.stairs(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        granitebrickPool.slab(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
        granitebrickPool.wall(ModBlocks.POLISHED_GRANITE_BRICK_WALL);

        lightfrostbrickPool.stairs(ModBlocks.LIGHT_FROSITE_BRICK_STAIRS);
        lightfrostbrickPool.slab(ModBlocks.LIGHT_FROSITE_BRICK_SLAB);
        lightfrostbrickPool.wall(ModBlocks.LIGHT_FROSITE_BRICK_WALL);

        lightfrosttilePool.stairs(ModBlocks.LIGHT_CUT_FROSITE_STAIRS);
        lightfrosttilePool.slab(ModBlocks.LIGHT_CUT_FROSITE_SLAB);
        lightfrosttilePool.wall(ModBlocks.LIGHT_CUT_FROSITE_WALL);

        lightfrostPool.button(ModBlocks.LIGHT_FROSITE_BUTTON);
        lightfrostPool.pressurePlate(ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE);

        darkenfrostbrickPool.stairs(ModBlocks.DARK_FROSITE_BRICK_STAIRS);
        darkenfrostbrickPool.slab(ModBlocks.DARK_FROSITE_BRICK_SLAB);
        darkenfrostbrickPool.wall(ModBlocks.DARK_FROSITE_BRICK_WALL);

        darkenfrosttilePool.stairs(ModBlocks.DARK_CUT_FROSITE_STAIRS);
        darkenfrosttilePool.slab(ModBlocks.DARK_CUT_FROSITE_SLAB);
        darkenfrosttilePool.wall(ModBlocks.DARK_CUT_FROSITE_WALL);

        darkfrostPool.button(ModBlocks.DARK_FROSITE_BUTTON);
        darkfrostPool.pressurePlate(ModBlocks.DARK_FROSITE_PRESSURE_PLATE);

        lightsandbrickPool.stairs(ModBlocks.LIGHT_SANDITE_BRICK_STAIRS);
        lightsandbrickPool.slab(ModBlocks.LIGHT_SANDITE_BRICK_SLAB);
        lightsandbrickPool.wall(ModBlocks.LIGHT_SANDITE_BRICK_WALL);

        lightsandtilePool.stairs(ModBlocks.LIGHT_CUT_SANDITE_STAIRS);
        lightsandtilePool.slab(ModBlocks.LIGHT_CUT_SANDITE_SLAB);
        lightsandtilePool.wall(ModBlocks.LIGHT_CUT_SANDITE_WALL);

        darkensandbrickPool.stairs(ModBlocks.DARK_SANDITE_BRICK_STAIRS);
        darkensandbrickPool.slab(ModBlocks.DARK_SANDITE_BRICK_SLAB);
        darkensandbrickPool.wall(ModBlocks.DARK_SANDITE_BRICK_WALL);

        darkensandtilePool.stairs(ModBlocks.DARK_CUT_SANDITE_STAIRS);
        darkensandtilePool.slab(ModBlocks.DARK_CUT_SANDITE_SLAB);
        darkensandtilePool.wall(ModBlocks.DARK_CUT_SANDITE_WALL);

        lightleafbrickPool.stairs(ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS);
        lightleafbrickPool.slab(ModBlocks.LIGHT_LEAFITE_BRICK_SLAB);
        lightleafbrickPool.wall(ModBlocks.LIGHT_LEAFITE_BRICK_WALL);

        lightleaftilePool.stairs(ModBlocks.LIGHT_CUT_LEAFITE_STAIRS);
        lightleaftilePool.slab(ModBlocks.LIGHT_CUT_LEAFITE_SLAB);
        lightleaftilePool.wall(ModBlocks.LIGHT_CUT_LEAFITE_WALL);

        darkenleafbrickPool.stairs(ModBlocks.DARK_LEAFITE_BRICK_STAIRS);
        darkenleafbrickPool.slab(ModBlocks.DARK_LEAFITE_BRICK_SLAB);
        darkenleafbrickPool.wall(ModBlocks.DARK_LEAFITE_BRICK_WALL);

        darkenleaftilePool.stairs(ModBlocks.DARK_CUT_LEAFITE_STAIRS);
        darkenleaftilePool.slab(ModBlocks.DARK_CUT_LEAFITE_SLAB);
        darkenleaftilePool.wall(ModBlocks.DARK_CUT_LEAFITE_WALL);

        lightendbrickPool.stairs(ModBlocks.LIGHT_END_ITE_BRICK_STAIRS);
        lightendbrickPool.slab(ModBlocks.LIGHT_END_ITE_BRICK_SLAB);
        lightendbrickPool.wall(ModBlocks.LIGHT_END_ITE_BRICK_WALL);

        lightendtilePool.stairs(ModBlocks.LIGHT_CUT_END_ITE_STAIRS);
        lightendtilePool.slab(ModBlocks.LIGHT_CUT_END_ITE_SLAB);
        lightendtilePool.wall(ModBlocks.LIGHT_CUT_END_ITE_WALL);

        darkenendbrickPool.stairs(ModBlocks.DARK_END_ITE_BRICK_STAIRS);
        darkenendbrickPool.slab(ModBlocks.DARK_END_ITE_BRICK_SLAB);
        darkenendbrickPool.wall(ModBlocks.DARK_END_ITE_BRICK_WALL);

        darkenendtilePool.stairs(ModBlocks.DARK_CUT_END_ITE_STAIRS);
        darkenendtilePool.slab(ModBlocks.DARK_CUT_END_ITE_SLAB);
        darkenendtilePool.wall(ModBlocks.DARK_CUT_END_ITE_WALL);

        icebrickPool.stairs(ModBlocks.ICE_BRICK_STAIRS);
        icebrickPool.slab(ModBlocks.ICE_BRICK_SLAB);
        icebrickPool.wall(ModBlocks.ICE_BRICK_WALL);

        stonemasonryPool.stairs(ModBlocks.STONE_MASONRY_BRICK_STAIRS);
        stonemasonryPool.slab(ModBlocks.STONE_MASONRY_BRICK_SLAB);
        stonemasonryPool.wall(ModBlocks.STONE_MASONRY_BRICK_WALL);

        endmasonryPool.stairs(ModBlocks.END_STONE_MASONRY_BRICK_STAIRS);
        endmasonryPool.slab(ModBlocks.END_STONE_MASONRY_BRICK_SLAB);
        endmasonryPool.wall(ModBlocks.END_STONE_MASONRY_BRICK_WALL);

        nethermasonryPool.stairs(ModBlocks.NETHER_MASONRY_BRICK_STAIRS);
        nethermasonryPool.slab(ModBlocks.NETHER_MASONRY_BRICK_SLAB);
        nethermasonryPool.wall(ModBlocks.NETHER_MASONRY_BRICK_WALL);

        rnethermasonryPool.stairs(ModBlocks.RED_NETHER_MASONRY_BRICK_STAIRS);
        rnethermasonryPool.slab(ModBlocks.RED_NETHER_MASONRY_BRICK_SLAB);
        rnethermasonryPool.wall(ModBlocks.RED_NETHER_MASONRY_BRICK_WALL);

        prismasonryPool.stairs(ModBlocks.PRISMARINE_MASONRY_BRICK_STAIRS);
        prismasonryPool.slab(ModBlocks.PRISMARINE_MASONRY_BRICK_SLAB);
        prismasonryPool.wall(ModBlocks.PRISMARINE_MASONRY_BRICK_WALL);

        deepmasonryPool.stairs(ModBlocks.DEEPSLATE_MASONRY_BRICK_STAIRS);
        deepmasonryPool.slab(ModBlocks.DEEPSLATE_MASONRY_BRICK_SLAB);
        deepmasonryPool.wall(ModBlocks.DEEPSLATE_MASONRY_BRICK_WALL);

        blackstonemasonryPool.stairs(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICK_STAIRS);
        blackstonemasonryPool.slab(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICK_SLAB);
        blackstonemasonryPool.wall(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICK_WALL);

        quartzmasonryPool.stairs(ModBlocks.QUARTZ_MASONRY_BRICK_STAIRS);
        quartzmasonryPool.slab(ModBlocks.QUARTZ_MASONRY_BRICK_SLAB);
        quartzmasonryPool.wall(ModBlocks.QUARTZ_MASONRY_BRICK_WALL);

        mudmasonryPool.stairs(ModBlocks.MUD_MASONRY_BRICK_STAIRS);
        mudmasonryPool.slab(ModBlocks.MUD_MASONRY_BRICK_SLAB);
        mudmasonryPool.wall(ModBlocks.MUD_MASONRY_BRICK_WALL);

        marblemasonryPool.stairs(ModBlocks.MARBLE_MASONRY_BRICK_STAIRS);
        marblemasonryPool.slab(ModBlocks.MARBLE_MASONRY_BRICK_SLAB);
        marblemasonryPool.wall(ModBlocks.MARBLE_MASONRY_BRICK_WALL);

        andesitemasonryPool.stairs(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICK_STAIRS);
        andesitemasonryPool.slab(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICK_SLAB);
        andesitemasonryPool.wall(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICK_WALL);

        dioritemasonryPool.stairs(ModBlocks.POLISHED_DIORITE_MASONRY_BRICK_STAIRS);
        dioritemasonryPool.slab(ModBlocks.POLISHED_DIORITE_MASONRY_BRICK_SLAB);
        dioritemasonryPool.wall(ModBlocks.POLISHED_DIORITE_MASONRY_BRICK_WALL);

        granitemasonryPool.stairs(ModBlocks.POLISHED_GRANITE_MASONRY_BRICK_STAIRS);
        granitemasonryPool.slab(ModBlocks.POLISHED_GRANITE_MASONRY_BRICK_SLAB);
        granitemasonryPool.wall(ModBlocks.POLISHED_GRANITE_MASONRY_BRICK_WALL);

        bedrockmasonryPool.stairs(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICK_STAIRS);
        bedrockmasonryPool.slab(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICK_SLAB);
        bedrockmasonryPool.wall(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICK_WALL);

        voidmasonryPool.stairs(ModBlocks.VOID_STONE_MASONRY_BRICK_STAIRS);
        voidmasonryPool.slab(ModBlocks.VOID_STONE_MASONRY_BRICK_SLAB);
        voidmasonryPool.wall(ModBlocks.VOID_STONE_MASONRY_BRICK_WALL);

        uniformPool.stairs(ModBlocks.UNIFORM_BRICK_STAIRS);
        uniformPool.slab(ModBlocks.UNIFORM_BRICK_SLAB);
        uniformPool.wall(ModBlocks.UNIFORM_BRICK_WALL);

        muduniformPool.stairs(ModBlocks.MUD_UNIFORM_BRICK_STAIRS);
        muduniformPool.slab(ModBlocks.MUD_UNIFORM_BRICK_SLAB);
        muduniformPool.wall(ModBlocks.MUD_UNIFORM_BRICK_WALL);

        netheruniformPool.stairs(ModBlocks.NETHER_UNIFORM_BRICK_STAIRS);
        netheruniformPool.slab(ModBlocks.NETHER_UNIFORM_BRICK_SLAB);
        netheruniformPool.wall(ModBlocks.NETHER_UNIFORM_BRICK_WALL);

        rnetheruniformPool.stairs(ModBlocks.RED_NETHER_UNIFORM_BRICK_STAIRS);
        rnetheruniformPool.slab(ModBlocks.RED_NETHER_UNIFORM_BRICK_SLAB);
        rnetheruniformPool.wall(ModBlocks.RED_NETHER_UNIFORM_BRICK_WALL);

        quartzuniformPool.stairs(ModBlocks.QUARTZ_UNIFORM_BRICK_STAIRS);
        quartzuniformPool.slab(ModBlocks.QUARTZ_UNIFORM_BRICK_SLAB);
        quartzuniformPool.wall(ModBlocks.QUARTZ_UNIFORM_BRICK_WALL);

        prisuniformPool.stairs(ModBlocks.PRISMARINE_UNIFORM_BRICK_STAIRS);
        prisuniformPool.slab(ModBlocks.PRISMARINE_UNIFORM_BRICK_SLAB);
        prisuniformPool.wall(ModBlocks.PRISMARINE_UNIFORM_BRICK_WALL);

        enduniformPool.stairs(ModBlocks.END_STONE_UNIFORM_BRICK_STAIRS);
        enduniformPool.slab(ModBlocks.END_STONE_UNIFORM_BRICK_SLAB);
        enduniformPool.wall(ModBlocks.END_STONE_UNIFORM_BRICK_WALL);

        voiduniformPool.stairs(ModBlocks.VOID_STONE_UNIFORM_BRICK_STAIRS);
        voiduniformPool.slab(ModBlocks.VOID_STONE_UNIFORM_BRICK_SLAB);
        voiduniformPool.wall(ModBlocks.VOID_STONE_UNIFORM_BRICK_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.ALUMINUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ALUMINUM_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.RUSTED_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUSTED_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.STONEBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STONEBARK_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.DEEPBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DEEPBARK_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.LEAFITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LEAFITE_TRAPDOOR);

        blockStateModelGenerator.registerSimpleState(ModBlocks.FLINT_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.IRON_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.ALUMINUM_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.STEEL_SPIKES);

        blockStateModelGenerator.registerSimpleState(ModBlocks.SILVER_CROWN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.POWDERED_SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SALT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_FLESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FLESH, Models.GENERATED);

        itemModelGenerator.register(ModItems.FROSITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_DRIVE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POWER_DRIVE, Models.GENERATED);

        itemModelGenerator.register(ModItems.FROSITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_BOOTS));

        itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLINT_AND_ALUMINUM, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_BOOTS));

        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.NICKEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NICKEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_BOOTS));

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_BOOTS));

        itemModelGenerator.register(ModItems.IRON_BALL, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUMINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUCKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKOPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUNICKOPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUPPEREL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKOPPINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKINUPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPINUCKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPELUNUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_COMPOUND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_BOOTS));

        itemModelGenerator.register(ModItems.STONEBARK_HANGING_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPBARK_HANGING_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_BOOTS));

        itemModelGenerator.register(ModItems.COBALT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.COBALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_BOOTS));

        itemModelGenerator.register(ModItems.COBALT_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DUEL_POWER_DRIVE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEDROCK_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEDROCK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_BOOTS));

        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_BOOTS));

        itemModelGenerator.register(ModItems.SANDITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SANDITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_BOOTS));

        itemModelGenerator.register(ModItems.LEAFITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_SCALE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_MANDIBLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUSTED_STEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTED_STEEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAFITE_HANGING_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAFITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAFITE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAFITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEAFITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEAFITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEAFITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEAFITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LEAFITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LEAFITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LEAFITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LEAFITE_BOOTS));

        itemModelGenerator.register(ModItems.PLATINUM_CLUSTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PLATINUM_MULTI_TOOL, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATINUM_BOOTS));

        itemModelGenerator.register(ModItems.END_ITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.END_ITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.END_ITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.END_ITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.END_ITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.END_ITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.END_ITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.END_ITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.END_ITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.END_ITE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_HELMET_VISOR));

        itemModelGenerator.register(ModItems.ICE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_BOMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROZEN_FLESH, Models.GENERATED);

        itemModelGenerator.register(ModItems.ICY_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_CARVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_CARVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_CARVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_CARVER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MASONRY_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNIFORM_BLUEPRINT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_STEW, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHELLED_COBBLENUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBBLENUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFED_COBBLENUT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVERPEDE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.JUNGLE_SPIDER_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.ENDER_SPIDER_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.FROSITE_GOLEM_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.FROSTBITEN_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.ICE_CUBE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.FROSTED_STRAY_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));
    }
}
