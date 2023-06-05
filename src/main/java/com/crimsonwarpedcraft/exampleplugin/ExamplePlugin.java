package com.crimsonwarpedcraft.exampleplugin;

import io.papermc.lib.PaperLib;
import io.papermc.paper.util.Tick;
import net.kyori.adventure.util.Ticks;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.ChatPaginator;


/**
 * Created by Levi Muniz on 7/29/20.
 *
 * @author Copyright (c) Levi Muniz. All Rights Reserved.
 */
public class ExamplePlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
