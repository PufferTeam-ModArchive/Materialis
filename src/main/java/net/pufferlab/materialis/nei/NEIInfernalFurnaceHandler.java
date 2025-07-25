package net.pufferlab.materialis.nei;

import static codechicken.lib.gui.GuiDraw.changeTexture;
import static codechicken.lib.gui.GuiDraw.drawTexturedModalRect;

import java.awt.Rectangle;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import org.lwjgl.opengl.GL11;

import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;

public class NEIInfernalFurnaceHandler extends TemplateRecipeHandler {

    public class InfernalSmeltingPair extends CachedRecipe {

        public InfernalSmeltingPair(ItemStack ingred, ItemStack result) {
            this.ingred = new PositionedStack(ingred, 24, 24, true);
            this.result = new PositionedStack(result, 126, 14, false);
        }

        @Override
        public List<PositionedStack> getIngredients() {
            return getCycledIngredients(cycleticks / 48, Collections.singletonList(ingred));
        }

        @Override
        public PositionedStack getResult() {
            return result;
        }

        final PositionedStack ingred;
        final PositionedStack result;
    }

    @Override
    public void loadTransferRects() {
        transferRects.add(new RecipeTransferRect(new Rectangle(59, 8, 48, 48), "tcInfernalFurnace"));
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("tcInfernalFurnace") && getClass() == NEIInfernalFurnaceHandler.class) { // don't want
                                                                                                     // subclasses
                                                                                                     // getting
            // a hold of this
            Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) FurnaceRecipes.smelting()
                .getSmeltingList();
            for (Map.Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
                arecipes.add(new NEIInfernalFurnaceHandler.InfernalSmeltingPair(recipe.getKey(), recipe.getValue()));
        } else super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) FurnaceRecipes.smelting()
            .getSmeltingList();
        for (Map.Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue(), result))
                arecipes.add(new NEIInfernalFurnaceHandler.InfernalSmeltingPair(recipe.getKey(), recipe.getValue()));
    }

    @Override
    public void loadUsageRecipes(String inputID, Object... ingredients) {
        super.loadUsageRecipes(inputID, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) FurnaceRecipes.smelting()
            .getSmeltingList();
        for (Map.Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey(), ingredient)) {
                NEIInfernalFurnaceHandler.InfernalSmeltingPair arecipe = new NEIInfernalFurnaceHandler.InfernalSmeltingPair(
                    recipe.getKey(),
                    recipe.getValue());
                arecipe.setIngredientPermutation(Collections.singletonList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getRecipeName() {
        return "Infernal Furnace";
    }

    @Override
    public String getGuiTexture() {
        return "materialis:textures/gui/nei/infernalfurnace.png";
    }

    @Override
    public String getOverlayIdentifier() {
        return "tcInfernalFurnace";
    }

    @Override
    public void drawBackground(int recipe) {
        GL11.glColor4f(1, 1, 1, 1);
        changeTexture(getGuiTexture());
        drawTexturedModalRect(0, 0, 5, 11, 166, 106);
    }
}
