(ns happy.core.desktop-launcher
  (:require [happy.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. happy-game "happy" 640 480)
  (Keyboard/enableRepeatEvents true))
