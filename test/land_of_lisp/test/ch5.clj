(ns land-of-lisp.test.ch5
  (:use [ch5])
  (:use [expectations]))

(expect 3 (count *nodes*))
