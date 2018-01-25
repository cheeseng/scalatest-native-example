scalaVersion := "2.11.12"

enablePlugins(ScalaNativePlugin)

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.0-SNAP6" % Test

import scalanative.sbtplugin.ScalaNativePlugin
import scalanative.tools
import scalanative.optimizer.{inject, pass}
import scalanative.sbtplugin.ScalaNativePluginInternal.{nativeConfig, nativeOptimizerDriver, nativeLinkerReporter, nativeOptimizerReporter, NativeTest}
import ScalaNativePlugin.autoImport._

nativeLinkStubs in NativeTest := true
