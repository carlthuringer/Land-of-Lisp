(ns land-of-lisp.test.ch5
  (:use [ch5])
  (:use [expectations]))

(expect 3 (count *nodes*))
(expect "you are in the living-room. a wizard is snoring loudly on the couch."
        (get *nodes* :living-room))
(expect "you are in the living-room. a wizard is snoring loudly on the couch."
        (describe-location *nodes* :living-room))
(expect "there is a door going west from here."
        (describe-path '(garden west door)))
(expect "there is a door going east from here."
        (describe-path '(living-room east door)))
(expect "there is a door going west from here. there is a ladder going upstairs from here."
        (describe-paths 'living-room *edges*))
