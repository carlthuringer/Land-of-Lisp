(ns ch2
  (:require [land-of-lisp.core :as lol]))

(def ^:dynamic *small* 1)
(def ^:dynamic *big* 100)

(defn guess-my-number
  []
  ('lol/ash (+ *small* *big*) -1))

