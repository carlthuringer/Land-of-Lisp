(ns land-of-lisp.test.ch2
  (:use [ch2])
  (:use [expectations]))

;Force a reload because mutable global state screws up autoexpect. duh
(use 'ch2 :reload)
(expect 50 (guess-my-number))
(expect 75 (bigger))
(expect 62 (smaller))
(expect 56 (smaller))
