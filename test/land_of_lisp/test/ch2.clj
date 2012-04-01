(ns land-of-lisp.test.ch2
  (:use [ch2])
  (:use [expectations]))

; Force start-over because global state screws up expectations
(expect 50 (start-over))
(expect 50 (guess-my-number))
(expect 75 (bigger))
(expect 62 (smaller))
(expect 56 (smaller))
(expect 50 (start-over))
(expect 75 (bigger))
(expect 62 (smaller))
(expect 56 (smaller))
