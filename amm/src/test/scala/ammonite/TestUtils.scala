package ammonite

object TestUtils {
  val sessionPrefix = if (scala2_10) "$sess." else ""
  val windowsPlatform = System.getProperty("os.name").startsWith("Windows")
  def scala2_10 = scala.util.Properties.versionNumberString.contains("2.10")
}
