package bconstruct.common.util;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

public final class Log {

  public static final String CHANNEL = "BrewersConstruct";

  public static void warn(String msg) {
    FMLLog.log(CHANNEL, Level.WARNING, msg);
  }

  public static void error(String msg) {
    FMLLog.log(CHANNEL, Level.SEVERE, msg);
  }

  public static void info(String msg) {
    FMLLog.log(CHANNEL, Level.INFO, msg);
  }

  public static void debug(String msg) {
    FMLLog.log(CHANNEL, Level.FINE, msg);
  }

  private Log() {
  }

}