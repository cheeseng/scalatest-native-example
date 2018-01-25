scalaVersion := "2.11.12"

enablePlugins(ScalaNativePlugin)

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.0-SNAP6" % Test

import scalanative.sbtplugin.ScalaNativePluginInternal.NativeTest

nativeLinkStubs in NativeTest := true
