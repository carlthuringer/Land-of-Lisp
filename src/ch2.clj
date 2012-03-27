(ns ch2
  (:require [clojure.math.numeric-tower :as math]))

(def ^:dynamic *small* 1)
(def ^:dynamic *big* 100)
(defn ash
  "Clojure implementation of CLISP ash"
  [x y]
  (if (< y 0)
    (bit-shift-right x (math/abs y))
    (bit-shift-left x y)))


(defn guess-my-number
  []
  (ash (+ *small* *big*) -1))

