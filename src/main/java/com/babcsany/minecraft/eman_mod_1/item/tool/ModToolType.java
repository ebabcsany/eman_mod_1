package com.babcsany.minecraft.eman_mod_1.item.tool;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import net.minecraftforge.common.ToolType;

import static net.minecraftforge.common.ToolType.get;

public class ModToolType {
    public static final ToolType INFINITY = getTool("infinity");

    public static ToolType getTool(String name) {
        String string = Eman_mod_1.MOD_ID;
        return get(string + name);
    }
}
