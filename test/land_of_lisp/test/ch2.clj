(ns land-of-lisp.test.ch2
  (:use [ch2])
  (:use [expectations]))

(expect 50 (guess-my-number))
(expect 75 (bigger))
(expect 62 (smaller))
(expect 56 (smaller))
