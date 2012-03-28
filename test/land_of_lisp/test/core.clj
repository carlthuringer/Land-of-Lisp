(ns land-of-lisp.test.core
  (:require [land-of-lisp.core :as lol])
  (:use [expectations]))

(expect nil? nil)
(expect 22 (lol/ash 11 1))
(expect 5 (lol/ash 11 -1))
