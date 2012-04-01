(ns ch2
  (:require [land-of-lisp.core :as lol]))

(def ^:dynamic *small* (atom 1))
(def ^:dynamic *big* (atom 100))

(defn guess-my-number
  []
  (lol/ash (+ @*small* @*big*) -1))

(defn bigger
  []
  (reset! *small* ((fn [] (+ (guess-my-number) 1))))
  (guess-my-number))

(defn smaller
  []
  (reset! *big* ((fn [] (- (guess-my-number) 1))))
  (guess-my-number))

(defn start-over
  []
  (reset! *big* 100)
  (reset! *small* 1)
  (guess-my-number))

