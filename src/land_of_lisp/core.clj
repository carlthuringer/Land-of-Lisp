(ns land-of-lisp.core
  (:require [clojure.math.numeric-tower :as math]))

;"Clojure implementation of CLISP ash"
(defn ash
  [number shift]
  (if (< shift 0)
    (bit-shift-right number (math/abs shift))
    (bit-shift-left number shift)))
