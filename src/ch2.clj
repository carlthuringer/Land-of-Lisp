(ns ch2
  (:require [land-of-lisp.core :as lol]))

(def ^:dynamic *small* 1)
(def ^:dynamic *big* (atom 100))

(defn guess-my-number
  []
  (lol/ash (+ *small* @*big*) -1))

(defn bigger
  []
  (reset! *big* (fn [] (- (guess-my-number) 1)))
  @*big*)

(defn smaller
  []
  (binding [*small* (+ (guess-my-number) 1)] *small*))
