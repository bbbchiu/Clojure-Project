(ns happy.core
  (:require [play-clj.core :refer :all]
            [play-clj.g2d :refer :all]
            [play-clj.math :refer :all]))

(declare happy-game main-screen)
(def speed 14)

(defscreen main-screen
  :on-show
  (fn [screen entities]
    (update! screen :renderer (stage))
    (add-timer! screen :spawn-apple 1 2)
    (let [background (texture "apple_orchard.png")
          player (assoc (texture "cow.png") :x 50, :y 50, :width 400, :height 350, :player? true, :direction :right)]
      [background player]))

  :on-render
  (fn [screen entities]
    (clear!)
    (render! screen entities)))

(defgame happy-game
  :on-create
  (fn [this]
    (set-screen! this main-screen)))
